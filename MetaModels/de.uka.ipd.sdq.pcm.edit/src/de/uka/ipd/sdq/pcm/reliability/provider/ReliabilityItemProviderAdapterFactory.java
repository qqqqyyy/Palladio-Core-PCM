/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.reliability.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.uka.ipd.sdq.pcm.core.provider.PalladioComponentModelEditPlugin;
import de.uka.ipd.sdq.pcm.reliability.ReliabilityPackage;
import de.uka.ipd.sdq.pcm.reliability.util.ReliabilityAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The
 * adapters generated by this factory convert EMF adapter notifications into calls to
 * {@link #fireNotifyChanged fireNotifyChanged}. The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ReliabilityItemProviderAdapterFactory extends ReliabilityAdapterFactory implements
        ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This helps manage the child creation extenders. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
            PalladioComponentModelEditPlugin.INSTANCE, ReliabilityPackage.eNS_URI);

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType
     * isFactoryForType}. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ReliabilityItemProviderAdapterFactory() {
        this.supportedTypes.add(IEditingDomainItemProvider.class);
        this.supportedTypes.add(IStructuredItemContentProvider.class);
        this.supportedTypes.add(ITreeItemContentProvider.class);
        this.supportedTypes.add(IItemLabelProvider.class);
        this.supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.pcm.reliability.HardwareInducedFailureType} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected HardwareInducedFailureTypeItemProvider hardwareInducedFailureTypeItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.pcm.reliability.HardwareInducedFailureType}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createHardwareInducedFailureTypeAdapter() {
        if (this.hardwareInducedFailureTypeItemProvider == null) {
            this.hardwareInducedFailureTypeItemProvider = new HardwareInducedFailureTypeItemProvider(this);
        }

        return this.hardwareInducedFailureTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.pcm.reliability.ExternalFailureOccurrenceDescription} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ExternalFailureOccurrenceDescriptionItemProvider externalFailureOccurrenceDescriptionItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.pcm.reliability.ExternalFailureOccurrenceDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createExternalFailureOccurrenceDescriptionAdapter() {
        if (this.externalFailureOccurrenceDescriptionItemProvider == null) {
            this.externalFailureOccurrenceDescriptionItemProvider = new ExternalFailureOccurrenceDescriptionItemProvider(
                    this);
        }

        return this.externalFailureOccurrenceDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.pcm.reliability.ResourceTimeoutFailureType} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ResourceTimeoutFailureTypeItemProvider resourceTimeoutFailureTypeItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.pcm.reliability.ResourceTimeoutFailureType}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createResourceTimeoutFailureTypeAdapter() {
        if (this.resourceTimeoutFailureTypeItemProvider == null) {
            this.resourceTimeoutFailureTypeItemProvider = new ResourceTimeoutFailureTypeItemProvider(this);
        }

        return this.resourceTimeoutFailureTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.pcm.reliability.NetworkInducedFailureType} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected NetworkInducedFailureTypeItemProvider networkInducedFailureTypeItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.pcm.reliability.NetworkInducedFailureType}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createNetworkInducedFailureTypeAdapter() {
        if (this.networkInducedFailureTypeItemProvider == null) {
            this.networkInducedFailureTypeItemProvider = new NetworkInducedFailureTypeItemProvider(this);
        }

        return this.networkInducedFailureTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected InternalFailureOccurrenceDescriptionItemProvider internalFailureOccurrenceDescriptionItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createInternalFailureOccurrenceDescriptionAdapter() {
        if (this.internalFailureOccurrenceDescriptionItemProvider == null) {
            this.internalFailureOccurrenceDescriptionItemProvider = new InternalFailureOccurrenceDescriptionItemProvider(
                    this);
        }

        return this.internalFailureOccurrenceDescriptionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link de.uka.ipd.sdq.pcm.reliability.SoftwareInducedFailureType} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SoftwareInducedFailureTypeItemProvider softwareInducedFailureTypeItemProvider;

    /**
     * This creates an adapter for a
     * {@link de.uka.ipd.sdq.pcm.reliability.SoftwareInducedFailureType}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createSoftwareInducedFailureTypeAdapter() {
        if (this.softwareInducedFailureTypeItemProvider == null) {
            this.softwareInducedFailureTypeItemProvider = new SoftwareInducedFailureTypeItemProvider(this);
        }

        return this.softwareInducedFailureTypeItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return this.parentAdapterFactory == null ? this : this.parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setParentAdapterFactory(final ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object type) {
        return this.supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter adapt(final Notifier notifier, final Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object adapt(final Object object, final Object type) {
        if (this.isFactoryForType(type)) {
            final Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders() {
        return this.childCreationExtenderManager.getChildCreationExtenders();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Collection<?> getNewChildDescriptors(final Object object, final EditingDomain editingDomain) {
        return this.childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return this.childCreationExtenderManager;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void addListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void removeListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void fireNotifyChanged(final Notification notification) {
        this.changeNotifier.fireNotifyChanged(notification);

        if (this.parentAdapterFactory != null) {
            this.parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void dispose() {
        if (this.hardwareInducedFailureTypeItemProvider != null) {
            this.hardwareInducedFailureTypeItemProvider.dispose();
        }
        if (this.softwareInducedFailureTypeItemProvider != null) {
            this.softwareInducedFailureTypeItemProvider.dispose();
        }
        if (this.internalFailureOccurrenceDescriptionItemProvider != null) {
            this.internalFailureOccurrenceDescriptionItemProvider.dispose();
        }
        if (this.networkInducedFailureTypeItemProvider != null) {
            this.networkInducedFailureTypeItemProvider.dispose();
        }
        if (this.externalFailureOccurrenceDescriptionItemProvider != null) {
            this.externalFailureOccurrenceDescriptionItemProvider.dispose();
        }
        if (this.resourceTimeoutFailureTypeItemProvider != null) {
            this.resourceTimeoutFailureTypeItemProvider.dispose();
        }
    }

}
