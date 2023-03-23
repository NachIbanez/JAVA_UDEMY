package practica8;

import java.util.Scanner;

public class PrecioTotalCompra {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuánto cuesta el producto que deaseas comprar?: ");
		double precio = sc.nextDouble();
		
		System.out.print("¿Cuántas unidades quieres del producto?: ");
		int unidades = sc.nextInt();
		
		double precioTotal = precio * unidades;
		System.out.println("El precio total a pagar es de: " + precioTotal + "$");
		
		if (precioTotal < 100) {
			System.out.println("No tiene derecho a descuento por ser una comprar menor a 100$");
		} else if (precioTotal > 200) {
			precioTotal = precioTotal * 0.85;
			System.out.println("Se le aplica un descueto del 15% y el precio final será de " + precioTotal + "$");
		} else {
			precioTotal = precioTotal * 0.90;
			System.out.println("Se le aplica un descueto del 10% y el precio final será de " + precioTotal + "$");
		}

	}

}
