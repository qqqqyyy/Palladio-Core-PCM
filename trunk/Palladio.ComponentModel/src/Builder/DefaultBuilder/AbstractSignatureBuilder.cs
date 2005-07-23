using System;
using System.Collections;
using Palladio.ComponentModel.Identifier;
using Palladio.ComponentModel.ModelDataManagement;
using Palladio.ComponentModel.ModelEntities;

namespace Palladio.ComponentModel.Builder.DefaultBuilder
{
	/// <summary>
	/// Abstract implementation of the Signature builder - methods that are available at all levels.
	/// </summary>
	/// <remarks>
	/// <pre>
	/// Version history:
	///
	/// $Log$
	/// Revision 1.26  2005/07/23 18:59:57  joemal
	/// IType now is implemented in external object. Plugins for serializer are created.
	///
	/// Revision 1.25  2005/06/12 17:07:31  joemal
	/// renamed from QueryEntity to QueryRepository
	///
	/// Revision 1.24  2005/06/05 10:37:33  joemal
	/// - replace the entities by the ids
	/// - components now can be added to more than one container
	///
	/// Revision 1.23  2005/05/27 15:22:51  kelsaka
	/// - added return of entity ids
	///
	/// Revision 1.22  2005/05/27 13:34:41  kelsaka
	/// - AbstractEntity now holds the ModelDataManger and the BuilderManager
	///
	/// Revision 1.21  2005/05/25 19:44:54  kelsaka
	/// - optimized usings
	/// - builders are now returning identifiers again
	///
	/// Revision 1.20  2005/05/25 16:27:10  kelsaka
	/// - renamed former BuilderFactory / therefore removed former BuilderManager
	///
	/// Revision 1.19  2005/04/24 14:50:14  kelsaka
	/// - added full support for constraints
	/// - added typed lists for builders
	/// - removed protocol builder
	///
	/// Revision 1.18  2005/04/23 11:00:44  kelsaka
	/// - removed Init-Methods from AbstractBuilder - created constructors
	///
	/// Revision 1.17  2005/04/20 18:55:13  kelsaka
	/// - removed unused builders for parameters and types
	///
	/// Revision 1.16  2005/04/20 18:27:45  kelsaka
	/// - made classes internal
	/// - removed unused init-methods
	/// - use of InternalEntityIdentifier for creating new Identifiers
	///
	/// Revision 1.15  2005/04/20 17:55:54  kelsaka
	/// - added methods for deserialization
	///
	/// Revision 1.14  2005/04/20 13:26:43  kelsaka
	/// - added new Init-method implementation
	///
	/// Revision 1.13  2005/04/20 13:08:31  kelsaka
	/// - introduced IModelDataManagement
	/// - integrated use of the new interface
	///
	/// Revision 1.12  2005/04/15 08:29:46  kelsaka
	/// - fixed errors on xml-comments
	///
	/// Revision 1.11  2005/04/14 13:43:03  kelsaka
	/// - fixed error in boolean expression for dertermining exception-types
	///
	/// Revision 1.10  2005/04/14 08:19:28  kelsaka
	/// - added new Equals semantic for IType
	/// - added new GetType-method for IType
	///
	/// Revision 1.9  2005/04/13 21:22:40  kelsaka
	/// - added testcases
	///
	/// Revision 1.8  2005/04/13 20:24:08  kelsaka
	/// - added enitity methods
	///
	/// Revision 1.7  2005/04/13 17:36:51  kelsaka
	/// - completed signature builder
	///
	/// Revision 1.6  2005/04/13 17:06:02  kelsaka
	/// - added further support for building signatures
	///
	/// Revision 1.5  2005/04/13 09:27:17  kelsaka
	/// - added builders (including interfaces) for types and parameters of signatures.
	///
	/// Revision 1.4  2005/04/12 18:08:35  kelsaka
	/// - added events to builders
	///
	/// Revision 1.3  2005/04/12 12:32:39  kelsaka
	/// - removed property to access typed IDs directly from the builders
	/// - renamed the property from 'SignaturID' to 'SignatureID' in ISignature
	///
	/// Revision 1.2  2005/04/09 12:23:20  kelsaka
	/// - added documentation
	///
	/// Revision 1.1  2005/04/08 15:40:06  kelsaka
	/// - added SignatureBuilder
	/// - fixed bug: some new entities were not added to component model
	///
	/// </pre>
	/// </remarks>
	internal abstract class AbstractSignatureBuilder : AbstractEntityBuilder, ISignatureBuilder
	{
		#region constructors

