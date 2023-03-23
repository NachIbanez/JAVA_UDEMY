package practica26;

import java.util.ArrayList;
import java.util.List;

public class AlmacenBebidas {

	public static void main(String[] args) {

		Bebida b1 = new AguaMineral(1,100,"Bezoya",1.50,"Montañas Rocosas");
		Bebida b2 = new AguaMineral(2,150,"Lanjarón",2.15,"Andorra");
		Bebida b3 = new BebidasAzucaradas(3,50,"Monster",2.50,0.15);
		Bebida b4 = new BebidasAzucaradas(4,50,"Energety",1.90,0.13);
		
		List<Bebida> listaBebidas = new ArrayList<Bebida>();
		
		Almacen almacen = new Almacen(listaBebidas);
		
		almacen.AgregarBebida(b1);
		almacen.AgregarBebida(b2);
		almacen.AgregarBebida(b3);
		almacen.AgregarBebida(b4);
		
		almacen.AgregarBebida(b4);
		
		almacen.EliminarBebida(3);
		
		almacen.AgregarBebida(b3);
		
		almacen.CalcularPrecioTotal();
		almacen.CalcularPrecioTotalMarca("Monster");
		almacen.MostrarInformacion();
		
		
	}

}
