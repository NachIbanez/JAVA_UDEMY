package practica24;

public abstract class Legislador extends Persona{
	
	private String provincia;
	private String partidoPolitico;
	private int numeroDespacho;
	
	
	public Legislador() {
		super();
	}


	public Legislador(String nombre, String apellidos, int edad, boolean casado, String provincia, String partidoPolitico, int numeroDespacho) {
		super(nombre,apellidos,edad,casado);
		this.provincia = provincia;
		this.partidoPolitico = partidoPolitico;
		this.numeroDespacho = numeroDespacho;
	}
	
	public abstract String getCamaraEnQueTrabaja();


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getPartidoPolitico() {
		return partidoPolitico;
	}


	public void setPartidoPolitico(String partidoPolitico) {
		this.partidoPolitico = partidoPolitico;
	}


	public int getNumeroDespacho() {
		return numeroDespacho;
	}


	public void setNumeroDespacho(int numeroDespacho) {
		this.numeroDespacho = numeroDespacho;
	}


	public String toString() {
		return super.toString() + "Legislador [provincia=" + provincia + ", partidoPolitico=" + partidoPolitico + ", numeroDespacho="
				+ numeroDespacho + "]";
	}
	
	

	
	

}
