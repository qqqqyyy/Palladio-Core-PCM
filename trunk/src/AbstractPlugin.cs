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

namespace Palladio.Editor.Common
{
	/// <summary>
	/// Zusammenfassung f�r AbstractPlugin.
	/// </summary>
	public abstract class AbstractPlugin : MarshalByRefObject, IPlugin
	{
		public AbstractPlugin()
		{
			this._name			= "undef";
			this._description	= "undef";
			this._author		= "undef";
			this._version		= "undef";
		}

		protected string _name;
		public abstract string Name	{ get; }

		protected string _description;
		public abstract string Description { get; }

		protected string _author;
		public abstract string Author {	get; }

		protected string _version;
		public abstract string Version { get; }

		public abstract void Detach();
	}
}
