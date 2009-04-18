package de.uka.ipd.sdq.codegen.runconfig;

import java.net.URL;
import java.net.URLClassLoader;

import org.apache.commons.logging.impl.LogFactoryImpl;
import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import de.uka.ipd.sdq.codegen.runconfig.logging.StreamsProxyAppender;
import de.uka.ipd.sdq.codegen.workflow.Blackboard;
import de.uka.ipd.sdq.codegen.workflow.IJob;
import de.uka.ipd.sdq.codegen.workflow.Workflow;
import de.uka.ipd.sdq.codegen.workflow.ui.UIBasedWorkflow;
import de.uka.ipd.sdq.codegen.workflow.ui.UIBasedWorkflowExceptionHandler;

/**
 * Abstract base class of all solver runs for PCM model instances. A PCM model instance
 * consists of a PCM system model, its allocation, a resource environment, several PCM
 * repositories, and a usage model.
 * 
 * The class is supposed to be used to implement Eclipse run configurations, like SimuCom, ProtoCom,
 * PCM2Java, PCM2LQN, etc.
 * 
 * The class is abstract and defines some methods, which must be
 * implemented by subclasses. See method descriptions for details.
 * 
 * @author Roman Andrej
 * 		   Steffen Becker
 */

public abstract class 
	AbstractWorkflowBasedLaunchConfigurationDelegate
		<WorkflowConfigurationType extends AbstractWorkflowBasedRunConfiguration,
		BlackboardType extends Blackboard<?>>
	implements ILaunchConfigurationDelegate {

	private static final String SHORT_LOG_PATTERN = "[%-10t] %-5p: %m%n";
	private static final String DETAILED_LOG_PATTERN = "%-8r [%-10t] %-5p: %m [%c]%n";
	
	protected Logger logger = null;
	public static String VERBOSE_LOGGING = "verboseLogging";

	/*(non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration,
	 *      java.lang.String, org.eclipse.debug.core.ILaunch,
	 *      org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		logger = Logger.getLogger(AbstractWorkflowBasedLaunchConfigurationDelegate.class);

		// Add a process to this launch, needed for Eclipse UI updates
		SimProcess myProcess = getProcess(launch); 
		setupLogging(configuration, myProcess);
		launch.addProcess(myProcess);
		
		// Setup a new classloader to allow reconfiguration of apache commons logging
		ClassLoader oldClassLoader = configureNewClassloader();
		// Reconfigure apache commons logging to use Log4J as backend logger
		System.setProperty(LogFactoryImpl.LOG_PROPERTY, "org.apache.commons.logging.impl.Log4JLogger");

		try {
			logger.info("Create workflow configuration");
			WorkflowConfigurationType workflowConfiguration = 
				deriveConfiguration(configuration, mode);
		
			logger.info("Validating configuration...");
			workflowConfiguration.validateAndFreeze();
	
			Workflow workflow = new UIBasedWorkflow<BlackboardType>(
				createWorkflowJob(workflowConfiguration, launch), 
				monitor, 
				new UIBasedWorkflowExceptionHandler(
						!workflowConfiguration.isInteractive()),
				createBlackboard());
			workflow.run();
		} finally {
			// Reset classloader to original value
			Thread.currentThread().setContextClassLoader(oldClassLoader);
		}
		
		// Singnal execution terminatation to Eclipse to update UI 
		launch.getProcesses()[0].terminate();
	}

	/**
	 * Factory method for the blackboard used in the workflow of this launch
	 * @return The blackboard to be used in the workflow
	 */
	protected abstract BlackboardType createBlackboard();

	/**
	 * @return
	 */
	private ClassLoader configureNewClassloader() {
		ClassLoader oldClassLoader = Thread.currentThread().getContextClassLoader();
		URLClassLoader cl = new URLClassLoader(new URL[]{},oldClassLoader);
		Thread.currentThread().setContextClassLoader(cl);
		return oldClassLoader;
	}

	/**
	 * @param configuration 
	 * @param myProcess
	 * @throws CoreException 
	 */
	private void setupLogging(ILaunchConfiguration configuration, SimProcess myProcess) throws CoreException {
		/* Initialise Log4J Logging */
		Logger sdqLogger = Logger.getLogger("de.uka.ipd.sdq");
		StreamsProxyAppender sdqAppender = new StreamsProxyAppender();
		if (configuration.getAttribute(VERBOSE_LOGGING, false)) {
			setupLogger(sdqAppender,sdqLogger,DETAILED_LOG_PATTERN);
		} else {
			setupLogger(sdqAppender,sdqLogger,SHORT_LOG_PATTERN);
		}
		myProcess.addAppender(sdqAppender);

		Logger oawLogger = Logger.getLogger("org.openarchitectureware");
		StreamsProxyAppender oawAppender = new StreamsProxyAppender();
		setupLogger(oawAppender,oawLogger,SHORT_LOG_PATTERN);
		myProcess.addAppender(oawAppender);
	}

	/**
	 * @param appender 
	 * @param logger
	 */
	private void setupLogger(Appender appender, Logger logger, String layout) {
		logger.removeAllAppenders();
		logger.setLevel(Level.INFO);
		appender.setLayout(
				new PatternLayout(layout));
		logger.setAdditivity(false);
		logger.addAppender(appender);
	}

	/**
	 * @param launch
	 * @return
	 */
	protected SimProcess getProcess(ILaunch launch) {
		return new SimProcess(launch);
	}

	/**
	 * Create the job executed in the underlying workflow
	 * 
	 */
	protected abstract IJob createWorkflowJob(
			WorkflowConfigurationType config,
			ILaunch launch) throws CoreException;
	
	/**
	 * The method create the instance of generic type. The type defines that
	 * access methods on ILaunchConfiguration-Object
	 * @param mode 
	 * @throws CoreException 
	 */
	protected abstract WorkflowConfigurationType deriveConfiguration(ILaunchConfiguration configuration, String mode) throws CoreException;
}
