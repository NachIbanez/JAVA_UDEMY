package practica24;

public class Diputado extends Legislador {
	
	
	public Diputado(String nombre, String apellidos, int edad, boolean casado, String provincia, String partidoPolitico,
			int numeroDespacho) {
		super(nombre, apellidos, edad, casado, provincia, partidoPolitico, numeroDespacho);
	}

	public String getCamaraEnQueTrabaja() {
		return "Trabaja en el Congreso";
	}

}
