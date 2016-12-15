package org.institutoserpis.org;
import java.util.Random;

public class Vector {

	public static void main(String[] args) {

	/*	int index=0;
		while(index<5){
			System.out.println("index="+index);
			index++;
		}
		System.out.println("Fuera del ciclo index="+index);
	*/
		/*
		Random random =new Random();
		int[]v=new int[100];
		//definir el vector: int[]=
		//Crear el array, en este caso de 100 elementos de memoria: =new int[100]
		for(int index=0;index<v.length;index++){
			v[index]=random.nextInt(1000)+1;
			System.out.println(v[index]);
			
	} 
	*/
//	System.out.println("indeOf="+indexOf(v,7));
// }
//
//public static int indexOf(int[]v, int item){
//	int index=0;
//	while (index<v.length&&v[index]!=item)
//		index++;
//	if (index==v.length)//no encontrado
//		return -1;
//	return index;		
//	}

//public static int indexOf(int[]v, int value){
//	for (int index=0; index<v.length;index++)
//	if (v[index]==value)
//		return index;
//	return -1;
//		
//	}

		int index=indexOf(new int[]{32,15,7,9,12},99);
			System.out.println("Vector index=" +index);
		}
		
		public static int indexOf(int[]v, int data){
			//wirth Algoritmos y Estructuras de datos.
//			int index=0;
//			while(index<v.length && v[index]!=data)
//				index++;
//			if(index==v.length)
//				return -1;
//			return index;
			int index=0;
			for (int item:v){
				if (item==data)
					return index;
				index++;
			}
			return -1;
		}
		
		public static int min(int[]v){
			int min=v[0];
//			for(int index=1;index<v.length;index++){
//				if(v[index]<min)
//					min=v[index];
			//implementación complementraria utilixando for (item)
			for(int item:v){
				if(item<min)
					min=item;
			}
			return min;
		}
		
}