package practica4;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("-------------CALCULADORA DE AREAS DE TRIANGULOS-------------\n");
		System.out.print("Introduzca la base del triangulo (cm):");
		double base_cm = sc.nextDouble();
		System.out.print("Introduzca la altura del triangulo (cm):");
		double altura_cm = sc.nextDouble();
		
		double area_m = ((base_cm * altura_cm)/2)/100;
		
		System.out.println("\nEl área del triángulo es " + area_m + " metros");
			
		
		

	}

}
