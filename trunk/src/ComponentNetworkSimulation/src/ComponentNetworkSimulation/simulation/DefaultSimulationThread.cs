using System;
using System.Collections;
using ComponentNetworkSimulation.Structure;

//TODO: logging
namespace ComponentNetworkSimulation.Simulation
{
	#region declarations
		
	/// <summary>
	/// the declaration of the threadtype specifying the logging behavior of this thread.
	/// </summary>
	public enum SimulationThreadType {TYPE_LOG_ALL,TYPE_LOG_ON_LPS,TYPE_LOG_NOTHING};

	/// <summary>
	/// The declaration of the eventhandler for all thread events.
	/// </summary>	
	public delegate void NextTCEventHandler(object sender,NextTCEventArgs eventArgs);

	#endregion declarations

	/// <summary>
	/// This class implements the simulation thread which is representing one request to the component network.
	/// </summary>
	public class DefaultSimulationThread : ISimulationThread
	{	
		#region events

		/// <summary>
		/// This event is fired, if the TimeConsumer has changed to next one
		/// </summary>
		public event NextTCEventHandler NextTCEvent;

		#endregion events

		#region data
		
		/// <summary>
		/// the id of the thread
		/// </summary>
		protected int threadId;

		/// <summary>
		/// this time contains the difference between the simulation time and the threads current state time.
		/// If this field is zero, the next TimeConsumer is entered.
		/// </summary>
		protected long timeInFuture=0;

		/// <summary>
		/// holds the type of the thread
		/// </summary>
		protected SimulationThreadType type = SimulationThreadType.TYPE_LOG_ON_LPS;

		/// <summary>
		/// this field hold an implemented observer if set
		/// </summary>
		protected IThreadObserver observer;

		/// <summary>
		/// this field holds the stack of timeconsumers. 
		/// </summary>
		protected Stack timeConsumerStack = new Stack();

		#endregion data

		#region constructor

		/// <summary>
		/// constructs a new simulationthread.
		/// </summary>
		/// <param name="id">The id of the thread.</param>
		/// <param name="firstTimeConsumer">The first TimeConsumer.</param>
		/// <param name="type">The type of the thread.</param>
		public DefaultSimulationThread(int id, ITimeConsumer firstTimeConsumer, SimulationThreadType type)
		{
			this.threadId = id;
			this.timeConsumerStack.Push(firstTimeConsumer);
			this.timeInFuture = firstTimeConsumer.ThreadEntered();
			this.type = type;
		}

		/// <summary>
		/// constructs a new simulationthread.
		/// </summary>
		/// <param name="id">The id of the thread.</param>
		/// <param name="firstTimeConsumer">The first TimeConsumer.</param>
		/// <param name="type">The type of the thread.</param>
		public DefaultSimulationThread(int id, ITimeConsumer firstTimeConsumer, SimulationThreadType type,
			IThreadObserver observer)
		{
			this.threadId = id;
			this.timeConsumerStack.Push(firstTimeConsumer);
			this.timeInFuture = firstTimeConsumer.ThreadEntered();
			this.type = type;
			this.observer = observer;
		}

		#endregion constructor

		#region properties
		/// <summary>
		/// the current TimeConsumer
		/// </summary>
		public ITimeConsumer CurrentTimeConsumer 
		{
			get
			{
				try 
				{
					return (ITimeConsumer)timeConsumerStack.Peek();
				}
				catch
				{
					return null;
				}
			}
		}

		/// <summary>
		/// this time contains the difference between the simulation time and the threads current state time.
		/// </summary>
		public virtual long TimeInFuture 
		{
			get{ return timeInFuture;}
		}

		/// <summary>
		/// is true, if the thread already has following TimeConsumers 
		/// </summary>
		public virtual bool IsAlive 
		{
			get {return this.HasAnyTimeConsumer();}
		}

		/// <summary>
		/// the id of the thread
		/// </summary>
		public int ThreadID
		{
			get {return threadId;}
		}

		/// <summary>
		/// returns the thread type
		/// </summary>
		public SimulationThreadType TheType
		{
			get {return this.type;}
		}

		#endregion properties

		#region methods

		/// <summary>
		/// called to move the timeline.
		/// </summary>
		/// <param name="time">The timestep to be moved.</param>
		public virtual void TimeMoved(long time) 
		{
			if (!HasAnyTimeConsumer()) return;
			
			timeInFuture -= time;
			NotifyTimeStepEvent(time);
			if (timeInFuture <= 0) NextTimeConsumer();
		}

		/// <summary>
		/// called if timeToFuture is zero to change to the next TimeConsumer.
		/// if the end of the control flow is reached, a thread event is fired and the thread is marked as dead.
		/// </summary>
		protected void NextTimeConsumer()
		{
			if (!HasAnyTimeConsumer()) return;

			ITimeConsumer previousTimeConsumer;

			if (CurrentTimeConsumer.HasNextTimeConsumer) 
			{
				previousTimeConsumer = CurrentTimeConsumer;
				previousTimeConsumer.ThreadExited();
				timeConsumerStack.Push(previousTimeConsumer.NextTimeConsumer);
			}				
			else
				previousTimeConsumer = BackToSubCaller();

			if (timeConsumerStack.Count == 0)
			{
				NotifyThreadReachedEndEvent();
				return;
			}

			timeInFuture = CurrentTimeConsumer.ThreadEntered();

			NotifyNextTCEvent(previousTimeConsumer);
		}

		/// <summary>
		/// call to remove all timeconsumer until reaching a SubCallingTimeConsumer or the stack is empty.
		/// If a SubCallingTimeConsumer is reached, its following TimeConsumer is pushed to stack. 
		/// </summary>
		/// <returns>
		/// returns the timeconsumer that finished the subcall
		/// </returns>
		private ITimeConsumer BackToSubCaller()
		{
			ITimeConsumer previousTC = (ITimeConsumer)timeConsumerStack.Peek();
			do
			{
				ITimeConsumer current = (ITimeConsumer)timeConsumerStack.Pop();
				if (current is ISubCallingTimeConsumer)
				{
					ITimeConsumer nextTC = ((ISubCallingTimeConsumer)current).NextTimeConsumerAfterReturn;
					if (nextTC != null) 
					{
						timeConsumerStack.Push(nextTC);
						return previousTC;
					}
				}
			}
			while(timeConsumerStack.Count != 0);

			return previousTC;
		}

		/// <summary>
		/// returns true, if any TimeConsumer is set to currentTimeConsumer
		/// </summary>
		/// <returns>true, if the thread is alive.</returns>
		protected bool HasAnyTimeConsumer()
		{
			return timeConsumerStack.Count != 0;
		}

		/// <summary>
		/// called to fire an event, when the thread changed the TimeConsumer
		/// </summary>
		/// <param name="previous">the previous TimeConsumer</param>
		protected virtual void NotifyNextTCEvent(ITimeConsumer previous)
		{
			if (NextTCEvent != null)
				NextTCEvent(this,new NextTCEventArgs(this.CurrentTimeConsumer,previous));

			if (observer != null)
				observer.NotifyThreadChangedTimeConsumer(this,previous);
		}

		/// <summary>
		/// called to notify the observer that the thread reached the end of its control flow
		/// </summary>
		protected virtual void NotifyThreadReachedEndEvent()
		{
			if (observer != null)
				observer.NotifyThreadReachedEnd(this);
		}

		/// <summary>
		/// called to notify the observer that the thread moves one timestep
		/// </summary>
		/// <param name="timeStep"></param>
		protected virtual void NotifyTimeStepEvent(long timeStep)
		{
			if (observer != null)
				observer.NotifyTimeStep(this,timeStep);
		}

		#endregion methods
	}
}
//EOF