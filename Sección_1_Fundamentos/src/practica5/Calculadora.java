package practica5;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------CALCULADORA-----------");
		System.out.println("---------------------------------\n");
		
		System.out.print("Introduzca el primer operando: ");
		
		double operando1;
		try {
		operando1 = sc.nextDouble();
		}
		catch(Exception ex) {
			operando1 = 1;
			System.out.println("Valor erróneo, se asignará 1 por defecto");
		}
		
		char operador;
		System.out.print("Introduzca el operador: ");
		try {
			operador = sc.next().charAt(0);
			if ((operador == ('+')) || (operador == ('-')) || (operador == ('*')) || (operador == ('/')) || (operador == ('%')))  {	
			} else {
			System.out.println("El operador no existe. FIN DEL PROGRAMA");
			System.exit(0);
			}
			
			}
			catch(Exception ex) {
				System.out.println("Valor erróneo, se asignará + por defecto");
				operador = '+';
			}
		
			
		double operando2;
		System.out.print("Introduzca el segundo operando: ");
		try {
			operando2 = sc.nextDouble();
			}
			catch(Exception ex) {
				operando2 = 1;
				System.out.println("Valor erróneo, se asignará 1 por defecto");
			}
		
		double resultado = 0;
		switch(operador) {
		
			case '+':{
				resultado = operando1 + operando2;
				break;
			}
			case '-':{
				resultado = operando1 - operando2;
				break;
			}
			case '*':{
				resultado = operando1 * operando2;
				break;
			}
			case '/':{
				try {
				resultado = operando1 / operando2;
				break;
				} catch(Exception ex) {
					System.out.println("No se puede dividir entre cero");
				}
			}
			case '%':{
				resultado = operando1 % operando2;
			}
		}
		
		System.out.println("\n\nEl resultado de la operación es: " + resultado);

	}

}
