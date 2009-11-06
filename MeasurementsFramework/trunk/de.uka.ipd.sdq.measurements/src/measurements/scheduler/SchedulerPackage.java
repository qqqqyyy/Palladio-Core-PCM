/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package measurements.scheduler;

import measurements.MeasurementsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see measurements.scheduler.SchedulerFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scheduler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///measurements/scheduler.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "measurements.scheduler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulerPackage eINSTANCE = measurements.scheduler.impl.SchedulerPackageImpl.init();

	/**
	 * The meta object id for the '{@link measurements.scheduler.impl.ResourceStrategyMeasurementTaskImpl <em>Resource Strategy Measurement Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see measurements.scheduler.impl.ResourceStrategyMeasurementTaskImpl
	 * @see measurements.scheduler.impl.SchedulerPackageImpl#getResourceStrategyMeasurementTask()
	 * @generated
	 */
	int RESOURCE_STRATEGY_MEASUREMENT_TASK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_STRATEGY_MEASUREMENT_TASK__ID = MeasurementsPackage.MACHINE_TASK__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_STRATEGY_MEASUREMENT_TASK__DESCRIPTION = MeasurementsPackage.MACHINE_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_STRATEGY_MEASUREMENT_TASK__NAME = MeasurementsPackage.MACHINE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_STRATEGY_MEASUREMENT_TASK__MACHINE = MeasurementsPackage.MACHINE_TASK__MACHINE;

	/**
	 * The feature id for the '<em><b>Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_STRATEGY_MEASUREMENT_TASK__DEMAND = MeasurementsPackage.MACHINE_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Strategy Measurement Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_STRATEGY_MEASUREMENT_TASK_FEATURE_COUNT = MeasurementsPackage.MACHINE_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link measurements.scheduler.ResourceStrategyDemand <em>Resource Strategy Demand</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see measurements.scheduler.ResourceStrategyDemand
	 * @see measurements.scheduler.impl.SchedulerPackageImpl#getResourceStrategyDemand()
	 * @generated
	 */
	int RESOURCE_STRATEGY_DEMAND = 1;


	/**
	 * Returns the meta object for class '{@link measurements.scheduler.ResourceStrategyMeasurementTask <em>Resource Strategy Measurement Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Strategy Measurement Task</em>'.
	 * @see measurements.scheduler.ResourceStrategyMeasurementTask
	 * @generated
	 */
	EClass getResourceStrategyMeasurementTask();

	/**
	 * Returns the meta object for the attribute '{@link measurements.scheduler.ResourceStrategyMeasurementTask#getDemand <em>Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Demand</em>'.
	 * @see measurements.scheduler.ResourceStrategyMeasurementTask#getDemand()
	 * @see #getResourceStrategyMeasurementTask()
	 * @generated
	 */
	EAttribute getResourceStrategyMeasurementTask_Demand();

	/**
	 * Returns the meta object for enum '{@link measurements.scheduler.ResourceStrategyDemand <em>Resource Strategy Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Strategy Demand</em>'.
	 * @see measurements.scheduler.ResourceStrategyDemand
	 * @generated
	 */
	EEnum getResourceStrategyDemand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchedulerFactory getSchedulerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link measurements.scheduler.impl.ResourceStrategyMeasurementTaskImpl <em>Resource Strategy Measurement Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see measurements.scheduler.impl.ResourceStrategyMeasurementTaskImpl
		 * @see measurements.scheduler.impl.SchedulerPackageImpl#getResourceStrategyMeasurementTask()
		 * @generated
		 */
		EClass RESOURCE_STRATEGY_MEASUREMENT_TASK = eINSTANCE.getResourceStrategyMeasurementTask();

		/**
		 * The meta object literal for the '<em><b>Demand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_STRATEGY_MEASUREMENT_TASK__DEMAND = eINSTANCE.getResourceStrategyMeasurementTask_Demand();

		/**
		 * The meta object literal for the '{@link measurements.scheduler.ResourceStrategyDemand <em>Resource Strategy Demand</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see measurements.scheduler.ResourceStrategyDemand
		 * @see measurements.scheduler.impl.SchedulerPackageImpl#getResourceStrategyDemand()
		 * @generated
		 */
		EEnum RESOURCE_STRATEGY_DEMAND = eINSTANCE.getResourceStrategyDemand();

	}

} //SchedulerPackage
