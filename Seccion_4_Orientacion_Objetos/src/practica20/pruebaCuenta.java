package practica20;

public class pruebaCuenta {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 = new Cuenta("Nacho");
		
		cuenta2.ingresar(2000);
		System.out.println(cuenta2.getCantidad());
		cuenta2.retirar(500);
		System.out.println(cuenta2.getCantidad());
		
		System.out.println(cuenta2.toString());

	}

}
