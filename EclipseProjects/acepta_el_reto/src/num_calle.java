 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: /10/2019
 * DESC.: 
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 


public class num_calle {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int x;			
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		do {
			x=teclado.nextInt();	
			
			if (x!=0) {
			
			if (x%2==0) {
			System.out.println("DERECHA");		
			}
			
			else {	
			System.out.println("IZQUIERDA");
			}
			}
		}
		
		while (x!=0);
		
		/*IMPRIMIMOS POR PANTALLA*/

		teclado.close();

	}

}
