import java.util.Scanner;

/**
 * 
 * Ejercicio 14, Escribe un programa que pida una base y un exponente 
 * (entero positivo) y que calcule la potencia.
 * 
 * Nombre del archivo: Ejercicio14.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio14 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduce una base: ");
		int base = datos.nextInt();
		System.out.print("Introduce un exponente: ");
		int exponente = datos.nextInt();
		
		int aux = base;
		
		for (int i = 0; i < exponente; i++) {
		
		  base = base * aux;
			
			System.out.println(base);
		}
		
		
	}
}
