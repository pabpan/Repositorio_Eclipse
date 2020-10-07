/*
  * NOMBRE: PABLO SUÁREZ
 * FECHA: 08/11/2019
 * DESC.: COCER HUEVOS
*/

import java.util.*;

public class cocer_huevos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int huevos, cazo, cociente, resto;
		int minutos=10;
		
		do {
			
			huevos=teclado.nextInt();
			cazo=teclado.nextInt();
			minutos=10;
			
			if (huevos>0 || cazo>0) {
			
			cociente=huevos/cazo;
			resto=huevos%cazo;
			
			if (resto>0) {
							
				cociente=cociente+1;
				minutos=minutos*cociente;
				System.out.println(minutos);

			} 
			else {
				minutos=minutos*cociente;
				System.out.println(minutos);
			}
			}
				
		}while (huevos!=0 || cazo!=0);
	
		teclado.close();
	}

}
