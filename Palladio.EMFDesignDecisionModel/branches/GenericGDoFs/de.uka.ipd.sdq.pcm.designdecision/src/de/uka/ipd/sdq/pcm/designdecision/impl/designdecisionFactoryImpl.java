/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import de.uka.ipd.sdq.pcm.designdecision.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class designdecisionFactoryImpl extends EFactoryImpl implements designdecisionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static designdecisionFactory init() {
		try {
			designdecisionFactory thedesigndecisionFactory = (designdecisionFactory)EPackage.Registry.INSTANCE.getEFactory("http://sdq.ipd.uka.de/DesignDecision/1.0"); 
			if (thedesigndecisionFactory != null) {
				return thedesigndecisionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new designdecisionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public designdecisionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case designdecisionPackage.CLASS_CHOICE: return createClassChoice();
			case designdecisionPackage.CONTINOUS_RANGE_CHOICE: return createContinousRangeChoice();
			case designdecisionPackage.CONTINUOUS_PROCESSING_RATE_DEGREE: return createContinuousProcessingRateDegree();
			case designdecisionPackage.ALLOCATION_DEGREE: return createAllocationDegree();
			case designdecisionPackage.ASSEMBLED_COMPONENT_DEGREE: return createAssembledComponentDegree();
			case designdecisionPackage.DISCRETE_RANGE_CHOICE: return createDiscreteRangeChoice();
			case designdecisionPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE: return createResourceContainerReplicationDegree();
			case designdecisionPackage.PROBLEM: return createProblem();
			case designdecisionPackage.CANDIDATE: return createCandidate();
			case designdecisionPackage.CANDIDATES: return createCandidates();
			case designdecisionPackage.FEATURE_GROUP_DEGREE: return createFeatureGroupDegree();
			case designdecisionPackage.FEATURE_SUBSET: return createFeatureSubset();
			case designdecisionPackage.OPTIONAL_FEATURE_DEGREE: return createOptionalFeatureDegree();
			case designdecisionPackage.DISCRETE_PROCESSING_RATE_DEGREE: return createDiscreteProcessingRateDegree();
			case designdecisionPackage.CAPACITY_DEGREE: return createCapacityDegree();
			case designdecisionPackage.SCHEDULING_POLICY_DEGREE: return createSchedulingPolicyDegree();
			case designdecisionPackage.SCHEDULING_POLICY_CHOICE: return createSchedulingPolicyChoice();
			case designdecisionPackage.RESOURCE_SELECTION_DEGREE: return createResourceSelectionDegree();
			case designdecisionPackage.DISCRETE_COMPONENT_PARAM_DEGREE: return createDiscreteComponentParamDegree();
			case designdecisionPackage.CONTINUOUS_COMPONENT_PARAM_DEGREE: return createContinuousComponentParamDegree();
			case designdecisionPackage.STRING_COMPONENT_PARAM_DEGREE: return createStringComponentParamDegree();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassChoice createClassChoice() {
		ClassChoiceImpl classChoice = new ClassChoiceImpl();
		return classChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousRangeChoice createContinousRangeChoice() {
		ContinousRangeChoiceImpl continousRangeChoice = new ContinousRangeChoiceImpl();
		return continousRangeChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousProcessingRateDegree createContinuousProcessingRateDegree() {
		ContinuousProcessingRateDegreeImpl continuousProcessingRateDegree = new ContinuousProcessingRateDegreeImpl();
		return continuousProcessingRateDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationDegree createAllocationDegree() {
		AllocationDegreeImpl allocationDegree = new AllocationDegreeImpl();
		return allocationDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssembledComponentDegree createAssembledComponentDegree() {
		AssembledComponentDegreeImpl assembledComponentDegree = new AssembledComponentDegreeImpl();
		return assembledComponentDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteRangeChoice createDiscreteRangeChoice() {
		DiscreteRangeChoiceImpl discreteRangeChoice = new DiscreteRangeChoiceImpl();
		return discreteRangeChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainerReplicationDegree createResourceContainerReplicationDegree() {
		ResourceContainerReplicationDegreeImpl resourceContainerReplicationDegree = new ResourceContainerReplicationDegreeImpl();
		return resourceContainerReplicationDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem createProblem() {
		ProblemImpl problem = new ProblemImpl();
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candidate createCandidate() {
		CandidateImpl candidate = new CandidateImpl();
		return candidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candidates createCandidates() {
		CandidatesImpl candidates = new CandidatesImpl();
		return candidates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupDegree createFeatureGroupDegree() {
		FeatureGroupDegreeImpl featureGroupDegree = new FeatureGroupDegreeImpl();
		return featureGroupDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSubset createFeatureSubset() {
		FeatureSubsetImpl featureSubset = new FeatureSubsetImpl();
		return featureSubset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalFeatureDegree createOptionalFeatureDegree() {
		OptionalFeatureDegreeImpl optionalFeatureDegree = new OptionalFeatureDegreeImpl();
		return optionalFeatureDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteProcessingRateDegree createDiscreteProcessingRateDegree() {
		DiscreteProcessingRateDegreeImpl discreteProcessingRateDegree = new DiscreteProcessingRateDegreeImpl();
		return discreteProcessingRateDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapacityDegree createCapacityDegree() {
		CapacityDegreeImpl capacityDegree = new CapacityDegreeImpl();
		return capacityDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicyDegree createSchedulingPolicyDegree() {
		SchedulingPolicyDegreeImpl schedulingPolicyDegree = new SchedulingPolicyDegreeImpl();
		return schedulingPolicyDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicyChoice createSchedulingPolicyChoice() {
		SchedulingPolicyChoiceImpl schedulingPolicyChoice = new SchedulingPolicyChoiceImpl();
		return schedulingPolicyChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSelectionDegree createResourceSelectionDegree() {
		ResourceSelectionDegreeImpl resourceSelectionDegree = new ResourceSelectionDegreeImpl();
		return resourceSelectionDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteComponentParamDegree createDiscreteComponentParamDegree() {
		DiscreteComponentParamDegreeImpl discreteComponentParamDegree = new DiscreteComponentParamDegreeImpl();
		return discreteComponentParamDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousComponentParamDegree createContinuousComponentParamDegree() {
		ContinuousComponentParamDegreeImpl continuousComponentParamDegree = new ContinuousComponentParamDegreeImpl();
		return continuousComponentParamDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringComponentParamDegree createStringComponentParamDegree() {
		StringComponentParamDegreeImpl stringComponentParamDegree = new StringComponentParamDegreeImpl();
		return stringComponentParamDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public designdecisionPackage getdesigndecisionPackage() {
		return (designdecisionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static designdecisionPackage getPackage() {
		return designdecisionPackage.eINSTANCE;
	}

} //designdecisionFactoryImpl