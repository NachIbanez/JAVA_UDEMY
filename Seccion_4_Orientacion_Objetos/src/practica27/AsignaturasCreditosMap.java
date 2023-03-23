package practica27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AsignaturasCreditosMap {

	public static void main(String[] args) {
		
		Map<String,Integer> alumnos = new HashMap<String,Integer>(); // No se puede almacenar en un mapa tipos primitivos de datos
		Scanner sc = new Scanner(System.in);
		
		String asignatura = " ";
		Integer creditos = 0;
		int creditosTotales = 0;
		
		System.out.println("---Calculadora de creditos universitarios---\n");
		System.out.println("---Para finalizar el programa no introducir asignatura 'finalizar'---\n");
		
		int opcion = 0;
		
		while (opcion != 2) {
			System.out.println("Introduce una opción");
			System.out.println("1 - Introducir asignatras y créditos");
			System.out.println("2 - Salir");
			opcion = sc.nextInt();
			sc.nextLine(); // Limpiamos el buffer para que no falle el scanner luego a la hora de pedir asignatura, ya que leera un salto de linea que no deseamos si no lo limpiamos
			
			if (opcion == 1) {
				System.out.print("Introduce una asignatura: ");
				asignatura = sc.nextLine();
				System.out.print("Introduce los créditos: ");
				creditos = sc.nextInt();
				alumnos.put(asignatura,creditos);	
			}
			
		}
		
		for(String a: alumnos.keySet()) {
			creditosTotales += alumnos.get(a);
		}
		
		System.out.println("Tienes un total de " + creditosTotales + " creditos por cursar");
	}

}
