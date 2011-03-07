/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.provider;

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

import de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.util.SourcecodedecoratorAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SourcecodedecoratorItemProviderAdapterFactory extends SourcecodedecoratorAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public SourcecodedecoratorItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.FileLevelSourceCodeLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileLevelSourceCodeLinkItemProvider fileLevelSourceCodeLinkItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.FileLevelSourceCodeLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileLevelSourceCodeLinkAdapter() {
		if (fileLevelSourceCodeLinkItemProvider == null) {
			fileLevelSourceCodeLinkItemProvider = new FileLevelSourceCodeLinkItemProvider(this);
		}

		return fileLevelSourceCodeLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.SourceFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceFileItemProvider sourceFileItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.SourceFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceFileAdapter() {
		if (sourceFileItemProvider == null) {
			sourceFileItemProvider = new SourceFileItemProvider(this);
		}

		return sourceFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.Methods} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodsItemProvider methodsItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.Methods}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodsAdapter() {
		if (methodsItemProvider == null) {
			methodsItemProvider = new MethodsItemProvider(this);
		}

		return methodsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.MethodLevelSourceCodeLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodLevelSourceCodeLinkItemProvider methodLevelSourceCodeLinkItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.MethodLevelSourceCodeLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodLevelSourceCodeLinkAdapter() {
		if (methodLevelSourceCodeLinkItemProvider == null) {
			methodLevelSourceCodeLinkItemProvider = new MethodLevelSourceCodeLinkItemProvider(this);
		}

		return methodLevelSourceCodeLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.ControlFlowLevelSourceCodeLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowLevelSourceCodeLinkItemProvider controlFlowLevelSourceCodeLinkItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.ControlFlowLevelSourceCodeLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlFlowLevelSourceCodeLinkAdapter() {
		if (controlFlowLevelSourceCodeLinkItemProvider == null) {
			controlFlowLevelSourceCodeLinkItemProvider = new ControlFlowLevelSourceCodeLinkItemProvider(this);
		}

		return controlFlowLevelSourceCodeLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.ControlFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowItemProvider controlFlowItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.ControlFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlFlowAdapter() {
		if (controlFlowItemProvider == null) {
			controlFlowItemProvider = new ControlFlowItemProvider(this);
		}

		return controlFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.SourceCodeDecoratorRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceCodeDecoratorRepositoryItemProvider sourceCodeDecoratorRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.SourceCodeDecoratorRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceCodeDecoratorRepositoryAdapter() {
		if (sourceCodeDecoratorRepositoryItemProvider == null) {
			sourceCodeDecoratorRepositoryItemProvider = new SourceCodeDecoratorRepositoryItemProvider(this);
		}

		return sourceCodeDecoratorRepositoryItemProvider;
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
		if (fileLevelSourceCodeLinkItemProvider != null) fileLevelSourceCodeLinkItemProvider.dispose();
		if (sourceFileItemProvider != null) sourceFileItemProvider.dispose();
		if (methodsItemProvider != null) methodsItemProvider.dispose();
		if (methodLevelSourceCodeLinkItemProvider != null) methodLevelSourceCodeLinkItemProvider.dispose();
		if (controlFlowLevelSourceCodeLinkItemProvider != null) controlFlowLevelSourceCodeLinkItemProvider.dispose();
		if (controlFlowItemProvider != null) controlFlowItemProvider.dispose();
		if (sourceCodeDecoratorRepositoryItemProvider != null) sourceCodeDecoratorRepositoryItemProvider.dispose();
	}

}
