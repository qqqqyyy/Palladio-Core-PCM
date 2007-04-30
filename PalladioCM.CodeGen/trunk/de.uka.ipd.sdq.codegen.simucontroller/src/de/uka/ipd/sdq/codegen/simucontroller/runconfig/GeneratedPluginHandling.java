/**
 * 
 */
package de.uka.ipd.sdq.codegen.simucontroller.runconfig;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

import de.uka.ipd.sdq.codegen.simucontroller.SimuComJob;
import de.uka.ipd.sdq.codegen.simucontroller.SimuControllerPlugin;
import de.uka.ipd.sdq.codegen.simucontroller.actions.ISimuComControl;

/**
 * @author admin
 * 
 */
public class GeneratedPluginHandling {
	
	private static final String PID = "de.uka.ipd.sdq.codegen.simucontroller";
	private static final String EPID = "controller";

	private IProgressMonitor monitor = null;
	private IProject project = null;
	private Bundle bundle = null;
	
	
	private GeneratedPluginHandling(IProgressMonitor monitor){
		this.monitor = monitor;

		try {
			setMonitorSubTask("Create Plugin");
			project = PluginProject.create(monitor);
			monitorWorked();
		} catch (CoreException e) {
			setLogMessage("Create container project failed: ", e);
		}
	}
	
	/**
	 * Fabric methode
	 */
	public static GeneratedPluginHandling create(IProgressMonitor monitor) {
		return new GeneratedPluginHandling(monitor);
	}
	
	public void simulate(){
		loadPlugin();

		setMonitorSubTask("Simulate");
		SimuComJob job = new SimuComJob(findPlugin(),null);
		job.setUser(true);
		job.schedule();
		try {
			job.join();
		} catch (InterruptedException e) {
			setLogMessage("Simulation: ", e);
		}
		
		unloadPlugin();
	}
	/**
	 * TODO
	 * @return
	 */
	public ISimuComControl findPlugin() {
		ISimuComControl control = null;

		for (IConfigurationElement configurationElement : Platform
				.getExtensionRegistry().getConfigurationElementsFor(
						PID + "." + EPID)) {
			try {
				control = (ISimuComControl) configurationElement
						.createExecutableExtension("class");
			} catch (CoreException e) {
				SimuControllerPlugin.log(IStatus.ERROR,
						"No simulation plugin found: " + e.getMessage());
			}
		}
		return control;
	}

	/**
	 * TODO
	 * @param project
	 */
	public Bundle loadPlugin() {
		String location = project.getLocationURI().toString();
		location = location.replaceAll("%20", " "); // Workaround a bug in OSGi
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=184620

		BundleContext bundleContext = SimuControllerPlugin.getDefault()
				.getBundle().getBundleContext();

		compileCode(project);

		try {
			setMonitorSubTask("Load Generated Plugin");
			bundle = bundleContext.installBundle(location);
			bundle.start();
			bundle.update();
			monitorWorked();
		} catch (BundleException e) {
			setLogMessage("Loading of generated plugin failed: ", e);
		}
		return bundle;
	}

	public void unloadPlugin() {
		setMonitorSubTask("Cleanup");
		try {
			bundle.stop();
			bundle.uninstall();
		} catch (BundleException e) {
			setLogMessage("Unload Bundle: ", e);
		}
		try {
			project.close(monitor);
			project.delete(true, monitor);
		} catch (CoreException e) {
			setLogMessage("Close project failed: ", e);
		}
		monitorWorked();
		monitoreDone();
	}
	
	private void compileCode(IProject project) {
		setMonitorSubTask("Compile Code");
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
		} catch (CoreException e) {
			setLogMessage("Comaling of generated plugin failed: ", e);
		}
		monitorWorked();
	}
	
	public void setLogMessage(String msg, Exception e) {
		SimuControllerPlugin.log(IStatus.ERROR, msg + e.getMessage());
	}
	
	
	public void monitoreDone(){
		monitor.done();
	}
	
	public void setMonitorSubTask(String task){
		monitor.subTask(task);
	}
	
	public void setMonitorBeginTask(String task){
		int work = 5;
		monitor.beginTask(task, work);
	}
	
	public void monitorWorked(){
		int work = 1;
		monitor.worked(work);
	}
	
	public IProject getProject() {
		return project;
	}
}
