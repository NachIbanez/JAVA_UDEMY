package practica17;

public class ArrayNumerosAleatorios {

	public static void main(String[] args) {

		int[] arrayAleatorios = new int[5];
		int suma = 0;
		
		for(int i=0; i<=arrayAleatorios.length-1; i++) {
			
			arrayAleatorios[i] = (int)Math.floor(Math.random()*(10+1)); //(int) realiza un casting a tipo entero desde un tipo double; floor se queda con la parte entera, trunca la parte decimal ; random()*10+1 hace un numero aleatorio entre 0 y 10
			System.out.println(arrayAleatorios[i]);
			suma += arrayAleatorios[i];
			
		}
		
		System.out.println("La suma de todos los números es de: " + suma);
	}

}
