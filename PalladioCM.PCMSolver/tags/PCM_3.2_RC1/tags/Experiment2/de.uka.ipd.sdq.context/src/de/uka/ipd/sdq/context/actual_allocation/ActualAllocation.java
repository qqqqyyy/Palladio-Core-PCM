/**
 * Copyright 2006, SDQ Group, University Karlsruhe (TH)
 *
 * $Id$
 */
package de.uka.ipd.sdq.context.actual_allocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.context.actual_allocation.ActualAllocation#getActualAllocationContexts_ActualAllocation <em>Actual Allocation Contexts Actual Allocation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.context.actual_allocation.Actual_AllocationPackage#getActualAllocation()
 * @model
 * @generated
 */
public interface ActualAllocation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006, SDQ Group, University Karlsruhe (TH)";

	/**
	 * Returns the value of the '<em><b>Actual Allocation Contexts Actual Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.context.actual_allocation.ActualAllocationContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Allocation Contexts Actual Allocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Allocation Contexts Actual Allocation</em>' containment reference list.
	 * @see de.uka.ipd.sdq.context.actual_allocation.Actual_AllocationPackage#getActualAllocation_ActualAllocationContexts_ActualAllocation()
	 * @model type="de.uka.ipd.sdq.context.actual_allocation.ActualAllocationContext" containment="true" ordered="false"
	 * @generated
	 */
	EList getActualAllocationContexts_ActualAllocation();

} // ActualAllocation
