package de.uka.ipd.sdq.dsexplore.analysis.simucom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.rosuda.JRI.REXP;

import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.Pie;
import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.PieEntity;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.core.composition.ComposedStructure;
import de.uka.ipd.sdq.pcm.core.composition.CompositionFactory;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.PassiveResource;
import de.uka.ipd.sdq.pcm.repository.Repository;
import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;
import de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcm.resultdecorator.ResultDecoratorRepository;
import de.uka.ipd.sdq.pcm.resultdecorator.ResultdecoratorFactory;
import de.uka.ipd.sdq.pcm.resultdecorator.repositorydecorator.RepositorydecoratorFactory;
import de.uka.ipd.sdq.pcm.resultdecorator.repositorydecorator.ServiceResult;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.PassiveResourceResult;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.ProcessingResourceSpecificationResult;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.ResourceenvironmentdecoratorFactory;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.UtilisationResult;
import de.uka.ipd.sdq.pcm.seff.ExternalCallAction;
import de.uka.ipd.sdq.pcm.seff.SeffFactory;
import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;
import de.uka.ipd.sdq.pcmsolver.transformations.ContextWrapper;
import de.uka.ipd.sdq.pcmsolver.transformations.EMFHelper;
import de.uka.ipd.sdq.pcmsolver.transformations.pcm2lqn.Pcm2LqnHelper;
import de.uka.ipd.sdq.sensorframework.adapter.StateSensorToPieAdapter;
import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.Measurement;
import de.uka.ipd.sdq.sensorframework.entities.Sensor;
import de.uka.ipd.sdq.sensorframework.entities.SensorAndMeasurements;
import de.uka.ipd.sdq.sensorframework.entities.TimeSpanMeasurement;
import de.uka.ipd.sdq.sensorframework.entities.TimeSpanSensor;
import de.uka.ipd.sdq.sensorframework.visualisation.rvisualisation.RVisualisationPlugin;
import de.uka.ipd.sdq.sensorframework.visualisation.rvisualisation.reports.RReport.TimeseriesData;
import de.uka.ipd.sdq.sensorframework.visualisation.rvisualisation.utils.RConnection;
import de.uka.ipd.sdq.statistics.PhiMixingBatchAlgorithm;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;
import de.uka.ipd.sdq.statistics.estimation.SampleMeanEstimator;


public class SimuComAnalysisResult extends AbstractPerformanceAnalysisResult implements IStatisticAnalysisResult, IPerformanceAnalysisResult {

	private ExperimentRun run;
	
	private double meanValue;

	private Experiment experiment;

	private double medianValue; 
	
	private double stdDeviation;

	private ConfidenceInterval confidenceInterval; 
	
	private double alpha = 0.95;

	private long observations = 0;

	/** You must not use the usage scenario to navigate in the PCM, as the
	 * model may not be longer valid for this result after the constructor call.
	 */
	private String usageSenarioName;

	/**
	 * Contains: resource utilisations
	 * Should also contain: Passive resources. 
	 */
	private ResultDecoratorRepository results;
	
	private static Logger logger = 
		Logger.getLogger("de.uka.ipd.sdq.dsexplore");

	public SimuComAnalysisResult(ExperimentRun run, Experiment experiment, PCMInstance pcmInstance, UsageScenario usageScenario) throws AnalysisFailedException {
		super(pcmInstance);
		this.run = run;
		this.experiment = experiment;
		this.usageSenarioName = usageScenario.getEntityName().replaceAll(" ", "_");
		
		SensorAndMeasurements sam = getUsageScenarioMeasurements();
		this.meanValue = calculateValue(sam,"mean");
		this.stdDeviation = calculateValue(sam,"sd");
		this.medianValue = calculateValue(sam,"median");
		this.observations = sam.getMeasurements().size();
		
		this.confidenceInterval = determineConfidenceInterval();
		
		this.results =  retrieveResults(pcmInstance);
		
		
		logger.debug("Initialised SimuCom result");
		
	}

	private ResultDecoratorRepository retrieveResults(PCMInstance pcmInstance) throws AnalysisFailedException {
		
		ResultDecoratorRepository repo = ResultdecoratorFactory.eINSTANCE.createResultDecoratorRepository();
		retrieveResourceUtilisation(pcmInstance, repo);
		retrieveServiceResults(pcmInstance, repo);
		
		return repo;
	}

