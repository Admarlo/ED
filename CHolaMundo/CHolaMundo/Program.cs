using System;

namespace Org.InstitutoSerpis.Ed
{
	class HolaMundo
	{
		public static void Main (string[] args)
		{
			Console.Write ("introduce tu nombre: ");
			string nombre=Console.ReadLine();
			Console.WriteLine ("Hola " + nombre);
		}
	}
}
