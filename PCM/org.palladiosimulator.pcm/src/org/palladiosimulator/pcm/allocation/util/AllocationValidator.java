/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 */
package org.palladiosimulator.pcm.allocation.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.palladiosimulator.pcm.allocation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.allocation.AllocationPackage
 * @generated
 */
public class AllocationValidator extends EObjectValidator {

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
    public static final AllocationValidator INSTANCE = new AllocationValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.pcm.allocation";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Assembly Context Or One Event Channel Should Be Referred' of 'Context'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int ALLOCATION_CONTEXT__ONE_ASSEMBLY_CONTEXT_OR_ONE_EVENT_CHANNEL_SHOULD_BE_REFERRED = 1;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Each Assembly Context Within System Has To Be Allocated Exactly Once' of 'Allocation'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int ALLOCATION__EACH_ASSEMBLY_CONTEXT_WITHIN_SYSTEM_HAS_TO_BE_ALLOCATED_EXACTLY_ONCE = 2;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Communicating Servers Have To Be Connected By Linking Resource' of 'Allocation'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int ALLOCATION__COMMUNICATING_SERVERS_HAVE_TO_BE_CONNECTED_BY_LINKING_RESOURCE = 3;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

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
    public AllocationValidator() {
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
        return AllocationPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        switch (classifierID) {
        case AllocationPackage.ALLOCATION_CONTEXT:
            return validateAllocationContext((AllocationContext) value, diagnostics, context);
        case AllocationPackage.ALLOCATION:
            return validateAllocation((Allocation) value, diagnostics, context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAllocationContext(AllocationContext allocationContext, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        if (!validate_NoCircularContainment((EObject) allocationContext, diagnostics, context))
            return false;
        boolean result = validate_EveryMultiplicityConforms((EObject) allocationContext, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryDataValueConforms((EObject) allocationContext, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryReferenceIsContained((EObject) allocationContext, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryProxyResolves((EObject) allocationContext, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_UniqueID((EObject) allocationContext, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryKeyUnique((EObject) allocationContext, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryMapEntryUnique((EObject) allocationContext, diagnostics, context);
        if (result || diagnostics != null)
            result &= validateAllocationContext_OneAssemblyContextOrOneEventChannelShouldBeReferred(allocationContext,
                    diagnostics, context);
        return result;
    }

    /**
     * Validates the OneAssemblyContextOrOneEventChannelShouldBeReferred constraint of '<em>Context</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAllocationContext_OneAssemblyContextOrOneEventChannelShouldBeReferred(
            AllocationContext allocationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return allocationContext.OneAssemblyContextOrOneEventChannelShouldBeReferred(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment((EObject) allocation, diagnostics, context))
            return false;
        boolean result = validate_EveryMultiplicityConforms((EObject) allocation, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryDataValueConforms((EObject) allocation, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryReferenceIsContained((EObject) allocation, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryProxyResolves((EObject) allocation, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_UniqueID((EObject) allocation, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryKeyUnique((EObject) allocation, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryMapEntryUnique((EObject) allocation, diagnostics, context);
        if (result || diagnostics != null)
            result &= validateAllocation_EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(allocation,
                    diagnostics, context);
        if (result || diagnostics != null)
            result &= validateAllocation_CommunicatingServersHaveToBeConnectedByLinkingResource(allocation, diagnostics,
                    context);
        return result;
    }

    /**
     * Validates the EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce constraint of '<em>Allocation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAllocation_EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(Allocation allocation,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return allocation.EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(diagnostics, context);
    }

    /**
     * Validates the CommunicatingServersHaveToBeConnectedByLinkingResource constraint of '<em>Allocation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAllocation_CommunicatingServersHaveToBeConnectedByLinkingResource(Allocation allocation,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return allocation.CommunicatingServersHaveToBeConnectedByLinkingResource(diagnostics, context);
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

} //AllocationValidator