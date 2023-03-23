package practica21;

public class pruebaLibro {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("ISBN 1","La comunidad del anillo","J.R.R. Tolkien",567);
		Libro libro2 = new Libro("ISBN 2","Las dos torres","J.R.R. Tolkien",623);
		Libro libro3 = new Libro("ISBN 3","El retorno del rey","J.R.R. Tolkien",734);
		
		Libro[] libros = new Libro[3];
		
		libros[0] = libro1;
		libros[1] = libro2;
		libros[2] = libro3;
		
		int numeroMayorNumeroPaginas = 0;
		String libroMayorNumeroPaginas = "";
		
		for(int i=0 ; i<=libros.length-1 ; i++) {
			
			System.out.println(libros[i].toString());
			
			if (libros[i].getNumeroPaginas() > numeroMayorNumeroPaginas) {
				numeroMayorNumeroPaginas = libros[i].getNumeroPaginas();
				libroMayorNumeroPaginas = libros[i].getTitulo();
			}
		}
		
		System.out.println("\n--> El libro con mayor número de páginas es '" + libroMayorNumeroPaginas + "' con un total de " + numeroMayorNumeroPaginas + " páginas");

	}

}
