 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 23/10/2019
 * DESC.: PRODUCTO SIN PRODUCTO
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 

public class Ejercicio41 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int b, n, i=0, r=1;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Introduce el valor de b: ");
		b=teclado.nextInt();
		System.out.println("Introduce el valor de n: ");
		n=teclado.nextInt();
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		do {
			r=r*b;
			i++;
		}
		while (i<n);
		
		System.out.println(+b+" elevado a "+n+" es: " + r);

		teclado.close();

	}

}
