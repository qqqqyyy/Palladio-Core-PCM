/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.seff.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.pcm.parameter.VariableUsage;
import de.uka.ipd.sdq.pcm.repository.FailureType;
import de.uka.ipd.sdq.pcm.repository.Role;
import de.uka.ipd.sdq.pcm.repository.Signature;
import de.uka.ipd.sdq.pcm.seff.CallAction;
import de.uka.ipd.sdq.pcm.seff.ExternalCallAction;
import de.uka.ipd.sdq.pcm.seff.FailureHandlingEntity;
import de.uka.ipd.sdq.pcm.seff.SeffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ExternalCallActionImpl#getOutputVariableUsages_ExternalCallAction <em>Output Variable Usages External Call Action</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ExternalCallActionImpl#getInputParameterUsages_ExternalCallAction <em>Input Parameter Usages External Call Action</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ExternalCallActionImpl#getFailuretype <em>Failuretype</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ExternalCallActionImpl#getCalledService_ExternalService <em>Called Service External Service</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ExternalCallActionImpl#getRole_ExternalService <em>Role External Service</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ExternalCallActionImpl#getRetryCount <em>Retry Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalCallActionImpl extends AbstractActionImpl implements ExternalCallAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The cached value of the '{@link #getOutputVariableUsages_ExternalCallAction() <em>Output Variable Usages External Call Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVariableUsages_ExternalCallAction()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableUsage> outputVariableUsages_ExternalCallAction;

	/**
	 * The cached value of the '{@link #getInputParameterUsages_ExternalCallAction() <em>Input Parameter Usages External Call Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameterUsages_ExternalCallAction()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableUsage> inputParameterUsages_ExternalCallAction;

	/**
	 * The cached value of the '{@link #getFailuretype() <em>Failuretype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailuretype()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureType> failuretype;

	/**
	 * The cached value of the '{@link #getCalledService_ExternalService() <em>Called Service External Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledService_ExternalService()
	 * @generated
	 * @ordered
	 */
	protected Signature calledService_ExternalService;

	/**
	 * The cached value of the '{@link #getRole_ExternalService() <em>Role External Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_ExternalService()
	 * @generated
	 * @ordered
	 */
	protected Role role_ExternalService;

	/**
	 * The default value of the '{@link #getRetryCount() <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetryCount() <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryCount()
	 * @generated
	 * @ordered
	 */
	protected int retryCount = RETRY_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalCallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.EXTERNAL_CALL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getCalledService_ExternalService() {
		if (calledService_ExternalService != null && calledService_ExternalService.eIsProxy()) {
			InternalEObject oldCalledService_ExternalService = (InternalEObject)calledService_ExternalService;
			calledService_ExternalService = (Signature)eResolveProxy(oldCalledService_ExternalService);
			if (calledService_ExternalService != oldCalledService_ExternalService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE, oldCalledService_ExternalService, calledService_ExternalService));
			}
		}
		return calledService_ExternalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetCalledService_ExternalService() {
		return calledService_ExternalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledService_ExternalService(Signature newCalledService_ExternalService) {
		Signature oldCalledService_ExternalService = calledService_ExternalService;
		calledService_ExternalService = newCalledService_ExternalService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE, oldCalledService_ExternalService, calledService_ExternalService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableUsage> getInputParameterUsages_ExternalCallAction() {
		if (inputParameterUsages_ExternalCallAction == null) {
			inputParameterUsages_ExternalCallAction = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, SeffPackage.EXTERNAL_CALL_ACTION__INPUT_PARAMETER_USAGES_EXTERNAL_CALL_ACTION);
		}
		return inputParameterUsages_ExternalCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureType> getFailuretype() {
		if (failuretype == null) {
			failuretype = new EObjectResolvingEList<FailureType>(FailureType.class, this, SeffPackage.EXTERNAL_CALL_ACTION__FAILURETYPE);
		}
		return failuretype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableUsage> getOutputVariableUsages_ExternalCallAction() {
		if (outputVariableUsages_ExternalCallAction == null) {
			outputVariableUsages_ExternalCallAction = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, SeffPackage.EXTERNAL_CALL_ACTION__OUTPUT_VARIABLE_USAGES_EXTERNAL_CALL_ACTION);
		}
		return outputVariableUsages_ExternalCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole_ExternalService() {
		if (role_ExternalService != null && role_ExternalService.eIsProxy()) {
			InternalEObject oldRole_ExternalService = (InternalEObject)role_ExternalService;
			role_ExternalService = (Role)eResolveProxy(oldRole_ExternalService);
			if (role_ExternalService != oldRole_ExternalService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE, oldRole_ExternalService, role_ExternalService));
			}
		}
		return role_ExternalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole_ExternalService() {
		return role_ExternalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_ExternalService(Role newRole_ExternalService) {
		Role oldRole_ExternalService = role_ExternalService;
		role_ExternalService = newRole_ExternalService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE, oldRole_ExternalService, role_ExternalService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetryCount() {
		return retryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryCount(int newRetryCount) {
		int oldRetryCount = retryCount;
		retryCount = newRetryCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.EXTERNAL_CALL_ACTION__RETRY_COUNT, oldRetryCount, retryCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.EXTERNAL_CALL_ACTION__OUTPUT_VARIABLE_USAGES_EXTERNAL_CALL_ACTION:
				return ((InternalEList<?>)getOutputVariableUsages_ExternalCallAction()).basicRemove(otherEnd, msgs);
			case SeffPackage.EXTERNAL_CALL_ACTION__INPUT_PARAMETER_USAGES_EXTERNAL_CALL_ACTION:
				return ((InternalEList<?>)getInputParameterUsages_ExternalCallAction()).basicRemove(otherEnd, msgs);
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
			case SeffPackage.EXTERNAL_CALL_ACTION__OUTPUT_VARIABLE_USAGES_EXTERNAL_CALL_ACTION:
				return getOutputVariableUsages_ExternalCallAction();
			case SeffPackage.EXTERNAL_CALL_ACTION__INPUT_PARAMETER_USAGES_EXTERNAL_CALL_ACTION:
				return getInputParameterUsages_ExternalCallAction();
			case SeffPackage.EXTERNAL_CALL_ACTION__FAILURETYPE:
				return getFailuretype();
			case SeffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE:
				if (resolve) return getCalledService_ExternalService();
				return basicGetCalledService_ExternalService();
			case SeffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE:
				if (resolve) return getRole_ExternalService();
				return basicGetRole_ExternalService();
			case SeffPackage.EXTERNAL_CALL_ACTION__RETRY_COUNT:
				return getRetryCount();
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
			case SeffPackage.EXTERNAL_CALL_ACTION__OUTPUT_VARIABLE_USAGES_EXTERNAL_CALL_ACTION:
				getOutputVariableUsages_ExternalCallAction().clear();
				getOutputVariableUsages_ExternalCallAction().addAll((Collection<? extends VariableUsage>)newValue);
				return;
			case SeffPackage.EXTERNAL_CALL_ACTION__INPUT_PARAMETER_USAGES_EXTERNAL_CALL_ACTION:
				getInputParameterUsages_ExternalCallAction().clear();
				getInputParameterUsages_ExternalCallAction().addAll((Collection<? extends VariableUsage>)newValue);
				return;
			case SeffPackage.EXTERNAL_CALL_ACTION__FAILURETYPE:
				getFailuretype().clear();
				getFailuretype().addAll((Collection<? extends FailureType>)newValue);
				return;
			case SeffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE:
				setCalledService_ExternalService((Signature)newValue);
				return;
			case SeffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE:
				setRole_ExternalService((Role)newValue);
				return;
			case SeffPackage.EXTERNAL_CALL_ACTION__RETRY_COUNT:
				setRetryCount((Integer)newValue);
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
			case SeffPackage.EXTERNAL_CALL_ACTION__OUTPUT_VARIABLE_USAGES_EXTERNAL_CALL_ACTION:
				getOutputVariableUsages_ExternalCallAction().clear();
				return;
			case SeffPackage.EXTERNAL_CALL_ACTION__INPUT_PARAMETER_USAGES_EXTERNAL_CALL_ACTION:
				getInputParameterUsages_ExternalCallAction().clear();
				return;
			case SeffPackage.EXTERNAL_CALL_ACTION__FAILURETYPE:
				getFailuretype().clear();
				return;
			case SeffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE:
				setCalledService_ExternalService((Signature)null);
				return;
			case SeffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE:
				setRole_ExternalService((Role)null);
				return;
			case SeffPackage.EXTERNAL_CALL_ACTION__RETRY_COUNT:
				setRetryCount(RETRY_COUNT_EDEFAULT);
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
			case SeffPackage.EXTERNAL_CALL_ACTION__OUTPUT_VARIABLE_USAGES_EXTERNAL_CALL_ACTION:
				return outputVariableUsages_ExternalCallAction != null && !outputVariableUsages_ExternalCallAction.isEmpty();
			case SeffPackage.EXTERNAL_CALL_ACTION__INPUT_PARAMETER_USAGES_EXTERNAL_CALL_ACTION:
				return inputParameterUsages_ExternalCallAction != null && !inputParameterUsages_ExternalCallAction.isEmpty();
			case SeffPackage.EXTERNAL_CALL_ACTION__FAILURETYPE:
				return failuretype != null && !failuretype.isEmpty();
			case SeffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE:
				return calledService_ExternalService != null;
			case SeffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE:
				return role_ExternalService != null;
			case SeffPackage.EXTERNAL_CALL_ACTION__RETRY_COUNT:
				return retryCount != RETRY_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CallAction.class) {
			switch (derivedFeatureID) {
				case SeffPackage.EXTERNAL_CALL_ACTION__OUTPUT_VARIABLE_USAGES_EXTERNAL_CALL_ACTION: return SeffPackage.CALL_ACTION__OUTPUT_VARIABLE_USAGES_EXTERNAL_CALL_ACTION;
				case SeffPackage.EXTERNAL_CALL_ACTION__INPUT_PARAMETER_USAGES_EXTERNAL_CALL_ACTION: return SeffPackage.CALL_ACTION__INPUT_PARAMETER_USAGES_EXTERNAL_CALL_ACTION;
				default: return -1;
			}
		}
		if (baseClass == FailureHandlingEntity.class) {
			switch (derivedFeatureID) {
				case SeffPackage.EXTERNAL_CALL_ACTION__FAILURETYPE: return SeffPackage.FAILURE_HANDLING_ENTITY__FAILURETYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CallAction.class) {
			switch (baseFeatureID) {
				case SeffPackage.CALL_ACTION__OUTPUT_VARIABLE_USAGES_EXTERNAL_CALL_ACTION: return SeffPackage.EXTERNAL_CALL_ACTION__OUTPUT_VARIABLE_USAGES_EXTERNAL_CALL_ACTION;
				case SeffPackage.CALL_ACTION__INPUT_PARAMETER_USAGES_EXTERNAL_CALL_ACTION: return SeffPackage.EXTERNAL_CALL_ACTION__INPUT_PARAMETER_USAGES_EXTERNAL_CALL_ACTION;
				default: return -1;
			}
		}
		if (baseClass == FailureHandlingEntity.class) {
			switch (baseFeatureID) {
				case SeffPackage.FAILURE_HANDLING_ENTITY__FAILURETYPE: return SeffPackage.EXTERNAL_CALL_ACTION__FAILURETYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (retryCount: ");
		result.append(retryCount);
		result.append(')');
		return result.toString();
	}

} //ExternalCallActionImpl