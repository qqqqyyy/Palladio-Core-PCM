using System;
using System.Reflection;

namespace Palladio.ComponentModel.InterfaceModels 
{
	/// <summary>
	/// A service consists of a provided signature with an associated service
	/// effect specification describing its requirements.
	/// </summary>
	internal class Service : IService 
	{
		#region Properties

		/// <summary>
		/// Describes the method provided by this service.
		/// </summary>
		public ISignature Signature 
		{
			get { return signature; }
			set { signature = value; }
		}

		/// <summary>
		/// Specifies the requirements of this service.
		/// </summary>
		public ISignatureList EffectSpec 
		{ 
			get { return effectSpec; }
			set { effectSpec = value; }
		}

		#endregion

		#region Methods

		/// <summary>
		/// The Equals method determines whether the specified 
		/// System.Object is equal to the current System.Object.
		/// </summary>
		/// <param name="obj">Contains the Object to compare with 
		/// the current object.</param>
		/// <returns>Returns true if the specified object is equal 
		/// to the current objector or false if the obejcts 
		/// are not equal.</returns>
		public override bool Equals(object obj)
		{
			if (obj is Service) 
			{
				Service srv = (Service)obj;
				return (this.Signature.Equals(srv.Signature) &&
						this.EffectSpec.Equals(srv.EffectSpec));
			}
			return false;
		}

		/// <summary>
		/// The GetHashCode method serves as a hash function 
		/// for a particular type, suitable for use in hashing 
		/// algorithms and data structures like a hash table.
		/// </summary>
		/// <returns>A hash value for the current object.</returns>
		public override int GetHashCode()
		{
			return base.GetHashCode ();
		}

		/// <summary>
		/// Creates a copy of the current instance.
		/// </summary>
		/// <returns>A new object with the same values as the current instance.</returns>
		public object Clone()
		{
			return new Service( this );
		}

		/// <summary>
		/// Retrieves a string representation of the object.
		/// </summary>
		/// <returns>String representation of the object.</returns>
		public override string ToString()
		{
			string result = "Signature:\n"+Signature+"\n";
			result += "ServiceEffectSpecification:\n" + EffectSpec;
			return result;
		}

		#endregion
		
		#region Constructors
		
		/// <summary>
		/// Creates a new Service without a service effect specification.
		/// </summary>
		/// <param name="aSignature">Signature provided by the new Service.</param>
		public Service(ISignature aSignature)
		{
			signature = (ISignature) aSignature.Clone();
		}

		/// <summary>
		/// Creates a new Service providing aSignature and requiring aServideEffectSpec.
		/// </summary>
		/// <param name="aServiceEffectSpec">Requirements of the service.</param>
		/// <param name="aSignature">Signature provided by the new Service.</param>
		public Service(ISignatureList aServiceEffectSpec, ISignature aSignature) : this( aSignature )
		{
			effectSpec = (ISignatureList) aServiceEffectSpec.Clone();
		}

		/// <summary>
		/// CopyConstructor.
		/// </summary>
		/// <param name="aService">Service to copy.</param>
		public Service( Service aService ) : this( aService.EffectSpec, aService.Signature ) {}

		#endregion

		#region Data

		private ISignatureList effectSpec;
		private ISignature signature;
		#endregion
	}
}