	/**
	 * Quite ugly method to get the service results, because sensors only contain strings for identification, 
	 * and because only external calls currently have results, not SEFFs (TODO: define right probes when optimizing, then refactor this).
	 * @param pcmInstance
	 * @param repo
	 * @throws AnalysisFailedException 
	 */
	private void retrieveServiceResults(PCMInstance pcmInstance,
			ResultDecoratorRepository repo) throws AnalysisFailedException {
		
		//Need to get all times from all calls to that SEFF. 
		
		//get all ExternalCalls from model
		// get the eclass (strange way, but how to do it better?
		ExternalCallAction sampleExternalCall = SeffFactory.eINSTANCE.createExternalCallAction();
		EMFHelper helper = new EMFHelper();
		List<Repository> respositories = pcmInstance.getRepositories();
		
		HashMap<String, ExternalCallAction> idToExternalCallMap = new HashMap<String, ExternalCallAction>(100);
		
		for (Repository repository : respositories) {
			List<EObject> allExternalCallsList = helper.getElements(repository, sampleExternalCall.eClass());
			
			//put all external calls in a hash map based on their id
			for (EObject eObject : allExternalCallsList) {
				if (eObject instanceof ExternalCallAction){
					ExternalCallAction externalCall = (ExternalCallAction) eObject;
					String id = externalCall.getId(); 
					idToExternalCallMap.put(id, externalCall);
				}
				//if not ignore it (although something is wrong with the query above in that case) 

			}
		}
		
		// need all AssemblyContexts to get the called SEFFs and to get the contexts for the external calls 
		// (they may be instantiated several times in the system) 
		AssemblyContext sampleAssemblyContext = CompositionFactory.eINSTANCE.createAssemblyContext();
		//only gets the AssemblyContexts directly contained in the system, so we also need to query the Repository for composite components 
		EList<EObject> eObjectAssemblyContexts = helper.getElements(pcmInstance.getSystem(), sampleAssemblyContext.eClass());
		
		for (Repository repository : respositories) {
			List<EObject> allExternalCallsList = helper.getElements(repository, sampleAssemblyContext.eClass());
			eObjectAssemblyContexts.addAll(allExternalCallsList);
		}
		
		//Put them in map based on their id
		Map<String, AssemblyContextContext> idToAssemblyContextMap = new HashMap<String, AssemblyContextContext>(eObjectAssemblyContexts.size());
		//List<AssemblyContext> assemblyContextList = new ArrayList<AssemblyContext>(eObjectAssemblyContexts.size());
		for (EObject eObjectAssemblyContext : eObjectAssemblyContexts) {
			if (eObjectAssemblyContext instanceof AssemblyContext){
				AssemblyContext assemblyContext = (AssemblyContext)eObjectAssemblyContext;
				idToAssemblyContextMap.put(assemblyContext.getId(), new AssemblyContextContext(assemblyContext));
			}
		}
		
		//set parent contexts
		for (AssemblyContextContext assemblyContextContext : idToAssemblyContextMap.values()) {
			RepositoryComponent component = assemblyContextContext.getAssemblyContext().getEncapsulatedComponent_AssemblyContext();
			if (component instanceof ComposedStructure){
				List<AssemblyContext> innerAssemblyContexts = ((ComposedStructure)component).getAssemblyContexts_ComposedStructure();
				for (AssemblyContext assemblyContext : innerAssemblyContexts) {
					String id = assemblyContext.getId();
					AssemblyContextContext innerContext = idToAssemblyContextMap.get(id);
					innerContext.setParent(assemblyContextContext);
				}
			}
		}
		
		Map<String, PassiveResourceResult> passiveResourceResultsMap = retrievePassiveResourceUtil(repo, pcmInstance);
						
		//iterate through sensors and store the (ExternalCall,AssemblyContext) pairs with their sensors.
		Collection<Sensor> sensorList = this.experiment.getSensors();
		List<ExternalCallActionWithSensors> externalCallsInContextWithSensorsList = new LinkedList<ExternalCallActionWithSensors>();
		
		for (Sensor sensor : sensorList) {
			String sensorName = sensor.getSensorName();
			if (sensorName.contains("CallID")){
				//current sensor is an ExternalCall sensor
				
				// parse external call id
				if (sensorName.lastIndexOf(" ") < sensorName.length()-2 
						&& sensorName.lastIndexOf(" ") > -1
						&& sensorName.length() > 2){
					String externalCallID = sensorName.substring(sensorName.lastIndexOf(" ")+1, sensorName.length()-1);
				
					// 	find the external call in the model
					ExternalCallAction myCall = idToExternalCallMap.get(externalCallID);
				
					if (myCall != null){
						
						//retrieve AssemblyContext from sensor name
						String assemblyContextID = sensorName.substring(sensorName.indexOf("AssemblyCtx")+13,sensorName.indexOf("CallID")-2);
						AssemblyContextContext myAssemblyContext = idToAssemblyContextMap.get(assemblyContextID);
						if (myAssemblyContext != null){
							
							ExternalCallActionWithSensors externalCallInContextWithSensors = new ExternalCallActionWithSensors(myCall, myAssemblyContext);
							
							//reuse pair if it already there
							int index = externalCallsInContextWithSensorsList.indexOf(externalCallInContextWithSensors);
							if (index > 0){
								externalCallInContextWithSensors = externalCallsInContextWithSensorsList.get(index);
							} else {
								externalCallsInContextWithSensorsList.add(externalCallInContextWithSensors);
							}
						
							// map all result sensors to the SEFF they call
							externalCallInContextWithSensors.addSensor(sensor);
							continue;
						}
					}
				}
				throw new RuntimeException("Cannot retrieve external call id from sensor, sensor name labels must have changed. Contact developers");
			} 
			
		}
		
		//FIXME: This all does not work if composite components themselves are used several times in the system, because then, the  AssemblyContexts of the inner components will not be unique anymore.  
		
		
		// get the average time for the SEFFs (careful: contains network)
		// by getting the data of the chosen sensors from this.run
		
		for (ExternalCallActionWithSensors externalCallActionWithSensors : externalCallsInContextWithSensorsList) {
			List<Sensor> mySensors = externalCallActionWithSensors.getSensors();
			
			if (mySensors.size() > 0){
			
				//	create service result
				ServiceResult myServiceResult = RepositorydecoratorFactory.eINSTANCE.createAllocationServiceResult();
			
				//get SEFF for external call
				
				ContextWrapper contextWrapper = new ContextWrapper(pcmInstance);
				//set the AssemblyContext hierarchy
				List<AssemblyContext> assemblyContextHierarchy = new ArrayList<AssemblyContext>(4);
				AssemblyContextContext currentContext = externalCallActionWithSensors.getAssemblyContext();
				while (currentContext != null) {
					assemblyContextHierarchy.add(currentContext.getAssemblyContext());
					currentContext = currentContext.getParentAssemblyContext();
				}
				//the currentContext needs to be last in the list.
				Collections.reverse(assemblyContextHierarchy);
				contextWrapper.setAssCtxList(assemblyContextHierarchy);
				
				ServiceEffectSpecification seff = contextWrapper.getNextSEFF(externalCallActionWithSensors.getExternalCall());
				
				myServiceResult.setServiceEffectSpecification_ServiceResult(seff);
				
				double weightedAndCumulatedMeanResponseTime = 0;
				int totalNumberOfMeasurements = 0;
				
				for (Sensor sensor : mySensors) {
					 SensorAndMeasurements results = run.getMeasurementsOfSensor(sensor);
					 Collection<Measurement> measurements = results.getMeasurements();
					 totalNumberOfMeasurements += measurements.size();
					 weightedAndCumulatedMeanResponseTime += calculateValue(results, "mean") * totalNumberOfMeasurements;
					 
				}
				double meanResponseTime = weightedAndCumulatedMeanResponseTime / totalNumberOfMeasurements;
				myServiceResult.setMeanResponseTime(meanResponseTime);
				
				repo.getServiceResult_ResultDecoratorRepository().add(myServiceResult);
				
			}
		
		}
		
		
	}