		/// <summary>
		/// Initializes the Builder.
		/// </summary>
		/// <param name="sigId">the id of the builders signature</param>
		/// <param name="modelDataManager">The model data management.</param>
		/// <param name="builderManager">The factory to use for creating other builders.</param>
		public AbstractSignatureBuilder(ISignatureIdentifier sigId, IModelDataManager modelDataManager, IBuilderManager builderManager)
			: base(sigId,builderManager, modelDataManager)
		{
		}

		#endregion

		#region methods

		/// <summary>
		/// Sets the return type of the actual signature. 
		/// </summary>
		/// <param name="type">the return type to be set.</param>
		public void SetReturnType (IType type)
		{
			this.Signature.ReturnType = type;			
		}

		/// <summary>
		/// called to set "void" es return type.
		/// </summary>
		public void SetVoidReturnType()
		{
			this.Signature.ReturnType = EntityFactory.CreateVoidType();
		}

		/// <summary>
		/// Appends a new parameter to the end of the parameter list of the signature.
		/// The <see cref="ParameterModifierEnum"/> is set to <see cref="ParameterModifierEnum.NONE"/>
		/// by default.
		/// </summary>
		/// <param name="type">The type of the new parameter</param>
		/// <param name="name">The new parameters name.</param>
		public void AppendParameter(IType type, string name)
		{			
			IParameter parameter = EntityFactory.CreateParameter(type, name);
			AppendParameter (parameter);
		}

		/// <summary>
		/// Appends a new parameter to the end of the parameter list of the signature.
		/// </summary>
		/// <param name="type">The type of the new parameter</param>
		/// <param name="name">The new parameters name.</param>
		/// <param name="modifier">The modifier (<see cref="ParameterModifierEnum"/> like "out"
		/// or "ref") of the actual parameter.</param>
		public void AppendParameter(IType type, string name, ParameterModifierEnum modifier)
		{
			IParameter parameter = EntityFactory.CreateParameter(type, name,modifier);
			AppendParameter (parameter);
		}

		/// <summary>
		/// Appends a new parameter to the end of the parameter list of the signature.
		/// </summary>
		/// <param name="type">The type of the new parameter</param>
		/// <param name="modifier">The modifier (<see cref="ParameterModifierEnum"/> like "out"
		/// or "ref") of the actual parameter.</param>
		public void AppendParameter(IType type, ParameterModifierEnum modifier)
		{
			throw new NotImplementedException();
		}

		private void AppendParameter (IParameter parameter)
		{
			ArrayList parameterList = new ArrayList(this.Signature.Parameters);
			parameterList.Add(parameter);
			Signature.Parameters = (IParameter[])parameterList.ToArray(typeof(IParameter));	
		}

		/// <summary>
		/// Clears the list of parameters. Afterwards the signature contains no more parameters.
		/// (Reset to default parameters.)
		/// </summary>
		/// <remarks>
		/// Currently parameters do not have IDs. As parameters might occur multiple times it can
		/// not be determined which parameter is meant to delete. So always the whole list has to
		/// be deleted.
		/// </remarks>
		public void ClearParameterList ()
		{
			this.Signature.Parameters = SignatureDescription.DEFAULT_PARAMETERS;
		}

		/// <summary>
		/// Adds the given exception to the signature.
		/// </summary>
		/// <remarks>
		/// Exceptions are only added once. If a exceptions is added multiple times it is added
		/// only once.
		/// </remarks>
		/// <param name="type">The exception to add. It has to be a valid
		/// <see cref="Exception"/>.</param>
		public void AddException (IType type)
		{
			ArrayList exceptionsList = new ArrayList(this.Signature.Exceptions);
			// search for double exception-types. 
			if(!exceptionsList.Contains(type))
			{
				exceptionsList.Add(type);	
				Signature.Exceptions = (IType[])exceptionsList.ToArray(typeof(IType));			
			}
		}

		/// <summary>
		/// Removes the given exception from the signature.
		/// </summary>
		/// <param name="exception">The exception to remove.</param>
		public void RemoveException (IType exception)
		{
			ArrayList exceptionsList = new ArrayList(this.Signature.Exceptions);
			exceptionsList.Remove(exception);
			Signature.Exceptions = (IType[])exceptionsList.ToArray(typeof(IType));				
		}

		#endregion

		#region Properties

		/// <summary>
		/// Accesses the created instance.
		/// </summary>
		public ISignature Signature
		{
			get { return this.ModelDataManager.Query.QueryRepository.GetSignature(this.SignatureId); }
		}

		/// <summary>
		/// Accesses the identifier of the actual instance.
		/// </summary>
		public ISignatureIdentifier SignatureId
		{
			get { return (ISignatureIdentifier) this.Id; }
		}

		#endregion
	}
}
