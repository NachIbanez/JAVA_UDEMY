package practica23;

public class HerenciaVehículos {

	public static void main(String[] args) {
		
		Electrico cocheElectrico = new Electrico(1,2500,50000);
		Combustion cocheCombustion = new Combustion(2,3000,1500);

		System.out.println(cocheElectrico.toString());
		System.out.println(cocheCombustion.toString());
		
		System.out.println(cocheElectrico.impuestoTotal());
		System.out.println(cocheCombustion.impuestoTotal());
		


		
	}

}
