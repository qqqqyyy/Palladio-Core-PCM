using System;

using ComponentNetworkSimulation.Analysis;
using ComponentNetworkSimulation.Structure;

namespace ComponentNetworkSimulation.Simulation
{
	/// <summary>
	/// Handles the events fired when threads are created or destroyed.
	/// </summary>	
	public delegate void ThreadLifeCycleEventHandler(object sender,ThreadLifeCycleEventArgs eventArgs);

	/// <summary>
	/// This interface defines all methods and events provided by the threadscheduler of the simulation
	/// </summary>
	public interface IThreadScheduler
	{
		#region events
		
		/// <summary>
		/// This event is fired, if one of the threads changes its current TimeConsumer.
		/// </summary>
		event NextTCEventHandler NextTCEvent;

		/// <summary>
		/// This event is fired, if a new thread was created.
		/// </summary>
		event ThreadLifeCycleEventHandler ThreadCreatedEvent;

		/// <summary>
		/// This event is fired, if a thread is destroyed.
		/// </summary>
		event ThreadLifeCycleEventHandler ThreadDestroyedEvent;

		/// <summary>
		/// This event is fired, if no more threads are alive
		/// </summary>
		event EventHandler NoMoreThreadsAliveEvent;

		/// <summary>
		/// this event is fired, if a thread wants to log something
		/// </summary>
		event LogEventHandler ThreadLogEvent;

		#endregion events

		#region properties

		/// <summary>
		/// true, if any thread is alive 
		/// </summary>
		bool IsAnyThreadAlive
		{
			get;
		}

		#endregion

		#region methods

		/// <summary>
		/// call to create a new SimulationThread.
		/// </summary>
		/// <param name="firstTimeConsumer">The first TimeConsumer of this thread.</param>
		/// <param name="type">The logging type of this thread.</param>
		void CreateSimulationThread(ITimeConsumer firstTimeConsumer, SimulationThreadType type);

		/// <summary>
		/// call to create a new SimulationThread observed by the given observer.
		/// </summary>
		/// <param name="firstTimeConsumer">The first TimeConsumer of this thread.</param>
		/// <param name="type">The logging type of this thread.</param>
		/// <param name="observer">the observer</param>
		void CreateSimulationThread(ITimeConsumer firstTimeConsumer, SimulationThreadType type, 
			IThreadObserver observer);

		/// <summary>
		/// call to create a new periodic SimulationThread.
		/// </summary>
		/// <param name="firstTimeConsumer">The first TimeConsumer of this thread.</param>
		/// <param name="type">The logging type of this thread.</param>
		void CreateSimulationThread(ITimeConsumer firstTimeConsumer, SimulationThreadType type, long periodTime);

		/// <summary>
		/// call to create a new periodic SimulationThread observed by the given observer.
		/// </summary>
		/// <param name="firstTimeConsumer">The first TimeConsumer of this thread.</param>
		/// <param name="type">The logging type of this thread.</param>
		/// <param name="periodTime">reached the thread this time, a new thread is created.</param>
		/// <param name="observer">the oberserver</param>
		void CreateSimulationThread(ITimeConsumer firstTimeConsumer,SimulationThreadType type,
			long periodTime, IThreadObserver observer);

		/// <summary>
		/// call to add a simulationthread to the scheduler, created by any extern method.
		/// </summary>
		/// <param name="simulationThread">The simulationthread</param>
		void AddSimulationThread(ISimulationThread simulationThread);

		/// <summary>
		/// call to reset the scheduler. 
		/// </summary>
		void Reset();

		/// <summary>
		/// call to move the timeline in the scheduler.
		/// </summary>
		/// <param name="maxTimeStep">the maximum timestep</param>
		/// <returns>the realy done time step</returns>
		long SimulationStep(long maxTimeStep);


		#endregion
		
	}
}
