import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AccesoBD {

	public static void main(String[] args) {

		//insertarAlumno();
		//actualizarAlumno();
		//eliminarAlumno();
		mostrarAlumnos();
		
	}
	
	public static void insertarAlumno() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación, introduzca los datos necesarios para añadir un alumno a la BBDD");
		System.out.print("Introduzca el ID del alumno: ");
		String id = sc.nextLine();
		System.out.print("Introduzca el Nombre del alumno: ");
		String nombre = sc.nextLine();
		System.out.print("Introduzca la Edad del alumno: ");
		int edad = sc.nextInt();
		sc.close();
		
		DBConnection con = new DBConnection(); // conectar con la BBDD
		
		String sql = "INSERT INTO ALUMNO VALUES('" + id + "', '" + nombre + "', " + edad + ")"; // Creamos la sentencia SQL que queramos ejecutar y la guardamos en un string
				
		
		try {
			Statement st = con.getConnection().createStatement(); // Los statements son una extensión de java que permite ejecutar sentencias SQL
			st.executeQuery(sql); // Ejecutamos la Query
			System.out.println("Inserción realizada con éxito");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		con.Desconectar(); // desconectar de la BBDD
		
	}
	
	public static void actualizarAlumno() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta el ID del alumno que deseas actualizar: ");
		String id = sc.nextLine();
		System.out.print("Inserta el nuevo nombre que deseas actualizar: ");
		String nombre = sc.nextLine();
		System.out.print("Inserta la nueva edad que deseas actualizar: ");
		int edad = sc.nextInt();
		sc.close();
		
		DBConnection con = new DBConnection(); // conectar con la BBDD
		
		String sql = "UPDATE ALUMNO SET NOMBRE = '" + nombre + "', EDAD = " + edad + " WHERE ID = '" + id + "'"; // Creamos la sentencia SQL que queramos ejecutar y la guardamos en un string
		
		try {
			Statement st = con.getConnection().createStatement(); // Los statements son una extensión de java que permite ejecutar sentencias SQL
			st.executeQuery(sql); // Ejecutamos la Query
			System.out.println("Alumno actualizado");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

		con.Desconectar(); // desconectar de la BBDD


	
	}
	
	public static void eliminarAlumno() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta el ID del alumno que deseas eliminar: ");
		String id = sc.nextLine();
		sc.close();
		
		DBConnection con = new DBConnection(); // conectar con la BBDD
		
		String sql = "DELETE FROM ALUMNO WHERE ID = '" + id + "'"; // Creamos la sentencia SQL que queramos ejecutar y la guardamos en un string
		
		try {
			Statement st = con.getConnection().createStatement(); // Los statements son una extensión de java que permite ejecutar sentencias SQL
			st.executeQuery(sql); // Ejecutamos la Query
			System.out.println("Alumno eliminado");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

		con.Desconectar(); // desconectar de la BBDD


	
	}
	
	public static void mostrarAlumnos() {
		
		System.out.print("--LISTA DE ALUMNOS-- ");
	
		DBConnection con = new DBConnection(); // conectar con la BBDD
		
		String sql = "SELECT * FROM ALUMNO"; // Creamos la sentencia SQL que queramos ejecutar y la guardamos en un string
		
		try {
			Statement st = con.getConnection().createStatement(); // Los statements son una extensión de java que permite ejecutar sentencias SQL
			ResultSet rs = st.executeQuery(sql); // Ejecutamos la Query para un SELECT, tenemos que almacenar en un objeto RESULT SET los registros del select
			
			while (rs.next()) { // Recorremos el objeto anterior para que mientras haya un registro en siguiente/next siga recorriendo y mostrando
				String id = rs.getString("id");
				String nombre = rs.getString("nombre");
				int edad = rs.getInt("edad");

				System.out.println("Alumno con ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

		con.Desconectar(); // desconectar de la BBDD


	
	}
	
}
