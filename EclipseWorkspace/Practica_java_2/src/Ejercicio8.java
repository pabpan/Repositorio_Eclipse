 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 08/10/2019
 * DESC.: ECUACIÓN SEGUNDO GRADO
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEER POR TECLADO*/
import java.util.Scanner; 

public class Ejercicio8 {

	public static void main(String[] args) {
		
		/*INICIALIZAMOS EL TECLADO*/
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int a, b, c;
		double x1, x2, int_raiz;
		
		System.out.print("Introduce el valor de a: ");
		a=teclado.nextInt();
		System.out.print("Introduce el valor de b: ");
		b=teclado.nextInt();
		System.out.print("Introduce el valor de c: ");
		c=teclado.nextInt();
		
		/*REALIZAMOS LAS OPERACIONES*/

		int_raiz=(b*b)-(4*a*c);
		
		x1=(-b+Math.sqrt(int_raiz))/(2*a);
		x2=(-b-Math.sqrt(int_raiz))/(2*a);
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("El valor de x siendo a=" + a + "b= " + b + " y c=" + c + " es igual a " + x1 + " y " + x2 + ".");

		teclado.close();
	}
		
}