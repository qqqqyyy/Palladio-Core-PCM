using System;
using System.Collections;
using Palladio.Attributes;

namespace Palladio.ComponentModel
{
	/// <summary>
	/// Connects two interfaces of different componetens to each other.
	/// </summary>
	public interface IConnection : IAttributable, ICloneable
	{
		#region Properties

		/// <summary>
		/// Description of the services provided 
		/// by one of the compontents to the other.
		/// </summary>
		IAttachedRole ProvidesRole
		{ 
			get;
		}

		/// <summary>
		/// Description of the services required by one of the
		/// components from the other.
		/// </summary>
		IAttachedRole RequiresRole
		{ 
			get;
		}

		#endregion
	}
}