package practica25;

public class InterfazAcciones {

	public static void main(String[] args) {

		Persona p1 = new Persona();
		Gallo g1 = new Gallo();
		Canario c1 = new Canario();
		
		p1.andar();
		p1.cantar();
		g1.andar();
		g1.cantar();
		c1.andar();
		c1.cantar();
		
	}

}
