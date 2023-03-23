package practica26;

public class BebidasAzucaradas extends Bebida{
	
	private double porcentajeAzucar;
	
	public BebidasAzucaradas(int identificador, int capacidad, String marca, double precio, double porcentajeAzucar) {
		super(identificador, capacidad, marca, precio);
		this.porcentajeAzucar = porcentajeAzucar;
	}
	
	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public String toString() {
		return super.toString() + "BebidasAzucaradas [porcentajeAzucar=" + porcentajeAzucar + "]";
	}

}
