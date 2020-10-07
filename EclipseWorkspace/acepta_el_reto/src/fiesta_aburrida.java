 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 25/10/2019
 * DESC.: FIESTA ABURRIDA
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 

public class fiesta_aburrida {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
	
		int personas;
		String nombre;
		
		
		personas=teclado.nextInt();
		teclado.nextLine();
		
		for (int i=0; i<personas; i++) {		
		nombre=teclado.nextLine();
		String[] parts = nombre.split(" ");
		System.out.println("Hola, "+parts[1]+".");	
		}		
		

		teclado.close();

	}

}
