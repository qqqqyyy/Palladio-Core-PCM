/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.seff.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;
import de.uka.ipd.sdq.pcm.repository.Signature;
import de.uka.ipd.sdq.pcm.seff.AbstractAction;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingBehaviour;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingInternalBehaviour;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;
import de.uka.ipd.sdq.pcm.seff.SeffPackage;
import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;
import de.uka.ipd.sdq.pcm.seff.util.SeffValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Demanding SEFF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ResourceDemandingSEFFImpl#getSeffTypeID <em>Seff Type ID</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ResourceDemandingSEFFImpl#getDescribedService__SEFF <em>Described Service SEFF</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ResourceDemandingSEFFImpl#getSteps_Behaviour <em>Steps Behaviour</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.seff.impl.ResourceDemandingSEFFImpl#getResourceDemandingInternalBehaviours <em>Resource Demanding Internal Behaviours</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceDemandingSEFFImpl extends IdentifierImpl implements ResourceDemandingSEFF {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The default value of the '{@link #getSeffTypeID() <em>Seff Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeffTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final String SEFF_TYPE_ID_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getSeffTypeID() <em>Seff Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeffTypeID()
	 * @generated
	 * @ordered
	 */
	protected String seffTypeID = SEFF_TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescribedService__SEFF() <em>Described Service SEFF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedService__SEFF()
	 * @generated
	 * @ordered
	 */
	protected Signature describedService__SEFF;

	/**
	 * The cached value of the '{@link #getSteps_Behaviour() <em>Steps Behaviour</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps_Behaviour()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractAction> steps_Behaviour;

	/**
	 * The cached value of the '{@link #getResourceDemandingInternalBehaviours() <em>Resource Demanding Internal Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDemandingInternalBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceDemandingInternalBehaviour> resourceDemandingInternalBehaviours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDemandingSEFFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.RESOURCE_DEMANDING_SEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeffTypeID() {
		return seffTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeffTypeID(String newSeffTypeID) {
		String oldSeffTypeID = seffTypeID;
		seffTypeID = newSeffTypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID, oldSeffTypeID, seffTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getDescribedService__SEFF() {
		if (describedService__SEFF != null && describedService__SEFF.eIsProxy()) {
			InternalEObject oldDescribedService__SEFF = (InternalEObject)describedService__SEFF;
			describedService__SEFF = (Signature)eResolveProxy(oldDescribedService__SEFF);
			if (describedService__SEFF != oldDescribedService__SEFF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF, oldDescribedService__SEFF, describedService__SEFF));
			}
		}
		return describedService__SEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetDescribedService__SEFF() {
		return describedService__SEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribedService__SEFF(Signature newDescribedService__SEFF) {
		Signature oldDescribedService__SEFF = describedService__SEFF;
		describedService__SEFF = newDescribedService__SEFF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF, oldDescribedService__SEFF, describedService__SEFF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractAction> getSteps_Behaviour() {
		if (steps_Behaviour == null) {
			steps_Behaviour = new EObjectContainmentEList<AbstractAction>(AbstractAction.class, this, SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR);
		}
		return steps_Behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceDemandingInternalBehaviour> getResourceDemandingInternalBehaviours() {
		if (resourceDemandingInternalBehaviours == null) {
			resourceDemandingInternalBehaviours = new EObjectContainmentEList<ResourceDemandingInternalBehaviour>(ResourceDemandingInternalBehaviour.class, this, SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS);
		}
		return resourceDemandingInternalBehaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ExactlyOneStopAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (EXACTLY_ONE_STOP_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SeffPackage.Literals.RESOURCE_DEMANDING_BEHAVIOUR);
			try {
				EXACTLY_ONE_STOP_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(EXACTLY_ONE_STOP_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(EXACTLY_ONE_STOP_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SeffValidator.DIAGNOSTIC_SOURCE,
						 SeffValidator.RESOURCE_DEMANDING_BEHAVIOUR__EXACTLY_ONE_STOP_ACTION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ExactlyOneStopAction", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ExactlyOneStartAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (EXACTLY_ONE_START_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SeffPackage.Literals.RESOURCE_DEMANDING_BEHAVIOUR);
			try {
				EXACTLY_ONE_START_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(EXACTLY_ONE_START_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(EXACTLY_ONE_START_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SeffValidator.DIAGNOSTIC_SOURCE,
						 SeffValidator.RESOURCE_DEMANDING_BEHAVIOUR__EXACTLY_ONE_START_ACTION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ExactlyOneStartAction", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SeffPackage.Literals.RESOURCE_DEMANDING_BEHAVIOUR);
			try {
				EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SeffValidator.DIAGNOSTIC_SOURCE,
						 SeffValidator.RESOURCE_DEMANDING_BEHAVIOUR__EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ExactlyOneStopAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exactly One Stop Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ExactlyOneStopAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EXACTLY_ONE_STOP_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.steps_Behaviour->select(s|s.oclIsTypeOf(StopAction))->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #ExactlyOneStopAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exactly One Stop Action</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ExactlyOneStopAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EXACTLY_ONE_STOP_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #ExactlyOneStartAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exactly One Start Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ExactlyOneStartAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EXACTLY_ONE_START_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.steps_Behaviour->select(s|s.oclIsTypeOf(StartAction))->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #ExactlyOneStartAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exactly One Start Action</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ExactlyOneStartAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EXACTLY_ONE_START_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Each Action Except Start Actionand Stop Action Must Hhave APredecessor And Successor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.steps_Behaviour->select(s|not s.oclIsTypeOf(StartAction) and not s.oclIsTypeOf(StopAction))->exists(a|a.oclAsType(AbstractAction).predecessor_AbstractAction.oclIsUndefined()) and not self.steps_Behaviour->select(s|not s.oclIsTypeOf(StartAction) and not s.oclIsTypeOf(StopAction))->exists(a|a.oclAsType(AbstractAction).successor_AbstractAction.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Each Action Except Start Actionand Stop Action Must Hhave APredecessor And Successor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
				return ((InternalEList<?>)getSteps_Behaviour()).basicRemove(otherEnd, msgs);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
				return ((InternalEList<?>)getResourceDemandingInternalBehaviours()).basicRemove(otherEnd, msgs);
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
				return getSeffTypeID();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
				if (resolve) return getDescribedService__SEFF();
				return basicGetDescribedService__SEFF();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
				return getSteps_Behaviour();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
				return getResourceDemandingInternalBehaviours();
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
				setSeffTypeID((String)newValue);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
				setDescribedService__SEFF((Signature)newValue);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
				getSteps_Behaviour().clear();
				getSteps_Behaviour().addAll((Collection<? extends AbstractAction>)newValue);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
				getResourceDemandingInternalBehaviours().clear();
				getResourceDemandingInternalBehaviours().addAll((Collection<? extends ResourceDemandingInternalBehaviour>)newValue);
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
				setSeffTypeID(SEFF_TYPE_ID_EDEFAULT);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
				setDescribedService__SEFF((Signature)null);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
				getSteps_Behaviour().clear();
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
				getResourceDemandingInternalBehaviours().clear();
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
				return SEFF_TYPE_ID_EDEFAULT == null ? seffTypeID != null : !SEFF_TYPE_ID_EDEFAULT.equals(seffTypeID);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
				return describedService__SEFF != null;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
				return steps_Behaviour != null && !steps_Behaviour.isEmpty();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
				return resourceDemandingInternalBehaviours != null && !resourceDemandingInternalBehaviours.isEmpty();
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
		if (baseClass == ServiceEffectSpecification.class) {
			switch (derivedFeatureID) {
				case SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID: return SeffPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID;
				case SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF: return SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF;
				default: return -1;
			}
		}
		if (baseClass == ResourceDemandingBehaviour.class) {
			switch (derivedFeatureID) {
				case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR: return SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR;
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
		if (baseClass == ServiceEffectSpecification.class) {
			switch (baseFeatureID) {
				case SeffPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID: return SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID;
				case SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF: return SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF;
				default: return -1;
			}
		}
		if (baseClass == ResourceDemandingBehaviour.class) {
			switch (baseFeatureID) {
				case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR: return SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR;
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
		result.append(" (seffTypeID: ");
		result.append(seffTypeID);
		result.append(')');
		return result.toString();
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

} //ResourceDemandingSEFFImpl