 /*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 18/10/2019
 * DESC.: NÚMEROS
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEER POR TECLADO*/
import java.util.Scanner; 

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int n, i, j, suma;

		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Introduce un número positivo");
		n=teclado.nextInt();
		
		/*REALIZAMOS LAS OPERACIONES*/
				
		for (i=1; i<=n; i++) {
			for (j=i; j<=n; j++) {
				suma=(i+j)+(2*i*j);
			System.out.println("Par "+i+","+j+": "+i+"+"+j+"+2*"+i+"*"+j+"vale "+suma);
			}
		}
		

		teclado.close();

	}

}
