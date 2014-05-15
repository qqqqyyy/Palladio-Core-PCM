package edu.kit.ipd.sdq.eventsim.workload;

import java.util.List;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.probfunction.math.IProbabilityFunctionFactory;
import de.uka.ipd.sdq.probfunction.math.impl.ProbabilityFunctionFactoryImpl;
import de.uka.ipd.sdq.simucomframework.variables.cache.StoExCache;
import edu.kit.ipd.sdq.eventsim.AbstractEventSimModel;
import edu.kit.ipd.sdq.eventsim.entities.EventSimEntity;
import edu.kit.ipd.sdq.eventsim.entities.User;
import edu.kit.ipd.sdq.eventsim.workload.command.parameter.InstallSystemCallParameterHandling;
import edu.kit.ipd.sdq.eventsim.workload.debug.DebugUsageTraversalListener;
import edu.kit.ipd.sdq.eventsim.workload.events.ResumeUsageTraversalEvent;
import edu.kit.ipd.sdq.eventsim.workload.generator.BuildWorkloadGenerator;
import edu.kit.ipd.sdq.eventsim.workload.generator.IWorkloadGenerator;
import edu.kit.ipd.sdq.eventsim.workload.interpreter.usage.UsageBehaviourInterpreter;
import edu.kit.ipd.sdq.eventsim.workload.interpreter.usage.UsageInterpreterConfiguration;
import edu.kit.ipd.sdq.eventsim.workload.probespec.commands.BuildUsageResponseTimeCalculators;
import edu.kit.ipd.sdq.eventsim.workload.probespec.commands.MountSystemCallProbes;
import edu.kit.ipd.sdq.eventsim.workload.probespec.commands.MountUsageScenarioProbes;
import edu.kit.ipd.sdq.simcomp.component.IRequest;
import edu.kit.ipd.sdq.simcomp.component.ISimulationMiddleware;
import edu.kit.ipd.sdq.simcomp.event.IEventHandler;
import edu.kit.ipd.sdq.simcomp.event.system.SystemRequestProcessed;

/**
 * The EventSim workload simulation model. This is the central class of the workload simulation.
 * 
 * run. Before the simulation starts, it initialises the simulation in the
 * {@code init()} method. During the simulation, it provides information about
 * the PCM model that is to be simulated, the simulation configuration and the
 * simulation status. Finally, it cleans up after a simulation run in the
 * {finalise()} method.
 * 
 * @author Philipp Merkle
 * @author Christoph Föhrdes
 * 
 */
public class EventSimWorkloadModel extends AbstractEventSimModel {

	private static final Logger logger = Logger.getLogger(EventSimWorkloadModel.class);

	private ISimulationMiddleware middleware;
	
	private UsageBehaviourInterpreter usageInterpreter;

	public EventSimWorkloadModel(ISimulationMiddleware middleware) {
		super(middleware);
		this.middleware = middleware;
	}

	/**
	 * This method prepares the EventSim workload simulator and creates the
	 * initial events to start the workload generation.
	 */
	public void init() {

		// initialise behaviour interpreters
		usageInterpreter = new UsageBehaviourInterpreter(new UsageInterpreterConfiguration());

		// initialise probfunction factory and random generator
		IProbabilityFunctionFactory probFunctionFactory = ProbabilityFunctionFactoryImpl.getInstance();
		probFunctionFactory.setRandomGenerator(this.getEventSimConfig().getRandomGenerator());
		StoExCache.initialiseStoExCache(probFunctionFactory);

		// install debug traversal listeners, if debugging is enabled
		if (logger.isDebugEnabled()) {
			DebugUsageTraversalListener.install(this.usageInterpreter.getConfiguration());
		}

		// setup handling for PCM parameter characterisations
		this.execute(new InstallSystemCallParameterHandling(this.usageInterpreter.getConfiguration()));

		this.initProbeSpecification();

		this.registerEventHandler();

		// ...and start the simulation by generating the workload
		final List<IWorkloadGenerator> workloadGenerators = this.execute(new BuildWorkloadGenerator(this));
		for (final IWorkloadGenerator d : workloadGenerators) {
			d.processWorkload();
		}
	}

	/**
	 * Register event handler to react on specific simulation events.
	 */
	private void registerEventHandler() {

		// setup system processed request event listener
		this.middleware.registerEventHandler(SystemRequestProcessed.EVENT_ID, new IEventHandler<SystemRequestProcessed>() {

			@Override
			public void handle(SystemRequestProcessed simulationEvent) {
				// resume usage traversal after system finished processing
				IRequest request = simulationEvent.getRequest();
				User user = (User) request.getUser();

                new ResumeUsageTraversalEvent(EventSimWorkloadModel.this, user.getUserState()).schedule((User) request.getUser(), 0);
			}

		});

	}

	/**
	 * Initializes the Probe Specification by setting up the calculators and mounting the probes.
	 */
	private void initProbeSpecification() {

		// build calculators
		this.execute(new BuildUsageResponseTimeCalculators(this));

		// mount probes
		this.execute(new MountUsageScenarioProbes(this.usageInterpreter.getConfiguration(), this.middleware));
		this.execute(new MountSystemCallProbes(this.usageInterpreter.getConfiguration(), this.middleware));
	}

	@Override
	public void finalise() {
		super.finalise();

		EventSimEntity.resetIdGenerator();
	}

	/**
	 * Gives access to the usage behavior interpreter
	 * 
	 * @return A usage behavior interpreter
	 */
	public UsageBehaviourInterpreter getUsageInterpreter() {
		return usageInterpreter;
	}

	/**
	 * Gives access to the current simulation middleware instance.
	 * 
	 * @return A simulation middleware instance
	 */
	public ISimulationMiddleware getSimulationMiddleware() {
		return this.middleware;
	}

}