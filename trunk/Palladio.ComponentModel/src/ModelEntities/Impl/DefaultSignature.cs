using Palladio.ComponentModel.Identifier;

namespace Palladio.ComponentModel.ModelEntities.Impl
{
	/// <summary>
	/// Default Signature class. The signature has a name, an id, a returntype, an array of parameters and an array of
	/// exceptions.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.1  2005/03/15 12:31:37  joemal
	/// initial class creation
	///
	/// 
	/// </pre>
	/// </remarks>
	internal class DefaultSignature : AbstractEntity ,ISignature
	{
		#region Properties

		/// <summary>
		/// the typed id of the signature
		/// </summary>
		public ISignatureIdentifier SignaturID
		{
			get
			{
				return  (ISignatureIdentifier) id;
			}
		}

		/// <summary>
		/// set or get the whole description of a signature with parameters, returntype and exceptions
		/// </summary>
		public SignatureDescription Description
		{
			get
			{
				return this.signatureDescription;
			}

			set
			{
				this.signatureDescription = value;
			}
		}

		/// <summary>
		/// Type of the return value. 
		/// </summary>
		public IType ReturnType
		{
			get
			{
				return this.signatureDescription.ReturnType;
			}

			set
			{
				this.signatureDescription.ReturnType = value;
			}
		}

		/// <summary>
		/// Parameters required by this signature. 
		/// </summary>
		public IParameter[] Parameters
		{
			get
			{
				return this.signatureDescription.Parameters;
			}

			set
			{
				this.signatureDescription.Parameters = value;
			}
		}

		/// <summary>
		/// An unordered set of exceptions thrown by the methods implementing this signature.
		/// </summary>
		public IType[] Exceptions
		{
			get
			{
				return this.signatureDescription.Exceptions;
			}

			set
			{
				this.signatureDescription.Exceptions = value;
			}
		}

		#endregion

		#region Constructors

		/// <summary>
		/// Creates a signature with given name, given id and given signature description. 
		/// </summary>
		/// <param name="aID">ID of the interface</param>
		/// <param name="name">the name of the interface</param>
		/// <param name="description">the description of the signature</param>
		public DefaultSignature(ISignatureIdentifier aID, string name, SignatureDescription description) : base(aID, name)
		{
			this.signatureDescription = description;
		}		

		#endregion

		#region data

		//holds the description structure of the signature
		private SignatureDescription signatureDescription;

		#endregion
	}
}