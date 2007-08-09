/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.usagemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage
 * @generated
 */
public interface UsagemodelFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsagemodelFactory eINSTANCE = de.uka.ipd.sdq.pcm.usagemodel.impl.UsagemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Usage Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Scenario</em>'.
	 * @generated
	 */
	UsageScenario createUsageScenario();

	/**
	 * Returns a new object of class '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Behaviour</em>'.
	 * @generated
	 */
	ScenarioBehaviour createScenarioBehaviour();

	/**
	 * Returns a new object of class '<em>Usage Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Model</em>'.
	 * @generated
	 */
	UsageModel createUsageModel();

	/**
	 * Returns a new object of class '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop</em>'.
	 * @generated
	 */
	Stop createStop();

	/**
	 * Returns a new object of class '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start</em>'.
	 * @generated
	 */
	Start createStart();

	/**
	 * Returns a new object of class '<em>Open Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Workload</em>'.
	 * @generated
	 */
	OpenWorkload createOpenWorkload();

	/**
	 * Returns a new object of class '<em>Inter Arrival Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inter Arrival Time</em>'.
	 * @generated
	 */
	InterArrivalTime createInterArrivalTime();

	/**
	 * Returns a new object of class '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop</em>'.
	 * @generated
	 */
	Loop createLoop();

	/**
	 * Returns a new object of class '<em>Loop Iterations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Iterations</em>'.
	 * @generated
	 */
	LoopIterations createLoopIterations();

	/**
	 * Returns a new object of class '<em>Entry Level System Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Level System Call</em>'.
	 * @generated
	 */
	EntryLevelSystemCall createEntryLevelSystemCall();

	/**
	 * Returns a new object of class '<em>Closed Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closed Workload</em>'.
	 * @generated
	 */
	ClosedWorkload createClosedWorkload();

	/**
	 * Returns a new object of class '<em>Think Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Think Time</em>'.
	 * @generated
	 */
	ThinkTime createThinkTime();

	/**
	 * Returns a new object of class '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch</em>'.
	 * @generated
	 */
	Branch createBranch();

	/**
	 * Returns a new object of class '<em>Branch Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch Transition</em>'.
	 * @generated
	 */
	BranchTransition createBranchTransition();

	/**
	 * Returns a new object of class '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay</em>'.
	 * @generated
	 */
	Delay createDelay();

	/**
	 * Returns a new object of class '<em>Delay Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Time</em>'.
	 * @generated
	 */
	DelayTime createDelayTime();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UsagemodelPackage getUsagemodelPackage();

} //UsagemodelFactory