	/**
	 * retrieves active resource utils. 
	 * Should also do passive resource utils (but not yet collected in SimuCom).  
	 * @param pcmInstance
	 * @param repo 
	 * @return
	 * @throws AnalysisFailedException
	 */
	private ResultDecoratorRepository retrieveResourceUtilisation(
			PCMInstance pcmInstance, ResultDecoratorRepository repo) throws AnalysisFailedException {
		
		List<ResourceContainer> resourceContainerList = pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
		for (ResourceContainer resourceContainer : resourceContainerList) {
			List<ProcessingResourceSpecification> resources = resourceContainer.getActiveResourceSpecifications_ResourceContainer();
			for (ProcessingResourceSpecification resource : resources) {
				ProcessingResourceSpecificationResult result = this.getUtilisationOfResource(resourceContainer, resource);
				if (result != null && result.getResourceUtilisation() != Double.NaN){
					result.setEntityName("Util of "+resourceContainer.getEntityName()+"_"+resource.getActiveResourceType_ActiveResourceSpecification().getEntityName());
					result.setProcessingResourceSpecification_ProcessingResourceSpecificationResult(resource);
					repo.getUtilisationResults_ResultDecoratorRepository().add(result);
				}
			}
			
		}
		return repo;
	}
	
	private Map<String, PassiveResourceResult> retrievePassiveResourceUtil(ResultDecoratorRepository repo, PCMInstance pcm) throws AnalysisFailedException{
		
		
		Map<String, PassiveResourceResult> idsToPassiveResourceResult = new HashMap<String, PassiveResourceResult>();
		
		// results for passive resources
		List<AssemblyContext> allAssemblyContexts = de.uka.ipd.sdq.dsexplore.helper.EMFHelper.getAllUsedAssemblyContexts(pcm.getSystem());
		for (AssemblyContext assemblyContext : allAssemblyContexts) {
			RepositoryComponent innerComponent = assemblyContext.getEncapsulatedComponent_AssemblyContext();
			if (innerComponent instanceof BasicComponent){
				
				BasicComponent basicComponent = (BasicComponent) innerComponent;
				List<PassiveResource> passiveResourceOfComponentList = basicComponent
						.getPassiveResource_BasicComponent();
				for (PassiveResource passiveResource : passiveResourceOfComponentList) {

					String passiveResourceAndAssemblyContextId = passiveResource.getId()+":"+assemblyContext.getId();
					
					PassiveResourceResult result = ResourceenvironmentdecoratorFactory.eINSTANCE.createPassiveResourceResult();
					
					result.setPassiveResource_PassiveResourceResult(passiveResource);
					result.setAssemblyContext_PassiveResourceResult(assemblyContext);
					result.setEntityName("Utilisation of "+passiveResource.getEntityName()+" id: "+passiveResourceAndAssemblyContextId);
					
					
					repo.getUtilisationResults_ResultDecoratorRepository().add(result);
					idsToPassiveResourceResult.put(passiveResourceAndAssemblyContextId, result);
					
				}
		
			}
			
		}
		//iterate through sensors and store the (ExternalCall,AssemblyContext) pairs with their sensors.
		Collection<Sensor> sensorList = this.experiment.getSensors();
		
		for (Sensor sensor : sensorList) {
			String sensorName = sensor.getSensorName();
			if (sensorName.contains("Passive Resource")){
				String passiveResourceAndAssemblyContextID = sensorName.substring(sensorName.lastIndexOf(" ")+1);
				PassiveResourceResult passiveResourceResult = idsToPassiveResourceResult.get(passiveResourceAndAssemblyContextID);
				
				if (passiveResourceResult != null){
				
					SensorAndMeasurements results = run.getMeasurementsOfSensor(sensor);

					if (sensorName.contains("Hold time")){
						passiveResourceResult.setAverageHoldingTime(calculateValue(results, "mean"));
					} else if (sensorName.contains("Wait time")){
						passiveResourceResult.setAverageWaitTime(calculateValue(results, "mean"));
					} else if (sensorName.contains("Util")){
						// for passive resources, also consider the capacity when calculating the util
						int capacity = Integer.parseInt(passiveResourceResult.getPassiveResource_PassiveResourceResult().getCapacity_PassiveResource().getSpecification());
						retrieveUtilisationFromSensor(sensor, passiveResourceResult, capacity);
						 
					}
				} else {
					logger.warn("Unknown passive resource id "+passiveResourceAndAssemblyContextID+", ignoring this sensor.");
				}
			}
			
		}
		
		return idsToPassiveResourceResult;
		
	}

