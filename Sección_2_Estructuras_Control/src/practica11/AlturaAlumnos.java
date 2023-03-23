package practica11;

import java.util.Scanner;

public class AlturaAlumnos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuántos alumnos tiene la clase?: ");
		
		int numeroAlumnos = sc.nextInt();
		
		int alumnosAltos = 0;
		int alumnosBajos = 0;
		double promedioAltura = 0;
		
		for(int i=1; i<=numeroAlumnos; ++i) {
			
			System.out.print("¿Cuánto mide el alumno " + i + "?: ");
			double alturaAlumno = sc.nextDouble();
			
			if (alturaAlumno >= 1.80) {
				alumnosAltos++;
			} else {
				alumnosBajos++;
			}
			
			promedioAltura += alturaAlumno;
					
		}
		
		promedioAltura /= numeroAlumnos;
		
		System.out.println("Hay un total de " + alumnosAltos + " alumnos mas altos de 1.80m");
		System.out.println("Hay un total de " + alumnosBajos + " alumnos mas bajos de 1.80m");
		System.out.println("El promedio de altura de la clase es de " + promedioAltura + "m");


	}

}
