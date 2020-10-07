 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 24/10/2019
 * DESC.: FACTORIAL DE UN NÚMERO
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 


public class Ejercicio43 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int n,a;		
	
		/*IMPRIMIMOS POR PANTALLA*/

		System.out.println("Ingrese un número");
		n=teclado.nextInt();

		/*REALIZAMOS LAS OPERACIONES*/
		
		a=n-1;
		
		do {

			if (a==0) {
				a=n;
				System.out.println("El factorial es "+n);			
				}
			else if (a>1 && a>0) {
			n=n*a;
			a--;
				System.out.println("El factorial es "+n);
				}
		}
		
		while (n!=0);{
			
		}
		
			System.out.println("El factorial es 1");

				
			}

			
}