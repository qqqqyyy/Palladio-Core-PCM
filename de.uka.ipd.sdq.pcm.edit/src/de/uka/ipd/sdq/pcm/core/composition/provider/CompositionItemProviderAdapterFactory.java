/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.core.composition.provider;

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

import de.uka.ipd.sdq.pcm.core.composition.util.CompositionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionItemProviderAdapterFactory extends CompositionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.ProvidedDelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedDelegationConnectorItemProvider providedDelegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.ProvidedDelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidedDelegationConnectorAdapter() {
		if (providedDelegationConnectorItemProvider == null) {
			providedDelegationConnectorItemProvider = new ProvidedDelegationConnectorItemProvider(this);
		}

		return providedDelegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.AssemblyConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorItemProvider assemblyConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyConnectorAdapter() {
		if (assemblyConnectorItemProvider == null) {
			assemblyConnectorItemProvider = new AssemblyConnectorItemProvider(this);
		}

		return assemblyConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.RequiredDelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredDelegationConnectorItemProvider requiredDelegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.RequiredDelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequiredDelegationConnectorAdapter() {
		if (requiredDelegationConnectorItemProvider == null) {
			requiredDelegationConnectorItemProvider = new RequiredDelegationConnectorItemProvider(this);
		}

		return requiredDelegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.ResourceRequiredDelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRequiredDelegationConnectorItemProvider resourceRequiredDelegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.ResourceRequiredDelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceRequiredDelegationConnectorAdapter() {
		if (resourceRequiredDelegationConnectorItemProvider == null) {
			resourceRequiredDelegationConnectorItemProvider = new ResourceRequiredDelegationConnectorItemProvider(this);
		}

		return resourceRequiredDelegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.EventChannel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChannelItemProvider eventChannelItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.EventChannel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventChannelAdapter() {
		if (eventChannelItemProvider == null) {
			eventChannelItemProvider = new EventChannelItemProvider(this);
		}

		return eventChannelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.AssemblyEventConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyEventConnectorItemProvider assemblyEventConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.AssemblyEventConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyEventConnectorAdapter() {
		if (assemblyEventConnectorItemProvider == null) {
			assemblyEventConnectorItemProvider = new AssemblyEventConnectorItemProvider(this);
		}

		return assemblyEventConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.SinkDelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkDelegationConnectorItemProvider sinkDelegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.SinkDelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSinkDelegationConnectorAdapter() {
		if (sinkDelegationConnectorItemProvider == null) {
			sinkDelegationConnectorItemProvider = new SinkDelegationConnectorItemProvider(this);
		}

		return sinkDelegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.AssemblyInfrastructureConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyInfrastructureConnectorItemProvider assemblyInfrastructureConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.AssemblyInfrastructureConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyInfrastructureConnectorAdapter() {
		if (assemblyInfrastructureConnectorItemProvider == null) {
			assemblyInfrastructureConnectorItemProvider = new AssemblyInfrastructureConnectorItemProvider(this);
		}

		return assemblyInfrastructureConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.RequiredInfrastructureDelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredInfrastructureDelegationConnectorItemProvider requiredInfrastructureDelegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.RequiredInfrastructureDelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequiredInfrastructureDelegationConnectorAdapter() {
		if (requiredInfrastructureDelegationConnectorItemProvider == null) {
			requiredInfrastructureDelegationConnectorItemProvider = new RequiredInfrastructureDelegationConnectorItemProvider(this);
		}

		return requiredInfrastructureDelegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.ProvidedInfrastructureDelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedInfrastructureDelegationConnectorItemProvider providedInfrastructureDelegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.ProvidedInfrastructureDelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidedInfrastructureDelegationConnectorAdapter() {
		if (providedInfrastructureDelegationConnectorItemProvider == null) {
			providedInfrastructureDelegationConnectorItemProvider = new ProvidedInfrastructureDelegationConnectorItemProvider(this);
		}

		return providedInfrastructureDelegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.RequiredResourceDelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredResourceDelegationConnectorItemProvider requiredResourceDelegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.RequiredResourceDelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequiredResourceDelegationConnectorAdapter() {
		if (requiredResourceDelegationConnectorItemProvider == null) {
			requiredResourceDelegationConnectorItemProvider = new RequiredResourceDelegationConnectorItemProvider(this);
		}

		return requiredResourceDelegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.EventChannelSinkConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChannelSinkConnectorItemProvider eventChannelSinkConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.EventChannelSinkConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventChannelSinkConnectorAdapter() {
		if (eventChannelSinkConnectorItemProvider == null) {
			eventChannelSinkConnectorItemProvider = new EventChannelSinkConnectorItemProvider(this);
		}

		return eventChannelSinkConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.EventChannelSourceConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChannelSourceConnectorItemProvider eventChannelSourceConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.EventChannelSourceConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventChannelSourceConnectorAdapter() {
		if (eventChannelSourceConnectorItemProvider == null) {
			eventChannelSourceConnectorItemProvider = new EventChannelSourceConnectorItemProvider(this);
		}

		return eventChannelSourceConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.SourceDelegationConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceDelegationConnectorItemProvider sourceDelegationConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.SourceDelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceDelegationConnectorAdapter() {
		if (sourceDelegationConnectorItemProvider == null) {
			sourceDelegationConnectorItemProvider = new SourceDelegationConnectorItemProvider(this);
		}

		return sourceDelegationConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.core.composition.AssemblyContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextItemProvider assemblyContextItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.core.composition.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyContextAdapter() {
		if (assemblyContextItemProvider == null) {
			assemblyContextItemProvider = new AssemblyContextItemProvider(this);
		}

		return assemblyContextItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (resourceRequiredDelegationConnectorItemProvider != null) resourceRequiredDelegationConnectorItemProvider.dispose();
		if (eventChannelItemProvider != null) eventChannelItemProvider.dispose();
		if (eventChannelSourceConnectorItemProvider != null) eventChannelSourceConnectorItemProvider.dispose();
		if (eventChannelSinkConnectorItemProvider != null) eventChannelSinkConnectorItemProvider.dispose();
		if (providedDelegationConnectorItemProvider != null) providedDelegationConnectorItemProvider.dispose();
		if (requiredDelegationConnectorItemProvider != null) requiredDelegationConnectorItemProvider.dispose();
		if (assemblyConnectorItemProvider != null) assemblyConnectorItemProvider.dispose();
		if (assemblyEventConnectorItemProvider != null) assemblyEventConnectorItemProvider.dispose();
		if (sourceDelegationConnectorItemProvider != null) sourceDelegationConnectorItemProvider.dispose();
		if (sinkDelegationConnectorItemProvider != null) sinkDelegationConnectorItemProvider.dispose();
		if (assemblyInfrastructureConnectorItemProvider != null) assemblyInfrastructureConnectorItemProvider.dispose();
		if (providedInfrastructureDelegationConnectorItemProvider != null) providedInfrastructureDelegationConnectorItemProvider.dispose();
		if (requiredInfrastructureDelegationConnectorItemProvider != null) requiredInfrastructureDelegationConnectorItemProvider.dispose();
		if (requiredResourceDelegationConnectorItemProvider != null) requiredResourceDelegationConnectorItemProvider.dispose();
		if (assemblyContextItemProvider != null) assemblyContextItemProvider.dispose();
	}

}
