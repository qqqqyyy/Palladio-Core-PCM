/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LqnCore.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import LqnCore.ActivityDefBase;
import LqnCore.ActivityDefType;
import LqnCore.ActivityGraphBase;
import LqnCore.ActivityListType;
import LqnCore.ActivityLoopListType;
import LqnCore.ActivityLoopType;
import LqnCore.ActivityMakingCallType;
import LqnCore.ActivityOrType;
import LqnCore.ActivityPhasesType;
import LqnCore.ActivityType;
import LqnCore.AndJoinListType;
import LqnCore.AsynchCallType;
import LqnCore.BindType;
import LqnCore.CallListType;
import LqnCore.DocumentRoot;
import LqnCore.EntryActivityDefType;
import LqnCore.EntryActivityGraph;
import LqnCore.EntryMakingCallType;
import LqnCore.EntryType;
import LqnCore.FirstPlotType;
import LqnCore.HistogramBinType;
import LqnCore.InPortType;
import LqnCore.InterfaceType;
import LqnCore.LqnCorePackage;
import LqnCore.LqnCoreType;
import LqnCore.LqnModelType;
import LqnCore.MakingCallType;
import LqnCore.OrListType;
import LqnCore.OutPortType;
import LqnCore.OutputDistributionType;
import LqnCore.OutputEntryDistributionType;
import LqnCore.OutputResultForwardingANDJoinDelay;
import LqnCore.OutputResultType;
import LqnCore.ParaType;
import LqnCore.ParameterType;
import LqnCore.PhaseActivities;
import LqnCore.PlotControlType;
import LqnCore.PlotType;
import LqnCore.PortBindingType;
import LqnCore.PragmaType;
import LqnCore.PrecedenceType;
import LqnCore.ProcessorBindingType;
import LqnCore.ProcessorType;
import LqnCore.ReplyActivityType;
import LqnCore.ReplyEntryType;
import LqnCore.ResultConf95Type;
import LqnCore.ResultConf95Type1;
import LqnCore.ResultConf99Type;
import LqnCore.ResultConf99Type1;
import LqnCore.ResultGeneralType;
import LqnCore.RunControlType;
import LqnCore.ServiceType;
import LqnCore.SingleActivityListType;
import LqnCore.SlotType;
import LqnCore.SolverParamsType;
import LqnCore.SynchCallType;
import LqnCore.TaskActivityGraph;
import LqnCore.TaskType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see LqnCore.LqnCorePackage
 * @generated
 */
