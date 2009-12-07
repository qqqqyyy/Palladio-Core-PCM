package de.uka.ipd.sdq.measurements.driver.os.tasks;

import java.util.ArrayList;
import java.util.List;

import de.uka.ipd.sdq.measurements.driver.common.DriverLogger;
import de.uka.ipd.sdq.measurements.driver.common.tasks.AbstractTaskExecuter;
import de.uka.ipd.sdq.measurements.driver.common.tasks.FinishIndicator;
import de.uka.ipd.sdq.measurements.driver.common.tasks.TaskExecuterFactory;
import de.uka.ipd.sdq.measurements.driver.common.tasks.TaskListener;
import de.uka.ipd.sdq.measurements.driver.common.tasks.TaskResultStorage;
import de.uka.ipd.sdq.measurements.driver.os.ChildProcessManager;
import de.uka.ipd.sdq.measurements.rmi.tasks.RmiAbstractTask;
import de.uka.ipd.sdq.measurements.rmi.tasks.RmiParallelProcessTask;
import de.uka.ipd.sdq.measurements.rmi.tasks.RmiParallelTask;

public class ParallelProcessTaskExecuter extends AbstractTaskExecuter {
		
	private AbstractTaskExecuter myOwnTaskExecuter = null;
	private FinishIndicator myOwnTaskFinishIndicator = null;
	private boolean[] isMyOwnTaskFinished = null;
	private int[] childProcessTaskIds = null;
	private List<Integer> completedNestedTasks = new ArrayList<Integer>();
	
	private int numberOfCompletedTasks = 0;
	private boolean stopUponFirstTaskCompleted = true;
	private boolean firstTaskCompleted = false;
	
	public ParallelProcessTaskExecuter(RmiParallelProcessTask task, int numberOfIterations, FinishIndicator finishIndicator) {
		super(task, numberOfIterations, finishIndicator);
		//MidisHost.logDebug("Preparing parallel task (ID: " + task.getId() + ") ...");
		//stopUponFirstTaskCompleted = task.getStopUponFirstTaskCompleted();
		//MidisHost.logDebug("Parallel task (ID: " + task.getId() + ") prepared.");	
		
	}
	
	private boolean isAlreadyPrepared = false;
	private int numberOfChildTasks = 0;
	
	protected boolean prepare(final int iteration) {
		// Do the following preparation only once.
		if (isAlreadyPrepared == true) {
			return true;
		}
		
		if (isMyOwnTaskFinished == null) {
			isMyOwnTaskFinished = new boolean[numberOfIterations];
		}
		
		// The first parallel task is not executed on a child process.
		RmiAbstractTask ownRmiTask  = ((RmiParallelProcessTask)task).getTasks().get(0);
		FinishIndicator finishIndicator = new FinishIndicator();
		myOwnTaskExecuter = TaskExecuterFactory.getInstance().convertTask(ownRmiTask, numberOfIterations, finishIndicator);
		myOwnTaskExecuter.addTaskListener(new TaskListener() {
			public void taskCompleted(int taskId, int completedIterations) {
				synchronized (ParallelProcessTaskExecuter.this) {
					numberOfCompletedTasks++;
					isMyOwnTaskFinished[iteration] = true;
					if (stopUponFirstTaskCompleted == true) {
						firstTaskCompleted = true;
					}
					completedNestedTasks.add(taskId);
					ParallelProcessTaskExecuter.this.notify();
					myOwnTaskExecuter.removeTaskListener(this);
				}
			}
		});
		myOwnTaskFinishIndicator = finishIndicator;
		
		
		if (((RmiParallelProcessTask)task).getTasks().size() > 1) {
			// also start further subprocesses to run parallel tasks.
			childProcessTaskIds = new int[((RmiParallelProcessTask)task).getTasks().size()-1];
		}
		for(int i=0; i<((RmiParallelTask)task).getTasks().size(); i++) {
			RmiAbstractTask rmiTask  = ((RmiParallelProcessTask)task).getTasks().get(i);
			if (i==0) {
				// The first parallel task has already been prepared.
				continue;
			} else {
				boolean prepareResult = ChildProcessManager.getInstance().prepareTask(i-1, rmiTask, numberOfIterations);
				if (prepareResult == false) {
					if (DriverLogger.LOGGING) {
						DriverLogger.logError("Failed to prepare child task (ID: " + rmiTask.getId() + ") on child process " + (i-1));
					}
				} else {
					if (DriverLogger.DEBUG) {
						DriverLogger.logDebug("Prepared child task (ID: " + rmiTask.getId() + ") on child process " + (i-1));
					}
				}
				childProcessTaskIds[i-1] = rmiTask.getId();
				numberOfChildTasks++;
			}
		}
		isAlreadyPrepared = true;
		return true;
	}
	
