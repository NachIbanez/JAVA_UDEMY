package practica16;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una cadena para comprobar si es un palíndromo: ");
		
		String cadena = sc.nextLine();
		
		String cadenaInvertida = "";
		boolean esPalindromo = false;
		
		for (int i=cadena.length()-1; i>=0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		
		System.out.println(cadena + " <---> " + cadenaInvertida);
		
		esPalindromo = cadena.equals(cadenaInvertida);
		
		if (esPalindromo) {
			System.out.println("Es palíndromo");
		} else {
			System.out.println("No es palíndromo");
		}
		
		
		
	}

}
