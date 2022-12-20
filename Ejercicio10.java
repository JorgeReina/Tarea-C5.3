import java.util.Scanner;

/**
 * 
 * Ejercicio 10, Escribe un programa que calcule la media de un conjunto
 * de números positivos introducidos por teclado.
 * 
 * Nombre del archivo: Ejercicio10.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio10 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce una serie de números, para terminar introuce un nº negativo.");
		
		int numero = 1;
		int digitosIntroducidos = 0;
		int total = 0;
		String recuento = " ";
		
		while (numero > 0) {
			numero = datos.nextInt();
			
			recuento += numero + " ";
			total = total + numero;
			digitosIntroducidos++;
		}
		
    double media = total / (digitosIntroducidos - 1);
    
    //Mostramos por pantalla el resultado.
    System.out.printf("Cantidad de numeros introducidos: %s\n", digitosIntroducidos - 1);
    System.out.printf("Media = %s\n", media);
    System.out.printf("Todos los numeros introducidos =%s", recuento);
		
	}
}