	private ConfidenceInterval determineConfidenceInterval() throws AnalysisFailedException {
		ConfidenceInterval ci;
		SensorAndMeasurements meas = getUsageScenarioMeasurements();
		Sensor sensor = meas.getSensor();
		if (sensor instanceof TimeSpanSensor){
			PhiMixingBatchAlgorithm statisticChecker = new PhiMixingBatchAlgorithm();
						
			for (Measurement m : meas.getMeasurements()) {
				TimeSpanMeasurement t = (TimeSpanMeasurement)m;
				statisticChecker.offerSample(t.getTimeSpan());
			}
			if (statisticChecker.hasValidBatches()){
				ci = new SampleMeanEstimator().estimateConfidence(statisticChecker.getBatchMeans(),this.alpha);
			} else {
				ci = new ConfidenceInterval(Double.NaN, 0, Double.POSITIVE_INFINITY, this.alpha);
			}
			return ci;
		} else {
			logger.error("Sensor of usage scenario is not a time span sensor, cannot calculate statistics.");
			return null;
		}
	}

	@Override
	public double getMeanValue() {
		return meanValue;
	}
	
	public double getStandardDeviation() {
		return stdDeviation;
	}
	
	public double getVariance() throws AnalysisFailedException {
		double std = this.getStandardDeviation();
		return std * std;
	}
	
