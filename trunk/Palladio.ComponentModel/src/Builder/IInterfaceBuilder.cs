using System;
using Palladio.ComponentModel.Builder.TypeLevelBuilder;
using Palladio.ComponentModel.Identifier;
using Palladio.ComponentModel.ModelEntities;

namespace Palladio.ComponentModel.Builder
{
	/// <summary>
	/// IInterfaceBuilder. Builder for creating interfaces including signatures and protocols.
	/// </summary>
	/// <remarks>
	/// <p>This builder interface contains all non model-level specifical methods of a interface.</p>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.8  2005/04/12 12:32:39  kelsaka
	/// - removed property to access typed IDs directly from the builders
	/// - renamed the property from 'SignaturID' to 'SignatureID' in ISignature
	///
	/// Revision 1.7  2005/04/09 12:23:20  kelsaka
	/// - added documentation
	///
	/// Revision 1.6  2005/04/08 18:12:01  kelsaka
	/// - added further method to be able to add an existing signature
	///
	/// Revision 1.5  2005/04/08 16:50:31  kelsaka
	/// - added interface builder implementation
	///
	/// Revision 1.4  2005/04/08 15:40:06  kelsaka
	/// - added SignatureBuilder
	/// - fixed bug: some new entities were not added to component model
	///
	/// Revision 1.3  2005/04/08 10:41:18  kelsaka
	/// - added return of IDs
	/// - added implementation of defined interfaces
	/// - redefined interfaces for builder-context
	/// - added CC-levels
	///
	/// Revision 1.2  2005/04/06 19:06:58  kelsaka
	/// - added new builder interfaces to support the levels of the component model
	/// - added basic set of methods to interfaces
	///
	/// Revision 1.1  2005/03/17 18:30:35  kelsaka
	/// - added first builder-interfaces
	///
	/// </pre>
	/// </remarks>
	public interface IInterfaceBuilder
	{
		#region methods

		/// <summary>
		/// Adds an existing signature to the actual Interface.
		/// </summary>
		/// <param name="signature">The existing signature.</param>
		void AddSignature(ISignature signature);

		/// <summary>
		/// Adds a new signature with the given name to the actual Interface.
		/// </summary>
		/// <param name="signatureName">The new signatures name.</param>
		/// <returns>SignatureBuilder</returns>
		ISignatureTypeLevelBuilder AddSignature(string signatureName);

		/// <summary>
		/// called to remove the signature with given id. If the entity could not be found in 
		/// componentmodel, the method returns without doing anything.
		/// </summary>
		/// <param name="signatureID">the id of the signature that has to be removed</param>
		void RemoveSignature(ISignatureIdentifier signatureID);

		/// <summary>
		/// Adds a new protocol to the interface.
		/// </summary>
		/// <param name="protocolName">The new protocols name.</param>
		IProtocolTypeLevelBuilder AddProtocol(string protocolName);

		/// <summary>
		/// called to add a existing protocol to the actual interfaces.
		/// </summary>
		/// <param name="protocol">the protocol to be added</param>
		void AddProtocol(IProtocol protocol);

		/// <summary>
		/// called to remove the protocol with given id. If the entity could not be found in 
		/// componentmodel, the method returns without doing anything.
		/// </summary>
		/// <param name="protocolID">the id of the protocol that has to be removed</param>
		void RemoveProtocol(IProtocolIdentifier protocolID);

		#endregion

		#region Properties

		/// <summary>
		/// Accesses the created instance.
		/// </summary>
		IInterface Interface
		{
			get;
		}

		#endregion
	}
}
