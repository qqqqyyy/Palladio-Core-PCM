
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.usagemodel;

import de.uka.ipd.sdq.pcm.repository.ProvidedRole;
import de.uka.ipd.sdq.pcm.repository.Signature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Level System Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.usagemodel.EntryLevelSystemCall#getActualParameterUsage_EntryLevelSystemCall <em>Actual Parameter Usage Entry Level System Call</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.usagemodel.EntryLevelSystemCall#getProvidedRole_EntryLevelSystemCall <em>Provided Role Entry Level System Call</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.usagemodel.EntryLevelSystemCall#getSignature_EntryLevelSystemCall <em>Signature Entry Level System Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage#getEntryLevelSystemCall()
 * @model
 * @generated
 */
public interface EntryLevelSystemCall extends AbstractUserAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(c) by SDQ, IPD, U Karlsruhe (TH), 2006";

	/**
	 * Returns the value of the '<em><b>Actual Parameter Usage Entry Level System Call</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.parameter.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Parameter Usage Entry Level System Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Parameter Usage Entry Level System Call</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage#getEntryLevelSystemCall_ActualParameterUsage_EntryLevelSystemCall()
	 * @model type="de.uka.ipd.sdq.pcm.parameter.VariableUsage" containment="true" ordered="false"
	 * @generated
	 */
	EList getActualParameterUsage_EntryLevelSystemCall();

	/**
	 * Returns the value of the '<em><b>Provided Role Entry Level System Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Role Entry Level System Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role Entry Level System Call</em>' reference.
	 * @see #setProvidedRole_EntryLevelSystemCall(ProvidedRole)
	 * @see de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage#getEntryLevelSystemCall_ProvidedRole_EntryLevelSystemCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProvidedRole getProvidedRole_EntryLevelSystemCall();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.usagemodel.EntryLevelSystemCall#getProvidedRole_EntryLevelSystemCall <em>Provided Role Entry Level System Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role Entry Level System Call</em>' reference.
	 * @see #getProvidedRole_EntryLevelSystemCall()
	 * @generated
	 */
	void setProvidedRole_EntryLevelSystemCall(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Signature Entry Level System Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Entry Level System Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Entry Level System Call</em>' reference.
	 * @see #setSignature_EntryLevelSystemCall(Signature)
	 * @see de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage#getEntryLevelSystemCall_Signature_EntryLevelSystemCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Signature getSignature_EntryLevelSystemCall();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.usagemodel.EntryLevelSystemCall#getSignature_EntryLevelSystemCall <em>Signature Entry Level System Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Entry Level System Call</em>' reference.
	 * @see #getSignature_EntryLevelSystemCall()
	 * @generated
	 */
	void setSignature_EntryLevelSystemCall(Signature value);

} // EntryLevelSystemCall