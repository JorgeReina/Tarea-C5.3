import java.util.Scanner;

/**
 * 
 * Ejercicio 20, Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * Nombre del archivo: Ejercicio20.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio20 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduce la altura de la piramide: ");
    int alturaIntroducida = datos.nextInt();
    System.out.print("Introduce relleno de la piramide: ");
    String relleno = datos.next();
    
    //definimos las variables para la piramide.
    int altura = 1;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosInternos = 0;
    
    while (altura < alturaIntroducida) {
      
      
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      
      
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(relleno);
      }
      
      System.out.println();
      altura++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    }
    
    
    for (i = 1; i < altura*2; i++) {
      System.out.print(relleno);
    }
		
	}
}
