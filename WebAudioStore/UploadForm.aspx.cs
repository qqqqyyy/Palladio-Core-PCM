using System;
using System.Collections;
using System.Data;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;

namespace WebAudioStore
{
	/// <summary>
	/// Zusammenfassung f�r WebForm1.
	/// </summary>
	public partial class UploadForm : Page
	{
		protected HtmlInputFile myFile;
		protected DataView dataView;

		public ArrayList files = new ArrayList();
		static public ArrayList hif = new ArrayList();
		static public int filesUploaded = 0;

		
		

		static IAudioStore direct_db = new AudioStore(new DBAdapter());
		static IAudioStore direct_encoding_db  = new AudioStore(new EncodingAdapter(new DBAdapter(), new OggEncoder()));
		static IAudioStore buffering_db = new AudioStore(new BufferingDBAdapter());
		static IAudioStore buffering_encoding_db = new AudioStore(new EncodingAdapter(new BufferingDBAdapter(), new OggEncoder()));
        static protected IAudioStore audioStore = buffering_encoding_db;
		private static int uploadCnt = 0;
		private static int repID = 0;


		public UploadForm()
		{
			direct_db.Identifier = "direct_db";
			direct_encoding_db.Identifier = "direct_encoding_db";
			buffering_db.Identifier = "buffering_db";
			buffering_encoding_db.Identifier = "buffering_encoding_db";
		}

		protected void Page_Load(object sender, EventArgs e)
		{
			// Hier Benutzercode zur Seiteninitialisierung einf�gen
		}

		#region Vom Web Form-Designer generierter Code
		override protected void OnInit(EventArgs e)
		{
			dataView = audioStore.GetUploadedFileView();

			//
			// CODEGEN: Dieser Aufruf ist f�r den ASP.NET Web Form-Designer erforderlich.
			//
			InitializeComponent();
			base.OnInit(e);
		}
		
		/// <summary>
		/// Erforderliche Methode f�r die Designerunterst�tzung. 
		/// Der Inhalt der Methode darf nicht mit dem Code-Editor ge�ndert werden.
		/// </summary>
		private void InitializeComponent()
		{    

		}
		#endregion

//		private void GridLoad(object sender, EventArgs e)
//		{
//			grid.HeaderStyle.Font.Bold = true;
//			grid.DataSource = dataView;
//			grid.DataBind();
//		}

		/// <summary>
		/// AddFile will add the path of the client side file that is currently in the 
		/// PostedFile
		/// property of the HttpInputFile control to the listbox.
		/// </summary>
		/// <param name="sender"></param>
		/// <param name="e"></param>
		protected void AddFile_Click(object sender, EventArgs e)
		{
			if (Page.IsPostBack == true)
			{
				hif.Add(FindFile);
				ListBox1.Items.Add(FindFile.PostedFile.FileName);
			}
			else
			{
                
			}
		}

		/// <summary>
		/// RemvFile will remove the currently selected file from the listbox.
		/// </summary>
		/// <param name="sender"></param>
		/// <param name="e"></param>
		protected void RemvFile_Click(object sender, EventArgs e)
		{
			if(ListBox1.Items.Count != 0)
			{
				hif.RemoveAt(ListBox1.SelectedIndex);
				ListBox1.Items.Remove(ListBox1.SelectedItem.Text);
			}
        
		}

		/// <summary>
		/// Upload_ServerClick is the server side script that will upload the files to 
		/// the web server
		/// by looping through the files in the listbox.
		/// </summary>
		/// <param name="sender"></param>
		/// <param name="e"></param>
		public void Upload_ServerClick(object sender, EventArgs e)
		{
			string baseLocation = "C:\\temp\\";
			string status = "";
            
			if((ListBox1.Items.Count == 0) && (filesUploaded == 0))
			{
				Label1.Text = "Error - a file name must be specified.";
				return;

			}
			else
			{
				foreach(HtmlInputFile HIF in hif)
				{
					try
					{
						string fn = audioStore.HandleUpload(HIF.PostedFile);
						status += fn + "<br>";
					}
					catch(Exception err)
					{
						Label1.Text = "Error saving file " + baseLocation
							+ "<br>" + err.ToString();
					}
				}

				audioStore.FinalizeUpload(); // for the BufferingDBAdapter to finish

				if(filesUploaded == hif.Count)
				{
					Label1.Text = "These " + filesUploaded + " file(s) were "
						+ "uploaded:<br>" + status;
				}
				hif.Clear();
				ListBox1.Items.Clear();
			}
			
			uploadCnt++;
			if (uploadCnt >= 100)
			{
				SaveTimes();
				ChangeStrategy();
				repID++;
				uploadCnt = 0;
			}

			Response.Redirect("UploadForm.aspx"); // to reload the table
		}

		private void ChangeStrategy()
		{
			if (audioStore.Identifier.Equals("direct_db"))
			{
				audioStore = direct_encoding_db; 
				return;
			}
			if (audioStore.Identifier.Equals("direct_encoding_db"))
			{
				audioStore = buffering_db; 
				return;
			}
			if (audioStore.Identifier.Equals("buffering_db"))
			{
				audioStore = buffering_encoding_db; 
				return;
			}
			if (audioStore.Identifier.Equals("buffering_encoding_db"))
			{
				audioStore = direct_db; 
				return;
			}
		}

		private void SaveTimes()
		{
			string fileName = DateTime.Now.Day.ToString() + "measure_" + repID + "_" + GetCurrentStrategyName() + "_" + ".xml";
			CallLogger.SaveLoggedInformationXML(fileName);
			CallLogger.ResetLogger();
		}

		private string GetCurrentStrategyName()
		{
			return audioStore.Identifier;
		}

		protected void Button1_Click(object sender, EventArgs e)
		{
			CallLogger.SaveLoggedInformationXML("measure.xml");
		}


	}
}
