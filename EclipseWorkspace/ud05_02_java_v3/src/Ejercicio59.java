/*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 05/11/2019
 * DESC.: DADOS
*/

import java.util.*;

public class Ejercicio59 {

	public static void main(String[] args) {
		
		
		Random aleatorio = new Random();
		int dado1, dado2;

		dado1= aleatorio.nextInt(6)+1;
		dado2= aleatorio.nextInt(6)+1;
		
		System.out.println("¿¿VAMOS A TIRAR LOS DADOS!!");

		
		do {
			
			System.out.printf("La tirada es %s %s\n",dado1,dado2);
			dado1= aleatorio.nextInt(6)+1;
			dado2= aleatorio.nextInt(6)+1;
			
		}
		while (dado1!=dado2);
		
		System.out.printf("La última tirada es %s %s\n",dado1,dado2);

		
	}

}
