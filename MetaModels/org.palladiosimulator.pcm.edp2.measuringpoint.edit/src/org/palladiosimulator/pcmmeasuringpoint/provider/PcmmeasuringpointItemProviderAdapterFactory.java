/**
 */
package org.palladiosimulator.pcmmeasuringpoint.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.palladiosimulator.pcmmeasuringpoint.util.PcmmeasuringpointAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The
 * adapters generated by this factory convert EMF adapter notifications into calls to
 * {@link #fireNotifyChanged fireNotifyChanged}. The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class PcmmeasuringpointItemProviderAdapterFactory extends PcmmeasuringpointAdapterFactory implements
        ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
    public PcmmeasuringpointItemProviderAdapterFactory() {
        this.supportedTypes.add(IEditingDomainItemProvider.class);
        this.supportedTypes.add(IStructuredItemContentProvider.class);
        this.supportedTypes.add(ITreeItemContentProvider.class);
        this.supportedTypes.add(IItemLabelProvider.class);
        this.supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.pcmmeasuringpoint.AssemblyOperationMeasuringPoint} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AssemblyOperationMeasuringPointItemProvider assemblyOperationMeasuringPointItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.pcmmeasuringpoint.AssemblyOperationMeasuringPoint}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createAssemblyOperationMeasuringPointAdapter() {
        if (this.assemblyOperationMeasuringPointItemProvider == null) {
            this.assemblyOperationMeasuringPointItemProvider = new AssemblyOperationMeasuringPointItemProvider(this);
        }

        return this.assemblyOperationMeasuringPointItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.pcmmeasuringpoint.AssemblyPassiveResourceMeasuringPoint}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AssemblyPassiveResourceMeasuringPointItemProvider assemblyPassiveResourceMeasuringPointItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.pcmmeasuringpoint.AssemblyPassiveResourceMeasuringPoint}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createAssemblyPassiveResourceMeasuringPointAdapter() {
        if (this.assemblyPassiveResourceMeasuringPointItemProvider == null) {
            this.assemblyPassiveResourceMeasuringPointItemProvider = new AssemblyPassiveResourceMeasuringPointItemProvider(
                    this);
        }

        return this.assemblyPassiveResourceMeasuringPointItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.pcmmeasuringpoint.ActiveResourceMeasuringPoint} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ActiveResourceMeasuringPointItemProvider activeResourceMeasuringPointItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.pcmmeasuringpoint.ActiveResourceMeasuringPoint}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createActiveResourceMeasuringPointAdapter() {
        if (this.activeResourceMeasuringPointItemProvider == null) {
            this.activeResourceMeasuringPointItemProvider = new ActiveResourceMeasuringPointItemProvider(this);
        }

        return this.activeResourceMeasuringPointItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.pcmmeasuringpoint.SystemOperationMeasuringPoint} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SystemOperationMeasuringPointItemProvider systemOperationMeasuringPointItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.pcmmeasuringpoint.SystemOperationMeasuringPoint}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createSystemOperationMeasuringPointAdapter() {
        if (this.systemOperationMeasuringPointItemProvider == null) {
            this.systemOperationMeasuringPointItemProvider = new SystemOperationMeasuringPointItemProvider(this);
        }

        return this.systemOperationMeasuringPointItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.pcmmeasuringpoint.LinkingResourceMeasuringPoint} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected LinkingResourceMeasuringPointItemProvider linkingResourceMeasuringPointItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.pcmmeasuringpoint.LinkingResourceMeasuringPoint}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createLinkingResourceMeasuringPointAdapter() {
        if (this.linkingResourceMeasuringPointItemProvider == null) {
            this.linkingResourceMeasuringPointItemProvider = new LinkingResourceMeasuringPointItemProvider(this);
        }

        return this.linkingResourceMeasuringPointItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.pcmmeasuringpoint.SubSystemOperationMeasuringPoint} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SubSystemOperationMeasuringPointItemProvider subSystemOperationMeasuringPointItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.pcmmeasuringpoint.SubSystemOperationMeasuringPoint}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createSubSystemOperationMeasuringPointAdapter() {
        if (this.subSystemOperationMeasuringPointItemProvider == null) {
            this.subSystemOperationMeasuringPointItemProvider = new SubSystemOperationMeasuringPointItemProvider(this);
        }

        return this.subSystemOperationMeasuringPointItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.pcmmeasuringpoint.UsageScenarioMeasuringPoint} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected UsageScenarioMeasuringPointItemProvider usageScenarioMeasuringPointItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.pcmmeasuringpoint.UsageScenarioMeasuringPoint}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createUsageScenarioMeasuringPointAdapter() {
        if (this.usageScenarioMeasuringPointItemProvider == null) {
            this.usageScenarioMeasuringPointItemProvider = new UsageScenarioMeasuringPointItemProvider(this);
        }

        return this.usageScenarioMeasuringPointItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.pcmmeasuringpoint.EntryLevelSystemCallMeasuringPoint} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EntryLevelSystemCallMeasuringPointItemProvider entryLevelSystemCallMeasuringPointItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.pcmmeasuringpoint.EntryLevelSystemCallMeasuringPoint}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createEntryLevelSystemCallMeasuringPointAdapter() {
        if (this.entryLevelSystemCallMeasuringPointItemProvider == null) {
            this.entryLevelSystemCallMeasuringPointItemProvider = new EntryLevelSystemCallMeasuringPointItemProvider(
                    this);
        }

        return this.entryLevelSystemCallMeasuringPointItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.pcmmeasuringpoint.ExternalCallActionMeasuringPoint} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExternalCallActionMeasuringPointItemProvider externalCallActionMeasuringPointItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.pcmmeasuringpoint.ExternalCallActionMeasuringPoint}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createExternalCallActionMeasuringPointAdapter() {
        if (this.externalCallActionMeasuringPointItemProvider == null) {
            this.externalCallActionMeasuringPointItemProvider = new ExternalCallActionMeasuringPointItemProvider(this);
        }

        return this.externalCallActionMeasuringPointItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.pcmmeasuringpoint.ResourceEnvironmentMeasuringPoint} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ResourceEnvironmentMeasuringPointItemProvider resourceEnvironmentMeasuringPointItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.pcmmeasuringpoint.ResourceEnvironmentMeasuringPoint}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createResourceEnvironmentMeasuringPointAdapter() {
        if (this.resourceEnvironmentMeasuringPointItemProvider == null) {
            this.resourceEnvironmentMeasuringPointItemProvider = new ResourceEnvironmentMeasuringPointItemProvider(this);
        }

        return this.resourceEnvironmentMeasuringPointItemProvider;
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
        if (this.assemblyOperationMeasuringPointItemProvider != null) {
            this.assemblyOperationMeasuringPointItemProvider.dispose();
        }
        if (this.assemblyPassiveResourceMeasuringPointItemProvider != null) {
            this.assemblyPassiveResourceMeasuringPointItemProvider.dispose();
        }
        if (this.activeResourceMeasuringPointItemProvider != null) {
            this.activeResourceMeasuringPointItemProvider.dispose();
        }
        if (this.systemOperationMeasuringPointItemProvider != null) {
            this.systemOperationMeasuringPointItemProvider.dispose();
        }
        if (this.linkingResourceMeasuringPointItemProvider != null) {
            this.linkingResourceMeasuringPointItemProvider.dispose();
        }
        if (this.subSystemOperationMeasuringPointItemProvider != null) {
            this.subSystemOperationMeasuringPointItemProvider.dispose();
        }
        if (this.usageScenarioMeasuringPointItemProvider != null) {
            this.usageScenarioMeasuringPointItemProvider.dispose();
        }
        if (this.entryLevelSystemCallMeasuringPointItemProvider != null) {
            this.entryLevelSystemCallMeasuringPointItemProvider.dispose();
        }
        if (this.externalCallActionMeasuringPointItemProvider != null) {
            this.externalCallActionMeasuringPointItemProvider.dispose();
        }
        if (this.resourceEnvironmentMeasuringPointItemProvider != null) {
            this.resourceEnvironmentMeasuringPointItemProvider.dispose();
        }
    }

}
