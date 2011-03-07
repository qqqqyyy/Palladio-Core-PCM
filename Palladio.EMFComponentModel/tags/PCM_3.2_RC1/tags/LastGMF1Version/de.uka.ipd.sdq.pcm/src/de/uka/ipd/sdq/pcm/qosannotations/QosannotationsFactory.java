/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.qosannotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.qosannotations.QosannotationsPackage
 * @generated
 */
public interface QosannotationsFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "(c) by SDQ, IPD, U Karlsruhe (TH), 2006";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QosannotationsFactory eINSTANCE = de.uka.ipd.sdq.pcm.qosannotations.impl.QosannotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specified Failure Probability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specified Failure Probability</em>'.
	 * @generated
	 */
	SpecifiedFailureProbability createSpecifiedFailureProbability();

	/**
	 * Returns a new object of class '<em>System Specified Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Specified Execution Time</em>'.
	 * @generated
	 */
	SystemSpecifiedExecutionTime createSystemSpecifiedExecutionTime();

	/**
	 * Returns a new object of class '<em>Component Specified Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Specified Execution Time</em>'.
	 * @generated
	 */
	ComponentSpecifiedExecutionTime createComponentSpecifiedExecutionTime();

	/**
	 * Returns a new object of class '<em>Qo SAnnotations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SAnnotations</em>'.
	 * @generated
	 */
	QoSAnnotations createQoSAnnotations();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QosannotationsPackage getQosannotationsPackage();

} //QosannotationsFactory