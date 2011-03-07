package de.uka.ipd.sdq.pcmsolver.transformations.pcm2lqn;

import java.math.BigInteger;
import java.util.Date;
import java.util.Stack;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.EList;

import LqnCore.ActivityDefType;
import LqnCore.ActivityListType;
import LqnCore.ActivityMakingCallType;
import LqnCore.ActivityOrType;
import LqnCore.ActivityPhasesType;
import LqnCore.ActivityType;
import LqnCore.EntryType;
import LqnCore.LqnCoreFactory;
import LqnCore.LqnModelType;
import LqnCore.OrListType;
import LqnCore.OutputEntryDistributionType;
import LqnCore.PhaseActivities;
import LqnCore.PrecedenceType;
import LqnCore.ProcessorType;
import LqnCore.ReplyActivityType;
import LqnCore.ReplyEntryType;
import LqnCore.SchedulingType;
import LqnCore.ServiceType;
import LqnCore.SingleActivityListType;
import LqnCore.SolverParamsType;
import LqnCore.TaskActivityGraph;
import LqnCore.TaskOptionType;
import LqnCore.TaskSchedulingType;
import LqnCore.TaskType;
import LqnCore.TypeType;
import de.uka.ipd.sdq.pcmsolver.runconfig.MessageStrings;

public class LqnBuilder {
	
	private static Logger logger = Logger.getLogger(LqnBuilder.class.getName());
	
	private LqnCoreFactory lqnFactory = LqnCoreFactory.eINSTANCE;
	private LqnModelType lqnModel = null;

	private Stack<TaskActivityGraph> taskGraphStack = new Stack<TaskActivityGraph>();
	
	public LqnBuilder(){
		lqnModel = lqnFactory.createLqnModelType();
		lqnModel.setName("PCM2LQN_Model");
	}

	public ProcessorType addProcessor(String id){
		ProcessorType pt = getProcessorTypeFromModel(id);
		if (pt==null){
			pt = lqnFactory.createProcessorType();
			pt.setName(id+"_Processor");
			pt.setMultiplicity(new BigInteger("1"));
			pt.setScheduling(SchedulingType.FCFS);
			lqnModel.getProcessor().add(pt);	
		}
		return pt;
	}
	
	private ProcessorType getProcessorTypeFromModel(String id) {
		EList<ProcessorType> list = lqnModel.getProcessor();
		for(ProcessorType procType : list){
			if(procType.getName().equals(id+"_Processor")){
				return procType;
			}
		}
		return null;
	}

	private EntryType getEntryTypeFromTask(String id, TaskType tt) {
		EList<EntryType> entryList = tt.getEntry();
		for (EntryType entryType : entryList){
			if (entryType.getName().equals(id+"_Entry")){
				return entryType;
			}
		}
		return null;
	}
	
	public TaskType addTask(String id, ProcessorType pt) {
		
		TaskType tt = null;
		if (!pt.getTask().isEmpty())	{
			tt = pt.getTask().get(0);
		}
		if (tt == null) {
			tt = lqnFactory.createTaskType();
			tt.setName(id + "_Task");
			tt.setMultiplicity(new BigInteger("1"));

			tt.setThinkTime("0.0");
			tt.setActivityGraph(TaskOptionType.YES);
			
			//tt.setScheduling(TaskSchedulingType.INF);
			tt.setScheduling(TaskSchedulingType.FCFS);
			tt.setMultiplicity(new BigInteger("100"));

			ServiceType st = lqnFactory.createServiceType();
			st.setName("MyService");
			tt.getService().add(st);

			pt.getTask().add(tt);
		}
		return tt;
	}

	public TaskType addTaskForResourceDemand(String id, ProcessorType pt) {
		
		TaskType tt = null;
		if (!pt.getTask().isEmpty())	{
			EList<TaskType> taskList = pt.getTask();
			for (TaskType t : taskList){
				if (t.getName().equals(id+"_Task")){
					return t;
				}
			}
		}
		if (tt == null) {
			tt = lqnFactory.createTaskType();
			tt.setName(id + "_Task");
			tt.setMultiplicity(new BigInteger("1"));

			tt.setThinkTime("0.0");
			tt.setScheduling(TaskSchedulingType.FCFS);
			tt.setActivityGraph(TaskOptionType.YES);

			ServiceType st = lqnFactory.createServiceType();
			st.setName("MyService");
			tt.getService().add(st);

			pt.getTask().add(tt);
		}
		return tt;
	}

	
	public EntryType addEntry(String id, TaskType tt){
		EntryType et = getEntryTypeFromTask(id, tt);
		if (et==null){
			et = lqnFactory.createEntryType();
			et.setName(id+"_Entry");
			et.setType(TypeType.NONE); // actually TypeType.GRAPH, but not supported by lqns
			tt.getEntry().add(et);
		}
		return et;
	}
	


