import java.util.Scanner;

/**
 * 
 * Ejercicio 17, Realiza un programa que sume los 100 números siguientes a un número entero 
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido 
 * es correcto (que es un número positivo).
 * 
 * Nombre del archivo: Ejercicio17.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio17 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int numero = datos.nextInt();
		
		int n = numero;
		
		if ( numero > 0 ) {
			for (int i = numero+1; i < numero+100; i++) {
				System.out.println(n);
				n += i;
			}
		} else {
			System.out.print("El dato introducido no es valido.");
		}
		
	}
}
