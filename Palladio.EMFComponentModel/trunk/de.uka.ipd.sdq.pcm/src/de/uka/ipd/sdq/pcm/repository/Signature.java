/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.repository;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents the signature of a method, i.e., its parameters, exception declarations, return type, etc.
 * 
 * Every service of an interface has a unique signature, like void doSomething(int a). A PCM signature is comparable to a method signature in programming languages like C#, Java or the OMG IDL.
 * 
 * It contains:
 * 
 * * A type of the return value or void (no return value),
 * 
 * * an identifier naming the service,
 * 
 * * an ordered set of parameters (0..*).Each parameter is a tuple of a datatype and an identifier (which is unique across the parameters). Additionally, the modifiers in, out, and inout (with its OMG
 * IDL semantics) can be used for parameters, and
 * 
 * * an unordered set of exceptions.
 * 
 * A signature has to be unique for an interface through the tupel (identifier, order of parameters). An interface has a list of 1..* signatures (interfaces associate 1..* signatures, not the other way around). A
 * signature is assigned to exactly one interface. However, different interfaces can define equally named signatures. If, for example, void doIt() is defined for interface A and B, void doIt() is not identical in both interfaces.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.Signature#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.Signature#getParameters__Signature <em>Parameters Signature</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.Signature#getInterface_Signature <em>Interface Signature</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.Signature#getReturntype__Signature <em>Returntype Signature</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.repository.Signature#getExceptions__Signature <em>Exceptions Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the service name realized by this method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getSignature_ServiceName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.repository.Signature#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters Signature</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.repository.Parameter}.
	 * It is bidirectional and its opposite is '{@link de.uka.ipd.sdq.pcm.repository.Parameter#getSignature_Parameter <em>Signature Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters Signature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the list of parameters of the corresponding method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters Signature</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getSignature_Parameters__Signature()
	 * @see de.uka.ipd.sdq.pcm.repository.Parameter#getSignature_Parameter
	 * @model opposite="signature_Parameter" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters__Signature();

	/**
	 * Returns the value of the '<em><b>Interface Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uka.ipd.sdq.pcm.repository.Interface#getSignatures__Interface <em>Signatures Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Signature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the interface that contains the method with this signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Signature</em>' container reference.
	 * @see #setInterface_Signature(Interface)
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getSignature_Interface_Signature()
	 * @see de.uka.ipd.sdq.pcm.repository.Interface#getSignatures__Interface
	 * @model opposite="signatures__Interface" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Interface getInterface_Signature();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.repository.Signature#getInterface_Signature <em>Interface Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Signature</em>' container reference.
	 * @see #getInterface_Signature()
	 * @generated
	 */
	void setInterface_Signature(Interface value);

	/**
	 * Returns the value of the '<em><b>Returntype Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returntype Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the return type of the corresponding method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Returntype Signature</em>' reference.
	 * @see #setReturntype__Signature(DataType)
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getSignature_Returntype__Signature()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getReturntype__Signature();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.repository.Signature#getReturntype__Signature <em>Returntype Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returntype Signature</em>' reference.
	 * @see #getReturntype__Signature()
	 * @generated
	 */
	void setReturntype__Signature(DataType value);

	/**
	 * Returns the value of the '<em><b>Exceptions Signature</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.repository.ExceptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions Signature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the list of exceptions declared by this signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exceptions Signature</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.repository.RepositoryPackage#getSignature_Exceptions__Signature()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExceptionType> getExceptions__Signature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.parameters__Signature->isUnique(p : Parameter |
	 * 	p.parameterName
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.parameters__Signature->isUnique(p : Parameter |\r\n\tp.parameterName\r\n)'"
	 * @generated
	 */
	boolean ParameterNamesHaveToBeUniqueForASignature(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Signature