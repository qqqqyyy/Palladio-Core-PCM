/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourceenvironment;

import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linking Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model&nbsp;element&nbsp;representing&nbsp;communication&nbsp;links&nbsp;like&nbsp;LAN,&nbsp;WAN,&nbsp;WiFi&nbsp;etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getConnectedResourceContainers <em>Connected Resource Containers</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getCommunicationLinkResourceSpecifications <em>Communication Link Resource Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getLinkingResource()
 * @model
 * @generated
 */
public interface LinkingResource extends Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Connected Resource Containers</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Resource Containers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Resource Containers</em>' reference list.
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getLinkingResource_ConnectedResourceContainers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ResourceContainer> getConnectedResourceContainers();

	/**
	 * Returns the value of the '<em><b>Communication Link Resource Specifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Link Resource Specifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Link Resource Specifications</em>' containment reference.
	 * @see #setCommunicationLinkResourceSpecifications(CommunicationLinkResourceSpecification)
	 * @see de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage#getLinkingResource_CommunicationLinkResourceSpecifications()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	CommunicationLinkResourceSpecification getCommunicationLinkResourceSpecifications();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource#getCommunicationLinkResourceSpecifications <em>Communication Link Resource Specifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Link Resource Specifications</em>' containment reference.
	 * @see #getCommunicationLinkResourceSpecifications()
	 * @generated
	 */
	void setCommunicationLinkResourceSpecifications(CommunicationLinkResourceSpecification value);

} // LinkingResource