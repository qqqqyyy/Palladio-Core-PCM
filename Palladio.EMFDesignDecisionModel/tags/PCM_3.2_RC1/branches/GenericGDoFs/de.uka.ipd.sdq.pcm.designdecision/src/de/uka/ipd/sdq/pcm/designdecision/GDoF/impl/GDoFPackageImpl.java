/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.GDoF.impl;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;

import de.uka.ipd.sdq.pcm.cost.costPackage;

import de.uka.ipd.sdq.pcm.designdecision.GDoF.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.GDoFFactory;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.GDoFPackage;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.GDoFRepository;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.GenericDegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.InstanceSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.OCLRule;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.SelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.StaticContextRule;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.StaticSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.ValueRule;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.OCLQuery;

import de.uka.ipd.sdq.pcm.designdecision.PrimitiveTypes.PrimitiveTypesPackage;

import de.uka.ipd.sdq.pcm.designdecision.PrimitiveTypes.impl.PrimitiveTypesPackageImpl;

import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl;

import de.uka.ipd.sdq.pcm.designdecision.resourcerepository.ResourcerepositoryPackage;

import de.uka.ipd.sdq.pcm.designdecision.resourcerepository.impl.ResourcerepositoryPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GDoFPackageImpl extends EPackageImpl implements GDoFPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeableElementDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperOCLDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticContextRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gDoFRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSelectionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticSelectionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericDegreeOfFreedomEClass = null;

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
	 * @see de.uka.ipd.sdq.pcm.designdecision.GDoF.GDoFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GDoFPackageImpl() {
		super(eNS_URI, GDoFFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GDoFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GDoFPackage init() {
		if (isInited) return (GDoFPackage)EPackage.Registry.INSTANCE.getEPackage(GDoFPackage.eNS_URI);

		// Obtain or create and register package
		GDoFPackageImpl theGDoFPackage = (GDoFPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GDoFPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GDoFPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		costPackage.eINSTANCE.eClass();
		featuremodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI) instanceof designdecisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI) : designdecisionPackage.eINSTANCE);
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) instanceof PrimitiveTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) : PrimitiveTypesPackage.eINSTANCE);
		ResourcerepositoryPackageImpl theResourcerepositoryPackage = (ResourcerepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcerepositoryPackage.eNS_URI) instanceof ResourcerepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcerepositoryPackage.eNS_URI) : ResourcerepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theGDoFPackage.createPackageContents();
		thedesigndecisionPackage.createPackageContents();
		thePrimitiveTypesPackage.createPackageContents();
		theResourcerepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theGDoFPackage.initializePackageContents();
		thedesigndecisionPackage.initializePackageContents();
		thePrimitiveTypesPackage.initializePackageContents();
		theResourcerepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGDoFPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GDoFPackage.eNS_URI, theGDoFPackage);
		return theGDoFPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeableElementDescription() {
		return changeableElementDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeableElementDescription_ChangeableContainer() {
		return (EReference)changeableElementDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeableElementDescription_Changeable() {
		return (EReference)changeableElementDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeableElementDescription_ValueRule() {
		return (EReference)changeableElementDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeableElementDescription_SelectionRule() {
		return (EReference)changeableElementDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRule() {
		return valueRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLRule() {
		return oclRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLRule_MainOclQuery() {
		return (EAttribute)oclRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLRule_HelperDefinition() {
		return (EReference)oclRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelperOCLDefinition() {
		return helperOCLDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticContextRule() {
		return staticContextRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticContextRule_ContextClass() {
		return (EReference)staticContextRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionRule() {
		return selectionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGDoFRepository() {
		return gDoFRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGDoFRepository_Gdofs() {
		return (EReference)gDoFRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSelectionRule() {
		return instanceSelectionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSelectionRule_ContextInstance() {
		return (EReference)instanceSelectionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticSelectionRule() {
		return staticSelectionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericDegreeOfFreedom() {
		return genericDegreeOfFreedomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericDegreeOfFreedom_Name() {
		return (EAttribute)genericDegreeOfFreedomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericDegreeOfFreedom_AddedElements() {
		return (EReference)genericDegreeOfFreedomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericDegreeOfFreedom_ChangeableElementDescription() {
		return (EReference)genericDegreeOfFreedomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericDegreeOfFreedom_InteractionConstraint() {
		return (EReference)genericDegreeOfFreedomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericDegreeOfFreedom_PrimaryChangeable() {
		return (EReference)genericDegreeOfFreedomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GDoFFactory getGDoFFactory() {
		return (GDoFFactory)getEFactoryInstance();
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
		changeableElementDescriptionEClass = createEClass(CHANGEABLE_ELEMENT_DESCRIPTION);
		createEReference(changeableElementDescriptionEClass, CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE_CONTAINER);
		createEReference(changeableElementDescriptionEClass, CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE);
		createEReference(changeableElementDescriptionEClass, CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE);
		createEReference(changeableElementDescriptionEClass, CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE);

		valueRuleEClass = createEClass(VALUE_RULE);

		oclRuleEClass = createEClass(OCL_RULE);
		createEAttribute(oclRuleEClass, OCL_RULE__MAIN_OCL_QUERY);
		createEReference(oclRuleEClass, OCL_RULE__HELPER_DEFINITION);

		helperOCLDefinitionEClass = createEClass(HELPER_OCL_DEFINITION);

		staticContextRuleEClass = createEClass(STATIC_CONTEXT_RULE);
		createEReference(staticContextRuleEClass, STATIC_CONTEXT_RULE__CONTEXT_CLASS);

		selectionRuleEClass = createEClass(SELECTION_RULE);

		gDoFRepositoryEClass = createEClass(GDO_FREPOSITORY);
		createEReference(gDoFRepositoryEClass, GDO_FREPOSITORY__GDOFS);

		instanceSelectionRuleEClass = createEClass(INSTANCE_SELECTION_RULE);
		createEReference(instanceSelectionRuleEClass, INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE);

		staticSelectionRuleEClass = createEClass(STATIC_SELECTION_RULE);

		genericDegreeOfFreedomEClass = createEClass(GENERIC_DEGREE_OF_FREEDOM);
		createEAttribute(genericDegreeOfFreedomEClass, GENERIC_DEGREE_OF_FREEDOM__NAME);
		createEReference(genericDegreeOfFreedomEClass, GENERIC_DEGREE_OF_FREEDOM__ADDED_ELEMENTS);
		createEReference(genericDegreeOfFreedomEClass, GENERIC_DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTION);
		createEReference(genericDegreeOfFreedomEClass, GENERIC_DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINT);
		createEReference(genericDegreeOfFreedomEClass, GENERIC_DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		valueRuleEClass.getESuperTypes().add(this.getOCLRule());
		helperOCLDefinitionEClass.getESuperTypes().add(this.getOCLRule());
		helperOCLDefinitionEClass.getESuperTypes().add(this.getStaticContextRule());
		selectionRuleEClass.getESuperTypes().add(this.getOCLRule());
		instanceSelectionRuleEClass.getESuperTypes().add(this.getSelectionRule());
		staticSelectionRuleEClass.getESuperTypes().add(this.getSelectionRule());
		staticSelectionRuleEClass.getESuperTypes().add(this.getStaticContextRule());

		// Initialize classes and features; add operations and parameters
		initEClass(changeableElementDescriptionEClass, ChangeableElementDescription.class, "ChangeableElementDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeableElementDescription_ChangeableContainer(), theEcorePackage.getEClass(), null, "changeableContainer", null, 1, 1, ChangeableElementDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getChangeableElementDescription_Changeable(), theEcorePackage.getEStructuralFeature(), null, "changeable", null, 1, 1, ChangeableElementDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getChangeableElementDescription_ValueRule(), this.getValueRule(), null, "valueRule", null, 1, 1, ChangeableElementDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getChangeableElementDescription_SelectionRule(), this.getSelectionRule(), null, "selectionRule", null, 0, 1, ChangeableElementDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueRuleEClass, ValueRule.class, "ValueRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclRuleEClass, OCLRule.class, "OCLRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOCLRule_MainOclQuery(), ecorePackage.getEString(), "mainOclQuery", null, 1, 1, OCLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOCLRule_HelperDefinition(), this.getHelperOCLDefinition(), null, "helperDefinition", null, 0, -1, OCLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(helperOCLDefinitionEClass, HelperOCLDefinition.class, "HelperOCLDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticContextRuleEClass, StaticContextRule.class, "StaticContextRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticContextRule_ContextClass(), theEcorePackage.getEClass(), null, "contextClass", null, 0, 1, StaticContextRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(selectionRuleEClass, SelectionRule.class, "SelectionRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gDoFRepositoryEClass, GDoFRepository.class, "GDoFRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGDoFRepository_Gdofs(), this.getGenericDegreeOfFreedom(), null, "gdofs", null, 0, -1, GDoFRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(instanceSelectionRuleEClass, InstanceSelectionRule.class, "InstanceSelectionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSelectionRule_ContextInstance(), this.getChangeableElementDescription(), null, "contextInstance", null, 0, 1, InstanceSelectionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(staticSelectionRuleEClass, StaticSelectionRule.class, "StaticSelectionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericDegreeOfFreedomEClass, GenericDegreeOfFreedom.class, "GenericDegreeOfFreedom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericDegreeOfFreedom_Name(), ecorePackage.getEString(), "name", null, 1, 1, GenericDegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenericDegreeOfFreedom_AddedElements(), theEcorePackage.getEClass(), null, "addedElements", null, 0, -1, GenericDegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenericDegreeOfFreedom_ChangeableElementDescription(), this.getChangeableElementDescription(), null, "changeableElementDescription", null, 0, -1, GenericDegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenericDegreeOfFreedom_InteractionConstraint(), theEcorePackage.getEOperation(), null, "interactionConstraint", null, 0, -1, GenericDegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGenericDegreeOfFreedom_PrimaryChangeable(), this.getChangeableElementDescription(), null, "primaryChangeable", null, 1, 1, GenericDegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //GDoFPackageImpl