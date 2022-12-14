import java.util.Scanner;

/**
*
*	Ejercicio 9,  Realiza un programa que nos diga cuántos dígitos tiene un número introducido
*	por teclado. 
* 
*	Nombre del archivo: Ejercicio9.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio9 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca un número.
		System.out.print("Por favor, introduce un número: ");
		int numero = datos.nextInt();
	
		int digito = 1;
		int n = numero;
		
		while (n >= 10) {
			n /= 10;
			digito = digito + 1;
		}
		
		System.out.printf("El número tiene %s dígitos", digito);
		
	}
}
