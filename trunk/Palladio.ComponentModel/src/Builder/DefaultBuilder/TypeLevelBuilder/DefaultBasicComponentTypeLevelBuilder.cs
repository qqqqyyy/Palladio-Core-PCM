using System;
using Palladio.ComponentModel.Builder.ImplementationLevelBuilder;
using Palladio.ComponentModel.Builder.TypeLevelBuilder;
using Palladio.ComponentModel.Exceptions;
using Palladio.ComponentModel.Identifier;
using Palladio.ComponentModel.ModelDataManagement;
using Palladio.ComponentModel.ModelEntities;

namespace Palladio.ComponentModel.Builder.DefaultBuilder.TypeLevelBuilder
{
	/// <summary>
	/// Default implementation of the basic component builder at the type level.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.12  2005/07/29 16:01:33  joemal
	/// now service effect specifications can be added ...
	///
	/// Revision 1.11  2005/06/05 10:37:57  joemal
	/// - replace the entities by the ids
	/// - components now can be added to more than one container
	///
	/// Revision 1.10  2005/05/27 13:34:41  kelsaka
	/// - AbstractEntity now holds the ModelDataManger and the BuilderManager
	///
	/// Revision 1.9  2005/05/25 16:27:10  kelsaka
	/// - renamed former BuilderFactory / therefore removed former BuilderManager
	///
	/// Revision 1.8  2005/04/24 14:50:14  kelsaka
	/// - added full support for constraints
	/// - added typed lists for builders
	/// - removed protocol builder
	///
	/// Revision 1.7  2005/04/23 11:00:44  kelsaka
	/// - removed Init-Methods from AbstractBuilder - created constructors
	///
	/// Revision 1.6  2005/04/20 21:02:35  kelsaka
	/// - added first methods for constraints
	///
	/// Revision 1.5  2005/04/20 17:55:54  kelsaka
	/// - added methods for deserialization
	///
	/// Revision 1.4  2005/04/20 13:08:31  kelsaka
	/// - introduced IModelDataManagement
	/// - integrated use of the new interface
	///
	/// Revision 1.3  2005/04/15 08:29:46  kelsaka
	/// - fixed errors on xml-comments
	///
	/// Revision 1.2  2005/04/07 17:49:31  kelsaka
	/// - added some unit tests
	/// - added builder implementation
	///
	/// Revision 1.1  2005/04/06 19:06:59  kelsaka
	/// - added new builder interfaces to support the levels of the component model
	/// - added basic set of methods to interfaces
	///
	/// Revision 1.2  2005/03/18 07:36:27  kelsaka
	/// - corrected errors
	///
	/// Revision 1.1  2005/03/17 18:30:35  kelsaka
	/// - added first builder-interfaces
	///
	/// </pre>
	/// </remarks>
	internal class DefaultBasicComponentTypeLevelBuilder : AbstractComponentBuilder, IBasicComponentTypeLevelBuilder
	{
		/// <summary>
		/// Initializes the Builder.
		/// </summary>
		/// <param name="modelDataManager">The model data management.</param>
		/// <param name="builderManager">The factory to use for creating new builders.</param>
		/// <param name="compId">the id of the builders component</param>
		public DefaultBasicComponentTypeLevelBuilder(IComponentIdentifier compId, IModelDataManager modelDataManager, IBuilderManager builderManager) 
			: base(compId,modelDataManager, builderManager)
		{
			
		}

		/// <summary>
		/// Offers a possibility to change the model-level at which the actual entity is created.
		/// </summary>
		public IBasicComponentImplementationLevelBuilder ImplementationLevelBuilder
		{
			get { throw new NotImplementedException ("ImplementationLevelBuilder is not done yet."); }
		}

		#region constraint-management

		/// <summary>
		/// The child builder to call for each method defined in the builder interface.
		/// </summary>
		public IBasicComponentTypeLevelBuilder ChildBuilder
		{
			set {} //in constrast to constraints the builder itself has no child. 
		}

		/// <summary>
		/// Clones the actual builder / constraints instance except the created / supervised
		/// component model entity.
		/// </summary>
		/// <param name="compId">The id of the component model entity that has to be builder /
		/// supervised.</param>
		/// <returns>A copy of the actual builder / constraint.</returns>
		public IBasicComponentTypeLevelBuilder Clone (IComponentIdentifier compId)
		{
			return new DefaultBasicComponentTypeLevelBuilder(compId,ModelDataManager, base.BuilderManager);
		}

		#endregion

		/// <summary>
		/// call to add a service effect specification to the builders basic component.
		/// </summary>
		/// <param name="seff">the service effect specification</param>
		/// <param name="ifaceID">the id of the interface that holds the signature of the seff.</param>
		/// <param name="sigID">the id of the signature</param>
		/// <exception cref="InterfaceNotFromComponentException">a seff with given id already exists in cm</exception>
		/// <exception cref="EntityAlreadyExistsException">the interface could not be found in cm</exception>
		/// <exception cref="InterfaceNotFoundException">the signature could not be found in cm</exception>
		/// <exception cref="SignatureNotFoundException">the interface is not bound to the component</exception>		
		public void AddServiceEffectSpecification(IServiceEffectSpecification seff, IInterfaceIdentifier ifaceID, 
			ISignatureIdentifier sigID)
		{
			base.ModelDataManager.LowLevelBuilder.
				AddServiceEffectSpecification(seff,new ConnectionPoint(ifaceID,ComponentId),sigID);
		}

		/// <summary>
		/// called to remove the service effect specification that matchs to given id.
		/// </summary>
		/// <param name="seffId">the id of the seff to be removed</param>
		public void RemoveServiceEffectSpecification(ISeffIdentifier seffId)
		{
			base.ModelDataManager.LowLevelBuilder.RemoveServiceEffectSpecification(seffId);
		}
	}
}
