/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourcetype.provider;

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

import de.uka.ipd.sdq.pcm.resourcetype.util.ResourcetypeAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcetypeItemProviderAdapterFactory extends ResourcetypeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

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
	public ResourcetypeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.resourcetype.ResourceRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRepositoryItemProvider resourceRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.resourcetype.ResourceRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceRepositoryAdapter() {
		if (resourceRepositoryItemProvider == null) {
			resourceRepositoryItemProvider = new ResourceRepositoryItemProvider(this);
		}

		return resourceRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.resourcetype.ControllerStack} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerStackItemProvider controllerStackItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.resourcetype.ControllerStack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllerStackAdapter() {
		if (controllerStackItemProvider == null) {
			controllerStackItemProvider = new ControllerStackItemProvider(this);
		}

		return controllerStackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.resourcetype.ControllerLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerLayerItemProvider controllerLayerItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.resourcetype.ControllerLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllerLayerAdapter() {
		if (controllerLayerItemProvider == null) {
			controllerLayerItemProvider = new ControllerLayerItemProvider(this);
		}

		return controllerLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.resourcetype.ControllerType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerTypeItemProvider controllerTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.resourcetype.ControllerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllerTypeAdapter() {
		if (controllerTypeItemProvider == null) {
			controllerTypeItemProvider = new ControllerTypeItemProvider(this);
		}

		return controllerTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.resourcetype.CommunicationLinkResourceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationLinkResourceTypeItemProvider communicationLinkResourceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.resourcetype.CommunicationLinkResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationLinkResourceTypeAdapter() {
		if (communicationLinkResourceTypeItemProvider == null) {
			communicationLinkResourceTypeItemProvider = new CommunicationLinkResourceTypeItemProvider(this);
		}

		return communicationLinkResourceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.resourcetype.ResourceInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInterfaceItemProvider resourceInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.resourcetype.ResourceInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceInterfaceAdapter() {
		if (resourceInterfaceItemProvider == null) {
			resourceInterfaceItemProvider = new ResourceInterfaceItemProvider(this);
		}

		return resourceInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.resourcetype.ResourceService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceServiceItemProvider resourceServiceItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.resourcetype.ResourceService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceServiceAdapter() {
		if (resourceServiceItemProvider == null) {
			resourceServiceItemProvider = new ResourceServiceItemProvider(this);
		}

		return resourceServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.resourcetype.ResourceProvidedRole} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceProvidedRoleItemProvider resourceProvidedRoleItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.resourcetype.ResourceProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceProvidedRoleAdapter() {
		if (resourceProvidedRoleItemProvider == null) {
			resourceProvidedRoleItemProvider = new ResourceProvidedRoleItemProvider(this);
		}

		return resourceProvidedRoleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.resourcetype.ResourceRequiredRole} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRequiredRoleItemProvider resourceRequiredRoleItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.resourcetype.ResourceRequiredRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceRequiredRoleAdapter() {
		if (resourceRequiredRoleItemProvider == null) {
			resourceRequiredRoleItemProvider = new ResourceRequiredRoleItemProvider(this);
		}

		return resourceRequiredRoleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.resourcetype.ProcessingResourceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingResourceTypeItemProvider processingResourceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.resourcetype.ProcessingResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessingResourceTypeAdapter() {
		if (processingResourceTypeItemProvider == null) {
			processingResourceTypeItemProvider = new ProcessingResourceTypeItemProvider(this);
		}

		return processingResourceTypeItemProvider;
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
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
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
		if (resourceRepositoryItemProvider != null) resourceRepositoryItemProvider.dispose();
		if (controllerStackItemProvider != null) controllerStackItemProvider.dispose();
		if (controllerLayerItemProvider != null) controllerLayerItemProvider.dispose();
		if (controllerTypeItemProvider != null) controllerTypeItemProvider.dispose();
		if (resourceProvidedRoleItemProvider != null) resourceProvidedRoleItemProvider.dispose();
		if (resourceInterfaceItemProvider != null) resourceInterfaceItemProvider.dispose();
		if (resourceServiceItemProvider != null) resourceServiceItemProvider.dispose();
		if (processingResourceTypeItemProvider != null) processingResourceTypeItemProvider.dispose();
		if (communicationLinkResourceTypeItemProvider != null) communicationLinkResourceTypeItemProvider.dispose();
		if (resourceRequiredRoleItemProvider != null) resourceRequiredRoleItemProvider.dispose();
	}

}
