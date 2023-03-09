package practica3;

import java.util.Scanner;

public class ConversorMonedas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("---------------CONVERSOR DE EUROS A DÓLARES---------------");
		System.out.print("Introduzca la cantidad de euros a convertir: ");
		double euros = sc.nextDouble();
		
		double dolares = euros * 1.12;
		
		System.out.println("\n\n");

		System.out.println(euros + " euros son un total de " + dolares + " dólares");
		

	}

}
