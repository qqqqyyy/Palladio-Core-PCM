
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.seff.impl;

import de.uka.ipd.sdq.pcm.resourcetype.ProcessingResourceType;

import de.uka.ipd.sdq.pcm.seff.AbstractResourceDemandingAction;
import de.uka.ipd.sdq.pcm.seff.ParametricResourceDemand;
import de.uka.ipd.sdq.pcm.seff.SeffPackage;

import de.uka.ipd.sdq.stoex.impl.RandomVariableImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parametric Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ParametricResourceDemandImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ParametricResourceDemandImpl#getRequiredResource_ParametricResourceDemand <em>Required Resource Parametric Resource Demand</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ParametricResourceDemandImpl#getAction_ParametricResourceDemand <em>Action Parametric Resource Demand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametricResourceDemandImpl extends RandomVariableImpl implements ParametricResourceDemand {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(c) by SDQ, IPD, U Karlsruhe (TH), 2006";

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredResource_ParametricResourceDemand() <em>Required Resource Parametric Resource Demand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResource_ParametricResourceDemand()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceType requiredResource_ParametricResourceDemand = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametricResourceDemandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SeffPackage.Literals.PARAMETRIC_RESOURCE_DEMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceType getRequiredResource_ParametricResourceDemand() {
		if (requiredResource_ParametricResourceDemand != null && requiredResource_ParametricResourceDemand.eIsProxy()) {
			InternalEObject oldRequiredResource_ParametricResourceDemand = (InternalEObject)requiredResource_ParametricResourceDemand;
			requiredResource_ParametricResourceDemand = (ProcessingResourceType)eResolveProxy(oldRequiredResource_ParametricResourceDemand);
			if (requiredResource_ParametricResourceDemand != oldRequiredResource_ParametricResourceDemand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND, oldRequiredResource_ParametricResourceDemand, requiredResource_ParametricResourceDemand));
			}
		}
		return requiredResource_ParametricResourceDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceType basicGetRequiredResource_ParametricResourceDemand() {
		return requiredResource_ParametricResourceDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredResource_ParametricResourceDemand(ProcessingResourceType newRequiredResource_ParametricResourceDemand) {
		ProcessingResourceType oldRequiredResource_ParametricResourceDemand = requiredResource_ParametricResourceDemand;
		requiredResource_ParametricResourceDemand = newRequiredResource_ParametricResourceDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND, oldRequiredResource_ParametricResourceDemand, requiredResource_ParametricResourceDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractResourceDemandingAction getAction_ParametricResourceDemand() {
		if (eContainerFeatureID != SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND) return null;
		return (AbstractResourceDemandingAction)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction_ParametricResourceDemand(AbstractResourceDemandingAction newAction_ParametricResourceDemand, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAction_ParametricResourceDemand, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction_ParametricResourceDemand(AbstractResourceDemandingAction newAction_ParametricResourceDemand) {
		if (newAction_ParametricResourceDemand != eInternalContainer() || (eContainerFeatureID != SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND && newAction_ParametricResourceDemand != null)) {
			if (EcoreUtil.isAncestor(this, newAction_ParametricResourceDemand))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAction_ParametricResourceDemand != null)
				msgs = ((InternalEObject)newAction_ParametricResourceDemand).eInverseAdd(this, SeffPackage.ABSTRACT_RESOURCE_DEMANDING_ACTION__RESOURCE_DEMAND_ACTION, AbstractResourceDemandingAction.class, msgs);
			msgs = basicSetAction_ParametricResourceDemand(newAction_ParametricResourceDemand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND, newAction_ParametricResourceDemand, newAction_ParametricResourceDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAction_ParametricResourceDemand((AbstractResourceDemandingAction)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
				return basicSetAction_ParametricResourceDemand(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
				return eInternalContainer().eInverseRemove(this, SeffPackage.ABSTRACT_RESOURCE_DEMANDING_ACTION__RESOURCE_DEMAND_ACTION, AbstractResourceDemandingAction.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__UNIT:
				return getUnit();
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
				if (resolve) return getRequiredResource_ParametricResourceDemand();
				return basicGetRequiredResource_ParametricResourceDemand();
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
				return getAction_ParametricResourceDemand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__UNIT:
				setUnit((String)newValue);
				return;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
				setRequiredResource_ParametricResourceDemand((ProcessingResourceType)newValue);
				return;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
				setAction_ParametricResourceDemand((AbstractResourceDemandingAction)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
				setRequiredResource_ParametricResourceDemand((ProcessingResourceType)null);
				return;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
				setAction_ParametricResourceDemand((AbstractResourceDemandingAction)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
				return requiredResource_ParametricResourceDemand != null;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
				return getAction_ParametricResourceDemand() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //ParametricResourceDemandImpl