 /*
  * NOMBRE: PABLO SUÁREZ
 * FECHA: 04/11/2019
 * DESC.: NÚMERO MÁGICO
 */

import java.util.*;

//CON EL ANTERIOR PODEMOS IMPORTAR TODOS LOS ULTILS DIRECTAMENTE
//import java.util.Scanner;
//import java.util.Random;

public class Ejercicio53 {

	public static void main(String[] args) {
		
		//IMPORTAMOS LA CLASE RANDOM
		Random random = new Random();
		
		//INICIALIZAMOS EL TECLADO
		
		Scanner teclado = new Scanner(System.in);
				
		/*DECLARAMOS VARIABLES*/
		
		int aleatorio, num, intentos=0;
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		aleatorio=random.nextInt(99)+1;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Número: "+aleatorio);
		System.out.println("El juego del número mágico");
		
		do {
			
			System.out.println("Introduzca un número:");
			num=teclado.nextInt();
			
			if (num > aleatorio)
				
				System.out.println("El número mágico es menor!");
				
				else if (num!=aleatorio)
					
					System.out.println("El número mágico es mayor!");
			intentos++;
			
		} while (aleatorio!=num);
		
	System.out.println("Enhorabuena! Has acertado el número que era el "+aleatorio+"!");
	System.out.println("Lo has solucionado en "+intentos);

	

		

	}

}
