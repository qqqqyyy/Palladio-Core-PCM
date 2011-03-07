/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.SourcecodedecoratorPackage
 * @generated
 */
public interface SourcecodedecoratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SourcecodedecoratorFactory eINSTANCE = de.uka.ipd.sdq.pcm.sourcecodedecorator.sourcecodedecorator.impl.SourcecodedecoratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Level Source Code Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Level Source Code Link</em>'.
	 * @generated
	 */
	FileLevelSourceCodeLink createFileLevelSourceCodeLink();

	/**
	 * Returns a new object of class '<em>Source File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source File</em>'.
	 * @generated
	 */
	SourceFile createSourceFile();

	/**
	 * Returns a new object of class '<em>Methods</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Methods</em>'.
	 * @generated
	 */
	Methods createMethods();

	/**
	 * Returns a new object of class '<em>Method Level Source Code Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Level Source Code Link</em>'.
	 * @generated
	 */
	MethodLevelSourceCodeLink createMethodLevelSourceCodeLink();

	/**
	 * Returns a new object of class '<em>Control Flow Level Source Code Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow Level Source Code Link</em>'.
	 * @generated
	 */
	ControlFlowLevelSourceCodeLink createControlFlowLevelSourceCodeLink();

	/**
	 * Returns a new object of class '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow</em>'.
	 * @generated
	 */
	ControlFlow createControlFlow();

	/**
	 * Returns a new object of class '<em>Source Code Decorator Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Code Decorator Repository</em>'.
	 * @generated
	 */
	SourceCodeDecoratorRepository createSourceCodeDecoratorRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SourcecodedecoratorPackage getSourcecodedecoratorPackage();

} //SourcecodedecoratorFactory
