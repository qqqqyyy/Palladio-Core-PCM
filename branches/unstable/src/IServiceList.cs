using System;
using System.Collections;

using Palladio.Identifier;

namespace Palladio.ComponentModel
{
	/// <summary>
	/// A ServiceList contains a set of services
	/// and provides several methods to query them.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.1.2.1  2005/02/15 20:02:59  joemal
	/// diverses
	///
	/// </pre>
	/// </remarks>
	public interface IServiceList : ICloneable, IEnumerable
	{
		#region Properties

		/// <summary>
		/// The number of services in this list
		/// </summary>
		int Count
		{
			get;
		}
		
		/// <summary>
		/// Indexer to access the services easily.
		/// </summary>
		IService this[int index]
		{
			get;
		}

		/// <summary>
		/// Adds an array of services to the list.
		/// </summary>
		/// <param name="aServiceArray">Services to be added.</param>
		void AddServices( params IService[] aServiceArray );

		/// <summary>
		/// Deletes a set of services from the list.
		/// </summary>
		/// <param name="aServiceArray">Services to be removed.</param>
		void DeleteServices( params IService[] aServiceArray );
		
		/// <summary>
		/// Query the list for a certain service
		/// </summary>
		/// <param name="aSignature">The service which is searched</param>
		/// <returns>True if the queried service is in the list</returns>
		bool ContainsService( IService aService );
		
		/// <summary>
		/// Returns the service in the list matching to given id
		/// </summary>
		/// <param name="id">the id of the searched service</param>
		/// <returns>the service that is matching to given id or null if none exists.</returns>
		IService GetServiceByID( IIdentifier id );

		/// <summary>
		/// Returns the complete set of signatures belonging to this signature list
		/// </summary>
		/// <returns>A complete set of signatures belonging to this signature list</returns>
		IService[] GetServices();
		
		/// <summary>
		/// This event is raised before and after a change of the service in this list
		/// </summary>
		event ServiceListChangeEventHandler ServiceListChangeEvent;

		#endregion
	}
}
