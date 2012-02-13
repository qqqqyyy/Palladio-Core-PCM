/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 */
package de.uka.ipd.sdq.pcm.qosannotations.qos_performance.util;

import de.uka.ipd.sdq.pcm.qosannotations.qos_performance.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.qosannotations.qos_performance.QosPerformancePackage
 * @generated
 */
public class QosPerformanceValidator extends EObjectValidator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QosPerformanceValidator INSTANCE = new QosPerformanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.pcm.qosannotations.qos_performance";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'System Specified Execution Time Must Reference Required Role Of ASystem' of 'System Specified Execution Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_SPECIFIED_EXECUTION_TIME__SYSTEM_SPECIFIED_EXECUTION_TIME_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QosPerformanceValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return QosPerformancePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case QosPerformancePackage.SYSTEM_SPECIFIED_EXECUTION_TIME:
				return validateSystemSpecifiedExecutionTime((SystemSpecifiedExecutionTime)value, diagnostics, context);
			case QosPerformancePackage.SPECIFIED_EXECUTION_TIME:
				return validateSpecifiedExecutionTime((SpecifiedExecutionTime)value, diagnostics, context);
			case QosPerformancePackage.COMPONENT_SPECIFIED_EXECUTION_TIME:
				return validateComponentSpecifiedExecutionTime((ComponentSpecifiedExecutionTime)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemSpecifiedExecutionTime(SystemSpecifiedExecutionTime systemSpecifiedExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemSpecifiedExecutionTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemSpecifiedExecutionTime_SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem(systemSpecifiedExecutionTime, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem constraint of '<em>System Specified Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemSpecifiedExecutionTime_SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem(SystemSpecifiedExecutionTime systemSpecifiedExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemSpecifiedExecutionTime.SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecifiedExecutionTime(SpecifiedExecutionTime specifiedExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specifiedExecutionTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSpecifiedExecutionTime(ComponentSpecifiedExecutionTime componentSpecifiedExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentSpecifiedExecutionTime, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //QosPerformanceValidator
