package practica19;

public class AlumnosPromocionados {

	public static void main(String[] args) {

		String [][] notasAlumnos = {{"pepe","6.2","7.1","8.4"},{"ana","6.7","4.5","5.5"},{"juanjo","3.2","4.3","5.2"},{"jaimito","9.2","8.8","7.4"}};
		
		double notaFinal = 0;
		
		for (int i=0; i<=notasAlumnos.length-1; i++) {
			notaFinal = 0.4*((Double.parseDouble(notasAlumnos[i][1])+Double.parseDouble(notasAlumnos[i][2]))/2)+0.6*(Double.parseDouble(notasAlumnos[i][1])); //parseDouble nos permite pasar un string a tipo double
			if (notaFinal > 5) {
				System.out.println(notasAlumnos[i][0] + " ha aprobado la asignatura con un " + notaFinal);
			} else {
				System.out.println(notasAlumnos[i][0] + " ha suspendido la asignatura con un " + notaFinal);
			}
		}
	}

}
