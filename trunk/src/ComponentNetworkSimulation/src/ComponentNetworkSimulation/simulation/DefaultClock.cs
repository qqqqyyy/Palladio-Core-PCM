using System;
using System.Collections;

using ComponentNetworkSimulation;
using ComponentNetworkSimulation.Structure;
using ComponentNetworkSimulation.Analysis;

namespace ComponentNetworkSimulation.Simulation
{
	/// <summary>
	/// This class represents the clock of the simulation environment. It contains an absolute time counter of simulation time
	/// to syncronize the simulation. The simulation time, if not set, is limitet to long.MaxValue.
	/// Clock also contains an instance of ThreadScheduler, which manages the simulationthreads.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// $Log$
	/// Revision 1.6  2004/05/26 16:29:54  joemal
	/// add cvs log tag
	///
	/// 
	/// </pre>
	/// </remarks>	
	public class DefaultClock : IClock
	{		
		#region events

		/// <summary>
		/// This event is fired, when the timeline of the clock moves a step. The arguments of this events contains
		/// the step length and the new absolute time.
		/// </summary>
		public event TimeStepEventHandler TimeStepEvent;

		/// <summary>
		/// This event is fired, when the maximum simulation time s reached
		/// </summary>
		public event EventHandler MaxTimeReachedEvent;

		/// <summary>
		/// This event is fired, when the clock was reseted.
		/// </summary>
		public event EventHandler ClockResetEvent;

		/// <summary>
		/// This event is fired, when the clock wants something to be logged by the datapool
		/// </summary>
		public event LogEventHandler ClockLogEvent;

		#endregion

		#region data

		/// <summary>
		/// holds the maxium simulation time. By default, it is set to long.MaxValue.
		/// </summary>
		protected long maxSimulationTime = long.MaxValue;

		/// <summary>
		/// holds the current absolute simulation time.
		/// </summary>
		private long currentTime = 0;

		/// <summary>
		/// after this time, the next TimeStepEvent with cause CLOCK_STOP_EVENT has fired
		/// </summary>
		private long clockStopEventTime = long.MaxValue;

		/// <summary>
		/// holds an reference to the simulation environment
		/// </summary>
		protected ISimulationEnvironment simulationEnvironment = null;

		/// <summary>
		/// holds the instance of the threadscheduler
		/// </summary>
		private IThreadScheduler scheduler = null;

		#endregion

		#region constructors

		/// <summary>
		/// constructs a new Clock used by given simulation environment. The maximum simulation time is set to long.MaxValue.
		/// </summary>
		/// <param name="simulationEnvironment">the simulation environment</param>
		public DefaultClock(ISimulationEnvironment simulationEnvironment) : this(simulationEnvironment,long.MaxValue)
		{
		}

		/// <summary>
		/// constructs a new Clock used by given simulation environment. The maximum simulation time is set to 
		/// given value.
		/// </summary>
		/// <param name="simulationEnvironment">the simulation environment</param>
		/// <param name="maxSimulationTime">the maximum simulation time</param>
		public DefaultClock(ISimulationEnvironment simulationEnvironment, long maxSimulationTime) 
		{
			this.maxSimulationTime = maxSimulationTime;
			this.simulationEnvironment = simulationEnvironment;
			this.scheduler = this.CreateScheduler();
			this.scheduler.NoMoreThreadsAliveEvent += new EventHandler(this.OnNoMoreThreadsAliveEvent);
		}

		#endregion

		#region Properties

		/// <summary>
		/// This property sets and returns the maximum simulation time.
		/// </summary>
		public long MaximumSimulationTime 
		{
			get { return this.maxSimulationTime;}
			set 
			{
				if (value < 0)
					this.maxSimulationTime = long.MaxValue;
				else
					this.maxSimulationTime = value;
			}
		}

		/// <summary>
		/// return the instance of the Thread Scheduler
		/// </summary>
		public IThreadScheduler ThreadScheduler
		{
			get {return this.scheduler;}
		}

		/// <summary>
		/// return the current absolute simulation time
		/// </summary>
		public long CurrentTime
		{
			get {return this.currentTime;}
		}

		/// <summary>
		/// returns true, if the maximum simulation time is reached 
		/// </summary>
		public bool IsMaxTimeReached 
		{
			get {return currentTime >= maxSimulationTime;}
		}

		/// <summary>
		/// returns true, if any next step is possible at calling time
		/// </summary>
		public virtual bool HasNextStep
		{
			get
			{
				return !IsMaxTimeReached && (scheduler.IsAnyThreadAlive || this.clockStopEventTime != long.MaxValue);
			}
		}

		#endregion

		#region methods

