/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.core.composition.impl;

import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.core.composition.ComposedStructure;
import de.uka.ipd.sdq.pcm.core.composition.CompositionPackage;
import de.uka.ipd.sdq.pcm.core.composition.SourceDelegationConnector;

import de.uka.ipd.sdq.pcm.repository.SourceRole;

import de.uka.ipd.sdq.pcm.repository.impl.DelegationConnectorImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.SourceDelegationConnectorImpl#getInnerSourceRole__SourceRole <em>Inner Source Role Source Role</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.SourceDelegationConnectorImpl#getOuterSourceRole__SourceRole <em>Outer Source Role Source Role</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.SourceDelegationConnectorImpl#getAssemblyContext__SourceDelegationConnector <em>Assembly Context Source Delegation Connector</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.core.composition.impl.SourceDelegationConnectorImpl#getParentStructure__SourceDelegationConnector <em>Parent Structure Source Delegation Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceDelegationConnectorImpl extends DelegationConnectorImpl implements SourceDelegationConnector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached value of the '{@link #getInnerSourceRole__SourceRole() <em>Inner Source Role Source Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerSourceRole__SourceRole()
	 * @generated
	 * @ordered
	 */
	protected SourceRole innerSourceRole__SourceRole;

	/**
	 * The cached value of the '{@link #getOuterSourceRole__SourceRole() <em>Outer Source Role Source Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterSourceRole__SourceRole()
	 * @generated
	 * @ordered
	 */
	protected SourceRole outerSourceRole__SourceRole;

	/**
	 * The cached value of the '{@link #getAssemblyContext__SourceDelegationConnector() <em>Assembly Context Source Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext__SourceDelegationConnector()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblyContext__SourceDelegationConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceDelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.SOURCE_DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRole getInnerSourceRole__SourceRole() {
		if (innerSourceRole__SourceRole != null && innerSourceRole__SourceRole.eIsProxy()) {
			InternalEObject oldInnerSourceRole__SourceRole = (InternalEObject)innerSourceRole__SourceRole;
			innerSourceRole__SourceRole = (SourceRole)eResolveProxy(oldInnerSourceRole__SourceRole);
			if (innerSourceRole__SourceRole != oldInnerSourceRole__SourceRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.SOURCE_DELEGATION_CONNECTOR__INNER_SOURCE_ROLE_SOURCE_ROLE, oldInnerSourceRole__SourceRole, innerSourceRole__SourceRole));
			}
		}
		return innerSourceRole__SourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRole basicGetInnerSourceRole__SourceRole() {
		return innerSourceRole__SourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerSourceRole__SourceRole(SourceRole newInnerSourceRole__SourceRole) {
		SourceRole oldInnerSourceRole__SourceRole = innerSourceRole__SourceRole;
		innerSourceRole__SourceRole = newInnerSourceRole__SourceRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.SOURCE_DELEGATION_CONNECTOR__INNER_SOURCE_ROLE_SOURCE_ROLE, oldInnerSourceRole__SourceRole, innerSourceRole__SourceRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRole getOuterSourceRole__SourceRole() {
		if (outerSourceRole__SourceRole != null && outerSourceRole__SourceRole.eIsProxy()) {
			InternalEObject oldOuterSourceRole__SourceRole = (InternalEObject)outerSourceRole__SourceRole;
			outerSourceRole__SourceRole = (SourceRole)eResolveProxy(oldOuterSourceRole__SourceRole);
			if (outerSourceRole__SourceRole != oldOuterSourceRole__SourceRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.SOURCE_DELEGATION_CONNECTOR__OUTER_SOURCE_ROLE_SOURCE_ROLE, oldOuterSourceRole__SourceRole, outerSourceRole__SourceRole));
			}
		}
		return outerSourceRole__SourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRole basicGetOuterSourceRole__SourceRole() {
		return outerSourceRole__SourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterSourceRole__SourceRole(SourceRole newOuterSourceRole__SourceRole) {
		SourceRole oldOuterSourceRole__SourceRole = outerSourceRole__SourceRole;
		outerSourceRole__SourceRole = newOuterSourceRole__SourceRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.SOURCE_DELEGATION_CONNECTOR__OUTER_SOURCE_ROLE_SOURCE_ROLE, oldOuterSourceRole__SourceRole, outerSourceRole__SourceRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblyContext__SourceDelegationConnector() {
		if (assemblyContext__SourceDelegationConnector != null && assemblyContext__SourceDelegationConnector.eIsProxy()) {
			InternalEObject oldAssemblyContext__SourceDelegationConnector = (InternalEObject)assemblyContext__SourceDelegationConnector;
			assemblyContext__SourceDelegationConnector = (AssemblyContext)eResolveProxy(oldAssemblyContext__SourceDelegationConnector);
			if (assemblyContext__SourceDelegationConnector != oldAssemblyContext__SourceDelegationConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.SOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SOURCE_DELEGATION_CONNECTOR, oldAssemblyContext__SourceDelegationConnector, assemblyContext__SourceDelegationConnector));
			}
		}
		return assemblyContext__SourceDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext__SourceDelegationConnector() {
		return assemblyContext__SourceDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyContext__SourceDelegationConnector(AssemblyContext newAssemblyContext__SourceDelegationConnector) {
		AssemblyContext oldAssemblyContext__SourceDelegationConnector = assemblyContext__SourceDelegationConnector;
		assemblyContext__SourceDelegationConnector = newAssemblyContext__SourceDelegationConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.SOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SOURCE_DELEGATION_CONNECTOR, oldAssemblyContext__SourceDelegationConnector, assemblyContext__SourceDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedStructure getParentStructure__SourceDelegationConnector() {
		if (eContainerFeatureID() != CompositionPackage.SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_SOURCE_DELEGATION_CONNECTOR) return null;
		return (ComposedStructure)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStructure__SourceDelegationConnector(ComposedStructure newParentStructure__SourceDelegationConnector, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStructure__SourceDelegationConnector, CompositionPackage.SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_SOURCE_DELEGATION_CONNECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructure__SourceDelegationConnector(ComposedStructure newParentStructure__SourceDelegationConnector) {
		if (newParentStructure__SourceDelegationConnector != eInternalContainer() || (eContainerFeatureID() != CompositionPackage.SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_SOURCE_DELEGATION_CONNECTOR && newParentStructure__SourceDelegationConnector != null)) {
			if (EcoreUtil.isAncestor(this, newParentStructure__SourceDelegationConnector))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStructure__SourceDelegationConnector != null)
				msgs = ((InternalEObject)newParentStructure__SourceDelegationConnector).eInverseAdd(this, CompositionPackage.COMPOSED_STRUCTURE__SOURCE_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
			msgs = basicSetParentStructure__SourceDelegationConnector(newParentStructure__SourceDelegationConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_SOURCE_DELEGATION_CONNECTOR, newParentStructure__SourceDelegationConnector, newParentStructure__SourceDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_SOURCE_DELEGATION_CONNECTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStructure__SourceDelegationConnector((ComposedStructure)otherEnd, msgs);
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
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_SOURCE_DELEGATION_CONNECTOR:
				return basicSetParentStructure__SourceDelegationConnector(null, msgs);
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
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_SOURCE_DELEGATION_CONNECTOR:
				return eInternalContainer().eInverseRemove(this, CompositionPackage.COMPOSED_STRUCTURE__SOURCE_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE, ComposedStructure.class, msgs);
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
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__INNER_SOURCE_ROLE_SOURCE_ROLE:
				if (resolve) return getInnerSourceRole__SourceRole();
				return basicGetInnerSourceRole__SourceRole();
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__OUTER_SOURCE_ROLE_SOURCE_ROLE:
				if (resolve) return getOuterSourceRole__SourceRole();
				return basicGetOuterSourceRole__SourceRole();
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SOURCE_DELEGATION_CONNECTOR:
				if (resolve) return getAssemblyContext__SourceDelegationConnector();
				return basicGetAssemblyContext__SourceDelegationConnector();
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_SOURCE_DELEGATION_CONNECTOR:
				return getParentStructure__SourceDelegationConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__INNER_SOURCE_ROLE_SOURCE_ROLE:
				setInnerSourceRole__SourceRole((SourceRole)newValue);
				return;
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__OUTER_SOURCE_ROLE_SOURCE_ROLE:
				setOuterSourceRole__SourceRole((SourceRole)newValue);
				return;
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SOURCE_DELEGATION_CONNECTOR:
				setAssemblyContext__SourceDelegationConnector((AssemblyContext)newValue);
				return;
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_SOURCE_DELEGATION_CONNECTOR:
				setParentStructure__SourceDelegationConnector((ComposedStructure)newValue);
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
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__INNER_SOURCE_ROLE_SOURCE_ROLE:
				setInnerSourceRole__SourceRole((SourceRole)null);
				return;
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__OUTER_SOURCE_ROLE_SOURCE_ROLE:
				setOuterSourceRole__SourceRole((SourceRole)null);
				return;
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SOURCE_DELEGATION_CONNECTOR:
				setAssemblyContext__SourceDelegationConnector((AssemblyContext)null);
				return;
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_SOURCE_DELEGATION_CONNECTOR:
				setParentStructure__SourceDelegationConnector((ComposedStructure)null);
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
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__INNER_SOURCE_ROLE_SOURCE_ROLE:
				return innerSourceRole__SourceRole != null;
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__OUTER_SOURCE_ROLE_SOURCE_ROLE:
				return outerSourceRole__SourceRole != null;
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SOURCE_DELEGATION_CONNECTOR:
				return assemblyContext__SourceDelegationConnector != null;
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_SOURCE_DELEGATION_CONNECTOR:
				return getParentStructure__SourceDelegationConnector() != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceDelegationConnectorImpl