using Palladio.ComponentModel.Exceptions;
using Palladio.ComponentModel.Identifier;

namespace Palladio.ComponentModel.Query.TypeLevel
{
	/// <summary>
	/// This interface defines several query methods to find the entities in the componentmodel in type level.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.2  2005/04/19 16:47:41  joemal
	/// implement query methods
	///
	/// Revision 1.1  2005/04/18 08:50:50  joemal
	/// initial creation
	///
	/// 
	/// </pre>
	/// </remarks>
	public interface IQueryTypeLevel
	{
		/// <summary>
		/// returns an interface that contains several methods to query entities that belong to the static view
		/// </summary>
		/// <returns>the interface</returns>
		IQueryStaticViewTypeLevel QueryStaticView();

		/// <summary>
		/// returns an interface that contains several methods to query entities and relations that belong 
		/// to a component.
		/// </summary>
		/// <param name="componentID">the id of the component</param>
		/// <returns>the interface</returns>
		/// <exception cref="EntityNotFoundException">thrown if the component could not be found in the model.</exception>
		IQueryComponentTypeLevel QueryComponent(IComponentIdentifier componentID);

		/// <summary>
		/// returns an interface that contains several methods to query entities and relations that belong 
		/// to a basic component.
		/// </summary>
		/// <param name="bcID">the id of the component</param>
		/// <returns>the interface</returns>
		/// <exception cref="EntityNotFoundException">thrown if the component could not be found in the model.</exception>
		IQueryBasicComponentTypeLevel QueryBasicComponent(IComponentIdentifier bcID);

		/// <summary>
		/// returns an interface that contains several methods to query entities and relations that belong 
		/// to a composite component.
		/// </summary>
		/// <param name="ccID">the id of the component</param>
		/// <returns>the interface</returns>
		/// <exception cref="EntityNotFoundException">thrown if the component could not be found in the model.</exception>
		/// <exception cref="WrongComponentTypeException">thrown, if the id of the component is 
		/// not a composite component</exception>
		IQueryCompositeComponentTypeLevel QueryCompositeComponent(IComponentIdentifier ccID);

		/// <summary>
		/// returns an interface that contains several methods to query entities and relations that belong 
		/// to a connection.
		/// </summary>
		/// <param name="connectionID">the id of the connection</param>
		/// <returns>the interface</returns>
		/// <exception cref="EntityNotFoundException">thrown if the connection could not be found in the model.</exception>
		IQueryConnectionTypeLevel QueryConnection(IConnectionIdentifier connectionID);

		/// <summary>
		/// returns an interface that contains several methods to query entities and relations that belong 
		/// to an interface.
		/// </summary>
		/// <param name="ifaceID">the id of the interface</param>
		/// <returns>the queryinterface</returns>
		/// <exception cref="EntityNotFoundException">thrown if the interface could not be found in the model.</exception>
		IQueryInterfaceTypeLevel QueryInterface(IInterfaceIdentifier ifaceID);
	}
}
