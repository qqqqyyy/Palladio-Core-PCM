/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.reliability;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import de.uka.ipd.sdq.pcm.seff.InternalAction;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Internal Failure Occurrence Description</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Special&nbsp;case&nbsp;of&nbsp;a&nbsp;FailureOccurenceDescription
 * &nbsp;specifying the software-induced failure potential of InternalActions. <!-- end-model-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription#getInternalAction__InternalFailureOccurrenceDescription
 * <em>Internal Action Internal Failure Occurrence Description</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription
 * <em>Software Induced Failure Type Internal Failure Occurrence Description </em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.uka.ipd.sdq.pcm.reliability.ReliabilityPackage#getInternalFailureOccurrenceDescription()
 * @model
 * @generated
 */
public interface InternalFailureOccurrenceDescription extends FailureOccurrenceDescription {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

    /**
     * Returns the value of the '
     * <em><b>Software Induced Failure Type Internal Failure Occurrence Description</b></em> '
     * reference. It is bidirectional and its opposite is '
     * {@link de.uka.ipd.sdq.pcm.reliability.SoftwareInducedFailureType#getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType
     * <em>Internal Failure Occurrence Descriptions Software Induced Failure Type</em>} '. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '
     * <em>Software Induced Failure Type Internal Failure Occurrence Description</em> ' reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '
     *         <em>Software Induced Failure Type Internal Failure Occurrence Description</em> '
     *         reference.
     * @see #setSoftwareInducedFailureType__InternalFailureOccurrenceDescription(SoftwareInducedFailureType)
     * @see de.uka.ipd.sdq.pcm.reliability.ReliabilityPackage#getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription()
     * @see de.uka.ipd.sdq.pcm.reliability.SoftwareInducedFailureType#getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType
     * @model opposite= "internalFailureOccurrenceDescriptions__SoftwareInducedFailureType"
     *        required="true" ordered="false"
     * @generated
     */
    SoftwareInducedFailureType getSoftwareInducedFailureType__InternalFailureOccurrenceDescription();

    /**
     * Sets the value of the '
     * {@link de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription
     * <em>Software Induced Failure Type Internal Failure Occurrence Description</em>} ' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '
     *            <em>Software Induced Failure Type Internal Failure Occurrence Description</em> '
     *            reference.
     * @see #getSoftwareInducedFailureType__InternalFailureOccurrenceDescription()
     * @generated
     */
    void setSoftwareInducedFailureType__InternalFailureOccurrenceDescription(SoftwareInducedFailureType value);

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * ResourceTimeoutFailures are software-induced failure types, but are not annotated to
     * InternalActions (they are only meant for passive resource timeouts).
     * 
     * @param diagnostics
     *            The chain of diagnostics to which problems are to be appended.
     * @param context
     *            The cache of context-specific information. <!-- end-model-doc -->
     * @model annotation=
     *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.softwareInducedFailureType__InternalFailureOccurrenceDescription.oclIsTypeOf(ResourceTimeoutFailureType)'"
     * @generated
     */
    boolean NoResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription(DiagnosticChain diagnostics,
            Map<Object, Object> context);

    /**
     * Returns the value of the '
     * <em><b>Internal Action Internal Failure Occurrence Description</b></em>' container reference.
     * It is bidirectional and its opposite is '
     * {@link de.uka.ipd.sdq.pcm.seff.InternalAction#getInternalFailureOccurrenceDescriptions__InternalAction
     * <em>Internal Failure Occurrence Descriptions Internal Action</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the ' <em>Internal Action Internal Failure Occurrence Description</em>'
     * container reference isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the ' <em>Internal Action Internal Failure Occurrence Description</em>'
     *         container reference.
     * @see #setInternalAction__InternalFailureOccurrenceDescription(InternalAction)
     * @see de.uka.ipd.sdq.pcm.reliability.ReliabilityPackage#getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription()
     * @see de.uka.ipd.sdq.pcm.seff.InternalAction#getInternalFailureOccurrenceDescriptions__InternalAction
     * @model opposite="internalFailureOccurrenceDescriptions__InternalAction" required="true"
     *        transient="false" ordered="false"
     * @generated
     */
    InternalAction getInternalAction__InternalFailureOccurrenceDescription();

    /**
     * Sets the value of the '
     * {@link de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription#getInternalAction__InternalFailureOccurrenceDescription
     * <em>Internal Action Internal Failure Occurrence Description</em>}' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '
     *            <em>Internal Action Internal Failure Occurrence Description</em> ' container
     *            reference.
     * @see #getInternalAction__InternalFailureOccurrenceDescription()
     * @generated
     */
    void setInternalAction__InternalFailureOccurrenceDescription(InternalAction value);

} // InternalFailureOccurrenceDescription
