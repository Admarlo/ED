using System;
using System.Collections.Generic;

namespace CBingo
{
	public class Bombo
	{//deberemos utilizar test unitarios para resolverlo

		private IList<int>bolas=new List<int>();
		private Random Random=new Random();
		public Bombo ()
		{
			for(int numero=1;numero<=90;numero++)
				bolas.Add(numero);
		}

		public int SacarBola(){
			int index = Random.Next (bolas.Count);
			int bola = bolas [index];
			bolas.Remove (bola);
			return bola;
		}
		public bool QuedanBolas(){
			return bolas.Count > 0;
		}
	}
}
