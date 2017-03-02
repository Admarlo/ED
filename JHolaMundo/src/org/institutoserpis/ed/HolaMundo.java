package org.institutoserpis.ed;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("dime tu edad: ");
		String edad = scanner.nextLine();
		int edadSiguiente = Integer.parseInt(edad) + 1;
		System.out.println("Hola " + nombre + " el año que viene tendrás " + edadSiguiente + " años.");
	}

}
