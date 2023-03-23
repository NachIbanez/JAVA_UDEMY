package practica14;

import java.util.Scanner;

public class NumeroEspacios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introducir una cadena para contar sus espacios: ");
		
		String cadena = sc.nextLine();
		char c;
		int contadorEspacios = 0;
		
		for (int i=0; i <= cadena.length()-1; i++) {
			c = cadena.charAt(i);
			if (c == ' ') {
				contadorEspacios++;
			}
		}
		
		System.out.println("El número de espacios en blanco de tu cadena es de: " + contadorEspacios);

	}

}