	public double getCoefficientOfVariance()  {
		double std = this.getStandardDeviation();
		double mean = this.getMeanValue();
		return std / mean;
	}
	
	/**
	 * Retrieves the confidence interval. When called for the first time, this 
	 * method calculates the confidence interval with the given level from the 
	 * data stored in the usage scenario sensor. 
	 * If no batch independence is given, the confidence interval is set to  
	 * 0 to positive infinity. 
	 */
	public ConfidenceInterval getConfidenceInterval(){
		return this.confidenceInterval;
	}
	
	private SensorAndMeasurements getUsageScenarioMeasurements() throws AnalysisFailedException{
		//Get usage scenario sensor. 
		Sensor respTimeSensor = getSensorForUsageScenario(experiment, this.usageSenarioName);
		if (respTimeSensor != null){
			return run.getMeasurementsOfSensor(respTimeSensor);
			
		} else 
			throw new AnalysisFailedException("Could not find sensor for usage scenario "+this.usageSenarioName);
	}
	
	public double getMedianValue() {
		return medianValue;
	}


	private double calculateValue(SensorAndMeasurements sam, String command) throws AnalysisFailedException {
		AnalysisFailedException error = null;
		try {
		if (RConnection.isEngineAvailable()){

			RConnection rConnection = RConnection.getRConnection();
			String sensorName = storeMeasurementsInRVector(sam, sam.getSensor().getSensorID(), TimeseriesData.TIMESPAN, rConnection);
			Vector<REXP> rResult = rConnection.execute(command+"(" + sensorName + ")\n");
			if (rResult.size() > 0) {
				if (rResult.get(0).rtype == REXP.REALSXP){
					return rResult.get(0).asDouble();
				} else {
					error = new AnalysisFailedException("R engine returned a non-double when trying to calculate the mean value: "+rResult.get(0).asString());
					logger.error(error.getMessage());
				}
			} else {
				error = new AnalysisFailedException("Querying R engine returned an empty result. Maybe simulation time was too short and no results have been written to the response time sensor."); 
				logger.error(error.getMessage());
			}
		} else {
			error = new AnalysisFailedException("Could not connect to R engine! Check your R configuration.");
			logger.error(error.getMessage());
		}
		} catch (ExceptionInInitializerError e) {
			error = new AnalysisFailedException("Could not connect to R engine!  Check your R configuration.", e);
			logger.error(error.getMessage());
			logger.error(e.getMessage());
		}
		throw error;
	}
	
	private static Sensor getSensorForUsageScenario(Experiment exp, String usageScenarioName) {
		Collection<Sensor> sensors = exp.getSensors();
		for (Iterator<Sensor> iterator = sensors.iterator(); iterator.hasNext();) {
			Sensor sensor = iterator.next();
			//logger.debug("Experiment has a sensor with ID "+sensor.getSensorID()+" and name "+sensor.getSensorName()+".");
			//TODO: repeat the java name adjustment here (parentheses etc.)
			if (sensor.getSensorName().contains(usageScenarioName)){
				logger.debug("Found sensor for usage scenario "+usageScenarioName);
				return sensor;
			}
		}
		logger.error("No sensor found for usage scenario "+usageScenarioName);
		return null;
	}
	
	private static Sensor getSensorForResource(Experiment exp, ResourceContainer rc, ProcessingResourceSpecification res, String sensorTypeString) {
		Collection<Sensor> sensors = exp.getSensors();
		for (Iterator<Sensor> iterator = sensors.iterator(); iterator.hasNext();) {
			Sensor sensor = iterator.next();
			//logger.debug("Experiment has a sensor with ID "+sensor.getSensorID()+" and name "+sensor.getSensorName()+".");
			if (sensor.getSensorName().contains(res.getActiveResourceType_ActiveResourceSpecification().getEntityName())
					&& sensor.getSensorName().contains(sensorTypeString)
					&& sensor.getSensorName().contains(rc.getEntityName())){
				logger.debug("Found sensor of "+sensorTypeString+" for the resource "+rc.getEntityName()+": "+res.getActiveResourceType_ActiveResourceSpecification().getEntityName());
				return sensor;
			}
		}
		logger.error("No sensor of "+sensorTypeString+" found for resource "+rc.getEntityName()+": "+res.getActiveResourceType_ActiveResourceSpecification().getEntityName());
		return null;
	}

