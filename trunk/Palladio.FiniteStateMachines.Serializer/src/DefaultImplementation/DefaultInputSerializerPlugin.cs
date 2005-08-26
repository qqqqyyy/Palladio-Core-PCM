using System;
using System.Xml;
using Palladio.FiniteStateMachines.Serializer.Interfaces;

namespace Palladio.FiniteStateMachines.Serializer.DefaultImplementation
{
	/// <summary>
	/// Serializes the default input implementation that is returned
	/// by the <see cref="FSMFactory"/>.
	/// </summary>
	/// <remarks>
	/// There is no content data written or read - the default input has no special data.
	/// <code>
	/// Version history:
	/// 
	/// $Log$
	/// Revision 1.5  2005/08/26 09:45:27  kelsaka
	/// - validation fails
	///
	/// Revision 1.4  2005/08/25 18:43:47  kelsaka
	/// - support for default input serialization.
	///
	/// Revision 1.3  2005/08/25 09:41:20  kelsaka
	/// - prepared support for "test1" input serialization test
	///
	/// Revision 1.2  2005/08/24 10:24:07  kelsaka
	/// - added serialization support for default input
	///
	/// Revision 1.1  2005/08/24 09:25:40  kelsaka
	/// - created serializer for the default input
	/// - added methods for the IInputSerializerPlugin
	///
	/// </code>
	/// </remarks>
	public class DefaultInputSerializerPlugin : IInputSerializerPlugin
	{
		/// <summary>
		/// Serializes the given input and writes the results to the given xmlwriter.
		/// </summary>
		/// <param name="input">The input to serialize.</param>
		/// <param name="xmlWriter">The writer to use for serializing the input.</param>
		/// <remarks>The output is automatically surrounded by the calling class by a
		/// <code>&lt;input inputType="abcde"&gt;&lt;/input&gt;</code> Tag.</remarks>
		public void SerializeInput (IInput input, XmlWriter xmlWriter)
		{
			//xmlWriter.WriteAttributeString(
			//	this.XmlPrefix, "symbolID", this.XmlNamespace, input.ID.ToString());
		}

		/// <summary>
		/// Deserializes the given xmlNode, that represents an <see cref="IInput"/>.
		/// </summary>
		/// <param name="xmlNode">The node to deserialize, that contains the input
		/// xml element.</param>
		/// <returns>The deserialized input information.</returns>
		public IInput DeserializeInput (XmlNode xmlNode)
		{			
			//return FSMFactory.CreateDefaultInput(
			//	xmlNode.Attributes.GetNamedItem(this.XmlPrefix+":symbolID").Value);
			throw new NotImplementedException();
		}

		/// <summary>
		/// The namespace of the IInput elements. (read)
		/// </summary>
		public string XmlNamespace
		{
			get
			{
				return XMLSerializer.XMLNAMESPACE + "/DefaultInputSerializerPlugin/";
			}
		}

		/// <summary>
		/// The URI of the XSD-File that describes the XML-Scheme of the Plugin output. This XSD is used
		/// for validation. (read)
		/// </summary>
		public string XmlSchemaURI
		{
			get
			{
				return "DefaultInputSerializerPlugin.xsd";
			}
		}

		/// <summary>
		/// The prefix to identify XML elements written by the plugin.
		/// </summary>
		public string XmlPrefix
		{
			get
			{
				return "disp";
			}
		}
	}
}
