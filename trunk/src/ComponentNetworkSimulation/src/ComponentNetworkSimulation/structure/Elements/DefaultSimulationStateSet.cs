using System;

namespace ComponentNetworkSimulation.Structure.Elements
{
	/// <summary>
	/// This is the default set for simulationstates, that are supported by the framework.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// $Log$
	/// Revision 1.1  2004/07/06 12:25:40  joemal
	/// initial class creation
	///
	/// 
	/// </pre>
	/// </remarks>
	internal class DefaultSimulationStateSet : ISimulationStateSet
	{
		/// <summary>
		/// this is the factory method to create a state that supports the given parameter structure.
		/// </summary>
		/// <param name="parms">the parameters for the state</param>
		/// <returns>th state</returns>
		public ISimulationState CreateState(ISimulationStateParams parms)
		{
			if (parms is StaticTimeStateParams)
				return new DefaultStaticTimeState((StaticTimeStateParams)parms);

			throw new NotSupportedException("The given parameters are not supported by this set of states.");
		}

		/// <summary>
		/// this method has to return false, if the given parameterstructure is not supported by this set of states.
		/// If this method returns true, the set can create a state with this parameters.
		/// </summary>
		/// <param name="parms">the parameter that have to be checked</param>
		/// <returns>true, if this set can create a state using this parameters</returns>
		public bool IsSupported(ISimulationStateParams parms)
		{
			return parms is StaticTimeStateParams;
		}
	}
}
//EOF
