
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourceenvironment.impl;

import de.uka.ipd.sdq.pcm.resourceenvironment.CommunicationLinkResourceSpecification;
import de.uka.ipd.sdq.pcm.resourceenvironment.Latency;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage;

import de.uka.ipd.sdq.pcm.resourcetype.CommunicationLinkResourceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification <em>Communication Link Resource Type Communication Link Resource Specification</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl#getLinkLatency <em>Link Latency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationLinkResourceSpecificationImpl extends EObjectImpl implements CommunicationLinkResourceSpecification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached value of the '{@link #getCommunicationLinkResourceType_CommunicationLinkResourceSpecification() <em>Communication Link Resource Type Communication Link Resource Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationLinkResourceType_CommunicationLinkResourceSpecification()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLinkResourceType communicationLinkResourceType_CommunicationLinkResourceSpecification;

	/**
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final double THROUGHPUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected double throughput = THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;


	/**
	 * The cached value of the '{@link #getLinkLatency() <em>Link Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkLatency()
	 * @generated
	 * @ordered
	 */
	protected Latency linkLatency;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationLinkResourceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceenvironmentPackage.Literals.COMMUNICATION_LINK_RESOURCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkResourceType getCommunicationLinkResourceType_CommunicationLinkResourceSpecification() {
		if (communicationLinkResourceType_CommunicationLinkResourceSpecification != null && communicationLinkResourceType_CommunicationLinkResourceSpecification.eIsProxy()) {
			InternalEObject oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification = (InternalEObject)communicationLinkResourceType_CommunicationLinkResourceSpecification;
			communicationLinkResourceType_CommunicationLinkResourceSpecification = (CommunicationLinkResourceType)eResolveProxy(oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification);
			if (communicationLinkResourceType_CommunicationLinkResourceSpecification != oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification, communicationLinkResourceType_CommunicationLinkResourceSpecification));
			}
		}
		return communicationLinkResourceType_CommunicationLinkResourceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkResourceType basicGetCommunicationLinkResourceType_CommunicationLinkResourceSpecification() {
		return communicationLinkResourceType_CommunicationLinkResourceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationLinkResourceType_CommunicationLinkResourceSpecification(CommunicationLinkResourceType newCommunicationLinkResourceType_CommunicationLinkResourceSpecification) {
		CommunicationLinkResourceType oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification = communicationLinkResourceType_CommunicationLinkResourceSpecification;
		communicationLinkResourceType_CommunicationLinkResourceSpecification = newCommunicationLinkResourceType_CommunicationLinkResourceSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, oldCommunicationLinkResourceType_CommunicationLinkResourceSpecification, communicationLinkResourceType_CommunicationLinkResourceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(double newThroughput) {
		double oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT, oldThroughput, throughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latency getLinkLatency() {
		return linkLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkLatency(Latency newLinkLatency, NotificationChain msgs) {
		Latency oldLinkLatency = linkLatency;
		linkLatency = newLinkLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINK_LATENCY, oldLinkLatency, newLinkLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkLatency(Latency newLinkLatency) {
		if (newLinkLatency != linkLatency) {
			NotificationChain msgs = null;
			if (linkLatency != null)
				msgs = ((InternalEObject)linkLatency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINK_LATENCY, null, msgs);
			if (newLinkLatency != null)
				msgs = ((InternalEObject)newLinkLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINK_LATENCY, null, msgs);
			msgs = basicSetLinkLatency(newLinkLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINK_LATENCY, newLinkLatency, newLinkLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINK_LATENCY:
				return basicSetLinkLatency(null, msgs);
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
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				if (resolve) return getCommunicationLinkResourceType_CommunicationLinkResourceSpecification();
				return basicGetCommunicationLinkResourceType_CommunicationLinkResourceSpecification();
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT:
				return new Double(getThroughput());
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__UNITS:
				return getUnits();
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINK_LATENCY:
				return getLinkLatency();
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
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				setCommunicationLinkResourceType_CommunicationLinkResourceSpecification((CommunicationLinkResourceType)newValue);
				return;
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT:
				setThroughput(((Double)newValue).doubleValue());
				return;
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__UNITS:
				setUnits((String)newValue);
				return;
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINK_LATENCY:
				setLinkLatency((Latency)newValue);
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
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				setCommunicationLinkResourceType_CommunicationLinkResourceSpecification((CommunicationLinkResourceType)null);
				return;
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT:
				setThroughput(THROUGHPUT_EDEFAULT);
				return;
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__UNITS:
				setUnits(UNITS_EDEFAULT);
				return;
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINK_LATENCY:
				setLinkLatency((Latency)null);
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
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				return communicationLinkResourceType_CommunicationLinkResourceSpecification != null;
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT:
				return throughput != THROUGHPUT_EDEFAULT;
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__UNITS:
				return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
			case ResourceenvironmentPackage.COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINK_LATENCY:
				return linkLatency != null;
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
		result.append(" (throughput: ");
		result.append(throughput);
		result.append(", units: ");
		result.append(units);
		result.append(')');
		return result.toString();
	}

} //CommunicationLinkResourceSpecificationImpl
