package practica23;

public class Vehiculo {
	
	private int num_bastidor;
	private double peso;
	
	public Vehiculo(int num_bastidor, double peso) {
		this.num_bastidor = num_bastidor;
		this.peso = peso;
	}

	public int getNum_bastidor() {
		return num_bastidor;
	}

	public void setNum_bastidor(int num_bastidor) {
		this.num_bastidor = num_bastidor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String toString() {
		return "Vehiculo [num_bastidor=" + num_bastidor + ", peso=" + peso + "]";
	}
	
	public double impuestoBase() {
		return this.peso*0.45;
	}
	
	
	

}
