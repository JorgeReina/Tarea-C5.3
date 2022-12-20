import java.util.Scanner;

/**
 * 
 * Ejercicio 11, Escribe un programa que muestre en tres columnas, el cuadrado
 * y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * Nombre del archivo: Ejercicio11.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio11 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int numero = datos.nextInt();
		
		for (int i = 0; i < 5; i++) {
			
			int n1 = numero * numero;
			int n2 = numero * numero * numero;
			
			System.out.printf("%s %s %s\n", numero, n1, n2);
			
			numero++;
			
		}
		
	}
}