public class LqnCoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LqnCorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnCoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LqnCorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LqnCoreSwitch<Adapter> modelSwitch =
		new LqnCoreSwitch<Adapter>() {
			@Override
			public Adapter caseActivityDefBase(ActivityDefBase object) {
				return createActivityDefBaseAdapter();
			}
			@Override
			public Adapter caseActivityDefType(ActivityDefType object) {
				return createActivityDefTypeAdapter();
			}
			@Override
			public Adapter caseActivityGraphBase(ActivityGraphBase object) {
				return createActivityGraphBaseAdapter();
			}
			@Override
			public Adapter caseActivityListType(ActivityListType object) {
				return createActivityListTypeAdapter();
			}
			@Override
			public Adapter caseActivityLoopListType(ActivityLoopListType object) {
				return createActivityLoopListTypeAdapter();
			}
			@Override
			public Adapter caseActivityLoopType(ActivityLoopType object) {
				return createActivityLoopTypeAdapter();
			}
			@Override
			public Adapter caseActivityMakingCallType(ActivityMakingCallType object) {
				return createActivityMakingCallTypeAdapter();
			}
			@Override
			public Adapter caseActivityOrType(ActivityOrType object) {
				return createActivityOrTypeAdapter();
			}
			@Override
			public Adapter caseActivityPhasesType(ActivityPhasesType object) {
				return createActivityPhasesTypeAdapter();
			}
			@Override
			public Adapter caseActivityType(ActivityType object) {
				return createActivityTypeAdapter();
			}
			@Override
			public Adapter caseAndJoinListType(AndJoinListType object) {
				return createAndJoinListTypeAdapter();
			}
			@Override
			public Adapter caseAsynchCallType(AsynchCallType object) {
				return createAsynchCallTypeAdapter();
			}
			@Override
			public Adapter caseBindType(BindType object) {
				return createBindTypeAdapter();
			}
			@Override
			public Adapter caseCallListType(CallListType object) {
				return createCallListTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEntryActivityDefType(EntryActivityDefType object) {
				return createEntryActivityDefTypeAdapter();
			}
			@Override
			public Adapter caseEntryActivityGraph(EntryActivityGraph object) {
				return createEntryActivityGraphAdapter();
			}
			@Override
			public Adapter caseEntryMakingCallType(EntryMakingCallType object) {
				return createEntryMakingCallTypeAdapter();
			}
			@Override
			public Adapter caseEntryType(EntryType object) {
				return createEntryTypeAdapter();
			}
			@Override
			public Adapter caseFirstPlotType(FirstPlotType object) {
				return createFirstPlotTypeAdapter();
			}
			@Override
			public Adapter caseHistogramBinType(HistogramBinType object) {
				return createHistogramBinTypeAdapter();
			}
			@Override
			public Adapter caseInPortType(InPortType object) {
				return createInPortTypeAdapter();
			}
			@Override
			public Adapter caseInterfaceType(InterfaceType object) {
				return createInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseLqnCoreType(LqnCoreType object) {
				return createLqnCoreTypeAdapter();
			}
			@Override
			public Adapter caseLqnModelType(LqnModelType object) {
				return createLqnModelTypeAdapter();
			}
			@Override
			public Adapter caseMakingCallType(MakingCallType object) {
				return createMakingCallTypeAdapter();
			}
			@Override
			public Adapter caseOrListType(OrListType object) {
				return createOrListTypeAdapter();
			}
			@Override
			public Adapter caseOutPortType(OutPortType object) {
				return createOutPortTypeAdapter();
			}
			@Override
			public Adapter caseOutputDistributionType(OutputDistributionType object) {
				return createOutputDistributionTypeAdapter();
			}
			@Override
			public Adapter caseOutputEntryDistributionType(OutputEntryDistributionType object) {
				return createOutputEntryDistributionTypeAdapter();
			}
			@Override
			public Adapter caseOutputResultForwardingANDJoinDelay(OutputResultForwardingANDJoinDelay object) {
				return createOutputResultForwardingANDJoinDelayAdapter();
			}
			@Override
			public Adapter caseOutputResultType(OutputResultType object) {
				return createOutputResultTypeAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseParaType(ParaType object) {
				return createParaTypeAdapter();
			}
			@Override
			public Adapter casePhaseActivities(PhaseActivities object) {
				return createPhaseActivitiesAdapter();
			}
			@Override
			public Adapter casePlotControlType(PlotControlType object) {
				return createPlotControlTypeAdapter();
			}
			@Override
			public Adapter casePlotType(PlotType object) {
				return createPlotTypeAdapter();
			}
			@Override
			public Adapter casePortBindingType(PortBindingType object) {
				return createPortBindingTypeAdapter();
			}
			@Override
			public Adapter casePragmaType(PragmaType object) {
				return createPragmaTypeAdapter();
			}
			@Override
			public Adapter casePrecedenceType(PrecedenceType object) {
				return createPrecedenceTypeAdapter();
			}
			@Override
			public Adapter caseProcessorBindingType(ProcessorBindingType object) {
				return createProcessorBindingTypeAdapter();
			}
			@Override
			public Adapter caseProcessorType(ProcessorType object) {
				return createProcessorTypeAdapter();
			}
			@Override
			public Adapter caseReplyActivityType(ReplyActivityType object) {
				return createReplyActivityTypeAdapter();
			}
			@Override
			public Adapter caseReplyEntryType(ReplyEntryType object) {
				return createReplyEntryTypeAdapter();
			}
			@Override
			public Adapter caseResultConf95Type(ResultConf95Type object) {
				return createResultConf95TypeAdapter();
			}
			@Override
			public Adapter caseResultConf95Type1(ResultConf95Type1 object) {
				return createResultConf95Type1Adapter();
			}
			@Override
			public Adapter caseResultConf99Type(ResultConf99Type object) {
				return createResultConf99TypeAdapter();
			}
			@Override
			public Adapter caseResultConf99Type1(ResultConf99Type1 object) {
				return createResultConf99Type1Adapter();
			}
			@Override
			public Adapter caseResultGeneralType(ResultGeneralType object) {
				return createResultGeneralTypeAdapter();
			}
			@Override
			public Adapter caseRunControlType(RunControlType object) {
				return createRunControlTypeAdapter();
			}
			@Override
			public Adapter caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			@Override
			public Adapter caseSingleActivityListType(SingleActivityListType object) {
				return createSingleActivityListTypeAdapter();
			}
			@Override
			public Adapter caseSlotType(SlotType object) {
				return createSlotTypeAdapter();
			}
			@Override
			public Adapter caseSolverParamsType(SolverParamsType object) {
				return createSolverParamsTypeAdapter();
			}
			@Override
			public Adapter caseSynchCallType(SynchCallType object) {
				return createSynchCallTypeAdapter();
			}
			@Override
			public Adapter caseTaskActivityGraph(TaskActivityGraph object) {
				return createTaskActivityGraphAdapter();
			}
			@Override
			public Adapter caseTaskType(TaskType object) {
				return createTaskTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ActivityDefBase <em>Activity Def Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ActivityDefBase
	 * @generated
	 */
	public Adapter createActivityDefBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ActivityDefType <em>Activity Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ActivityDefType
	 * @generated
	 */
	public Adapter createActivityDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ActivityGraphBase <em>Activity Graph Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ActivityGraphBase
	 * @generated
	 */
	public Adapter createActivityGraphBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ActivityListType <em>Activity List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ActivityListType
	 * @generated
	 */
	public Adapter createActivityListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ActivityLoopListType <em>Activity Loop List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ActivityLoopListType
	 * @generated
	 */
	public Adapter createActivityLoopListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ActivityLoopType <em>Activity Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ActivityLoopType
	 * @generated
	 */
	public Adapter createActivityLoopTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ActivityMakingCallType <em>Activity Making Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ActivityMakingCallType
	 * @generated
	 */
	public Adapter createActivityMakingCallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ActivityOrType <em>Activity Or Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ActivityOrType
	 * @generated
	 */
	public Adapter createActivityOrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ActivityPhasesType <em>Activity Phases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ActivityPhasesType
	 * @generated
	 */
	public Adapter createActivityPhasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ActivityType
	 * @generated
	 */
	public Adapter createActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.AndJoinListType <em>And Join List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.AndJoinListType
	 * @generated
	 */
	public Adapter createAndJoinListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.AsynchCallType <em>Asynch Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.AsynchCallType
	 * @generated
	 */
	public Adapter createAsynchCallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.BindType <em>Bind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.BindType
	 * @generated
	 */
	public Adapter createBindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.CallListType <em>Call List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.CallListType
	 * @generated
	 */
	public Adapter createCallListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.EntryActivityDefType <em>Entry Activity Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.EntryActivityDefType
	 * @generated
	 */
	public Adapter createEntryActivityDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.EntryActivityGraph <em>Entry Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.EntryActivityGraph
	 * @generated
	 */
	public Adapter createEntryActivityGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.EntryMakingCallType <em>Entry Making Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.EntryMakingCallType
	 * @generated
	 */
	public Adapter createEntryMakingCallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.EntryType
	 * @generated
	 */
	public Adapter createEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.FirstPlotType <em>First Plot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.FirstPlotType
	 * @generated
	 */
	public Adapter createFirstPlotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.HistogramBinType <em>Histogram Bin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.HistogramBinType
	 * @generated
	 */
	public Adapter createHistogramBinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.InPortType <em>In Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.InPortType
	 * @generated
	 */
	public Adapter createInPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.InterfaceType
	 * @generated
	 */
	public Adapter createInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.LqnCoreType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.LqnCoreType
	 * @generated
	 */
	public Adapter createLqnCoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.LqnModelType <em>Lqn Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.LqnModelType
	 * @generated
	 */
	public Adapter createLqnModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.MakingCallType <em>Making Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.MakingCallType
	 * @generated
	 */
	public Adapter createMakingCallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.OrListType <em>Or List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.OrListType
	 * @generated
	 */
	public Adapter createOrListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.OutPortType <em>Out Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.OutPortType
	 * @generated
	 */
	public Adapter createOutPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.OutputDistributionType <em>Output Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.OutputDistributionType
	 * @generated
	 */
	public Adapter createOutputDistributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.OutputEntryDistributionType <em>Output Entry Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.OutputEntryDistributionType
	 * @generated
	 */
	public Adapter createOutputEntryDistributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.OutputResultForwardingANDJoinDelay <em>Output Result Forwarding AND Join Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.OutputResultForwardingANDJoinDelay
	 * @generated
	 */
	public Adapter createOutputResultForwardingANDJoinDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.OutputResultType <em>Output Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.OutputResultType
	 * @generated
	 */
	public Adapter createOutputResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ParaType <em>Para Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ParaType
	 * @generated
	 */
	public Adapter createParaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.PhaseActivities <em>Phase Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.PhaseActivities
	 * @generated
	 */
	public Adapter createPhaseActivitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.PlotControlType <em>Plot Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.PlotControlType
	 * @generated
	 */
	public Adapter createPlotControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.PlotType <em>Plot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.PlotType
	 * @generated
	 */
	public Adapter createPlotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.PortBindingType <em>Port Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.PortBindingType
	 * @generated
	 */
	public Adapter createPortBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.PragmaType <em>Pragma Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.PragmaType
	 * @generated
	 */
	public Adapter createPragmaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.PrecedenceType <em>Precedence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.PrecedenceType
	 * @generated
	 */
	public Adapter createPrecedenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ProcessorBindingType <em>Processor Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ProcessorBindingType
	 * @generated
	 */
	public Adapter createProcessorBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ProcessorType <em>Processor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ProcessorType
	 * @generated
	 */
	public Adapter createProcessorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ReplyActivityType <em>Reply Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ReplyActivityType
	 * @generated
	 */
	public Adapter createReplyActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ReplyEntryType <em>Reply Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ReplyEntryType
	 * @generated
	 */
	public Adapter createReplyEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ResultConf95Type <em>Result Conf95 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ResultConf95Type
	 * @generated
	 */
	public Adapter createResultConf95TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ResultConf95Type1 <em>Result Conf95 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ResultConf95Type1
	 * @generated
	 */
	public Adapter createResultConf95Type1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ResultConf99Type <em>Result Conf99 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ResultConf99Type
	 * @generated
	 */
	public Adapter createResultConf99TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ResultConf99Type1 <em>Result Conf99 Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ResultConf99Type1
	 * @generated
	 */
	public Adapter createResultConf99Type1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ResultGeneralType <em>Result General Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ResultGeneralType
	 * @generated
	 */
	public Adapter createResultGeneralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.RunControlType <em>Run Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.RunControlType
	 * @generated
	 */
	public Adapter createRunControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.SingleActivityListType <em>Single Activity List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.SingleActivityListType
	 * @generated
	 */
	public Adapter createSingleActivityListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.SlotType <em>Slot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.SlotType
	 * @generated
	 */
	public Adapter createSlotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.SolverParamsType <em>Solver Params Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.SolverParamsType
	 * @generated
	 */
	public Adapter createSolverParamsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.SynchCallType <em>Synch Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.SynchCallType
	 * @generated
	 */
	public Adapter createSynchCallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.TaskActivityGraph <em>Task Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.TaskActivityGraph
	 * @generated
	 */
	public Adapter createTaskActivityGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LqnCore.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LqnCore.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LqnCoreAdapterFactory