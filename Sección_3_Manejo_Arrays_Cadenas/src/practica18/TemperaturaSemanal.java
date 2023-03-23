package practica18;

import java.util.Scanner;

public class TemperaturaSemanal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double [] temperaturaSemana = new double [7];
		double temperaturaDia;
		double promedio = 0;
		
		for (int i=1 ; i<= temperaturaSemana.length ; i++) {
			System.out.println("Temperatura del día " + i + ": ");
			temperaturaDia= sc.nextDouble();
			temperaturaSemana[i-1] = temperaturaDia;
			promedio += temperaturaDia;
			
		}
		
		
		for (int i=1 ; i<= temperaturaSemana.length ; i++) {
			if(temperaturaSemana[i-1] < 0) {
				System.out.println("El día " + i + " se ha bajado de los 0º");
			}
		}
		
		promedio /= temperaturaSemana.length;
		System.out.println("La temperatura media de la semana es de: " + Math.round(promedio*100d)/100d + "º");
	}

}
