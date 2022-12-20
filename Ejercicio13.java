import java.util.Scanner;

/**
 * 
 * Ejercicio 13, Escribe un programa que lea una lista de diez números y 
 * determine cuántos son positivos, y cuántos son negativos.
 * 
 * Nombre del archivo: Ejercicio13.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio13 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		String positivo = " ";
		int numeroP = 0;
		String negativo = " ";
		int numeroN = 0;
		
		System.out.println("Introduce 10 números: ");
		
		for (int i = 0; i < 10; i++){
			
			int n = datos.nextInt();
			
			if ( n > 0 ) {
				positivo += n + " ";
				numeroP++;
			} else {
				negativo += n + " ";
				numeroN++;
			}
			
		}
		
		System.out.println();
		System.out.printf("%s han sido números positivos.\n", numeroP);
		System.out.printf("Y son los siguientes: %s\n", positivo);
		System.out.println();
		System.out.printf("%s han sido números positivos.\n", numeroN);
		System.out.printf("Y son los siguientes: %s\n", negativo);
		
	}
}
