package org.somox.ui.runconfig;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.osgi.service.prefs.BackingStoreException;
import org.somox.common.SoMoXProjectPreferences;
import org.somox.ui.Activator;
import org.somox.ui.GUISoMoXCoreController;
import org.somox.ui.SoMoXUILogger;


/**
 * The class is defined by the delegate attribute of a launchConfigurationType
 * extension and performs launching for a Model Extraction launch configuration.
 * 
 * @author Michael Hauck
 */
public class ModelExtractionConfigurationDelegate implements
		ILaunchConfigurationDelegate{

	/*(non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration,
	 *      java.lang.String, org.eclipse.debug.core.ILaunch,
	 *      org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		//launch.addProcess(new ModelExtractorProcess(launch));

		// check that the controller is available
		GUISoMoXCoreController controller = Activator.getDefault().getGuiSoMoXCoreController();
		/*IProcess[] p = launch.getProcesses();
		if (p != null) {
			for (int i=0; i<p.length; i++) {
				System.err.println("process: " + p[i]);
			}
		}*/
				
		if(controller == null){
			//MessageDialog.openError(shell, "SoMoX Core Controller not loaded", "The SoMoX Core Controller can not be accessed. This indicates that the controller is not loaded yet. May be the SoMoX Core itself is not in place or not started yet.");
		} else {
			Preferences preferencesTemp = Activator.getDefault().getPluginPreferences();
			Preferences preferences = new Preferences();
			String[] availableProperties = preferencesTemp.propertyNames();
			// Make a copy of the preferences to store run dialog preferences
			// as well
			for (int i=0; i<availableProperties.length; i++) {
				preferences.setValue(availableProperties[i], preferencesTemp.getString(availableProperties[i]));
			}
			
			// Create project dir based on project name
			String projectDir = Platform.getInstanceLocation().getURL().getFile();
			String projectName = configuration.getAttribute(SoMoXProjectPreferences.SOMOX_PROJECT_NAME, "");
			if ((projectName == null) || projectName.equals("")) {
				SoMoXUILogger.logError("No project specified. Extraction aborted.", null);
				return;
			}
			preferences.setValue(SoMoXProjectPreferences.SOMOX_PROJECT_NAME, projectDir + projectName);
			configuration.getAttributes().remove(SoMoXProjectPreferences.SOMOX_PROJECT_NAME);

			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			IScopeContext projectContext = new ProjectScope(project);
			IEclipsePreferences node = projectContext.getNode("org.somox");
			
			try {
				String[] projectPropertyKeys = node.keys();
				if ((projectPropertyKeys == null) || (projectPropertyKeys.length == 0)) {
					SoMoXUILogger.logError("Failed to read project preferences. Specified project is probably not a SoMoX project.", null);
				} else {
					for (int i=0; i<projectPropertyKeys.length; i++) {
						preferences.setValue(projectPropertyKeys[i], node.get(projectPropertyKeys[i], ""));
					}
				}
				
			} catch (BackingStoreException e) {
				SoMoXUILogger.logError("Failed to get project preferences.  Extraction aborted.", e);
				return;
			}
			
			Set<Map.Entry<String, Object>> runConfigProperties = configuration.getAttributes().entrySet();
			Iterator<Map.Entry<String, Object>> i = runConfigProperties.iterator();
			while (i.hasNext()) {
				Map.Entry<String, Object> entry = i.next();
				System.err.println("PREF: " + entry.getKey() + ", " + entry.getValue().toString());
				preferences.setValue(entry.getKey(), entry.getValue().toString());
			}
			
			
			controller.startExtraction(monitor, preferences);
		}

	}
	
	/*private MessageConsole getConsole() {
		if (console == null) {
			console = new MessageConsole("Model Extraction Console",
					null);
			ConsolePlugin.getDefault().getConsoleManager().addConsoles(
					new IConsole[] { console });
		}
		console.activate();
		return console;
	}
	
	private PrintStream getPrintStream() {
		if (myOutStream == null) {
			MessageConsole console = getConsole();
			myOutStream = new PrintStream(console.newMessageStream());
		}
		return myOutStream;
	}*/

}