	public TaskActivityGraph addTaskActivityGraph(TaskType tt){
		TaskActivityGraph taskActivityGraph = tt.getTaskActivities();
		if (taskActivityGraph==null){
			taskActivityGraph = lqnFactory.createTaskActivityGraph();
			tt.setTaskActivities(taskActivityGraph);
		}
		taskGraphStack.push(taskActivityGraph);
		return taskActivityGraph;
	}
	
	public OutputEntryDistributionType addOutputEntryDistributionType(EntryType et){
		OutputEntryDistributionType oedt = lqnFactory.createOutputEntryDistributionType();
		oedt.setPhase(new BigInteger("1"));
		oedt.setMin("0.0");
		oedt.setMax("10.0");
		et.getServiceTimeDistribution().add(oedt);
		return oedt;
	}

	public ReplyActivityType addReplyActivity(String id, String startId, String stopId) {
		EList<ReplyEntryType> list = taskGraphStack.peek().getReplyEntry();
		if (list.size()>0){
			return list.get(0).getReplyActivity().get(0);
		}
	
		ReplyActivityType rat = lqnFactory.createReplyActivityType();
		//rat.setName((String)doSwitch(getStartAction(sb)));
		rat.setName(stopId); 
		
		ReplyEntryType ret = lqnFactory.createReplyEntryType();
		ret.setName(id+"_Entry"); 
		ret.getReplyActivity().add(rat);
		taskGraphStack.peek().getReplyEntry().add(ret);		
		return rat;
	}

	public PrecedenceType addSequencePrecedence(String firstId, String secondId) {
		EList<PrecedenceType> list = taskGraphStack.peek().getPrecedence();
		for (PrecedenceType precType : list){
			SingleActivityListType salt = precType.getPre();
			if (salt!=null){
				if (salt.getActivity().getName().equals(firstId)){
					return precType;
				}
			}
		}
		
		PrecedenceType pt = lqnFactory.createPrecedenceType();
		
		SingleActivityListType saltPre = lqnFactory.createSingleActivityListType();
		ActivityType atPre = lqnFactory.createActivityType();
		atPre.setName(firstId); 
		saltPre.setActivity(atPre);
		
		SingleActivityListType saltPost = lqnFactory.createSingleActivityListType();
		ActivityType atPost = lqnFactory.createActivityType();
		atPost.setName(secondId);
		saltPost.setActivity(atPost);

		pt.setPre(saltPre);
		pt.setPost(saltPost);
		
		taskGraphStack.peek().getPrecedence().add(pt);
		return pt;
	}

	public ActivityDefType addActivityDef(String id) {
		EList<ActivityDefType> list = taskGraphStack.peek().getActivity();
		for (ActivityDefType actDefType : list){
			if (actDefType.getName().equals(id)) return actDefType;
		}
		
		ActivityDefType adt = lqnFactory.createActivityDefType();
		adt.setHostDemandMean("0.0");
		adt.setName(id);
		taskGraphStack.peek().getActivity().add(adt);
		return adt;
	}

	public ActivityMakingCallType addActivityMakingCall(String id, String targetId) {
		EList<ActivityDefType> actList = taskGraphStack.peek().getActivity();
		for (ActivityDefType actDefType : actList){
			if (actDefType.getName().equals(id)){
				EList<ActivityMakingCallType> list2 = actDefType.getSynchCall();
				for (ActivityMakingCallType amct : list2){
					if (amct.getDest().equals(targetId)) return amct;
				}
			}
		}
		
		ActivityMakingCallType amct = lqnFactory.createActivityMakingCallType();
		amct.setDest(targetId);
		amct.setCallsMean("1.0");
		
		EList<ActivityDefType> list = taskGraphStack.peek().getActivity();
		for (ActivityDefType adt : list){
			if (adt.getName().equals(id)){
				adt.getSynchCall().add(amct);
			}
		}
		
		return amct;
	}

