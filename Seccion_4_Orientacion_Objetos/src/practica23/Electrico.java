package practica23;

public class Electrico extends Vehiculo {
	
	private double precio;
	
	public Electrico(int num_bastidor, double peso, int precio) {
		super(num_bastidor, peso);
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String toString() {
		return super.toString() + "Electrico [precio=" + precio + "]";
	}

	public double impuestoTotal() {
		return super.impuestoBase()+1.09*precio;
	}

}
