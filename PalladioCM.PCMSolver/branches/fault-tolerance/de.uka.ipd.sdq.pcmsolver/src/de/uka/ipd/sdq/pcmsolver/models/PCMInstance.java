package de.uka.ipd.sdq.pcmsolver.models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.uka.ipd.sdq.context.computed_allocation.ComputedAllocation;
import de.uka.ipd.sdq.context.computed_allocation.ComputedAllocationContext;
import de.uka.ipd.sdq.context.computed_allocation.ComputedAllocationFactory;
import de.uka.ipd.sdq.context.computed_usage.ComputedUsage;
import de.uka.ipd.sdq.context.computed_usage.ComputedUsageFactory;
import de.uka.ipd.sdq.pcm.allocation.Allocation;
import de.uka.ipd.sdq.pcm.repository.Repository;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceEnvironment;
import de.uka.ipd.sdq.pcm.resourcetype.ResourceRepository;
import de.uka.ipd.sdq.pcm.usagemodel.UsageModel;
import de.uka.ipd.sdq.workflow.launchconfig.ConstantsContainer;
import de.uka.ipd.sdq.workflow.pcm.blackboard.PCMResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.configurations.AbstractPCMWorkflowRunConfiguration;


public class PCMInstance {

	private static Logger logger = Logger
			.getLogger(PCMInstance.class.getName());

//	private Allocation allocation;

//	private Repository repository;

//	private ResourceEnvironment resourceEnvironment;
//
//	private ResourceRepository resourceRepository;
//
//	private de.uka.ipd.sdq.pcm.system.System system;
//
//	private UsageModel usageModel;

	private ComputedUsage computedUsage;

	private ComputedAllocation actualAllocation;

	private String storagePath;
	
	private PCMResourceSetPartition resourceSetPartition;

	public PCMInstance(Properties config) {
		this.storagePath = config.getProperty("Storage_Path");
		this.computedUsage = ComputedUsageFactory.eINSTANCE.createComputedUsage();
		this.actualAllocation = ComputedAllocationFactory.eINSTANCE
				.createComputedAllocation();
		ArrayList <String> fileList = new ArrayList <String>();
		fileList.add(config.getProperty("Filename_UsageModel"));
		fileList.add(config.getProperty("Filename_AllocationModel"));
		createResourceSetPartition(fileList);
//		loadFromFiles(config);
	}

