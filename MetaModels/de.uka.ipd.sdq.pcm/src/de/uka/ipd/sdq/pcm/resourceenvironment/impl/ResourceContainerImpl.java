/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.pcm.core.entity.impl.EntityImpl;
import de.uka.ipd.sdq.pcm.resourceenvironment.ContainerOperatingSystem;
import de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceEnvironment;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceContainerImpl#getOperatingSystem_ResourceContainer <em>Operating System Resource Container</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceContainerImpl#getActiveResourceSpecifications_ResourceContainer <em>Active Resource Specifications Resource Container</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.ResourceContainerImpl#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceContainerImpl extends EntityImpl implements ResourceContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The default value of the '{@link #getOperatingSystem_ResourceContainer() <em>Operating System Resource Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem_ResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected static final ContainerOperatingSystem OPERATING_SYSTEM_RESOURCE_CONTAINER_EDEFAULT = ContainerOperatingSystem.ABSTRACT;

	/**
	 * The cached value of the '{@link #getOperatingSystem_ResourceContainer() <em>Operating System Resource Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem_ResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected ContainerOperatingSystem operatingSystem_ResourceContainer = OPERATING_SYSTEM_RESOURCE_CONTAINER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActiveResourceSpecifications_ResourceContainer() <em>Active Resource Specifications Resource Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveResourceSpecifications_ResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingResourceSpecification> activeResourceSpecifications_ResourceContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceenvironmentPackage.Literals.RESOURCE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerOperatingSystem getOperatingSystem_ResourceContainer() {
		return operatingSystem_ResourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingSystem_ResourceContainer(ContainerOperatingSystem newOperatingSystem_ResourceContainer) {
		ContainerOperatingSystem oldOperatingSystem_ResourceContainer = operatingSystem_ResourceContainer;
		operatingSystem_ResourceContainer = newOperatingSystem_ResourceContainer == null ? OPERATING_SYSTEM_RESOURCE_CONTAINER_EDEFAULT : newOperatingSystem_ResourceContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.RESOURCE_CONTAINER__OPERATING_SYSTEM_RESOURCE_CONTAINER, oldOperatingSystem_ResourceContainer, operatingSystem_ResourceContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingResourceSpecification> getActiveResourceSpecifications_ResourceContainer() {
		if (activeResourceSpecifications_ResourceContainer == null) {
			activeResourceSpecifications_ResourceContainer = new EObjectContainmentWithInverseEList<ProcessingResourceSpecification>(ProcessingResourceSpecification.class, this, ResourceenvironmentPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER, ResourceenvironmentPackage.PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION);
		}
		return activeResourceSpecifications_ResourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironment getResourceEnvironment_ResourceContainer() {
		if (eContainerFeatureID() != ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER) return null;
		return (ResourceEnvironment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvironment_ResourceContainer(ResourceEnvironment newResourceEnvironment_ResourceContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResourceEnvironment_ResourceContainer, ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvironment_ResourceContainer(ResourceEnvironment newResourceEnvironment_ResourceContainer) {
		if (newResourceEnvironment_ResourceContainer != eInternalContainer() || (eContainerFeatureID() != ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER && newResourceEnvironment_ResourceContainer != null)) {
			if (EcoreUtil.isAncestor(this, newResourceEnvironment_ResourceContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResourceEnvironment_ResourceContainer != null)
				msgs = ((InternalEObject)newResourceEnvironment_ResourceContainer).eInverseAdd(this, ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT, ResourceEnvironment.class, msgs);
			msgs = basicSetResourceEnvironment_ResourceContainer(newResourceEnvironment_ResourceContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER, newResourceEnvironment_ResourceContainer, newResourceEnvironment_ResourceContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveResourceSpecifications_ResourceContainer()).basicAdd(otherEnd, msgs);
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResourceEnvironment_ResourceContainer((ResourceEnvironment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				return ((InternalEList<?>)getActiveResourceSpecifications_ResourceContainer()).basicRemove(otherEnd, msgs);
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				return basicSetResourceEnvironment_ResourceContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				return eInternalContainer().eInverseRemove(this, ResourceenvironmentPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT, ResourceEnvironment.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__OPERATING_SYSTEM_RESOURCE_CONTAINER:
				return getOperatingSystem_ResourceContainer();
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				return getActiveResourceSpecifications_ResourceContainer();
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				return getResourceEnvironment_ResourceContainer();
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
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__OPERATING_SYSTEM_RESOURCE_CONTAINER:
				setOperatingSystem_ResourceContainer((ContainerOperatingSystem)newValue);
				return;
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				getActiveResourceSpecifications_ResourceContainer().clear();
				getActiveResourceSpecifications_ResourceContainer().addAll((Collection<? extends ProcessingResourceSpecification>)newValue);
				return;
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				setResourceEnvironment_ResourceContainer((ResourceEnvironment)newValue);
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
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__OPERATING_SYSTEM_RESOURCE_CONTAINER:
				setOperatingSystem_ResourceContainer(OPERATING_SYSTEM_RESOURCE_CONTAINER_EDEFAULT);
				return;
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				getActiveResourceSpecifications_ResourceContainer().clear();
				return;
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				setResourceEnvironment_ResourceContainer((ResourceEnvironment)null);
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
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__OPERATING_SYSTEM_RESOURCE_CONTAINER:
				return operatingSystem_ResourceContainer != OPERATING_SYSTEM_RESOURCE_CONTAINER_EDEFAULT;
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				return activeResourceSpecifications_ResourceContainer != null && !activeResourceSpecifications_ResourceContainer.isEmpty();
			case ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				return getResourceEnvironment_ResourceContainer() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operatingSystem_ResourceContainer: ");
		result.append(operatingSystem_ResourceContainer);
		result.append(')');
		return result.toString();
	}

} //ResourceContainerImpl