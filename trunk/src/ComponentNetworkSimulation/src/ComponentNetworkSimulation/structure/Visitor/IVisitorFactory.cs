using System;
using Palladio.ComponentModel;
using Palladio.Identifier;

namespace ComponentNetworkSimulation.Structure.Visitor
{
	/// <summary>
	/// this interface defines the factory used to create the visitors for the component architecture.
	/// This interface is part of the factory method pattern (GOF).
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	/// 
	/// $Log$
	/// Revision 1.1  2004/06/22 12:22:02  joemal
	/// inital class creation
	///
	///
	/// 
	/// </pre>	
	/// </remarks>
	public interface IVisitorFactory
	{	
		/// <summary>
		/// called to create a visitor for a composite component. This method is used, if the starting point is placed in
		/// an inner component of this composite component. The inner component is visited by the given visitor.
		/// </summary>
		/// <param name="component">the composite component</param>
		/// <param name="innerComponentVisitor">the visitor of the inner component</param>
		/// <returns>the visitor</returns>
		IComponentVisitor CreateVisitor(ICompositeComponent component, IComponentVisitor innerComponentVisitor);

		/// <summary>
		/// This method is used to create a visitor for a component, where the starting point is placed in
		/// this component. The starting point is defined by an interface id and a signature id.
		/// </summary>
		/// <param name="component">the component</param>
		/// <param name="interfaceID">the id of the interface in which the visitor has to start</param>
		/// <param name="signatureID">the id of the signature in the interface</param>
		/// <returns>the visitor</returns>
		IComponentVisitor CreateVisitor(IComponent component, IIdentifier interfaceID, IIdentifier signatureID);

		/// <summary>
		/// This method is used to create a visitor for a component, where the starting point is placed in
		/// this component. The starting point is defined by an external signature
		/// </summary>
		/// <param name="component">the composite component</param>
		/// <param name="extSig">the external signature</param>
		/// <returns>the visitor</returns>
		IComponentVisitor CreateVisitor(IComponent component, IExternalSignature extSig);
	}
}
//EOF
