package practica23;

public class Combustion extends Vehiculo{
	
	private int cilindrada;
	
	
	
	public Combustion(int num_bastidor, double peso, int cilindrada) {
		super(num_bastidor, peso);
		this.cilindrada = cilindrada;
	}
	
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	

	public String toString() {
		return super.toString() + "Combustion [cilindrada=" + cilindrada + "]";
	}


	public double impuestoTotal() {
		return super.impuestoBase()+3*cilindrada;
	}

}