	protected void doWork(final int iteration) {
		numberOfCompletedTasks = 0;
		int totalNumberOfTasks = numberOfChildTasks + 1;
		completedNestedTasks.clear();
		new Thread(new Runnable() {

			@Override
			public void run() {
				myOwnTaskExecuter.runSynchronously(1, true);
			}
			
		}).start();

		// CAUTION: The following (adding the listener) must not be done while preparation!
		// Since all tasks are prepared before executing the first one, several listeners
		// can be added to one child process. If the first child process tasks completes,
		// all other listeners for the child process will also be removed.
		for (int i=0; i<numberOfChildTasks; i++) {
			final int procNumber = i;
			ChildProcessManager.getInstance().addTaskListener(new TaskListener() {

				final int childProcessNumber = procNumber;
				public void taskCompleted(int taskId, int completedIterations) {
					synchronized (ParallelProcessTaskExecuter.this) {
						numberOfCompletedTasks++;
						if (stopUponFirstTaskCompleted == true) {
							firstTaskCompleted = true;
						}
						completedNestedTasks.add(taskId);
						ParallelProcessTaskExecuter.this.notify();
						ChildProcessManager.getInstance().removeTaskListener(this, childProcessNumber);
					}
				}
				
			}, procNumber);
			ChildProcessManager.getInstance().executeTask(childProcessTaskIds[i], i, iteration);
		}
		
		while (numberOfCompletedTasks < totalNumberOfTasks) {
			try {
				if (firstTaskCompleted == true) {
					if (isMyOwnTaskFinished[iteration] == false) {
						// Task running in the own process has not yet finished.
						myOwnTaskFinishIndicator.setFinishSignal(true);
						/*try {
							myOwnTaskExecuters[iteration].signalizeFinish();
							synchronized (myOwnTaskExecuters[iteration]) {
								myOwnTaskExecuters[iteration].notify();
							}
						} catch (IllegalMonitorStateException e) {
						}*/
					} else {
						for (int i=0; i<numberOfChildTasks; i++) {
							if (!completedNestedTasks.contains(childProcessTaskIds[i])) {
								ChildProcessManager.getInstance().finishTask(childProcessTaskIds[i], i);
								break;
							}
						}
					}
				}
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	protected void signalizeFinish() {
		//TODO
	}
	
	@Override
	public void storeResults() {
		TaskResultStorage.getInstance().storeTaskResult(task.getId(), getTaskResult());
		/*for (int i=0; i<myOwnTaskExecuters.length; i++) {
			myOwnTaskExecuter.storeResults();
		}*/
		myOwnTaskExecuter.storeResults();
		
		// Child process results are stored separately. Do nothing more.
	
	}
	
	@Override
	protected void doCleanup() {
		/*for (int i=0; i<myOwnTaskExecuters.length; i++) {
			myOwnTaskExecuters[i].cleanup();
		}*/
		myOwnTaskExecuter.cleanup();
		completedNestedTasks.clear();
		myOwnTaskExecuter = null;
		isMyOwnTaskFinished = null;
	}

}
