/**
 */
package org.palladiosimulator.pcmmeasuringpoint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.pcmmeasuringpoint.PcmmeasuringpointPackage;
import org.palladiosimulator.pcmmeasuringpoint.SystemReference;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>System Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.pcmmeasuringpoint.impl.SystemReferenceImpl#getSystem <em>System
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SystemReferenceImpl extends MinimalEObjectImpl.Container implements SystemReference {
    /**
     * The cached value of the '{@link #getSystem() <em>System</em>}' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getSystem()
     * @generated
     * @ordered
     */
    protected de.uka.ipd.sdq.pcm.system.System system;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SystemReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PcmmeasuringpointPackage.Literals.SYSTEM_REFERENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public de.uka.ipd.sdq.pcm.system.System getSystem() {
        if (this.system != null && ((EObject) this.system).eIsProxy()) {
            final InternalEObject oldSystem = (InternalEObject) this.system;
            this.system = (de.uka.ipd.sdq.pcm.system.System) this.eResolveProxy(oldSystem);
            if (this.system != oldSystem) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            PcmmeasuringpointPackage.SYSTEM_REFERENCE__SYSTEM, oldSystem, this.system));
                }
            }
        }
        return this.system;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public de.uka.ipd.sdq.pcm.system.System basicGetSystem() {
        return this.system;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSystem(final de.uka.ipd.sdq.pcm.system.System newSystem) {
        final de.uka.ipd.sdq.pcm.system.System oldSystem = this.system;
        this.system = newSystem;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    PcmmeasuringpointPackage.SYSTEM_REFERENCE__SYSTEM, oldSystem, this.system));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case PcmmeasuringpointPackage.SYSTEM_REFERENCE__SYSTEM:
            if (resolve) {
                return this.getSystem();
            }
            return this.basicGetSystem();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case PcmmeasuringpointPackage.SYSTEM_REFERENCE__SYSTEM:
            this.setSystem((de.uka.ipd.sdq.pcm.system.System) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case PcmmeasuringpointPackage.SYSTEM_REFERENCE__SYSTEM:
            this.setSystem((de.uka.ipd.sdq.pcm.system.System) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case PcmmeasuringpointPackage.SYSTEM_REFERENCE__SYSTEM:
            return this.system != null;
        }
        return super.eIsSet(featureID);
    }

} // SystemReferenceImpl