package de.uka.ipd.sdq.simucomframework.usage;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.scheduler.IActiveResource;
import de.uka.ipd.sdq.simucomframework.Context;
import de.uka.ipd.sdq.simucomframework.abstractSimEngine.SimProcess;
import de.uka.ipd.sdq.simucomframework.exceptions.FailureStatistics;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;

/**
 * Implementation of the workload driver interface for open workloads
 * 
 * @author Steffen Becker
 * 
 */
public class OpenWorkload extends SimProcess implements IWorkloadDriver {

	private static final int USER_THRESHOLD = 1000;
	private String interArrivalTime;
	private IUserFactory userFactory;

	private static Logger logger = Logger.getLogger(OpenWorkload.class
			.getName());

	/**
	 * Counter for usage scenario runs.
	 */

	/**
	 * Constructor of the open workload driver
	 * 
	 * @param model
	 *            The simulation model this driver belongs to
	 * @param userFactory
	 *            The factory which is used to bread the users
	 * @param interArrivalTime
	 *            The time to wait between leaving a new user to its fate
	 */
	public OpenWorkload(SimuComModel model, IUserFactory userFactory,
			String interArrivalTime) {
		super(model, "OpenWorkloadUserMaturationChamber");
		this.interArrivalTime = interArrivalTime;
		this.userFactory = userFactory;
	}

	public void run() {
		this.scheduleAt(0);
	}

	@Override
	protected void internalLifeCycle() {
		FailureStatistics.getInstance().reset();

		// As long as the simulation is running, new OpenWorkloadUsers are
		// generated and started:
		while (getModel().getSimulationControl().isRunning()) {

			// Count the new user:
			if (this.getModel().getConfig().getSimulateFailures()) {
				FailureStatistics.getInstance().increaseRunCount();
				// FailureStatistics.getInstance().printRunCount(logger);
			}

			// Generate and execute the new user:
			generateUser();

			// Wait for inter-arrival time:
			waitForNextUser();

			// Check the current number of users:
			if (Thread.activeCount() > USER_THRESHOLD) {
				logger
						.error("Too many users spawned! Check your workload settings!");
				throw new RuntimeException("Too many users spawned");
			}
		}

		// Print failure statistics:
		if (this.getModel().getConfig().getSimulateFailures()) {
			FailureStatistics.getInstance().printFailureStatistics(logger);
		}
	}

	private void waitForNextUser() {
		double interArrivalTimeSample = (Double) Context.evaluateStatic(
				interArrivalTime, Double.class);
		logger.debug("Waiting for " + interArrivalTimeSample
				+ " before spawing the next user");
		this.hold(interArrivalTimeSample);
	}

	private IUser generateUser() {
		logger.debug("Spawning New User...");
		IUser user = userFactory.createUser();
		user.startUserLife();
		return user;
	}

}