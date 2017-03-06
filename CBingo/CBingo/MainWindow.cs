using System;
using System.Diagnostics;
using Gtk;
using System.Collections.Generic;

using CBingo;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
		Bombo bombo=new Bombo();
		Panel panel = new Panel ();

		vBoxMain.Add (panel.Table);//c#
		//vBoxMain.Add(panel.getTable()); //java

		vBoxMain.Add (table);

		Random random = new Random ();
		buttonGoForward.Clicked += delegate {
			int bola = bombo.SacarBola();
			panel.MarcarNumero(bola);
			Process.Start("espeak","-v es"+ EspeakHelper.ToEspeak(bola));
			buttonGoForward.Sensitive=bombo.QuedanBolas;
		}
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
