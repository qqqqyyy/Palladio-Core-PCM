/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.reliability;

import de.uka.ipd.sdq.pcm.core.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- begin-model-doc -->
 * This package contains reliability-relevant classes such as the definition of failure types.
 * <!-- end-model-doc -->
 * @see de.uka.ipd.sdq.pcm.reliability.ReliabilityFactory
 * @model kind="package"
 * @generated
 */
public interface ReliabilityPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reliability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/PalladioComponentModel/Reliability/4.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcm.reliability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReliabilityPackage eINSTANCE = de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.FailureOccurrenceDescriptionImpl <em>Failure Occurrence Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.FailureOccurrenceDescriptionImpl
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getFailureOccurrenceDescription()
	 * @generated
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = 0;

	/**
	 * The number of structural features of the '<em>Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.FailureTypeImpl <em>Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.FailureTypeImpl
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getFailureType()
	 * @generated
	 */
	int FAILURE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Failure Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.StopFailureTypeImpl <em>Stop Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.StopFailureTypeImpl
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getStopFailureType()
	 * @generated
	 */
	int STOP_FAILURE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FAILURE_TYPE__ID = FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FAILURE_TYPE__ENTITY_NAME = FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Failure Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = FAILURE_TYPE__REPOSITORY_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>External Failure Occurrence Descriptions Stop Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FAILURE_TYPE__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_STOP_FAILURE_TYPE = FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stop Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FAILURE_TYPE_FEATURE_COUNT = FAILURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.HardwareInducedFailureTypeImpl <em>Hardware Induced Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.HardwareInducedFailureTypeImpl
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getHardwareInducedFailureType()
	 * @generated
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__ID = STOP_FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__ENTITY_NAME = STOP_FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Failure Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = STOP_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>External Failure Occurrence Descriptions Stop Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_STOP_FAILURE_TYPE = STOP_FAILURE_TYPE__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_STOP_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Processing Resource Type Hardware Induced Failure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE = STOP_FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE_FEATURE_COUNT = STOP_FAILURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.ExternalFailureOccurrenceDescriptionImpl <em>External Failure Occurrence Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.ExternalFailureOccurrenceDescriptionImpl
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getExternalFailureOccurrenceDescription()
	 * @generated
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Specified Reliability Annotation External Failure Occurrence Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stop Failure Type External Failure Occurrence Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__STOP_FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.NetworkInducedFailureTypeImpl <em>Network Induced Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.NetworkInducedFailureTypeImpl
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getNetworkInducedFailureType()
	 * @generated
	 */
	int NETWORK_INDUCED_FAILURE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__ID = STOP_FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__ENTITY_NAME = STOP_FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Failure Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = STOP_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>External Failure Occurrence Descriptions Stop Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_STOP_FAILURE_TYPE = STOP_FAILURE_TYPE__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_STOP_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Communication Link Resource Type Network Induced Failure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE = STOP_FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE_FEATURE_COUNT = STOP_FAILURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.InternalFailureOccurrenceDescriptionImpl <em>Internal Failure Occurrence Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.InternalFailureOccurrenceDescriptionImpl
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getInternalFailureOccurrenceDescription()
	 * @generated
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Software Induced Failure Type Internal Failure Occurrence Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal Action Internal Failure Occurrence Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.SoftwareInducedFailureTypeImpl <em>Software Induced Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.SoftwareInducedFailureTypeImpl
	 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getSoftwareInducedFailureType()
	 * @generated
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__ID = STOP_FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__ENTITY_NAME = STOP_FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Failure Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = STOP_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>External Failure Occurrence Descriptions Stop Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_STOP_FAILURE_TYPE = STOP_FAILURE_TYPE__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_STOP_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Internal Failure Occurrence Descriptions Software Induced Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE = STOP_FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE_FEATURE_COUNT = STOP_FAILURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.reliability.FailureOccurrenceDescription <em>Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Occurrence Description</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.FailureOccurrenceDescription
	 * @generated
	 */
	EClass getFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.reliability.FailureOccurrenceDescription#getFailureProbability <em>Failure Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Probability</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.FailureOccurrenceDescription#getFailureProbability()
	 * @see #getFailureOccurrenceDescription()
	 * @generated
	 */
	EAttribute getFailureOccurrenceDescription_FailureProbability();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.reliability.HardwareInducedFailureType <em>Hardware Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Induced Failure Type</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.HardwareInducedFailureType
	 * @generated
	 */
	EClass getHardwareInducedFailureType();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.reliability.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType <em>Processing Resource Type Hardware Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processing Resource Type Hardware Induced Failure Type</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType()
	 * @see #getHardwareInducedFailureType()
	 * @generated
	 */
	EReference getHardwareInducedFailureType_ProcessingResourceType__HardwareInducedFailureType();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.reliability.StopFailureType <em>Stop Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Failure Type</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.StopFailureType
	 * @generated
	 */
	EClass getStopFailureType();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.pcm.reliability.StopFailureType#getExternalFailureOccurrenceDescriptions__StopFailureType <em>External Failure Occurrence Descriptions Stop Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Failure Occurrence Descriptions Stop Failure Type</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.StopFailureType#getExternalFailureOccurrenceDescriptions__StopFailureType()
	 * @see #getStopFailureType()
	 * @generated
	 */
	EReference getStopFailureType_ExternalFailureOccurrenceDescriptions__StopFailureType();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.reliability.ExternalFailureOccurrenceDescription <em>External Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Failure Occurrence Description</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.ExternalFailureOccurrenceDescription
	 * @generated
	 */
	EClass getExternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.pcm.reliability.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription <em>Specified Reliability Annotation External Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specified Reliability Annotation External Failure Occurrence Description</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription()
	 * @see #getExternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.reliability.ExternalFailureOccurrenceDescription#getStopFailureType__ExternalFailureOccurrenceDescription <em>Stop Failure Type External Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stop Failure Type External Failure Occurrence Description</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.ExternalFailureOccurrenceDescription#getStopFailureType__ExternalFailureOccurrenceDescription()
	 * @see #getExternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getExternalFailureOccurrenceDescription_StopFailureType__ExternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.reliability.NetworkInducedFailureType <em>Network Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Induced Failure Type</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.NetworkInducedFailureType
	 * @generated
	 */
	EClass getNetworkInducedFailureType();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.reliability.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Link Resource Type Network Induced Failure Type</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType()
	 * @see #getNetworkInducedFailureType()
	 * @generated
	 */
	EReference getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription <em>Internal Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Failure Occurrence Description</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription
	 * @generated
	 */
	EClass getInternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription <em>Software Induced Failure Type Internal Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software Induced Failure Type Internal Failure Occurrence Description</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription()
	 * @see #getInternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription#getInternalAction__InternalFailureOccurrenceDescription <em>Internal Action Internal Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Internal Action Internal Failure Occurrence Description</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.InternalFailureOccurrenceDescription#getInternalAction__InternalFailureOccurrenceDescription()
	 * @see #getInternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.reliability.SoftwareInducedFailureType <em>Software Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Induced Failure Type</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.SoftwareInducedFailureType
	 * @generated
	 */
	EClass getSoftwareInducedFailureType();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.pcm.reliability.SoftwareInducedFailureType#getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType <em>Internal Failure Occurrence Descriptions Software Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Internal Failure Occurrence Descriptions Software Induced Failure Type</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.SoftwareInducedFailureType#getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType()
	 * @see #getSoftwareInducedFailureType()
	 * @generated
	 */
	EReference getSoftwareInducedFailureType_InternalFailureOccurrenceDescriptions__SoftwareInducedFailureType();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.reliability.FailureType <em>Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Type</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.FailureType
	 * @generated
	 */
	EClass getFailureType();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.pcm.reliability.FailureType#getRepository__FailureType <em>Repository Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository Failure Type</em>'.
	 * @see de.uka.ipd.sdq.pcm.reliability.FailureType#getRepository__FailureType()
	 * @see #getFailureType()
	 * @generated
	 */
	EReference getFailureType_Repository__FailureType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReliabilityFactory getReliabilityFactory();

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
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.FailureOccurrenceDescriptionImpl <em>Failure Occurrence Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.FailureOccurrenceDescriptionImpl
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getFailureOccurrenceDescription()
		 * @generated
		 */
		EClass FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Failure Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = eINSTANCE.getFailureOccurrenceDescription_FailureProbability();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.HardwareInducedFailureTypeImpl <em>Hardware Induced Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.HardwareInducedFailureTypeImpl
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getHardwareInducedFailureType()
		 * @generated
		 */
		EClass HARDWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getHardwareInducedFailureType();

		/**
		 * The meta object literal for the '<em><b>Processing Resource Type Hardware Induced Failure Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getHardwareInducedFailureType_ProcessingResourceType__HardwareInducedFailureType();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.StopFailureTypeImpl <em>Stop Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.StopFailureTypeImpl
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getStopFailureType()
		 * @generated
		 */
		EClass STOP_FAILURE_TYPE = eINSTANCE.getStopFailureType();

		/**
		 * The meta object literal for the '<em><b>External Failure Occurrence Descriptions Stop Failure Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_FAILURE_TYPE__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_STOP_FAILURE_TYPE = eINSTANCE.getStopFailureType_ExternalFailureOccurrenceDescriptions__StopFailureType();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.ExternalFailureOccurrenceDescriptionImpl <em>External Failure Occurrence Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.ExternalFailureOccurrenceDescriptionImpl
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getExternalFailureOccurrenceDescription()
		 * @generated
		 */
		EClass EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getExternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Specified Reliability Annotation External Failure Occurrence Description</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Stop Failure Type External Failure Occurrence Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__STOP_FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getExternalFailureOccurrenceDescription_StopFailureType__ExternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.NetworkInducedFailureTypeImpl <em>Network Induced Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.NetworkInducedFailureTypeImpl
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getNetworkInducedFailureType()
		 * @generated
		 */
		EClass NETWORK_INDUCED_FAILURE_TYPE = eINSTANCE.getNetworkInducedFailureType();

		/**
		 * The meta object literal for the '<em><b>Communication Link Resource Type Network Induced Failure Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE = eINSTANCE.getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.InternalFailureOccurrenceDescriptionImpl <em>Internal Failure Occurrence Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.InternalFailureOccurrenceDescriptionImpl
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getInternalFailureOccurrenceDescription()
		 * @generated
		 */
		EClass INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getInternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Software Induced Failure Type Internal Failure Occurrence Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Internal Action Internal Failure Occurrence Description</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.SoftwareInducedFailureTypeImpl <em>Software Induced Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.SoftwareInducedFailureTypeImpl
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getSoftwareInducedFailureType()
		 * @generated
		 */
		EClass SOFTWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getSoftwareInducedFailureType();

		/**
		 * The meta object literal for the '<em><b>Internal Failure Occurrence Descriptions Software Induced Failure Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getSoftwareInducedFailureType_InternalFailureOccurrenceDescriptions__SoftwareInducedFailureType();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.reliability.impl.FailureTypeImpl <em>Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.FailureTypeImpl
		 * @see de.uka.ipd.sdq.pcm.reliability.impl.ReliabilityPackageImpl#getFailureType()
		 * @generated
		 */
		EClass FAILURE_TYPE = eINSTANCE.getFailureType();

		/**
		 * The meta object literal for the '<em><b>Repository Failure Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = eINSTANCE.getFailureType_Repository__FailureType();

	}

} //ReliabilityPackage
