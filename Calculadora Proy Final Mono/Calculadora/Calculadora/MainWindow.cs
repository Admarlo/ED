using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnSumarBClicked (object sender, EventArgs e)
	{
		int a, b, c;
		a = Convert.ToInt32 (num1.Text);
		b = Convert.ToInt32 (num2.Text);
		c = a + b;
		resultado.Text = c.ToString ();
	}

	protected void OnBorraBClicked (object sender, EventArgs e)
	{
		num1.Text = num2.Text = resultado.Text = "";
	}

	protected void OnRestaClicked (object sender, EventArgs e)
	{
		int a, b, c;
		a = Convert.ToInt32 (num1.Text);
		b = Convert.ToInt32 (num2.Text);
		c = a - b;
		resultado.Text = c.ToString ();
	}

	protected void OnMultiplicaClicked (object sender, EventArgs e)
	{
		int a, b, c;
		a = Convert.ToInt32 (num1.Text);
		b = Convert.ToInt32 (num2.Text);
		c = a * b;
		resultado.Text = c.ToString ();
	}

	protected void OnDivideClicked (object sender, EventArgs e)
	{
		int a, b, c;
		a = Convert.ToInt32 (num1.Text);
		b = Convert.ToInt32 (num2.Text);
		c = a / b;
		resultado.Text = c.ToString ();
	}
}
