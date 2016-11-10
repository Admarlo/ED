package org.institutoserpis.es;

import java.util.Random;
import java.io.InputStream;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {

		Random random=new Random();
		int numeroAleatorio=random.nextInt(1000)+1;
		System.out.println("Tengo un número escondido entre 1 y 1000 ¡¡ADIVINALO!!");
		System.out.println("numeroAleatorio=" +numeroAleatorio);
		Scanner scanner=new Scanner(System.in);
		//int numero;
		
		/*do{

			System.out.print("Introduce el número: ");
			String line =scanner.nextLine();
			numero=Integer.parseInt(line);
			if(numero<numeroAleatorio)
				System.out.println("El numero escondido es mayor. ");
			
			if(numero>numeroAleatorio)
				System.out.println("El número escondido es menor. ");

		}while (numero!=numeroAleatorio);
				System.out.println("HA ACERTADO :) ");*/
	
	
	 boolean acertado;
	 int contadorIntentos=0;
	do{
		contadorIntentos++;
		System.out.printf("%30s (intento nº %5d)", "Introduzca el número:", contadorIntentos);
		String line =scanner.nextLine();
		int numero=Integer.parseInt(line);
		if(numero<numeroAleatorio)
			System.out.println("El numero escondido es mayor. ");
		
		if(numero>numeroAleatorio)
			System.out.println("El número escondido es menor. ");
	acertado=numero==numeroAleatorio;

	}while (!acertado);
			System.out.printf("HA ACERTADO :)  \nEn el intento nº %d",contadorIntentos);
		
}
}