/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.repository;

import de.uka.ipd.sdq.pcm.parameter.VariableUsage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passive Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.PassiveResource#getCapacity_PassiveResource <em>Capacity Passive Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getPassiveResource()
 * @model
 * @generated
 */
public interface PassiveResource extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Capacity Passive Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Passive Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Passive Resource</em>' containment reference.
	 * @see #setCapacity_PassiveResource(VariableUsage)
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getPassiveResource_Capacity_PassiveResource()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	VariableUsage getCapacity_PassiveResource();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.repository.PassiveResource#getCapacity_PassiveResource <em>Capacity Passive Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Passive Resource</em>' containment reference.
	 * @see #getCapacity_PassiveResource()
	 * @generated
	 */
	void setCapacity_PassiveResource(VariableUsage value);

} // PassiveResource