	/**Export the measurements of a sensor to R. 
	 * There are two alternatives. The measurements can be transferred 
	 * via an array, which implies certain size restrictions. An alternative is
	 * to use a temporary file. The behavior can only be switched in source 
	 * code by the constant <code>TRANSFER_TYPE</code>.
	 * Variable names in R are as follows:<br /> 
	 *   For timespan data: "sensor" + #<br />
	 *   For eventtime data: "sensor" + # + "_ET")<br />
	 * 
	 * @param measurements Measurements for a sensor.
	 * @param sensorNumber number of the sensor vector in R.
	 * @param dataSelection the data element to save.
	 * @param rConnection Connection to the R engine.
	 * @return R variable name which contains the data.
	 */
	protected static String storeMeasurementsInRVector(
			final SensorAndMeasurements measurements, final long sensorNumber,
			final TimeseriesData dataSelection, final RConnection rConnection) {
		String sensorName = null;

		if (dataSelection == TimeseriesData.TIMESPAN) {
			sensorName = "sensor" + sensorNumber; 
		} else 
			if (dataSelection == TimeseriesData.EVENTTIME) {
			sensorName = "sensor" + sensorNumber + "_ET";
		} else {
			throw new RuntimeException("Unknown data element of time series.");
		}

		//if (TRANSFER_TYPE == TransferType.MEMORY) {
			// Activate to transfer data via memory
			double[] measurementsArray = 
				prepareExportToRByMemory(measurements, dataSelection);
			rConnection.assign(sensorName, measurementsArray);
		//}
/*		if (TRANSFER_TYPE == TransferType.FILE) {
			// Activate to transfer data via temporary file
			String rCommand = sensorName + " <- "
				+ prepareExportToRByFile(measurements, dataSelection);
			Vector<REXP> result = rConnection.execute(rCommand);
			// Error handling
			if (!rConnection.getLastConsoleMessage().equalsIgnoreCase("Read " 
					+ measurements.getMeasurements().size() + " items\n")) {
				String rResults = "Executing command: '" + rCommand + "' with ";
				for (REXP currentResult : result) {
					rResults += "String: " + currentResult.asString() 
						+ ", SymbolName: " + currentResult.asSymbolName() 
						+ ", Type: " + currentResult.getType() + "\n";
				}
				RVisualisationPlugin.log(IStatus.INFO,
					"Storing Measurements in R via file is most likely wrong. Last message "
					+ "on the console was: " + rConnection.getLastConsoleMessage()
					+ "R returned:\n" + rResults);
			}

		}*/
		return sensorName;
	}
	
	/**Prepares the export the measurements of a sensor to R. Therefore an 
	 * array is filled with the measurements. 
	 * 
	 * Copied from 
	 * de.uka.ipd.sdq.sensorframework.visualisation.rvisualisation.reports.RReport. 
	 * TODO: Possibly make this public in RReport and use it properly or refactor it 
	 * to a helper class.
	 * 
	 * @param measurements Measurements for a sensor.
	 * @param dataSelection the data element to save.
	 * @return R command to read measurements. 
	 *         Can be used to store data in a r vector.
	 * @author Henning
	 */
	private static double[] prepareExportToRByMemory(
			final SensorAndMeasurements measurements,
			final TimeseriesData dataSelection) {
		double[] measurementsArray = 
			new double[measurements.getMeasurements().size()];
		if (measurements.getMeasurements().size() == Integer.MAX_VALUE) {
			RVisualisationPlugin.log(IStatus.ERROR,
					"Too many measurements. Results might be inaccurate.");
		}
		int position = 0;
		for (Measurement time : measurements.getMeasurements()) {
			TimeSpanMeasurement tsm = (TimeSpanMeasurement) time;
			measurementsArray[position++] = 
				(dataSelection == TimeseriesData.EVENTTIME) 
					? tsm.getEventTime() 
					: tsm.getTimeSpan(); 
		}
		return measurementsArray;
	}