	public PrecedenceType addBeginBranchPrecedence(String id) {
		EList<PrecedenceType> list = taskGraphStack.peek().getPrecedence();
		for (PrecedenceType precType : list){
			if (precType.getPre().getActivity().getName().equals(id)){
				return precType;
			}
		}
		
		PrecedenceType ptBegin = lqnFactory.createPrecedenceType();
		SingleActivityListType saltPreBegin = lqnFactory.createSingleActivityListType();
		ActivityType atPre = lqnFactory.createActivityType();
		atPre.setName(id);
		saltPreBegin.setActivity(atPre);
		ptBegin.setPre(saltPreBegin);

		OrListType oltPreBegin = lqnFactory.createOrListType(); // branch
		ptBegin.setPostOR(oltPreBegin);
		taskGraphStack.peek().getPrecedence().add(ptBegin);
		
		return ptBegin;
	}

	public PrecedenceType addEndBranchPrecedence() {
		PrecedenceType ptEnd = lqnFactory.createPrecedenceType();
		ActivityListType altPreEnd = lqnFactory.createActivityListType(); //merge
		ptEnd.setPreOR(altPreEnd);
		
		SingleActivityListType saltPostEnd = lqnFactory.createSingleActivityListType();
		ActivityType atPostEnd = lqnFactory.createActivityType();
		//atPostEnd.setName(successorId);
		saltPostEnd.setActivity(atPostEnd);
		
		ptEnd.setPost(saltPostEnd);
		taskGraphStack.peek().getPrecedence().add(ptEnd);
		return ptEnd;
	}

	public ActivityOrType addActivityOrType(String startId, String branchProb, PrecedenceType pt) {
		EList<ActivityOrType> list = pt.getPostOR().getActivity();
		for (ActivityOrType aot : list){
			if (aot.getName().equals(startId)) return aot;
		}
		
		ActivityOrType aot = lqnFactory.createActivityOrType();
		aot.setProb(branchProb);
		aot.setName(startId);
		pt.getPostOR().getActivity().add(aot);
		return aot;
	}

	public ActivityType addActivityType(String stopId, PrecedenceType pt) {
		EList<ActivityType> list = pt.getPreOR().getActivity();
		for (ActivityType at : list){
			if (at.getName().equals(stopId)) return at;
		}
	
		ActivityType at = lqnFactory.createActivityType();
		at.setName(stopId);
		pt.getPreOR().getActivity().add(at);
		return at;
	}

	public PhaseActivities addPhaseActivities(ActivityPhasesType apt) {
		PhaseActivities pa = lqnFactory.createPhaseActivities();
		pa.getActivity().add(apt);
		return pa;
	}

	public ActivityPhasesType addActivityPhases(String id) {
		ActivityPhasesType apt = lqnFactory.createActivityPhasesType();
		apt.setHostDemandMean("0.0");
		apt.setPhase(new BigInteger("1"));
		apt.setName(id+"_Activity");
		return apt;
	}

	public TaskType getTaskForProcessor(String processorId) {
		EList<ProcessorType> list = lqnModel.getProcessor();
		for (ProcessorType pt : list){
			if (pt.getName().equals(processorId+"_Processor")){
				return pt.getTask().get(0);
			}
		}
		logger.error("Could not find processor in Lqn Model.");
		return null;
	}

	public void finalizeLqnModel(ILaunchConfiguration config){
		SolverParamsType spt = LqnCoreFactory.eINSTANCE.createSolverParamsType();
		try {
			spt.setConvVal(config.getAttribute(MessageStrings.CONV_VALUE, "1e-005"));
			
			int itLimit = Integer.parseInt(config.getAttribute(MessageStrings.IT_LIMIT, "50"));
			spt.setItLimit(itLimit);
	
			int printInt = Integer.parseInt(config.getAttribute(MessageStrings.PRINT_INT, "10"));
			spt.setPrintInt(printInt);
			
			spt.setUnderrelaxCoeff(config.getAttribute(MessageStrings.UNDER_COEFF, "0.5"));
	
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		spt.setComment("Generated by PCM2LQN on "+new Date());
		lqnModel.setSolverParams(spt);
	}

	public void restoreFormerTaskActivityGraph() {
		taskGraphStack.pop();	
	}

	public LqnModelType getLqnModel(){
		return lqnModel;
	}

	public ProcessorType getProcessor(String processorId) {
		EList<ProcessorType> list = lqnModel.getProcessor();
		for (ProcessorType pt : list){
			if (pt.getName().equals(processorId+"_Processor")){
				return pt;
			}
		}
		logger.error("Could not find processor in Lqn Model.");
		return null;
	}
}