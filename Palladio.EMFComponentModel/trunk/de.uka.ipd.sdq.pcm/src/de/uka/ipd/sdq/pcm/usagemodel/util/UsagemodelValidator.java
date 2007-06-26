/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.usagemodel.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import de.uka.ipd.sdq.pcm.usagemodel.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage
 * @generated
 */
public class UsagemodelValidator extends EObjectValidator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UsagemodelValidator INSTANCE = new UsagemodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.pcm.usagemodel";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exactlyonestart' of 'Scenario Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCENARIO_BEHAVIOUR__EXACTLYONESTART = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exactlyonestop' of 'Scenario Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCENARIO_BEHAVIOUR__EXACTLYONESTOP = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsagemodelValidator() {
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return UsagemodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case UsagemodelPackage.WORKLOAD:
				return validateWorkload((Workload)value, diagnostics, context);
			case UsagemodelPackage.USAGE_SCENARIO:
				return validateUsageScenario((UsageScenario)value, diagnostics, context);
			case UsagemodelPackage.SCENARIO_BEHAVIOUR:
				return validateScenarioBehaviour((ScenarioBehaviour)value, diagnostics, context);
			case UsagemodelPackage.ABSTRACT_USER_ACTION:
				return validateAbstractUserAction((AbstractUserAction)value, diagnostics, context);
			case UsagemodelPackage.USAGE_MODEL:
				return validateUsageModel((UsageModel)value, diagnostics, context);
			case UsagemodelPackage.STOP:
				return validateStop((Stop)value, diagnostics, context);
			case UsagemodelPackage.START:
				return validateStart((Start)value, diagnostics, context);
			case UsagemodelPackage.OPEN_WORKLOAD:
				return validateOpenWorkload((OpenWorkload)value, diagnostics, context);
			case UsagemodelPackage.INTER_ARRIVAL_TIME:
				return validateInterArrivalTime((InterArrivalTime)value, diagnostics, context);
			case UsagemodelPackage.LOOP:
				return validateLoop((Loop)value, diagnostics, context);
			case UsagemodelPackage.LOOP_ITERATIONS:
				return validateLoopIterations((LoopIterations)value, diagnostics, context);
			case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL:
				return validateEntryLevelSystemCall((EntryLevelSystemCall)value, diagnostics, context);
			case UsagemodelPackage.CLOSED_WORKLOAD:
				return validateClosedWorkload((ClosedWorkload)value, diagnostics, context);
			case UsagemodelPackage.THINK_TIME:
				return validateThinkTime((ThinkTime)value, diagnostics, context);
			case UsagemodelPackage.BRANCH:
				return validateBranch((Branch)value, diagnostics, context);
			case UsagemodelPackage.BRANCH_TRANSITION:
				return validateBranchTransition((BranchTransition)value, diagnostics, context);
			case UsagemodelPackage.DELAY:
				return validateDelay((Delay)value, diagnostics, context);
			case UsagemodelPackage.DELAY_TIME:
				return validateDelayTime((DelayTime)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkload(Workload workload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageScenario(UsageScenario usageScenario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(usageScenario, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateScenarioBehaviour_Exactlyonestart(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateScenarioBehaviour_Exactlyonestop(scenarioBehaviour, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Exactlyonestart constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour_Exactlyonestart(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scenarioBehaviour.Exactlyonestart(diagnostics, context);
	}

	/**
	 * Validates the Exactlyonestop constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour_Exactlyonestop(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scenarioBehaviour.Exactlyonestop(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractUserAction(AbstractUserAction abstractUserAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(abstractUserAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageModel(UsageModel usageModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usageModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStop(Stop stop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stop, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(stop, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(start, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpenWorkload(OpenWorkload openWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(openWorkload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterArrivalTime(InterArrivalTime interArrivalTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interArrivalTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loop, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(loop, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopIterations(LoopIterations loopIterations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loopIterations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryLevelSystemCall(EntryLevelSystemCall entryLevelSystemCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(entryLevelSystemCall, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClosedWorkload(ClosedWorkload closedWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(closedWorkload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThinkTime(ThinkTime thinkTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thinkTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(branch, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchTransition(BranchTransition branchTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branchTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelay(Delay delay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delay, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_idHasToBeUnique(delay, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayTime(DelayTime delayTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delayTime, diagnostics, context);
	}

} //UsagemodelValidator
