package institutoserpis.org;


import java.util.Scanner;
import java.math.*;

public class Suma {

	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Programa Suma");
//		System.out.print("  Introduce el primer número:");
//		String primerNumero=scanner.nextLine();
//		int primero = Integer.parseInt(primerNumero);
//		System.out.print("Introduce el segundo número: ");
//		String segundoNumero= scanner.nextLine();
//		int segundo= Integer.parseInt(segundoNumero);
//		int suma= primero+segundo;
//		System.out.println("		 La suma es: " +suma);
//		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Programa Suma");
//		System.out.print("  Introduce el primer número:");
//		String primerNumero=scanner.nextLine();
//		Float primero = float.parseFloat(primerNumero);
//		System.out.print("Introduce el segundo número: ");
//		String segundoNumero= scanner.nextLine();
//		Float segundo= float.parseFloat(segundoNumero);
//		Float suma= primero+segundo;
//		System.out.println("		 La suma es: " +suma);
		//El float da problemas al utilizar la suma
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Programa Suma");
		System.out.print(" Introduce el primer número:");
		String primerNumero=scanner.nextLine();
		BigDecimal primero =new BigDecimal(primerNumero);
		System.out.print("Introduce el segundo número: ");
		String segundoNumero= scanner.nextLine();
		BigDecimal segundo= new BigDecimal(segundoNumero);
		BigDecimal suma=BigDecimal.ZERO;
		suma= primero.add(segundo);
		System.out.println("		 La suma es: " +suma);
	}

}
