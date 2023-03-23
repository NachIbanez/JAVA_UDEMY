package practica26;

public class AguaMineral extends Bebida{
	
	private String origen;

	public AguaMineral(int identificador, int capacidad, String marca, double precio, String origen) {
		super(identificador, capacidad, marca, precio);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String toString() {
		return super.toString() + "AguaMineral [origen=" + origen + "]";
	}
	
	
	
	

}
