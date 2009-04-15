package de.uka.ipd.sdq.codegen.workflow;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import de.uka.ipd.sdq.codegen.workflow.exceptions.JobFailedException;
import de.uka.ipd.sdq.codegen.workflow.exceptions.RollbackFailedException;
import de.uka.ipd.sdq.codegen.workflow.exceptions.UserCanceledException;
import de.uka.ipd.sdq.codegen.workflow.exceptions.WorkflowExceptionHandler;

/**
 * Implementation of a workflow. A workflow is a special composite job which executes all other jobs while displaying the progress in a progress
 * bar to the user.
 * The given Progress Monitor will receive updates before and after a
 * job is executed.
 * 
 * @author Philipp Meier
 * 		   Steffen Becker
 */
public class Workflow 
	extends OrderPreservingCompositeJob
	implements ICompositeJob {
	
	private IProgressMonitor myMonitor;
	protected Logger logger = null;
	protected WorkflowExceptionHandler exceptionHandler = null;

	public Workflow(IJob job) {
		this(job, null, new WorkflowExceptionHandler(false));
	}
	
	public Workflow(IJob job, WorkflowExceptionHandler exceptionHandler) {
		this(job, null, exceptionHandler);
	}
	
	/** 
	 * @param job 
	 * @param monitor the progress monitor to use
	 * @param workflowExceptionHandler 
	 */
	public Workflow(IJob job, IProgressMonitor monitor, WorkflowExceptionHandler workflowExceptionHandler) {
		this.addJob(job);
		this.exceptionHandler  = workflowExceptionHandler;
		if (monitor != null) {
			myMonitor = monitor;
		} else {
			myMonitor = new NullProgressMonitor();
		}
		logger = Logger.getLogger(Workflow.class);
	}

	public void run() {
		logger.info("Creating workflow engine and starting workflow");

		myMonitor.beginTask("Workflow", 1);		
		myMonitor.subTask(this.getName());	
		
		try {
			this.execute(myMonitor);
		} catch (JobFailedException e) {
			logger.error("Workflow job failed, handling failure...");
			logger.error("Failure reason was: ",e);
			this.exceptionHandler.handleJobFailed(e);
		} catch (UserCanceledException e) {
			logger.info("User canceled workflow");
			this.exceptionHandler.handleUserCanceled(e);
		} finally {
			logger.info("Cleaning up...");
			try {
				this.rollback(myMonitor);
			} catch (RollbackFailedException e) {
				logger.error("Critical failure during workflow rollback");
				this.exceptionHandler.handleRollbackFailed(e);
			}
		}
		
		myMonitor.worked(1);		
		myMonitor.done();
		
		logger.info("Workflow engine completed task");
	}
}
