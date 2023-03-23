package practica7;

import java.util.Scanner;

public class CalificacionFinal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Qué nota has sacado?: ");
		
		double nota = sc.nextDouble();
		
		if (nota >= 0 && nota < 3) {
			System.out.println("Muy deficiente");
		} else if (nota >= 3 && nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Sobresaliente!!!!");
		} else {
			System.out.println("Nota no válida, tiene que estar entre 0 y 10");
		}

	}

}
