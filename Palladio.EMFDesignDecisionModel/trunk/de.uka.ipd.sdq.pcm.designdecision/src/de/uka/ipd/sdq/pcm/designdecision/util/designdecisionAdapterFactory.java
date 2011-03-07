/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.util;

import de.uka.ipd.sdq.pcm.designdecision.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage
 * @generated
 */
public class designdecisionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static designdecisionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public designdecisionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = designdecisionPackage.eINSTANCE;
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
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected designdecisionSwitch<Adapter> modelSwitch =
		new designdecisionSwitch<Adapter>() {
			@Override
			public Adapter caseDegreeOfFreedom(DegreeOfFreedom object) {
				return createDegreeOfFreedomAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseRangeDegree(RangeDegree object) {
				return createRangeDegreeAdapter();
			}
			@Override
			public Adapter caseEnumerationDegree(EnumerationDegree object) {
				return createEnumerationDegreeAdapter();
			}
			@Override
			public Adapter caseEnumerationChoice(EnumerationChoice object) {
				return createEnumerationChoiceAdapter();
			}
			@Override
			public Adapter caseContinousRangeChoice(ContinousRangeChoice object) {
				return createContinousRangeChoiceAdapter();
			}
			@Override
			public Adapter caseContinuousProcessingRateDegree(ContinuousProcessingRateDegree object) {
				return createContinuousProcessingRateDegreeAdapter();
			}
			@Override
			public Adapter caseContinuousRangeDegree(ContinuousRangeDegree object) {
				return createContinuousRangeDegreeAdapter();
			}
			@Override
			public Adapter caseProcessingResourceDegree(ProcessingResourceDegree object) {
				return createProcessingResourceDegreeAdapter();
			}
			@Override
			public Adapter caseAllocationDegree(AllocationDegree object) {
				return createAllocationDegreeAdapter();
			}
			@Override
			public Adapter caseAssembledComponentDegree(AssembledComponentDegree object) {
				return createAssembledComponentDegreeAdapter();
			}
			@Override
			public Adapter caseDiscreteRangeDegree(DiscreteRangeDegree object) {
				return createDiscreteRangeDegreeAdapter();
			}
			@Override
			public Adapter caseDiscreteRangeChoice(DiscreteRangeChoice object) {
				return createDiscreteRangeChoiceAdapter();
			}
			@Override
			public Adapter caseResourceContainerReplicationDegree(ResourceContainerReplicationDegree object) {
				return createResourceContainerReplicationDegreeAdapter();
			}
			@Override
			public Adapter caseProblem(Problem object) {
				return createProblemAdapter();
			}
			@Override
			public Adapter caseConnectorConfigDegree(ConnectorConfigDegree object) {
				return createConnectorConfigDegreeAdapter();
			}
			@Override
			public Adapter caseCandidate(Candidate object) {
				return createCandidateAdapter();
			}
			@Override
			public Adapter caseCandidates(Candidates object) {
				return createCandidatesAdapter();
			}
			@Override
			public Adapter caseFeatureConfigDegree(FeatureConfigDegree object) {
				return createFeatureConfigDegreeAdapter();
			}
			@Override
			public Adapter caseFeatureGroupDegree(FeatureGroupDegree object) {
				return createFeatureGroupDegreeAdapter();
			}
			@Override
			public Adapter caseFeatureSubset(FeatureSubset object) {
				return createFeatureSubsetAdapter();
			}
			@Override
			public Adapter caseOptionalFeatureDegree(OptionalFeatureDegree object) {
				return createOptionalFeatureDegreeAdapter();
			}
			@Override
			public Adapter caseDiscreteProcessingRateDegree(DiscreteProcessingRateDegree object) {
				return createDiscreteProcessingRateDegreeAdapter();
			}
			@Override
			public Adapter caseCapacityDegree(CapacityDegree object) {
				return createCapacityDegreeAdapter();
			}
			@Override
			public Adapter caseSchedulingPolicyDegree(SchedulingPolicyDegree object) {
				return createSchedulingPolicyDegreeAdapter();
			}
			@Override
			public Adapter caseEnumDegree(EnumDegree object) {
				return createEnumDegreeAdapter();
			}
			@Override
			public Adapter caseSchedulingPolicyChoice(SchedulingPolicyChoice object) {
				return createSchedulingPolicyChoiceAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedom <em>Degree Of Freedom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedom
	 * @generated
	 */
	public Adapter createDegreeOfFreedomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.RangeDegree <em>Range Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.RangeDegree
	 * @generated
	 */
	public Adapter createRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.EnumerationDegree <em>Enumeration Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.EnumerationDegree
	 * @generated
	 */
	public Adapter createEnumerationDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.EnumerationChoice <em>Enumeration Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.EnumerationChoice
	 * @generated
	 */
	public Adapter createEnumerationChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice <em>Continous Range Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice
	 * @generated
	 */
	public Adapter createContinousRangeChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.ContinuousProcessingRateDegree <em>Continuous Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.ContinuousProcessingRateDegree
	 * @generated
	 */
	public Adapter createContinuousProcessingRateDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.ContinuousRangeDegree <em>Continuous Range Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.ContinuousRangeDegree
	 * @generated
	 */
	public Adapter createContinuousRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.ProcessingResourceDegree <em>Processing Resource Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.ProcessingResourceDegree
	 * @generated
	 */
	public Adapter createProcessingResourceDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.AllocationDegree <em>Allocation Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.AllocationDegree
	 * @generated
	 */
	public Adapter createAllocationDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.AssembledComponentDegree <em>Assembled Component Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.AssembledComponentDegree
	 * @generated
	 */
	public Adapter createAssembledComponentDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeDegree <em>Discrete Range Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeDegree
	 * @generated
	 */
	public Adapter createDiscreteRangeDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice <em>Discrete Range Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice
	 * @generated
	 */
	public Adapter createDiscreteRangeChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.ResourceContainerReplicationDegree <em>Resource Container Replication Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.ResourceContainerReplicationDegree
	 * @generated
	 */
	public Adapter createResourceContainerReplicationDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Problem
	 * @generated
	 */
	public Adapter createProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.ConnectorConfigDegree <em>Connector Config Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.ConnectorConfigDegree
	 * @generated
	 */
	public Adapter createConnectorConfigDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.Candidate <em>Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Candidate
	 * @generated
	 */
	public Adapter createCandidateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.Candidates <em>Candidates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.Candidates
	 * @generated
	 */
	public Adapter createCandidatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.FeatureConfigDegree <em>Feature Config Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.FeatureConfigDegree
	 * @generated
	 */
	public Adapter createFeatureConfigDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.FeatureGroupDegree <em>Feature Group Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.FeatureGroupDegree
	 * @generated
	 */
	public Adapter createFeatureGroupDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.FeatureSubset <em>Feature Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.FeatureSubset
	 * @generated
	 */
	public Adapter createFeatureSubsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.OptionalFeatureDegree <em>Optional Feature Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.OptionalFeatureDegree
	 * @generated
	 */
	public Adapter createOptionalFeatureDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.DiscreteProcessingRateDegree <em>Discrete Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.DiscreteProcessingRateDegree
	 * @generated
	 */
	public Adapter createDiscreteProcessingRateDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.CapacityDegree <em>Capacity Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.CapacityDegree
	 * @generated
	 */
	public Adapter createCapacityDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.SchedulingPolicyDegree <em>Scheduling Policy Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.SchedulingPolicyDegree
	 * @generated
	 */
	public Adapter createSchedulingPolicyDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.EnumDegree <em>Enum Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.EnumDegree
	 * @generated
	 */
	public Adapter createEnumDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.pcm.designdecision.SchedulingPolicyChoice <em>Scheduling Policy Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.pcm.designdecision.SchedulingPolicyChoice
	 * @generated
	 */
	public Adapter createSchedulingPolicyChoiceAdapter() {
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

} //designdecisionAdapterFactory