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
//		buttonGoFoward.Clicked += delegate {
//			Process.Start("espeak","-v es '" + entryNumero.Text + "'");
//
//		};

//		IList<int> list = new List<int> ();
//		list.Add (16);
//		list.Add (15);
//		list.Add (17);
//		list.Add (5);
//		list.Add (4);
//
//		foreach (int item in list)
//			Console.WriteLine ("item=" + item);
		IList<int> bolas = new List<int> ();
		IList<Button> butons = new List<Button> ();
		for (int numero = 1; numero < 90; numero++){
			bolas.Add (numero);
		uint index = numero - 1;
		Button button = new Button ();
		button.Label = "" + numero;
		button.Visible = true;
		uint row = index / 10;
		uint colum = index % 10;
		table.Attach (button, column, column + 1, row, row + 1);
		butons.Add (buton);
	}
	Table.Visible=true;
		vBoxMain.Add (table);


		Random random = new Random ();
		buttonGoForward.Clicked += delegate {
			int randomIndex = random.Next (bolas.Count);
			int bola = bolas [randomIndex];
			Console.WriteLine ("bola = " + bola);
			bolas.Remove (bola);
			if (bolas.Count == 0) 
				buttonGoForward.Sensitive = false;
			Process.Start ("espeak", "-v es" +EspeakHelper.ToEspeak(bola));
			buttons[bola-1].ModifyBg(StateType.Normal, new Gdk.Color (0, 255, 0));

		};

//	for (int vez = 0; vez < int.MaxValue; vez++) {
//		int numeroAleatorio = random.Next (1000);
//		if (numeroAleatorio < 5 || numeroAleatorio >= 995) 
//			Console.WriteLine (" vez=" + vez + "numeroAleatorio = " + numeroAleatorio);
//	}

	}

	protected void OnDeleteEvent(object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
