 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 23/10/2019
 * DESC.: PRODUCTO SIN PRODUCTO
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 

public class Ejercicio38 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int num1, num2;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Introduce el valor de num1: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el valor de num2: ");
		num2=teclado.nextInt();
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		if ((num1>0 && num2>0) || (num1<0 && num2<0)) {
			System.out.println("El producto de los 2 números es positivo o nulo");
			}
		else if ((num1<0 && num2>0) || (num1>0 && num2>0)) {
			System.out.println("El producto de los 2 números es negativo");
			}
		
		System.out.println("");

		teclado.close();

	}

}
