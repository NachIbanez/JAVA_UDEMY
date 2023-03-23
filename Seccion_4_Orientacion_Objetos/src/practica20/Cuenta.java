package practica20;

public class Cuenta {

	//Atributos
	private String titular;
	private double cantidad;
	
	//Constructor
	public Cuenta() {
		
	}
	
	public Cuenta(String titular) {
		this.titular = titular;
	}
	
	//Métodos
	public void ingresar (double cantidad) {
		if(cantidad > 0) {
			this.cantidad += cantidad;
		}
	}
	
	public void retirar (double cantidad) {
		this.cantidad -= cantidad;
		if(this.cantidad < 0) {
			this.cantidad = 0;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
