package de.uka.ipd.sdq.measurements.driver.common.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import de.uka.ipd.sdq.measurements.rmi.tasks.RmiAbstractTask;
import de.uka.ipd.sdq.measurements.rmi.tasks.RmiParallelTask;

public class ParallelTaskExecuter extends AbstractTaskExecuter {

	private List<AbstractTaskExecuter> taskExecuters = null;
	private List<FinishIndicator> finishIndicators = null;
	private List<Integer> completedNestedTasks = new ArrayList<Integer>();

	private int numberOfCompletedTasks = 0;
	private boolean stopUponFirstTaskCompleted = true;
	private boolean firstTaskCompleted = false;

	public ParallelTaskExecuter(RmiParallelTask task, int numberOfIterations, FinishIndicator finishIndicator) {
		super(task, numberOfIterations, finishIndicator);
		// MidisHost.logDebug("Preparing parallel task (ID: " + task.getId() +
		// ") ...");
		// stopUponFirstTaskCompleted = task.getStopUponFirstTaskCompleted();
		stopUponFirstTaskCompleted = true;
		// MidisHost.logDebug("Parallel task (ID: " + task.getId() +
		// ") prepared.");

	}
	
	private boolean prepared = false;

	protected boolean prepare(int iteration) {
		if (prepared) {
			return true;
		}
		if (taskExecuters == null) {
			//taskExecuters = new List[numberOfIterations];
			taskExecuters = new ArrayList<AbstractTaskExecuter>();
		}
		if (finishIndicators == null) {
			finishIndicators = new ArrayList<FinishIndicator>();
		}
		for (int i=0; i < ((RmiParallelTask) task).getTasks().size(); i++) {
			RmiAbstractTask rmiTask = ((RmiParallelTask) task).getTasks().get(i);
			FinishIndicator nestedFinishIndicator = new FinishIndicator();
			AbstractTaskExecuter taskExecuter = TaskExecuterFactory.getInstance().convertTask(rmiTask, numberOfIterations, nestedFinishIndicator);
			taskExecuter.addTaskListener(new TaskListener() {
				public void taskCompleted(int taskId, int completedIterations) {
					synchronized (ParallelTaskExecuter.this) {
						numberOfCompletedTasks++;
						if (stopUponFirstTaskCompleted == true) {
							firstTaskCompleted = true;
						}
						completedNestedTasks.add(taskId);
						ParallelTaskExecuter.this.notify();
					}
				}
			});
			finishIndicators.add(nestedFinishIndicator);
			taskExecuters.add(taskExecuter);
		}
		prepared = true;
		return true;
	}

	protected void doWork(int iteration) {
		numberOfCompletedTasks = 0;
		completedNestedTasks.clear();
		Iterator<AbstractTaskExecuter> taskIterator = taskExecuters.iterator();
		while (taskIterator.hasNext()) {
			final AbstractTaskExecuter taskExecuter = taskIterator.next();
			new Thread(new Runnable() {

				@Override
				public void run() {
					taskExecuter.runSynchronously(1, true);
				}
				
			}).start();
			//new Thread(taskExecuter).start();
		}
		while (numberOfCompletedTasks < taskExecuters.size()) {
			try {
				if (firstTaskCompleted == true) {
					for (int i=0; i<taskExecuters.size(); i++) {
						AbstractTaskExecuter taskExecuter = taskExecuters.get(i);
						if (!completedNestedTasks.contains(taskExecuter.getTask().getId())) {
							finishIndicators.get(i).setFinishSignal(true);
							break;
						}
					}
					/*while (taskIterator2.hasNext()) {
						AbstractTaskExecuter taskExecuter = taskIterator2.next();
						if (!completedNestedTasks.contains(taskExecuter.getTask().getId())) {
							/*try {
								synchronized (taskExecuter) {
									taskExecuter.signalizeFinish();
									taskExecuter.notify();
								}
							} catch (IllegalMonitorStateException e) {
							}
							
							break;
						}
					}*/
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
		for (FinishIndicator finishIndicator : finishIndicators) {
			finishIndicator.setFinishSignal(true);
		}
		finishSignal = true;
		/*if (currentRunningNestedExecuter != null) {
			currentRunningNestedExecuter.signalizeFinish();
		}*/
	}

	@Override
	public void storeResults() {
		TaskResultStorage.getInstance().storeTaskResult(task.getId(), getTaskResult());
		for (int i = 0; i < ((RmiParallelTask) task).getTasks().size(); i++) {
			/*for (int j = 0; j < numberOfIterations; j++) {
				taskExecuters[j].get(i).storeResults();
			}*/
			taskExecuters.get(i).storeResults();
		}
	}

	@Override
	protected void doCleanup() {
		if (taskExecuters != null) {
			//for (int i = 0; i < taskExecuters.length; i++) {
				for (AbstractTaskExecuter executer : taskExecuters) {
					executer.cleanup();
				}
			//}
			taskExecuters = null;
		}
	}

}
