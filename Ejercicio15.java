import java.util.Scanner;

/**
 * 
 * Ejercicio 15, Escribe un programa que dados dos números, uno real (base) y un entero 
 * positivo (exponente), saque por pantalla todas las potencias con base el 
 * numero dado y exponentes entre uno y el exponente introducido.
 * 
 * Nombre del archivo: Ejercicio15.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio15 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduce una base: ");
		int base = datos.nextInt();
		System.out.print("Introduce un exponente: ");
		int exponente = datos.nextInt();
		
		int potencia = base;
		int aux = base;
		
		for (int i = 1; i < exponente+1; i++) {
		
		  potencia = potencia * aux;
		  
		  System.out.println(base + "^" + i + " = " + potencia);
			
		}
		
	}
}
		
		
