 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 08/10/2019
 * DESC.: HIPOTENUSA
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEER POR TECLADO*/
import java.util.Scanner; 

public class Ejercicio9 {

	public static void main(String[] args) {
		
		/*INICIALIZAMOS EL TECLADO*/
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int cat1, cat2;
		double hipo;
		
		System.out.print("Introduce el valor del cateto 1: ");
		cat1=teclado.nextInt();
		System.out.print("Introduce el valor del cateto 2: ");
		cat2=teclado.nextInt();

		/*REALIZAMOS LAS OPERACIONES*/

		hipo=Math.sqrt((Math.pow(cat1, 2)+ Math.pow(cat2, 2)));
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.print("\nLa hipotenusa del triángulo es igual a la raiz cuadrada\n\n de la suma de los catetos al cuadrado: "+hipo);

		teclado.close();
	}
		
}