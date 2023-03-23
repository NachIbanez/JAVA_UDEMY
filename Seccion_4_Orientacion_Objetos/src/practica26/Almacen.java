package practica26;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
	
	private List<Bebida> Bebidas = new ArrayList<Bebida>();

	public Almacen(List<Bebida> bebidas) {
		Bebidas = bebidas;
	}

	public List<Bebida> getBebidas() {
		return Bebidas;
	}

	public void setBebidas(List<Bebida> bebidas) {
		Bebidas = bebidas;
	}

	public String toString() {
		return "Almacen [Bebidas=" + Bebidas + "]";
	}
	
	public void AgregarBebida(Bebida bebida) {

		boolean duplicado = false;		
		
		for (Bebida b: Bebidas) {
					
			if (b.getIdentificador() == bebida.getIdentificador()) {
				
				duplicado = true;
			}
			
		}
		
		if (duplicado == false) {
			
			Bebidas.add(bebida);
			System.out.println("Se ha añadido la bebida " + bebida.toString());
			
		} else {
			System.out.println("Identificador repetido, no se ha añadido ninguna bebida al almacén");
		}
			
	}
	
	public void EliminarBebida(int identificador) {
				
		for (Bebida b: Bebidas) {
			if (b.getIdentificador() == identificador) {
				
				Bebidas.remove(Bebidas.indexOf(b));
				System.out.println("Se ha eliminado la bebida con identificador " + identificador);
			}
		}
	}
	
	public void CalcularPrecioTotalMarca(String marca) {
		
		double PrecioTotalMarca = 0;
		
		for(Bebida b: Bebidas) {
			
			if(b.getMarca() == marca) {
				
				PrecioTotalMarca += b.getPrecio();
				
			}
		}
		
		if (PrecioTotalMarca > 0) {			
			System.out.println("El precio total de las bebidas de la marca " + marca + " es " + PrecioTotalMarca);			
		} else {
			System.out.println("No hay bebidas de esa marca");
		}
	}
	
	public void CalcularPrecioTotal() {
		
		double PrecioTotal = 0;
		
		for(Bebida b: Bebidas) {			
			PrecioTotal += b.getPrecio();							
		}
		
		System.out.println("El precio total de las bebidas es " + PrecioTotal);			
				
	}
	
	public void MostrarInformacion() {
		
		for(Bebida b: Bebidas) {			
			System.out.println(b.toString());							
		}
	}
	
	
	
	

}
