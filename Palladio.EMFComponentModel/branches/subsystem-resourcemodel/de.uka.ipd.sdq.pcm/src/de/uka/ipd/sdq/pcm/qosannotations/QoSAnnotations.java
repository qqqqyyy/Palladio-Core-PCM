/**
 * Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.qosannotations;

import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SAnnotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * QoSAnnotations allow software architects and performance analysts to annotate Quality of Service (QoS) attributes to services (i.e., signatures of an interface). It is important to note that these annotations are specified and not derived. Usually the PCM uses the internal specification of a components behaviour (i.e., its RD-SEFFs) to determine its QoS. However, in a mixed top down and bottom up approach as favoured by the PCM, software architects have to combine components whose internals are not yet known with fully specified components. QoSAnnotations provide a first perforamnce (or reliability) abstraction of the services offered by a component using the SpecifiedQoSAnnotation. They furthermore define the output parameters of the services without describing its internal behviour.
 * 
 * Notes:
 * - Should the association of QoSAnnotations to services not be in the class QoSAnnotation instead of SpecifiedQoSAnnotation and SpecifiedOutputParameterAbstraction separately?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.qosannotations.QoSAnnotations#getSpecifiedExecutionTimes_QoSAnnotations <em>Specified Execution Times Qo SAnnotations</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.qosannotations.QoSAnnotations#getSpecifiedOutputParameterAbstractions_QoSAnnotations <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.qosannotations.QosannotationsPackage#getQoSAnnotations()
 * @model
 * @generated
 */
public interface QoSAnnotations extends Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2007 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * Returns the value of the '<em><b>Specified Execution Times Qo SAnnotations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.qosannotations.SpecifiedQoSAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specified Execution Times Qo SAnnotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Execution Times Qo SAnnotations</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.qosannotations.QosannotationsPackage#getQoSAnnotations_SpecifiedExecutionTimes_QoSAnnotations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecifiedQoSAnnotation> getSpecifiedExecutionTimes_QoSAnnotations();

	/**
	 * Returns the value of the '<em><b>Specified Output Parameter Abstractions Qo SAnnotations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.qosannotations.SpecifiedOutputParameterAbstraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specified Output Parameter Abstractions Qo SAnnotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Output Parameter Abstractions Qo SAnnotations</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.qosannotations.QosannotationsPackage#getQoSAnnotations_SpecifiedOutputParameterAbstractions_QoSAnnotations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecifiedOutputParameterAbstraction> getSpecifiedOutputParameterAbstractions_QoSAnnotations();

} // QoSAnnotations