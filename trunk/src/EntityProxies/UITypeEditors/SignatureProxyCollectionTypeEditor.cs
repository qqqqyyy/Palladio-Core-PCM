#region Universit�t Oldenburg
//////////////////////////////////////////////////////////////////////////
//	Universit�t Oldenburg
//	Department f�r Informatik, Software Engineering
//	-----------------------------------------------------------------
//	Master-Arbeit "Entwicklung eines Editors f�r die modellgetriebene
//	Konstruktion komponentenbasierter Software-Architekturen"
//	Autor: Matthias Uflacker, 2004
//	eMail: matthias.uflacker@informatik.uni-oldenburg.de
//////////////////////////////////////////////////////////////////////////
#endregion

using System;
using System.Drawing.Design;

using Palladio.Editor.Common.EntityProxies;

namespace Palladio.Editor.Common.EntityProxies.UITypeEditors
{
	/// <summary>
	/// Zusammenfassung f�r SignatureProxyCollectionTypeEditor.
	/// </summary>
	public class SignatureProxyCollectionTypeEditor : UITypeEditor
	{
		public override object EditValue(System.ComponentModel.ITypeDescriptorContext context, IServiceProvider provider, object value)
		{
			Dialogs.SignatureProxyCollectionForm dialog = new Dialogs.SignatureProxyCollectionForm(context.Instance as InterfaceProxy);
			dialog.ShowDialog();
			return value;
		}

		public override UITypeEditorEditStyle GetEditStyle(System.ComponentModel.ITypeDescriptorContext context)
		{
			return UITypeEditorEditStyle.Modal;
		}

	}
}
