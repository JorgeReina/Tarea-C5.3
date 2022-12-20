import java.util.Scanner;

/**
 * 
 * Ejercicio 18, Escribe un programa que obtenga los números enteros comprendidos entre dos 
 * números introducidos por teclado y validados como distintos, el programa debe 
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * Nombre del archivo: Ejercicio18.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio18 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int n1 = datos.nextInt();
		System.out.print("Introduce un segundo número: ");
		int n2 = datos.nextInt();
		
		if ( n1 > n2 ) {
			for (int i = n2; i < n1; i++) {
				System.out.println(n2);
				n2 += 7; 
			}
		} else if ( n2 > n1 ) {
			for (int i = n1; i < n2; i++) {
				System.out.println(n1);
				n1 += 7; 
			}
		} else {
			System.out.print("Los números introducidos son iguales.");
		}
		
	}
}
