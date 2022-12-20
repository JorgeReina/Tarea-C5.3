import java.util.Scanner;

/**
 * 
 * Ejercicio 19, Realiza un programa que pinte una pirámide por pantalla. La altura se debe 
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe 
 * pedir por teclado.
 * 
 * Nombre del archivo: Ejercicio19.java
 * 
 * @author Jorge Reina Romero
 * 
 */
 
public class Ejercicio19 {
	public static void main(String[] args) {
		
		//Definimos la clase datos.
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduce la altura de la piramide: ");
    int altura = datos.nextInt();
    System.out.print("Introduce relleno de la piramide: ");
    String relleno = datos.next();
    
    //definimos las variables para la piramide.
    int planta = 1;
    int longitud = 1;
    int espaciado = altura - 1;
    
    //hacemos el bucle.
    while ( planta <= altura) {
      for (int i = 1; i <= espaciado ; i++) {
        System.out.print(" ");
      }
      for (int i = 1; i <= longitud ; i++){
        System.out.print(relleno);
      }
      System.out.println();
      
      planta++;
      espaciado--;
      longitud += 2;
      
    }
		
	}
}
