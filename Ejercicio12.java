import java.util.Scanner;

/**
 * 
 * Ejercicio 12, Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. 
 * 
 * Nombre del archivo: Ejercicio12.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio12 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Programa que muestra la serie de Fibonachi.");
		System.out.print("Introduce n: ");
		int n = datos.nextInt();
		
		switch (n) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int f1 = 0;
        int f2 = 1;
        int aux;
        while(n > 2) {
          aux = f1;
          f1 = f2;
          f2 = aux + f2;
          System.out.print(" " + f2);
          n--;
        }
    }
    
    System.out.println();
		
	}
}
