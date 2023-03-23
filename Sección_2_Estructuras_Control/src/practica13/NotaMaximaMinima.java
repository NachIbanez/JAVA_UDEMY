package practica13;

import java.util.Scanner;

public class NotaMaximaMinima {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int notaIntroducida = 0;
		int notaMaxima = -1;
		int notaMinima = 11;
		System.out.println("----Introduce tantos notas de examen como quiera, cuando desee parar introduzca un numero no comprendido entre 0 y 10----");
		System.out.println("Introduzca notas a continuación");
		
		while (notaIntroducida >= 0 && notaIntroducida <= 10) {
			
			notaIntroducida = sc.nextInt();
			
			if (notaIntroducida > notaMaxima && notaIntroducida <= 10) {
				notaMaxima = notaIntroducida;
			} 
			if (notaIntroducida < notaMinima && notaIntroducida >= 0){
				notaMinima = notaIntroducida;
			}
			
		}
		
		System.out.println("La nota máxima ha sido: " + notaMaxima);
		System.out.println("La nota mínima ha sido: " + notaMinima);

	}

}
