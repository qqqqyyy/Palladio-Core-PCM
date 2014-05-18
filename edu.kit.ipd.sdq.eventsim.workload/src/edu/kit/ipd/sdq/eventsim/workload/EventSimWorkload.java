package edu.kit.ipd.sdq.eventsim.workload;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.osgi.service.component.ComponentContext;

import edu.kit.ipd.sdq.simcomp.component.ISimulationMiddleware;
import edu.kit.ipd.sdq.simcomp.component.ISystem;
import edu.kit.ipd.sdq.simcomp.component.IWorkload;
import edu.kit.ipd.sdq.simcomp.event.IEventHandler;
import edu.kit.ipd.sdq.simcomp.event.simulation.SimulationFinalizeEvent;
import edu.kit.ipd.sdq.simcomp.event.simulation.SimulationInitEvent;

/**
 * An EventSim based workload simulation component implementation.
 * 
 * @author Christoph Föhrdes
 */
public class EventSimWorkload implements IWorkload {

	private static final Logger logger = Logger.getLogger(EventSimWorkload.class);

	private ISimulationMiddleware middleware;
	private List<ISystem> systemComponents;
	private EventSimWorkloadModel model;

	private Activator workloadActivator;

	public EventSimWorkload() {
		systemComponents = new ArrayList<ISystem>();
	}

	@Override
	public void generate() {

		if (logger.isDebugEnabled()) {
			logger.debug("Generating Workload");
		}

		// create the event sim model
		model = new EventSimWorkloadModel(this.middleware);

		// launch the event generation
		model.init();
	}

	/**
	 * Cleans up the system simulation component
	 */
	public void finalise() {
		this.model.finalise();
	}

	/**
	 * Registers the event handler which will start the workload generation
	 * process.
	 */
	private void registerEventHandler() {
		this.middleware.registerEventHandler(SimulationInitEvent.EVENT_ID, new IEventHandler<SimulationInitEvent>() {

			@Override
			public void handle(SimulationInitEvent event) {
				EventSimWorkload.this.generate();
			}

		});

		this.middleware.registerEventHandler(SimulationFinalizeEvent.EVENT_ID, new IEventHandler<SimulationFinalizeEvent>() {

			@Override
			public void handle(SimulationFinalizeEvent event) {
				EventSimWorkload.this.finalise();
			}

		});
	}

	public void bindSystemComponent(ISystem system) {
		System.out.println("System bound to Workload");

		this.systemComponents.add(system);
	}

	public void unbindSystemComponent(ISystem system) {
		if (this.systemComponents.contains(system)) {
			this.systemComponents.remove(system);
		}
	}

	public List<ISystem> getSystemComponents() {
		return this.systemComponents;
	}

	/**
	 * Binds a simulation middleware instance to the simulation component.
	 * Called by the declarative service framework.
	 * 
	 * @param middleware
	 */
	public void bindSimulationMiddleware(ISimulationMiddleware middleware) {
		this.middleware = middleware;

		// when the middleware is bound we register for some events
		this.registerEventHandler();
	}

	/**
	 * Unbind a simulation middleware instance from the simulation component
	 * when it is deactivated. Called by the declarative service framework.
	 * 
	 * @param middleware
	 */
	public void unbindSimulationMiddleware(ISimulationMiddleware middleware) {
		if (this.middleware.equals(middleware)) {
			this.middleware = null;
		}
	}

	/**
	 * Declarative service lifecycle method called when the workload simulation
	 * component is activated.
	 * 
	 * @param context
	 */
	public void activate(ComponentContext context) {
		System.out.println("Workload activated");

		this.workloadActivator = Activator.getDefault();
		this.workloadActivator.bindWorkloadComponent(this);
	}

	/**
	 * Declarative service lifecycle method called when the workload simulation
	 * component is deactivated.
	 * 
	 * @param context
	 */
	public void deactivate(ComponentContext context) {
		this.workloadActivator.unbindWorkloadComponent();
		this.workloadActivator = null;
	}
}
