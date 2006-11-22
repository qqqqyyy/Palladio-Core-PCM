/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.spa.resourcemodel.impl;

import de.uka.ipd.sdq.spa.resourcemodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceModelFactoryImpl extends EFactoryImpl implements ResourceModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceModelFactory init() {
		try {
			ResourceModelFactory theResourceModelFactory = (ResourceModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://sdq.ipd.uka.de/ResourceModel/1.0"); 
			if (theResourceModelFactory != null) {
				return theResourceModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourceModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResourceModelPackage.SEQUENTIAL_RESOURCE_USAGE: return createSequentialResourceUsage();
			case ResourceModelPackage.PASSIVE_RESOURCE: return createPassiveResource();
			case ResourceModelPackage.PARALLEL_RESOURCE_USAGE: return createParallelResourceUsage();
			case ResourceModelPackage.ITERATIVE_RESOURCE_USAGE: return createIterativeResourceUsage();
			case ResourceModelPackage.ALTERNATIVE_RESOURCE_USAGE: return createAlternativeResourceUsage();
			case ResourceModelPackage.RESOURCE_USAGE: return createResourceUsage();
			case ResourceModelPackage.PROCESSING_RESOURCE: return createProcessingResource();
			case ResourceModelPackage.DELAY_RESOURCE: return createDelayResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialResourceUsage createSequentialResourceUsage() {
		SequentialResourceUsageImpl sequentialResourceUsage = new SequentialResourceUsageImpl();
		return sequentialResourceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResource createPassiveResource() {
		PassiveResourceImpl passiveResource = new PassiveResourceImpl();
		return passiveResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelResourceUsage createParallelResourceUsage() {
		ParallelResourceUsageImpl parallelResourceUsage = new ParallelResourceUsageImpl();
		return parallelResourceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterativeResourceUsage createIterativeResourceUsage() {
		IterativeResourceUsageImpl iterativeResourceUsage = new IterativeResourceUsageImpl();
		return iterativeResourceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeResourceUsage createAlternativeResourceUsage() {
		AlternativeResourceUsageImpl alternativeResourceUsage = new AlternativeResourceUsageImpl();
		return alternativeResourceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceUsage createResourceUsage() {
		ResourceUsageImpl resourceUsage = new ResourceUsageImpl();
		return resourceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResource createProcessingResource() {
		ProcessingResourceImpl processingResource = new ProcessingResourceImpl();
		return processingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayResource createDelayResource() {
		DelayResourceImpl delayResource = new DelayResourceImpl();
		return delayResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceModelPackage getResourceModelPackage() {
		return (ResourceModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static ResourceModelPackage getPackage() {
		return ResourceModelPackage.eINSTANCE;
	}

} //ResourceModelFactoryImpl
