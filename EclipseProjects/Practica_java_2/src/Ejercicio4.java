 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 04/10/2019
 * DESC.: ÁREA DE UN TRIÁNGULO
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*INICIALIZAMOS EL TECLADO*/
		
		Scanner teclado = new Scanner(System.in);
	
		/*DECLARAMOS VARIABLES*/
		
		int base, altura;
		double area;
	
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Intruduce la base del triángulo: ");
		base=teclado.nextInt();
		System.out.println("Intruduce la altura: ");
		altura=teclado.nextInt();
			
		/*REALIZAMOS LAS OPERACIONES*/
		
		area=(base*altura)/2;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("El triángulo de base "+base+"  y altura "+altura+" tiene un área de "+area+".");

		teclado.close();
	}

}
