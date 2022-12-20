import java.util.Scanner;

/**
 * 
 * Ejercicio 16, Escribe un programa que diga si un número introducido por teclado es o no 
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
 * 
 * Nombre del archivo: Ejercicio16.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio16 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int n = datos.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        primo = false;
      }
    }
    
    if (primo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }
		
	}
}
