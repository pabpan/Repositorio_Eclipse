 /*
 * NOMBRE: PABLO SUÁREZ  
 * FECHA: 16/10/2019
 * DESC.: MAYÚSCULAS/MINÚSCULAS
 */

import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*INICIALIZAMOS EL TECLADO*/
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS LAS VARIABLES*/
		
		String frase;		
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Introduce una frase para pasarla a mayúsculas");
		frase=teclado.nextLine();		
		
		/*%s se sustituye por la variable de texto, imprime	en minúsculas*/
		System.out.printf("Tu frase en minúsculas es: %s \n",frase);
		/*%S se sustituye por la variable de texto, imprime	en mayúsculas*/
		System.out.printf("Tu frase en minúsculas es: %S",frase);

		
		teclado.close();
	}

}
