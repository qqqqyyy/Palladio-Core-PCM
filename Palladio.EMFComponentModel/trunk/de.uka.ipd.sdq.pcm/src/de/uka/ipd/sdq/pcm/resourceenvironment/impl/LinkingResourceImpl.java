/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourceenvironment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.uka.ipd.sdq.pcm.core.entity.impl.EntityImpl;
import de.uka.ipd.sdq.pcm.resourceenvironment.CommunicationLinkResourceSpecification;
import de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linking Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.LinkingResourceImpl#getConnectedResourceContainers_LinkingResource <em>Connected Resource Containers Linking Resource</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.LinkingResourceImpl#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkingResourceImpl extends EntityImpl implements LinkingResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, Karlsruhe Institute of Technology / University of Karlsruhe, Germany and SE, FZI Karlsruhe, Germany";

	/**
	 * The cached value of the '{@link #getConnectedResourceContainers_LinkingResource() <em>Connected Resource Containers Linking Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedResourceContainers_LinkingResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceContainer> connectedResourceContainers_LinkingResource;

	/**
	 * The cached value of the '{@link #getCommunicationLinkResourceSpecifications_LinkingResource() <em>Communication Link Resource Specifications Linking Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationLinkResourceSpecifications_LinkingResource()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLinkResourceSpecification communicationLinkResourceSpecifications_LinkingResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkingResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceenvironmentPackage.Literals.LINKING_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceContainer> getConnectedResourceContainers_LinkingResource() {
		if (connectedResourceContainers_LinkingResource == null) {
			connectedResourceContainers_LinkingResource = new EObjectResolvingEList<ResourceContainer>(ResourceContainer.class, this, ResourceenvironmentPackage.LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE);
		}
		return connectedResourceContainers_LinkingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkResourceSpecification getCommunicationLinkResourceSpecifications_LinkingResource() {
		return communicationLinkResourceSpecifications_LinkingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationLinkResourceSpecifications_LinkingResource(CommunicationLinkResourceSpecification newCommunicationLinkResourceSpecifications_LinkingResource, NotificationChain msgs) {
		CommunicationLinkResourceSpecification oldCommunicationLinkResourceSpecifications_LinkingResource = communicationLinkResourceSpecifications_LinkingResource;
		communicationLinkResourceSpecifications_LinkingResource = newCommunicationLinkResourceSpecifications_LinkingResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE, oldCommunicationLinkResourceSpecifications_LinkingResource, newCommunicationLinkResourceSpecifications_LinkingResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationLinkResourceSpecifications_LinkingResource(CommunicationLinkResourceSpecification newCommunicationLinkResourceSpecifications_LinkingResource) {
		if (newCommunicationLinkResourceSpecifications_LinkingResource != communicationLinkResourceSpecifications_LinkingResource) {
			NotificationChain msgs = null;
			if (communicationLinkResourceSpecifications_LinkingResource != null)
				msgs = ((InternalEObject)communicationLinkResourceSpecifications_LinkingResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourceenvironmentPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE, null, msgs);
			if (newCommunicationLinkResourceSpecifications_LinkingResource != null)
				msgs = ((InternalEObject)newCommunicationLinkResourceSpecifications_LinkingResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourceenvironmentPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE, null, msgs);
			msgs = basicSetCommunicationLinkResourceSpecifications_LinkingResource(newCommunicationLinkResourceSpecifications_LinkingResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE, newCommunicationLinkResourceSpecifications_LinkingResource, newCommunicationLinkResourceSpecifications_LinkingResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceenvironmentPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE:
				return basicSetCommunicationLinkResourceSpecifications_LinkingResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceenvironmentPackage.LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE:
				return getConnectedResourceContainers_LinkingResource();
			case ResourceenvironmentPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE:
				return getCommunicationLinkResourceSpecifications_LinkingResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourceenvironmentPackage.LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE:
				getConnectedResourceContainers_LinkingResource().clear();
				getConnectedResourceContainers_LinkingResource().addAll((Collection<? extends ResourceContainer>)newValue);
				return;
			case ResourceenvironmentPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE:
				setCommunicationLinkResourceSpecifications_LinkingResource((CommunicationLinkResourceSpecification)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResourceenvironmentPackage.LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE:
				getConnectedResourceContainers_LinkingResource().clear();
				return;
			case ResourceenvironmentPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE:
				setCommunicationLinkResourceSpecifications_LinkingResource((CommunicationLinkResourceSpecification)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResourceenvironmentPackage.LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE:
				return connectedResourceContainers_LinkingResource != null && !connectedResourceContainers_LinkingResource.isEmpty();
			case ResourceenvironmentPackage.LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE:
				return communicationLinkResourceSpecifications_LinkingResource != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkingResourceImpl
