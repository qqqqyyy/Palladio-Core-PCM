using System;
using System.Collections;
using Utils.Collections;

namespace FiniteStateMachines.Decorators
{
	/// <summary>
	/// Generates a FiniteCrossProduktMaschine. A FiniteCrossProduktMaschine (FSP) is a 
	/// specialization of a normal FSM. The FiniteCrossProduktMaschine is generated from
	/// two FSMs(A,B). And it only contains Transitions and the Inputs which is in both
	/// given FSMs. Its the intersection of two FSMs in the representation of new 
	/// FiniteTabularMachine.
	/// </summary>
	public class FiniteCrossProduktMaschine 
	{

		/// <summary>
		/// A new FiniteTabularMachine which represents the result of the intersection of 
		/// two FSMs. (The generated FiniteCrossProduktMaschine)
		/// </summary>
		protected FiniteTabularMachine cp;

		/// <summary>
		/// The intersection of the two Input alpabets from the given FSMs stored in a 
		/// <code>Set</code>
		/// </summary>
		protected Set CPInput;

		/// <summary>
		/// A <code>Stack</code> in which the States of the first FSM are stored.
		/// </summary>
		protected Stack oneStates;

		/// <summary>
		/// A <code>Stack</code> in which the States of the second FSM are stored.
		/// </summary>
		protected Stack twoStates;

		/// <summary>
		/// for debugging.
		/// </summary>
		protected bool debug  = !true;


		/// <summary>
		/// Initaites a empty FiniteCrossProduktMaschine
		/// </summary>
		public FiniteCrossProduktMaschine() 
		{
		}


		/// <summary>
		/// Initiates a FiniteCrossProduktMaschine and generates the crossprodukt of the two given 
		/// FiniteTabularMaschines
		/// </summary>
		/// <param name="one">the first FSM</param>
		/// <param name="two">the other FSM, together with one they are used to
		/// create the crossprodukt></param>
		public FiniteCrossProduktMaschine(FiniteTabularMachine aFSM, FiniteTabularMachine anotherFSM) 
		{
			this.cp = GenerateCP(aFSM,anotherFSM);
		}


		/// <summary>
		/// Returns the new generated <code>FiniteTabularMachine</code> which contains
		/// the crossproduct.
		/// </summary>
		public FiniteTabularMachine CP
		{
			get
			{
				return this.cp;
			}
		}


		/// <summary>
		/// Cenerates the crossproduct from two given FSMs
		/// </summary>
		/// <param name="one">the first FSM</param>
		/// <param name="two">the second FSM</param>
		/// <returns>the cp of the two FSM</returns>
		public FiniteTabularMachine GenerateCP(FiniteTabularMachine aFSM, FiniteTabularMachine anotherFSM) 
		{
			this.cp = new FiniteTabularMachine();
			this.oneStates = new Stack();
			this.twoStates = new Stack();
			GenerateCrossProductInput(aFSM,anotherFSM);
			if(this.debug) 
			{
				Console.WriteLine("CP Input: ");
				this.PrintInput();
			}
			DualState StartState = new DualState(aFSM.StartState,anotherFSM.StartState);
			this.oneStates.Push(aFSM.StartState);
			this.twoStates.Push(anotherFSM.StartState);
			while(this.oneStates.Count!= 0 && this.twoStates.Count!=0) 
			{

				AbstractState oneBefore = (AbstractState) this.oneStates.Pop();
				AbstractState twoBefore = (AbstractState) this.twoStates.Pop();

				foreach(Input i in this.CPInput) 
				{


					AbstractState oneNext = aFSM.GetNextState(oneBefore,i);
					if(this.debug)
						Console.WriteLine("oneNext is: "+oneNext.ToString());


					AbstractState twoNext = anotherFSM.GetNextState(twoBefore,i);
					if(this.debug)
						Console.WriteLine("twoNext is: "+twoNext.ToString());
					
					if(LoopChecking(aFSM,oneBefore,i)&& LoopChecking(anotherFSM,twoBefore,i)&&
						!oneNext.Equals(aFSM.ErrorState) && !twoNext.Equals(anotherFSM.ErrorState)) 
					{
						DualState selfPointingState = new DualState(oneNext,twoNext);
						this.cp.addTransition(selfPointingState,i,selfPointingState);
						this.oneStates.Pop();
						this.twoStates.Pop();
						continue;
					}
					if(!oneNext.Equals(aFSM.ErrorState)&&
						!twoNext.Equals(anotherFSM.ErrorState)) 
					{

						DualState fromState = new DualState(oneBefore, twoBefore);
						if(this.debug)
							Console.WriteLine("CPState fromState: "+fromState.ToString());
						DualState toState = new DualState(oneNext,twoNext);
						if(this.debug)
							Console.WriteLine("CPState toState is: "+toState.ToString());
						this.cp.addTransition(fromState,i,toState);
						this.oneStates.Push(oneNext);
						this.twoStates.Push(twoNext);
						if(this.debug) 
						{
							Console.WriteLine("I put one oneStates: "+oneNext.ToString());
							Console.WriteLine("I put on twoStates: "+twoNext.ToString());
						}
					}
					else 
					{}
				}

			}
			return this.cp;
		}


		/// <summary>
		/// Checks if the given state with given input leads to the given state
		/// (loop checking)
		/// </summary>
		/// <param name="fsm">A FSM which state and input should be checked</param>
		/// <param name="state">the state which should be checked</param>
		/// <param name="i">the inpt </param>
		/// <returns>true if it is selfpointing, false if not</returns>
		protected bool LoopChecking(FiniteTabularMachine fsm, AbstractState state, Input i) 
		{
//			return state == fsm.GetNextState(state,i);
			AbstractState temp = null;
			foreach(AbstractState s in fsm.States) 
			{
				if(s.Equals(state)) 
				{
					temp = s;
					break;
				}
			}

			AbstractState t = fsm.GetNextState(temp,i);
			if (t.Equals(state))
				return true;
			return false;
		}


		/// <summary>
		/// Generates the cross input of two FSMs and stores them in a <code>Set</code>
		/// </summary>
		/// <param name="one">The first FSM</param>
		/// <param name="two">The second FSM</param>
		protected void GenerateCrossProductInput(FiniteTabularMachine one, FiniteTabularMachine two) 
		{
			this.CPInput = new Set();
			foreach(Input i in one.InputAlphabet) 
			{
				foreach(Input p in two.InputAlphabet)
					if(p.Equals(i)) 
					{
						this.CPInput.Add((Input) i);
					}
			}
		}


		/// <summary>
		/// for debugging prints the cp Input alphabet.
		/// </summary>
		public void PrintInput() 
		{
			foreach(Input i in this.CPInput)
				Console.WriteLine(i.ToString());
		}

	}
}
