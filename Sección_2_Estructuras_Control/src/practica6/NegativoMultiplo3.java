package practica6;

import java.util.Scanner;

public class NegativoMultiplo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		int numero = sc.nextInt();
		
		if (numero < 0 && numero%3 == 0) {
			System.out.println("Tu número es negativo y múltiplo de 3");
		} else if (numero%3 == 0) {
			System.out.println("Tu número es multiplo de 3");
		} else if (numero < 0) {
			System.out.println("Tu número es negativo");			
		} else {
			System.out.println("Tu numero no es ni negativo ni múltiplo de 3");
		}

				
	}
}