	/**
	 * {@inheritDoc}
	 * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult#compareTo(de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult)
	 */
	@Override
	public int compareTo(IAnalysisResult other) {
		double difference;
		
		difference = (this.getMeanValue()-other.getMeanValue());
		if (difference < 0 && difference > -1)
			return -1;
		if (difference > 0 && difference < 1)
			return 1;
		return (int)Math.round(difference);
		
	}

	/**
	 * Get the utilisation of the passed resource
	 */
	private ProcessingResourceSpecificationResult getUtilisationOfResource(ResourceContainer container, ProcessingResourceSpecification resource) throws AnalysisFailedException {
		Sensor utilSensor = getSensorForResource(this.experiment, container, resource, "Util");
		Sensor demandedSensor = getSensorForResource(this.experiment, container, resource, "Demanded");
		
		// for later when wait os available
		//Sensor waitSensor = getSensorForResource(this.experiment, container, resource, "Wait");
		
		ProcessingResourceSpecificationResult result = ResourceenvironmentdecoratorFactory.eINSTANCE.createProcessingResourceSpecificationResult();
		
		if (utilSensor != null /*&& waitSensor != null*/){
			
			try {
				
				retrieveUtilisationFromSensor(utilSensor, result,1);
				
				/*
				SensorAndMeasurements sam = run.getMeasurementsOfSensor(waitSensor);
				result.setAverageWaitTime(calculateValue(sam, "mean"));
				*/
				result.setAverageWaitTime(Double.NaN);
				
				SensorAndMeasurements sam = run.getMeasurementsOfSensor(demandedSensor);
				result.setDemandedTime(calculateValue(sam, "mean"));
			
			} catch (RuntimeException e) {
				// FIXME: The call "SensorAndMeasurements sam =
				// run.getMeasurementsOfSensor(sensor);" above sometimes results
				// in a RuntimeException, because a State could not be
				// deserialised. Better fix that porperly instead of catching
				// the error here.
				logger.error("A runtime exception occured while accessing the sendorframework. I'll try to ignore it and continue.");
				e.printStackTrace();
				return null;
			} 
		} else 
			throw new AnalysisFailedException("Could not find sensor for resource "+container.getEntityName()+": "+resource.getActiveResourceType_ActiveResourceSpecification().getEntityName());

		return result;
	}

	/**
	 * 
	 * @param sensor
	 * @param result
	 * @param capacity The capacity of the resource, will divide busyFraction by this number to 
	 */
	private void retrieveUtilisationFromSensor(Sensor sensor,
			UtilisationResult result, int capacity) {
		SensorAndMeasurements sam = run.getMeasurementsOfSensor(sensor);
		double busyFraction = 0;
		
		double totalTime = 0;
		double weightedSumOfJobs = 0;
		
		if (sam.getMeasurements().size() > 0){
			StateSensorToPieAdapter dataAdapter = new StateSensorToPieAdapter(
					sam);
			Pie pie = (Pie) dataAdapter.getAdaptedObject();
			Collection<PieEntity> pieParts = pie
					.getEntities(Integer.MAX_VALUE);
			double totalIdleTime = 0;
			// 	I need to sum up all pie parts to get the 100% comparison

			double totalWeights = 0;
			int maxNumberOfJobs = 0;
		
			for (Iterator<PieEntity> iterator = pieParts.iterator(); iterator
			.hasNext();) {
				PieEntity pieEntity = iterator.next();
				totalTime += pieEntity.getValue();
				totalWeights += pieEntity.getValue();

				if (pieEntity.getLabel().contains("Idle")) {
					// this returns a large number > 399
					totalIdleTime = pieEntity.getValue();
				} else {
					String[] busyLabel = pieEntity.getLabel().split(" ");
					if (busyLabel.length > 1){
						try {
							String numberOfJobsString = busyLabel[1];
							int noOfJobs = Integer.parseInt(numberOfJobsString);
							totalWeights += pieEntity.getValue();
							weightedSumOfJobs += noOfJobs * pieEntity.getValue();
							if (noOfJobs > maxNumberOfJobs){
								maxNumberOfJobs = noOfJobs;
							}
						} catch (Exception e){
							logger.warn("Cannot read in queue lengths, labels of the pie chart may have changed.");
						}
					} else {
						logger.warn("Cannot read in queue lengths, labels of the pie chart may have changed.");
					}
				}

			}
			busyFraction = (1 - (totalIdleTime / totalTime));
			//queue length including the active job.
			result.setAverageQueueLength(weightedSumOfJobs / totalWeights);
			result.setMaxQueueLength(maxNumberOfJobs);
		}
		if (capacity == 1){
			result.setResourceUtilisation(busyFraction);
		} else if (totalTime > 0){
			/* if capacity is larger than 1 (for passive resources), calculate
			   the interval below the line of current resource usage, which is 
			   for each level of usage (noOfJobs) the time that it is active (x axis)
			   times the noOfJobs. Thus, this corresponds to the weightedSumOfJobs value.
			   Then divide by totalTime * capacity which is the maximum utilisation.
			   A value of 100% then means that all free resources have been used all the time. 
			*/
			double util = weightedSumOfJobs / (totalTime * capacity);
			result.setResourceUtilisation(util);
		}
	}
	
