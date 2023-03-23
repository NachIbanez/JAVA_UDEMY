package practica28;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoConcesionario {
	
	private static int indice = 0;
	private static List<Coche> coches = new ArrayList<Coche>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		System.out.println("--CATÁLOGO CONCESIONARIO--");
		
		cargarCoches();
		mostrarCoche();
		mostrarMenu();
		opcion = sc.nextInt();
		
		while (opcion != 3) {
			
			if (opcion == 1) {
				if (indice == coches.size()-1) {
					indice = 0;			
				} else {
					indice++;
				}
				mostrarCoche();
			}
			else if (opcion == 2) {
				if (indice == 0) {
					indice = coches.size()-1;
				} else {
					indice--;
				}
				mostrarCoche();
			}
			mostrarMenu();
			opcion = sc.nextInt();


		}
		
		sc.close();


	}
	
	public static void cargarCoches() {
		
		DBConnectionConcesionario con = new DBConnectionConcesionario(); // conectar con la BBDD	
		String sql = "SELECT * FROM COCHES";
		
		try {
			Statement st = con.getConnection().createStatement(); // Los statements son una extensión de java que permite ejecutar sentencias SQL
			ResultSet rs = st.executeQuery(sql); // Ejecutamos la Query para un SELECT, tenemos que almacenar en un objeto RESULT SET los registros del select
			
			while (rs.next()) { // Recorremos el objeto anterior para que mientras haya un registro en siguiente/next siga recorriendo y mostrando
				String matricula = rs.getString("matricula");
				String marca = rs.getString("marca");
				String modelo = rs.getString("modelo");
				String color = rs.getString("color");
				int anio = rs.getInt("anio");
				int precio = rs.getInt("precio");

				Coche c = new Coche(matricula,marca,modelo,color,anio,precio);
				coches.add(c);
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		con.Desconectar(); // desconectar de la BBDD		
	}
	
	public static void mostrarCoche() {
		System.out.println(coches.get(indice).toString());
	}
	
	public static void mostrarMenu() {
		System.out.println("1-SIGUIENTE:");
		System.out.println("2-ANTERIOR");
		System.out.println("3-SALIR");
		System.out.println("Seleccionar una opción:");

	}
}
