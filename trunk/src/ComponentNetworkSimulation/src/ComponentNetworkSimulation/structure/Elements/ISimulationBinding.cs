using System;

namespace ComponentNetworkSimulation.Structure.Elements
{
	/// <summary>
	/// This interface extends <code>Palladio.ComponentModel.IBinding</code> for usage in the simulation environment.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// $Log$
	/// Revision 1.1  2004/06/22 12:19:55  joemal
	/// inital class creation
	///
	/// 
	/// </pre>
	/// </remarks>
	public interface ISimulationBinding : Palladio.ComponentModel.IBinding, ITimeConsumer
	{
	}
}
