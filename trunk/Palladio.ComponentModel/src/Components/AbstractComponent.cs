using System;
using Palladio.Attributes;
using Palladio.ComponentModel.Exceptions;
using Palladio.ComponentModel.TypedCollections;
using Palladio.Identifier;

namespace Palladio.ComponentModel.Components 
{
	/// <summary>
	/// Default Component class. A component consits of a set of
	/// Provides and RequiresInterface which can be adapted to
	/// its environment.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.3  2005/02/24 20:13:06  joemal
	/// remove serilization and equals methods
	///
	/// Revision 1.2  2005/02/21 15:37:44  joemal
	/// replace keyword as with real typcast
	///
	/// Revision 1.1  2005/02/21 13:52:55  joemal
	/// initial import
	///
	/// 
	/// </pre>
	/// </remarks>
	internal abstract class AbstractComponent : IComponent
	{
		#region Properties

		/// <summary>
		/// return the id of the component
		/// </summary>
		public IIdentifier ID
		{
			get 
			{
				return this.guid;
			}
		}

		/// <summary>
		/// set or get the name of the component
		/// </summary>
		public string Name
		{
			get
			{
				return this.name;
			}

			set
			{
				this.name = value;
			}
		}

		/// <summary>
		/// Interfaces provided by the component to its environment.
		/// </summary>
		public IIdentifier[] ProvidedRoles
		{ 
			get 
			{
				IIdentifier[] result = new IIdentifier[providesMap.Count];
				if (providesMap.Count == 0)
					return result;
				providesMap.Keys.CopyTo(result,0);
				return result;
			}
		}

		/// <summary>
		/// Interfaces required by the component from its environment.
		/// </summary>
		public IIdentifier[] RequiredRoles 
		{ 
			get
			{
				IIdentifier[] result = new IIdentifier[requiresMap.Count];
				if (requiresMap.Count == 0)
					return result;
				requiresMap.Keys.CopyTo(result,0);
				return result;
			}
		}

		/// <summary>
		/// A list of attributes attached this component. 
		/// </summary>
		public AttributeHash Attributes 
		{ 
			get { return attributes; }
		}

		#endregion

		#region Methods

		/// <summary>
		/// Creates a copy of the current instance.
		/// </summary>
		/// <returns>A new object with the same values as the current instance.</returns>
		public abstract object Clone();
			
		/// <summary>
		/// Get the ProvidesInterface with the role aRoleID.
		/// </summary>
		/// <param name="aRoleID">A provided role of the component.</param>
		/// <returns>The ProvidesInterface with the role aRoleID. 
		/// If no interface with aRoleID can be found, a RoleNotFoundException is thrown.</returns>
		public IInterfaceModel GetProvidesInterface(IIdentifier aRoleID)
		{
			IRole result = providesMap[aRoleID];
			if (result == null)
				throw new RoleIDNotFoundException(aRoleID);
			return result.Interface;
		}
		
		/// <summary>
		/// Get the RequiresInterface with the role aRoleID.
		/// </summary>
		/// <param name="aRoleID">A provided role of the component.</param>
		/// <returns>The RequiresInterface with the role aRoleID. 
		/// If no interface with aRoleID can be found, a RoleNotFoundException is thrown.</returns>
		public IInterfaceModel GetRequiresInterface(IIdentifier aRoleID)
		{
			IRole result = requiresMap[aRoleID];
			if (result == null)
				throw new RoleIDNotFoundException(aRoleID);
			return result.Interface;
		}

		public bool HasProvidesInterface(IIdentifier aRoleID)
		{
			return (aRoleID != null ? providesMap.Contains(aRoleID) : false);
		}
		
		public bool HasRequiresInterface(IIdentifier aRoleID)
		{
			return (aRoleID != null ? requiresMap.Contains(aRoleID) : false);
		}

		public IRole GetProvidesRoleByInterfaceID(IIdentifier interfaceID)
		{
			foreach(IRole role in providesMap.Values)
			{
				if (role.Interface.ID.Equals(interfaceID))
					return role;
			}
			return null;
		}

		public IRole GetRequiresRoleByInterfaceID(IIdentifier interfaceID)
		{
			foreach(IRole role in requiresMap.Values)
			{
				if (role.Interface.ID.Equals(interfaceID))
					return role;							
			}
			return null;
		}

		/// <summary>
		/// Adds a provides interface to the component. For each service of the interface a 
		/// a service effect specification is required. It is given by a service effect mapping.
		/// </summary>
		/// <param name="aProvInterface">Provides interface to be added</param>
		public void AddProvidesInterface(IInterfaceModel aProvInterface)
		{
			if (aProvInterface == null)
				throw new ArgumentNullException("Interface can't be null");
			IRole role = ComponentFactory.CreateRole(aProvInterface,this);
			if (providesMap.Contains(role.ID))
				throw new RoleIDAlreadySpecifiedException(role.ID.ToString());
			providesMap.Add(role.ID, role);
			
		}

		/// <summary>
		/// Remove all provides interfaces with the roles given by aProvRoleArray 
		/// from the component.
		/// </summary>
		/// <param name="aProvRoleArray">Roles of the interfaces to be removed.</param>
		public virtual void DeleteProvidesInterfaces(params IIdentifier[] aProvRoleArray)
		{
			foreach (IIdentifier id in aProvRoleArray)
				if (!HasProvidesInterface(id))
					throw new RoleIDNotFoundException(id);
			foreach (IIdentifier id in aProvRoleArray)
			{
				providesMap.Remove(id);
			}
		}
			
		/// <summary>
		/// Add all requires interfaces given by aReqArray to the component.
		/// </summary>
		/// <param name="aReqInterface">An requires interface to be added</param>
		public void AddRequiresInterface(IInterfaceModel aReqInterface)
		{
			if (aReqInterface == null)
				throw new ArgumentNullException("Interface can't be null");
			IRole role = ComponentFactory.CreateRole(aReqInterface,this);
			if (requiresMap.Contains(role.ID))
				throw new RoleIDAlreadySpecifiedException(role.ID.ToString());
			requiresMap.Add(role.ID, role);
		}

		/// <summary>
		/// Remove all requires interfaces with the roles given by aReqRoleArray.
		/// </summary>
		/// <param name="aReqRoleArray">Roles of the requires interfaces to be deleted.</param>
		public virtual void DeleteRequiresInterfaces(params IIdentifier[] aReqRoleArray)
		{
			foreach (IIdentifier id in aReqRoleArray)
				if (!HasRequiresInterface(id))
					throw new RoleIDNotFoundException(id);
			foreach (IIdentifier id in aReqRoleArray)
			{
				requiresMap.Remove(id);
			}
		}
		
		public bool HasRole(IIdentifier roleID)
		{
			if (roleID == null)
				throw new ArgumentNullException("Interface or role can't be null");
			return (providesMap.Contains(roleID) || requiresMap.Contains(roleID));
		}

		public IRole GetRole(IIdentifier aRoleID)
		{
			if (!HasRole(aRoleID))
				throw new RoleIDNotFoundException(aRoleID);
			if (providesMap.Contains(aRoleID))
				return providesMap[aRoleID];
			else
				return requiresMap[aRoleID];

		}

		#endregion

		#region Constructors

		/// <summary>
		/// Creates an empty component with the attributes in anAttHash.
		/// </summary>
		/// <param name="anAttHash">List of attributes attached to this component.</param>
		/// <param name="aID">ID of the component</param>
		public AbstractComponent(AttributeHash anAttHash, string name, GloballyUniqueIdentifier aID)
		{
			providesMap = new ComponentRolesHashmap();
			requiresMap = new ComponentRolesHashmap();
			attributes = anAttHash;
			this.name = name;
			this.guid = aID;
		}

		public AbstractComponent(AbstractComponent anotherComponent)
		{
			requiresMap = (ComponentRolesHashmap)anotherComponent.requiresMap.Clone();
			providesMap = (ComponentRolesHashmap)anotherComponent.providesMap.Clone();
			attributes = (AttributeHash)anotherComponent.attributes.Clone();
			this.name = anotherComponent.Name;
			this.guid = (GloballyUniqueIdentifier)anotherComponent.ID.Clone();
		}

		#endregion

		#region Data

		protected ComponentRolesHashmap providesMap;
		protected ComponentRolesHashmap requiresMap;
		protected String name;
		protected GloballyUniqueIdentifier guid;
		private	  AttributeHash attributes;

		#endregion
	}
}