package practica2;

import java.util.Scanner;

public class MensajeBienvenida {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Introduzca su edad: ");
		int edad = sc.nextInt();
		
		System.out.println("¡Hola " + nombre + ", tienes " + edad + " años!");

	}

}
