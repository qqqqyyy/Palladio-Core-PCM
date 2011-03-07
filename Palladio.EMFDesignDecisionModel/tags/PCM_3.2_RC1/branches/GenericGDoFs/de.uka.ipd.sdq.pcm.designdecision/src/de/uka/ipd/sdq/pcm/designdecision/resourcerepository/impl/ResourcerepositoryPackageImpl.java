/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.resourcerepository.impl;

import EMOF.EMOFPackage;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;

import de.uka.ipd.sdq.pcm.cost.costPackage;

import de.uka.ipd.sdq.pcm.designdecision.GDoF.GDoFPackage;

import de.uka.ipd.sdq.pcm.designdecision.GDoF.impl.GDoFPackageImpl;

import de.uka.ipd.sdq.pcm.designdecision.PrimitiveTypes.PrimitiveTypesPackage;

import de.uka.ipd.sdq.pcm.designdecision.PrimitiveTypes.impl.PrimitiveTypesPackageImpl;

import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl;

import de.uka.ipd.sdq.pcm.designdecision.resourcerepository.ResourceDescription;
import de.uka.ipd.sdq.pcm.designdecision.resourcerepository.ResourceDescriptionRepository;
import de.uka.ipd.sdq.pcm.designdecision.resourcerepository.ResourcerepositoryFactory;
import de.uka.ipd.sdq.pcm.designdecision.resourcerepository.ResourcerepositoryPackage;

import de.uka.ipd.sdq.pcm.designdecision.resourcerepository.util.ResourcerepositoryValidator;

import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcerepositoryPackageImpl extends EPackageImpl implements ResourcerepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDescriptionRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDescriptionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uka.ipd.sdq.pcm.designdecision.resourcerepository.ResourcerepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourcerepositoryPackageImpl() {
		super(eNS_URI, ResourcerepositoryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ResourcerepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourcerepositoryPackage init() {
		if (isInited) return (ResourcerepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcerepositoryPackage.eNS_URI);

		// Obtain or create and register package
		ResourcerepositoryPackageImpl theResourcerepositoryPackage = (ResourcerepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResourcerepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResourcerepositoryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		costPackage.eINSTANCE.eClass();
		featuremodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI) instanceof designdecisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI) : designdecisionPackage.eINSTANCE);
		GDoFPackageImpl theGDoFPackage = (GDoFPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GDoFPackage.eNS_URI) instanceof GDoFPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GDoFPackage.eNS_URI) : GDoFPackage.eINSTANCE);
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) instanceof PrimitiveTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) : PrimitiveTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theResourcerepositoryPackage.createPackageContents();
		thedesigndecisionPackage.createPackageContents();
		theGDoFPackage.createPackageContents();
		thePrimitiveTypesPackage.createPackageContents();

		// Initialize created meta-data
		theResourcerepositoryPackage.initializePackageContents();
		thedesigndecisionPackage.initializePackageContents();
		theGDoFPackage.initializePackageContents();
		thePrimitiveTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theResourcerepositoryPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ResourcerepositoryValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theResourcerepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourcerepositoryPackage.eNS_URI, theResourcerepositoryPackage);
		return theResourcerepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceDescriptionRepository() {
		return resourceDescriptionRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceDescriptionRepository_AvailableProcessingResources_ResourceRepository() {
		return (EReference)resourceDescriptionRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceDescription() {
		return resourceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceDescription_FixedProcessingResourceCost_ResourceDescription() {
		return (EReference)resourceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceDescription_ProcessingResourceSpecification_ResourceDescription() {
		return (EReference)resourceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcerepositoryFactory getResourcerepositoryFactory() {
		return (ResourcerepositoryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceDescriptionRepositoryEClass = createEClass(RESOURCE_DESCRIPTION_REPOSITORY);
		createEReference(resourceDescriptionRepositoryEClass, RESOURCE_DESCRIPTION_REPOSITORY__AVAILABLE_PROCESSING_RESOURCES_RESOURCE_REPOSITORY);

		resourceDescriptionEClass = createEClass(RESOURCE_DESCRIPTION);
		createEReference(resourceDescriptionEClass, RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION);
		createEReference(resourceDescriptionEClass, RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		costPackage thecostPackage = (costPackage)EPackage.Registry.INSTANCE.getEPackage(costPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(resourceDescriptionRepositoryEClass, ResourceDescriptionRepository.class, "ResourceDescriptionRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceDescriptionRepository_AvailableProcessingResources_ResourceRepository(), this.getResourceDescription(), null, "availableProcessingResources_ResourceRepository", null, 0, -1, ResourceDescriptionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceDescriptionEClass, ResourceDescription.class, "ResourceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceDescription_FixedProcessingResourceCost_ResourceDescription(), thecostPackage.getFixedProcessingResourceCost(), null, "fixedProcessingResourceCost_ResourceDescription", null, 1, 1, ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceDescription_ProcessingResourceSpecification_ResourceDescription(), theResourceenvironmentPackage.getProcessingResourceSpecification(), null, "processingResourceSpecification_ResourceDescription", null, 1, 1, ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(resourceDescriptionEClass, ecorePackage.getEBoolean(), "CostAndResourceMustMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //ResourcerepositoryPackageImpl
