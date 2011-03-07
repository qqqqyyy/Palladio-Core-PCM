/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package scheduler.configuration.provider;

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

import scheduler.configuration.util.ConfigurationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationItemProviderAdapterFactory extends ConfigurationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ConfigurationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.DynamicPriorityBoostConfiguratioin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicPriorityBoostConfiguratioinItemProvider dynamicPriorityBoostConfiguratioinItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.DynamicPriorityBoostConfiguratioin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicPriorityBoostConfiguratioinAdapter() {
		if (dynamicPriorityBoostConfiguratioinItemProvider == null) {
			dynamicPriorityBoostConfiguratioinItemProvider = new DynamicPriorityBoostConfiguratioinItemProvider(this);
		}

		return dynamicPriorityBoostConfiguratioinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.LoadBalancing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancingItemProvider loadBalancingItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.LoadBalancing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoadBalancingAdapter() {
		if (loadBalancingItemProvider == null) {
			loadBalancingItemProvider = new LoadBalancingItemProvider(this);
		}

		return loadBalancingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.MultipleQueueConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleQueueConfigurationItemProvider multipleQueueConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.MultipleQueueConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultipleQueueConfigurationAdapter() {
		if (multipleQueueConfigurationItemProvider == null) {
			multipleQueueConfigurationItemProvider = new MultipleQueueConfigurationItemProvider(this);
		}

		return multipleQueueConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.QuantumTimeSliceConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantumTimeSliceConfigurationItemProvider quantumTimeSliceConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.QuantumTimeSliceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuantumTimeSliceConfigurationAdapter() {
		if (quantumTimeSliceConfigurationItemProvider == null) {
			quantumTimeSliceConfigurationItemProvider = new QuantumTimeSliceConfigurationItemProvider(this);
		}

		return quantumTimeSliceConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.PreemptionConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreemptionConfigurationItemProvider preemptionConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.PreemptionConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreemptionConfigurationAdapter() {
		if (preemptionConfigurationItemProvider == null) {
			preemptionConfigurationItemProvider = new PreemptionConfigurationItemProvider(this);
		}

		return preemptionConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.PriorityConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorityConfigurationItemProvider priorityConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.PriorityConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPriorityConfigurationAdapter() {
		if (priorityConfigurationItemProvider == null) {
			priorityConfigurationItemProvider = new PriorityConfigurationItemProvider(this);
		}

		return priorityConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.PriorityRange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorityRangeItemProvider priorityRangeItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.PriorityRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPriorityRangeAdapter() {
		if (priorityRangeItemProvider == null) {
			priorityRangeItemProvider = new PriorityRangeItemProvider(this);
		}

		return priorityRangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.PriorityDependentTimeSliceConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorityDependentTimeSliceConfigurationItemProvider priorityDependentTimeSliceConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.PriorityDependentTimeSliceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPriorityDependentTimeSliceConfigurationAdapter() {
		if (priorityDependentTimeSliceConfigurationItemProvider == null) {
			priorityDependentTimeSliceConfigurationItemProvider = new PriorityDependentTimeSliceConfigurationItemProvider(this);
		}

		return priorityDependentTimeSliceConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.ActiveResourceConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveResourceConfigurationItemProvider activeResourceConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.ActiveResourceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActiveResourceConfigurationAdapter() {
		if (activeResourceConfigurationItemProvider == null) {
			activeResourceConfigurationItemProvider = new ActiveResourceConfigurationItemProvider(this);
		}

		return activeResourceConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.PassiveResourceConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassiveResourceConfigurationItemProvider passiveResourceConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.PassiveResourceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPassiveResourceConfigurationAdapter() {
		if (passiveResourceConfigurationItemProvider == null) {
			passiveResourceConfigurationItemProvider = new PassiveResourceConfigurationItemProvider(this);
		}

		return passiveResourceConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.StaticPriorityBoost} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticPriorityBoostItemProvider staticPriorityBoostItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.StaticPriorityBoost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticPriorityBoostAdapter() {
		if (staticPriorityBoostItemProvider == null) {
			staticPriorityBoostItemProvider = new StaticPriorityBoostItemProvider(this);
		}

		return staticPriorityBoostItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.ProcessConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessConfigurationItemProvider processConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.ProcessConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessConfigurationAdapter() {
		if (processConfigurationItemProvider == null) {
			processConfigurationItemProvider = new ProcessConfigurationItemProvider(this);
		}

		return processConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.SingleQueueConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleQueueConfigurationItemProvider singleQueueConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.SingleQueueConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleQueueConfigurationAdapter() {
		if (singleQueueConfigurationItemProvider == null) {
			singleQueueConfigurationItemProvider = new SingleQueueConfigurationItemProvider(this);
		}

		return singleQueueConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.StaticPriorityBoostConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticPriorityBoostConfigurationItemProvider staticPriorityBoostConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.StaticPriorityBoostConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticPriorityBoostConfigurationAdapter() {
		if (staticPriorityBoostConfigurationItemProvider == null) {
			staticPriorityBoostConfigurationItemProvider = new StaticPriorityBoostConfigurationItemProvider(this);
		}

		return staticPriorityBoostConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.SchedulerConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerConfigurationItemProvider schedulerConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.SchedulerConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchedulerConfigurationAdapter() {
		if (schedulerConfigurationItemProvider == null) {
			schedulerConfigurationItemProvider = new SchedulerConfigurationItemProvider(this);
		}

		return schedulerConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link scheduler.configuration.StarvationBoost} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StarvationBoostItemProvider starvationBoostItemProvider;

	/**
	 * This creates an adapter for a {@link scheduler.configuration.StarvationBoost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStarvationBoostAdapter() {
		if (starvationBoostItemProvider == null) {
			starvationBoostItemProvider = new StarvationBoostItemProvider(this);
		}

		return starvationBoostItemProvider;
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
		if (dynamicPriorityBoostConfiguratioinItemProvider != null) dynamicPriorityBoostConfiguratioinItemProvider.dispose();
		if (loadBalancingItemProvider != null) loadBalancingItemProvider.dispose();
		if (multipleQueueConfigurationItemProvider != null) multipleQueueConfigurationItemProvider.dispose();
		if (quantumTimeSliceConfigurationItemProvider != null) quantumTimeSliceConfigurationItemProvider.dispose();
		if (preemptionConfigurationItemProvider != null) preemptionConfigurationItemProvider.dispose();
		if (priorityConfigurationItemProvider != null) priorityConfigurationItemProvider.dispose();
		if (priorityRangeItemProvider != null) priorityRangeItemProvider.dispose();
		if (priorityDependentTimeSliceConfigurationItemProvider != null) priorityDependentTimeSliceConfigurationItemProvider.dispose();
		if (activeResourceConfigurationItemProvider != null) activeResourceConfigurationItemProvider.dispose();
		if (passiveResourceConfigurationItemProvider != null) passiveResourceConfigurationItemProvider.dispose();
		if (staticPriorityBoostItemProvider != null) staticPriorityBoostItemProvider.dispose();
		if (processConfigurationItemProvider != null) processConfigurationItemProvider.dispose();
		if (singleQueueConfigurationItemProvider != null) singleQueueConfigurationItemProvider.dispose();
		if (staticPriorityBoostConfigurationItemProvider != null) staticPriorityBoostConfigurationItemProvider.dispose();
		if (schedulerConfigurationItemProvider != null) schedulerConfigurationItemProvider.dispose();
		if (starvationBoostItemProvider != null) starvationBoostItemProvider.dispose();
	}

}