	@Deprecated
	public PCMInstance(ILaunchConfiguration configuration) {
		this.computedUsage = ComputedUsageFactory.eINSTANCE.createComputedUsage();
		this.actualAllocation = ComputedAllocationFactory.eINSTANCE
				.createComputedAllocation();
		try {
			this.storagePath = configuration.getAttribute("outputPath", ".");

			ArrayList <String> fileList = new ArrayList <String>();
			fileList.add(configuration.getAttribute(
					ConstantsContainer.USAGE_FILE, ""));
			fileList.add(configuration.getAttribute(
					ConstantsContainer.ALLOCATION_FILE, ""));
			createResourceSetPartition(fileList);
			
			
//			String filename = configuration.getAttribute(
//					ConstantsContainer.ALLOCATION_FILE, "");
//			this.allocation = ((Allocation) loadFromXMIFile(filename));
//
//			filename = configuration.getAttribute(
//					ConstantsContainer.USAGE_FILE, "");
//			this.usageModel = ((UsageModel) loadFromXMIFile(filename));
			
//			filename = configuration.getAttribute(
//					ConstantsContainer.REPOSITORY_FILE, "");
//			this.repository = ((Repository) loadFromXMIFile(filename));
//
//			filename = configuration.getAttribute(
//					ConstantsContainer.RESOURCEENVIRONMENT_FILE, "");
//			this.resourceEnvironment = ((ResourceEnvironment) loadFromXMIFile(filename));
//
//			filename = configuration.getAttribute(
//					ConstantsContainer.RESOURCETYPEREPOSITORY_FILE, "");
//			this.resourceRepository = ((ResourceRepository) loadFromXMIFile(filename));
//
//			filename = configuration.getAttribute(
//					ConstantsContainer.SYSTEM_FILE, "");
//			this.system = ((de.uka.ipd.sdq.pcm.system.System) loadFromXMIFile(filename));



		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

//BRG
	public PCMInstance(PCMResourceSetPartition pcmModel) {
		this.computedUsage = ComputedUsageFactory.eINSTANCE.createComputedUsage();
		this.actualAllocation = ComputedAllocationFactory.eINSTANCE
		.createComputedAllocation();
		this.storagePath = ".";
		this.resourceSetPartition = pcmModel;


	}
	
//BRG

	/**
	 * Loads PCM Model contents.
	 * 
	 * @param modelFiles List of Strings containing Usage and Allocation FileNames 
	 */
	private void createResourceSetPartition(List<String> modelFiles) {
	
		resourceSetPartition = new PCMResourceSetPartition();
		resourceSetPartition.initialiseResourceSetEPackages(AbstractPCMWorkflowRunConfiguration.PCM_EPACKAGES);
		for (String modelFile : modelFiles) {
			resourceSetPartition.loadModel(modelFile);
		}
		resourceSetPartition.resolveAllProxies();

	}
	
	public Allocation getAllocation() {
		return resourceSetPartition.getAllocation();
	}

//BRG
//	public void setAllocation(Allocation allocation) {
//		this.allocation = allocation;
//	}

	public Repository getRepository() {
		return resourceSetPartition.getRepository();
	}

//	public void setRepository(Repository repository) {
//		this.repository = repository;
//	}

	public ResourceEnvironment getResourceEnvironment() {
		return resourceSetPartition.getResourceEnvironment();
	}

//	public void setResourceEnvironment(ResourceEnvironment resourceEnvironment) {
//		this.resourceEnvironment = resourceEnvironment;
//	}

	public ResourceRepository getResourceRepository() {
		return resourceSetPartition.getResourceTypeRepository();
	}

//	public void setResourceRepository(ResourceRepository resourceRepository) {
//		this.resourceRepository = resourceRepository;
//	}

	public de.uka.ipd.sdq.pcm.system.System getSystem() {
		return resourceSetPartition.getSystem();
	}

//	public void setSystem(de.uka.ipd.sdq.pcm.system.System system) {
//		this.system = system;
//	}

	public UsageModel getUsageModel() {
		return resourceSetPartition.getUsageModel();
	}

//	public void setUsageModel(UsageModel usageModel) {
//		this.usageModel = usageModel;
//	}

	public ComputedAllocation getComputedAllocation() {
		return actualAllocation;
	}

//	public void setComputedAllocation(ComputedAllocation actualAllocation) {
//		this.actualAllocation = actualAllocation;
//	}

	public ComputedUsage getComputedUsage() {
		return computedUsage;
	}

//	public void setComputedUsage(ComputedUsage usage) {
//		this.usage = usage;
//	}

	//BRG
//	private void loadFromFiles(Properties config) {
//		String filename = config.getProperty("Filename_Allocation");
//		this.allocation = ((Allocation) loadFromXMIFile(filename));
//		filename = config.getProperty("Filename_Repository");
//		this.repository = ((Repository) loadFromXMIFile(filename));
//		filename = config.getProperty("Filename_ResourceEnvironment");
//		this.resourceEnvironment = ((ResourceEnvironment) loadFromXMIFile(filename));
//		filename = config.getProperty("Filename_ResourceType");
//		this.resourceRepository = ((ResourceRepository) loadFromXMIFile(filename));
//		filename = config.getProperty("Filename_System");
//		this.system = ((de.uka.ipd.sdq.pcm.system.System) loadFromXMIFile(filename));
//		filename = config.getProperty("Filename_UsageModel");
//		this.usageModel = ((UsageModel) loadFromXMIFile(filename));
//	}

	public void saveToFiles(String fileNamePrefix) {
		fileNamePrefix = storagePath + "\\" + fileNamePrefix;
		saveToXMIFile(getAllocation(), fileNamePrefix + ".allocation");
		saveToXMIFile(getRepository(), fileNamePrefix + ".repository");
		saveToXMIFile(getResourceEnvironment(), fileNamePrefix
				+ ".resourceenvironment");
		saveToXMIFile(getResourceRepository(), fileNamePrefix + ".resourcetype");
		saveToXMIFile(getSystem(), fileNamePrefix + ".system");
		saveToXMIFile(getUsageModel(), fileNamePrefix + ".usagemodel");

		saveToXMIFile(computedUsage, fileNamePrefix + ".usage");
		saveToXMIFile(actualAllocation, fileNamePrefix + ".actualallocation");

	}

	//BRG
//	private EObject loadFromXMIFile(String fileName) {
//		// Create a resource set to hold the resources.
//		ResourceSet resourceSet = new ResourceSetImpl();
//
//		// Register the appropriate resource factory to handle all file
//		// extentions.
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
//				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
//						new XMIResourceFactoryImpl());
//
//		// Register the package to ensure it is available during loading.
//		registerPackages(resourceSet);
//
//		// Construct the URI for the instance file.
//		// The argument is treated as a file path only if it denotes an existing
//		// file. Otherwise, it's directly treated as a URL.
//		File file = new File(fileName);
//		URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath())
//				: URI.createURI(fileName);
//
//		Resource resource = null;
//		// Demand load resource for this file.
//		try {
//			resource = resourceSet.getResource(uri, true);
//		} catch (Exception e) {
//			logger.error(e.getMessage());
//			return null;
//		}
//
//		// logger.debug("Loaded " + uri);
//
//		// if (!fileName.endsWith(".assembly") &&
//		// !fileName.endsWith("repository")) {
//		// // Validate the contents of the loaded resource.
//		// for (Iterator j = resource.getContents().iterator(); j.hasNext();) {
//		// EObject eObject = (EObject) j.next();
//		// Diagnostic diagnostic = Diagnostician.INSTANCE
//		// .validate(eObject);
//		// if (diagnostic.getSeverity() != Diagnostic.OK) {
//		// System.out.println();
//		// System.out.println(diagnostic.getMessage());
//		// // printDiagnostic(diagnostic, "");
//		//					
//		// }
//		// }
//		// }
//		EObject eObject = (EObject) resource.getContents().iterator().next();
//		return EcoreUtil.getRootContainer(eObject);
//	}

	public void saveToXMIFile(EObject modelToSave, String fileName) {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		URI fileURI = URI.createFileURI(new File(fileName).getAbsolutePath());
		Resource resource = resourceSet.createResource(fileURI);
		resource.getContents().add(modelToSave);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
		// logger.debug("Saved " + fileURI);
	}
	
//BRG
//	private void registerPackages(ResourceSet resourceSet) {
//
//		resourceSet.getPackageRegistry().put(AllocationPackage.eNS_URI,
//				AllocationPackage.eINSTANCE);
//		resourceSet.getPackageRegistry().put(ParameterPackage.eNS_URI,
//				ParameterPackage.eINSTANCE);
//		resourceSet.getPackageRegistry().put(
//				ResourceenvironmentPackage.eNS_URI,
//				ResourceenvironmentPackage.eINSTANCE);
//		resourceSet.getPackageRegistry().put(ResourcetypePackage.eNS_URI,
//				ResourcetypePackage.eINSTANCE);
//		resourceSet.getPackageRegistry().put(RepositoryPackage.eNS_URI,
//				RepositoryPackage.eINSTANCE);
//		resourceSet.getPackageRegistry().put(SeffPackage.eNS_URI,
//				SeffPackage.eINSTANCE);
//		resourceSet.getPackageRegistry().put(SystemPackage.eNS_URI,
//				SystemPackage.eINSTANCE);
//		resourceSet.getPackageRegistry().put(UsagemodelPackage.eNS_URI,
//				UsagemodelPackage.eINSTANCE);
//
//	}

	public boolean isValid(){
		if (getAllocation() == null ||
			getRepository() == null ||
			getResourceEnvironment() == null ||
			getResourceRepository() == null ||
			getSystem() == null ||
			computedUsage == null){
			return false;
		} else return true;
			
	}
	
	/**
	 * Get the used ResourceContainers. These are all resource containers that are references from ComputedAllocationContexts inside the ComputedAllocation.
	 * 
	 * If the ComputedAllocation has not yet been calculated, this method returns all resource containers.
	 * 
	 * @return A set of all used resource containers. Each container is just contained once.
	 */
	public Set<ResourceContainer> getUsedResourceContainer() {
		//The maximal size of this list is the number of resource containers in the resource environment.
		Set<ResourceContainer> usedRCList = new HashSet<ResourceContainer>(this.getResourceEnvironment().getResourceContainer_ResourceEnvironment().size());
		
		//Check whether the ComputedAllocation has been determined already. If not, return all ResourceContainers.
		if (this.actualAllocation != null && this.actualAllocation.getComputedAllocationContexts_ComputedAllocation().size() != 0){
			List<ComputedAllocationContext> computedAllocationContextList = this.actualAllocation.getComputedAllocationContexts_ComputedAllocation();
			for (ComputedAllocationContext cac : computedAllocationContextList) {
				ResourceContainer rc = cac.getAllocationContext_ComputedAllocationContext().getResourceContainer_AllocationContext();
				if (!usedRCList.contains(rc)){
					usedRCList.add(rc);
				}

			}
		} else {
			//return all resource containers
			usedRCList.addAll(this.getResourceEnvironment().getResourceContainer_ResourceEnvironment());
		}
		return usedRCList;
	}
}
