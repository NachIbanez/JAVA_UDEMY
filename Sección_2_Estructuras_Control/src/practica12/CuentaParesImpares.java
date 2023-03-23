package practica12;

import java.util.Scanner;

public class CuentaParesImpares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numeroIntroducido = 1;
		int contadorPares = 0;
		int contadorImpares = 0;
		
		System.out.println("----Introduce tantos números como quiera, cuando desee parar introduzca 0----");
		System.out.println("Introduzca numeros enteros a continuación");

		while(numeroIntroducido != 0) {
			
			numeroIntroducido = sc.nextInt();
			
			if (numeroIntroducido%2 == 0) {
				contadorPares++;
			} else {
				contadorImpares++;
			}
						
		}
		
		System.out.println("Has introducido un total de " + contadorPares + " numero pares y " + contadorImpares + " numeros impares");

	}

}