		/// <summary>
		/// this method is called by the constructor to create an instance of the ThreadScheduler 
		/// </summary>
		protected virtual IThreadScheduler CreateScheduler()
		{
			return new DefaultThreadScheduler(this.simulationEnvironment);
		}

		/// <summary>
		/// call to simulate one step
		/// </summary>
		/// <returns>returns false, if the simulation reached its end because of reaching the maximum simulation time
		/// or there are no more thread alive.</returns>
		public bool SimulationStep() 
		{

			if (!this.HasNextStep) return false;

			int cause = TimeStepEventArgs.THREAD_REACHED_TIME_IN_FUTURE;
			long nextStep = long.MaxValue;

			if (scheduler.IsAnyThreadAlive)	nextStep = scheduler.CalculateNextTimeStep();

			if (currentTime + nextStep > maxSimulationTime) 
			{
				nextStep = maxSimulationTime-currentTime;
				cause = TimeStepEventArgs.MAX_TIME_REACHED;
			}

			if (this.clockStopEventTime != long.MaxValue) 
			{
				if (nextStep >= this.clockStopEventTime)
				{
					if (nextStep > this.clockStopEventTime)
						cause = TimeStepEventArgs.CLOCK_STOP_EVENT;
					else
						cause += TimeStepEventArgs.CLOCK_STOP_EVENT;

					nextStep = this.clockStopEventTime;
					this.clockStopEventTime = long.MaxValue;				
				}
				else
				{
					this.clockStopEventTime -= nextStep;
				}
			}

			currentTime += nextStep;
			NotifyTimeStepEvent(nextStep,cause);

			scheduler.SimulationStep(nextStep);

			if (currentTime == maxSimulationTime) NotifyMaxTimeReachedEvent();

			return HasNextStep;
		}

		/// <summary>
		/// call to set the time, after which the simulation has to fire a TimeStepEvent with cause CLOCK_STOP_EVENT.
		/// The clock might finish other steps before.
		/// </summary>
		/// <param name="time">the time, after which a TimeStepEvent has to be fired</param>
		public void SetClockStopEventTime(long time)
		{
			this.clockStopEventTime  = time;
		}

		/// <summary>
		/// call to reset the clock. All Threads in the ThreadScheduler are reseted and the simulationtime is set to zero.
		/// </summary>
		public void Reset() 
		{
			currentTime = 0;
			scheduler.Reset();
			NotifyClockResetEvent();
		}

		/// <summary>
		/// called, when the current time moved, to fire an event.
		/// </summary>
		/// <param name="timeStep">The timestep, the time moved</param>
		protected virtual void NotifyTimeStepEvent(long timeStep, int cause)
		{
            if (TimeStepEvent != null)
				TimeStepEvent(this,new TimeStepEventArgs(timeStep,this.currentTime,cause));
			
			NotifyClockLogEvent("Clock does a timestep with length "+timeStep,
				ClockLogEventArgs.EventType.CLOCK_STEP,timeStep);
		}

		/// <summary>
		/// called, when the maximum time is reached, in order to fire an event
		/// </summary>
		protected virtual void NotifyMaxTimeReachedEvent()
		{
			if (MaxTimeReachedEvent != null)
				MaxTimeReachedEvent(this,EventArgs.Empty);

			NotifyClockLogEvent("Simulation ended. Clock reached maximum simulation time.",
				ClockLogEventArgs.EventType.CLOCK_REACHED_MAXTIME,0);
		}

		/// <summary>
		/// called, when the clock was reseted, in order to fire an event.
		/// </summary>
		protected virtual void NotifyClockResetEvent()
		{
			if (ClockResetEvent != null)
				ClockResetEvent(this,EventArgs.Empty);

			NotifyClockLogEvent("Clock reseted.",ClockLogEventArgs.EventType.CLOCK_RESET,0);
		}

		/// <summary>
		/// called, when the clock wants the datapool to log something
		/// </summary>
		protected virtual void NotifyClockLogEvent(String message, ClockLogEventArgs.EventType type, long timeStep)
		{
			if (ClockLogEvent != null)
				ClockLogEvent(this,new ClockLogEventArgs(message,this,type,timeStep));
		}

		/// <summary>
		/// called by the scheduler, when no more threads are alive.
		/// </summary>
		/// <param name="sender">the scheduler</param>
		/// <param name="args">the eventargs</param>
		private void OnNoMoreThreadsAliveEvent(object sender,EventArgs args)
		{
			NotifyClockLogEvent("Simulation ended. There are no more threads alive.",
				ClockLogEventArgs.EventType.CLOCK_NO_MORE_THREADS,0);
		}

		#endregion
	}
}
//EOF