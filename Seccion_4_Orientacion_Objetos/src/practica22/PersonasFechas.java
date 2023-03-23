package practica22;

public class PersonasFechas {

	public static void main(String[] args) {
		
		Fecha fecha1 = new Fecha(9,7,1996);
		Persona persona1 = new Persona("Nacho","Ibáñez",fecha1);
		Fecha fecha2 = new Fecha(15,7,2022);
		Persona persona2 = new Persona("Emiliano","Ibáñez",fecha2);
		Fecha fecha3 = new Fecha(6,6,2015);
		Persona persona3 = new Persona("Tigretón","Ibáñez",fecha3);
		
		Persona[] Personas = {persona1,persona2,persona3};
		
		for (int i=0; i<=Personas.length-1; i++) {
			System.out.println("La fecha de nacimiento de la persona " + (i+1) + " es " + Personas[i].getFechaNacimiento().toString());
		}
		
	}

}
