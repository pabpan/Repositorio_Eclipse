 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 04/10/2019
 * DESC.: NUMEROS DE 7 EN 7
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 


public class Ejercicio50 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int numero1, numero2, contador;
						
		/*REALIZAMOS LAS OPERACIONES*/
		
		System.out.println("Introduce un número");
		numero1=teclado.nextInt();
		System.out.println("Introduce otro número");
		numero2=teclado.nextInt();
		
		for (contador=numero1; contador <= numero2; contador=contador+7) {
			System.out.println(contador);
		}
		
		teclado.close();

	}

}
