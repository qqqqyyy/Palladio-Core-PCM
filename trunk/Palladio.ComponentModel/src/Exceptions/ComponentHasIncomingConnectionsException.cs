using Palladio.Identifier;

namespace Palladio.ComponentModel.Exceptions
{
	/// <summary>
	/// Error indicating, that a component cannot be deleted because it has incoming connections.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.2  2005/02/24 20:13:05  joemal
	/// remove serilization and equals methods
	///
	/// Revision 1.1  2005/02/21 13:48:03  joemal
	/// initial import
	///
	///
	/// </pre>
	/// </remarks>
	public class ComponentHasIncomingConnectionsException : ComponentModelException
	{
		/// <summary>
		/// Error indicating, that a component cannot be deleted because it has incoming connections.
		/// </summary>
		/// <param name="anID">Considered component.</param>
		public ComponentHasIncomingConnectionsException(IIdentifier anID) : base( "Component " + anID.ToString() + " has incoming connections!")
		{
		}
	}
}