	@Override
	public long getNumberOfObservations() {
		return this.observations;
	}

	@Override
	public ResultDecoratorRepository getResults() {
		return this.results;
	}
	
	/**Prepares to export the measurements of a time series sensor to R. 
	 * Therefore a temporary file is created and the R command line to 
	 * import this data is returned. 
	 * 
	 * @param measurements Measurements for a sensor.
	 * @param dataSelection the data element to save.
	 * @return R command to read measurements. 
	 *         Can be used to store data in a r vector.
	 */
/*	private String prepareExportToRByFile(
			final SensorAndMeasurements measurements,
			final TimeseriesData dataSelection) {
		File temporaryFile;
		try {
			temporaryFile = File.createTempFile("data", 
					(dataSelection == TimeseriesData.EVENTTIME) 
						? "_et.txt" 
						: "_ts.txt"
					);
			temporaryFile.deleteOnExit();
			FileWriter temporaryFileWriter = new FileWriter(temporaryFile);
			StringBuffer result = new StringBuffer();
			for (Measurement time : measurements.getMeasurements()) {
				TimeSpanMeasurement tsm = (TimeSpanMeasurement) time;
				result.append(
					(dataSelection == TimeseriesData.EVENTTIME) 
						? tsm.getEventTime() 
						: tsm.getTimeSpan() 
					);
				result.append(" ");
			}
			temporaryFileWriter.write(result.toString());
			temporaryFileWriter.close();
			return "scan(file=\"" 
				+ temporaryFile.getAbsolutePath().replace(File.separator, 
						"\\\\")
				+ "\")";
		} catch (IOException e) {
			RVisualisationPlugin.log(IStatus.ERROR,
				"Error accessing temporary file to transfer sensordata "
				+ "to R. \n\n Details: "	+ e.getMessage());
		}
		return "";
	}*/

}

class ExternalCallActionWithSensors {
	
	private ExternalCallAction externalCallAction;
	private AssemblyContextContext assemblyContext;
	private List<Sensor> sensors;

	public ExternalCallActionWithSensors(ExternalCallAction e, AssemblyContextContext myAssemblyContext){
		this.externalCallAction = e;
		this.assemblyContext = myAssemblyContext;
		this.sensors = new LinkedList<Sensor>();
	}
	
	public ExternalCallAction getExternalCall() {
		return this.externalCallAction;
	}
	
	public AssemblyContextContext getAssemblyContext() {
		return this.assemblyContext;
	}

	public void addSensor(Sensor s){
		this.sensors.add(s);
	}
	
	public List<Sensor> getSensors(){
		return this.sensors;
	}
	
	@Override
	public boolean equals(Object o){
		if (this == o){
			return true;
		}
		if (o instanceof ExternalCallActionWithSensors){
			ExternalCallActionWithSensors other = (ExternalCallActionWithSensors)o;
			return other.getAssemblyContext().equals(this.assemblyContext)
				&& other.getExternalCall().equals(this.externalCallAction);
		} else {
			return false;
		}
		
	}
}

class AssemblyContextContext {
	
	private AssemblyContext assemblyContext;
	private AssemblyContextContext parentAssemblyContext;


	public AssemblyContextContext(AssemblyContext thisContext){
		this.assemblyContext = thisContext;
	}
	
	public boolean hasParent(){
		return this.parentAssemblyContext != null;
	}
	
	/**
	 * @return the assemblyContext
	 */
	public AssemblyContext getAssemblyContext() {
		return assemblyContext;
	}

	/**
	 * @return the parentAssemblyContext
	 */
	public AssemblyContextContext getParentAssemblyContext() {
		return parentAssemblyContext;
	}
	
	public void setParent(AssemblyContextContext assemblyContextContext){
		this.parentAssemblyContext = assemblyContextContext;
	}
	
	
}
