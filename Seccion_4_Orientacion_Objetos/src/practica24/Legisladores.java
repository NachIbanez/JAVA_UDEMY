package practica24;

public class Legisladores {

	public static void main(String[] args) {
		
		Legislador l1 = new Diputado("Emiliano","Ibáñez",1,false,"Madrid","Gatuno",635);
		Legislador l2 = new Senador("Tigretón","Ibáñez",8,true,"Madrid","Gatuno",54);
		Legislador l3 = new Senador("Nacho","Ibáñez",26,true,"Madrid","Gatuno",1);
		
		Legislador[] ListaLegisladores = {l1,l2,l3};
		
		for(Legislador leg: ListaLegisladores) {
			System.out.println(leg.getCamaraEnQueTrabaja());
		}

		
	}

}
