using System;

namespace ComponentNetworkSimulation.Structure.Attributes
{
	/// <summary>
	/// This class defines a attribute, that holds a controlflow strategy for a simulationstate.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	/// 
	/// $Log$
	/// Revision 1.2  2004/06/19 13:46:55  joemal
	/// - some refactoring
	///
	/// Revision 1.1  2004/05/25 16:18:56  joemal
	/// initial creation
	///
	/// 
	/// </pre>	
	/// </remarks>
	public class ControlFlowStrategyAttributeType : Palladio.Attributes.IAttributeType
	{
		/// <summary>
		/// Get a description of the attribute
		/// </summary>
		public string Description
		{
			get
			{
				return "This attribute defines a strategy to find a way through the finite state machine";
			}
		}

		/// <summary>
		/// Get a globally unique ID of the attribute used to identify 
		/// the attribute
		/// </summary>
		public Guid GUID
		{
			get
			{
				return new Guid("633514B1-6E30-4a7e-8335-42818A40D095");
			}
		}

		/// <summary>
		/// Get the type of the value of the given attribute
		/// </summary>
		public Type ValueType
		{
			get
			{
				return typeof(ComponentNetworkSimulation.Structure.Elements.IControlFlowStrategy);
			}
		}

		/// <summary>
		/// called by data driven visitors. Not implemented because this class is the end of the visitable path.
		/// </summary>
		public void AcceptVisitor(ReflectionBasedVisitor.IVisitor visitor)
		{
		}
	}
}
//EOF