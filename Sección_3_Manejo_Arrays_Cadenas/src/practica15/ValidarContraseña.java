package practica15;

import java.util.Scanner;

public class ValidarContraseña {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una contraseña (que tenga entre 10-20 caractereses y contenga uno de los siguientes caracteres * - _): ");
		
		String passwd = sc.nextLine();
		boolean valido = false;
		
		if (passwd.length() >= 10 && passwd.length() <= 20 ) {
			for(int i=0; i<=passwd.length()-1; i++) {
				if (passwd.charAt(i) == '*' || passwd.charAt(i) == '-' || passwd.charAt(i) == '_') {
					valido = true;
				}
			}
		} else {
			System.out.println("El número de caracteres debe estar entre 10 y 20");
		}
		
		if (valido == true) {
			System.out.println("Contraseña válida");
		} else {
			System.out.println("Contraseña no válida");
		}

	}

}
