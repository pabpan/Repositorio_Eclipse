 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 26/10/2019
 * DESC.: CAJA FUERTE
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 


public class Ejercicio47 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int codigo_caja=0000, codigo_usuario;
		int intentos=4;
			
		/*REALIZAMOS LAS OPERACIONES*/
		
		do {
			
			System.out.printf("Introduce un código de 4 cifras para desbloquear la caja: ");
			codigo_usuario=teclado.nextInt();
			
			if (codigo_usuario==codigo_caja) {
				intentos=0;
				System.out.println("\nLa caja fuerte se ha abierto satisfactoriamente");
				}
			else {
				intentos--;
				System.out.printf("\nLo siento, esa no es la combinación. Te quedan %s intentos\n\n", intentos);
				if (intentos==0) {
					System.out.printf("Lo siento, No has podido abrir la caja");
					}
				}
			}
		while (intentos!=0);
		
		teclado.close();

	}

}
