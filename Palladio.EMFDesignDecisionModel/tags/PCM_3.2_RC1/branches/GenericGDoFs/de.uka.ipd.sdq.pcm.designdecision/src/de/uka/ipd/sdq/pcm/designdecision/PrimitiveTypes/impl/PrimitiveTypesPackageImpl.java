/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.PrimitiveTypes.impl;

import EMOF.EMOFPackage;
import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.GDoFPackage;
import de.uka.ipd.sdq.pcm.designdecision.GDoF.impl.GDoFPackageImpl;
import de.uka.ipd.sdq.pcm.allocation.AllocationPackage;

import de.uka.ipd.sdq.pcm.core.CorePackage;

import de.uka.ipd.sdq.pcm.designdecision.PrimitiveTypes.PrimitiveTypesFactory;
import de.uka.ipd.sdq.pcm.designdecision.PrimitiveTypes.PrimitiveTypesPackage;

import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl;

import de.uka.ipd.sdq.pcm.designdecision.resourcerepository.ResourcerepositoryPackage;
import de.uka.ipd.sdq.pcm.designdecision.resourcerepository.impl.ResourcerepositoryPackageImpl;
import de.uka.ipd.sdq.pcm.parameter.ParameterPackage;

import de.uka.ipd.sdq.pcm.protocol.ProtocolPackage;

import de.uka.ipd.sdq.pcm.qosannotations.QosannotationsPackage;

import de.uka.ipd.sdq.pcm.repository.RepositoryPackage;

import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage;

import de.uka.ipd.sdq.pcm.resourcetype.ResourcetypePackage;

import de.uka.ipd.sdq.pcm.seff.SeffPackage;

import de.uka.ipd.sdq.pcm.subsystem.SubsystemPackage;

import de.uka.ipd.sdq.pcm.system.SystemPackage;

import de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveTypesPackageImpl extends EPackageImpl implements PrimitiveTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

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
	 * @see de.uka.ipd.sdq.pcm.designdecision.PrimitiveTypes.PrimitiveTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrimitiveTypesPackageImpl() {
		super(eNS_URI, PrimitiveTypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PrimitiveTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrimitiveTypesPackage init() {
		if (isInited) return (PrimitiveTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);

		// Obtain or create and register package
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrimitiveTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrimitiveTypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		costPackage.eINSTANCE.eClass();
		featuremodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI) instanceof designdecisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI) : designdecisionPackage.eINSTANCE);
		GDoFPackageImpl theGDoFPackage = (GDoFPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GDoFPackage.eNS_URI) instanceof GDoFPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GDoFPackage.eNS_URI) : GDoFPackage.eINSTANCE);
		ResourcerepositoryPackageImpl theResourcerepositoryPackage = (ResourcerepositoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcerepositoryPackage.eNS_URI) instanceof ResourcerepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcerepositoryPackage.eNS_URI) : ResourcerepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		thePrimitiveTypesPackage.createPackageContents();
		thedesigndecisionPackage.createPackageContents();
		theGDoFPackage.createPackageContents();
		theResourcerepositoryPackage.createPackageContents();

		// Initialize created meta-data
		thePrimitiveTypesPackage.initializePackageContents();
		thedesigndecisionPackage.initializePackageContents();
		theGDoFPackage.initializePackageContents();
		theResourcerepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrimitiveTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrimitiveTypesPackage.eNS_URI, thePrimitiveTypesPackage);
		return thePrimitiveTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getdouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypesFactory getPrimitiveTypesFactory() {
		return (PrimitiveTypesFactory)getEFactoryInstance();
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

		// Create data types
		doubleEDataType = createEDataType(DOUBLE);
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

		// Initialize data types
		initEDataType(doubleEDataType, double.class, "double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //PrimitiveTypesPackageImpl
