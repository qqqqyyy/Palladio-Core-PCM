using System;
using System.Collections;
using Palladio.Attributes;

namespace Palladio.ComponentModel.InterfaceModels
{
	#region DefaultServiceEffectSpecification
	/// <summary>
	/// An IInterfaceModel is the description of an interface (of a component).
	/// In our case an interface is a set of signatures
	/// which can be somehow related to each other.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.2  2005/02/24 20:13:06  joemal
	/// remove serilization and equals methods
	///
	/// Revision 1.1  2005/02/21 13:49:17  joemal
	/// initial import
	///
	///
	/// </pre>
	/// </remarks>
	internal class DefaultServiceEffectSpecification : IServiceEffectSpecification
	{
		protected IServiceList requiredServicesList;
		protected AttributeHash attributes;
		protected ArrayList serviceInformations = new ArrayList();
		
		public IServiceList RequiredServicesList
		{
			get
			{
				return requiredServicesList;
			}
		}
		
		public AttributeHash Attributes 
		{
			get 
			{
				return attributes;
			}
		}	
		
		/// <summary>
		/// Creates a copy of the current instance.
		/// </summary>
		/// <returns>A new object with the same values as the current instance.</returns>
		public object Clone()
		{
			return new DefaultServiceEffectSpecification(this.attributes, this.requiredServicesList);
		}
				
		/// <summary>
		/// Additional specification data like FSMs, Petri Nets, ....
		/// </summary>
		public IServiceInformation[] ServiceInformations
		{
			get
			{
				IServiceInformation[] result = new IServiceInformation[serviceInformations.Count];
				serviceInformations.CopyTo(result);
				return result;
			}
		}

		/// <summary>
		/// Get the auxiliary information of a given type
		/// </summary>
		/// <param name="aType">Type of the additional information to retrieve</param>
		/// <returns>The requested information or an exception if the information is not
		/// available</returns>
		public IServiceInformation GetServiceInformation(System.Type aType)
		{
			foreach (IServiceInformation inf in serviceInformations)
			{
				if (aType.IsAssignableFrom(inf.GetType()))
					return inf;
			}
			throw new Exception("Additional information from given type not found!");
		}
		
		/// <summary>
		/// Add a new specification aspect to this service, like a fsm.
		/// </summary>
		/// <param name="info">Additional specification data</param>
		public void AddServiceInformation(IServiceInformation info)
		{
			serviceInformations.Add(info);
			RequiredServicesList.ServiceListChangeEvent += new ServiceListChangeEventHandler(info.ServiceListChangeEventHandler);
		}
			
		public DefaultServiceEffectSpecification(AttributeHash attrHash, IServiceList aRequiredServiceList)
		{
			this.requiredServicesList = (IServiceList)aRequiredServiceList.Clone();
			this.attributes = attrHash;
		}
		
		public DefaultServiceEffectSpecification(AttributeHash attrHash)
		{
			requiredServicesList = ComponentFactory.CreateServiceList(new IService[0]);
			this.attributes = attrHash;
		}
	}
	#endregion
}