 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 25/10/2019
 * DESC.: SAN FERMINES
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 


public class san_fermines {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
	int toros, velocidad;
		
	toros=teclado.nextInt();
	
	velocidad=teclado.nextInt();
	
	if (velocidad<=toros) {
	
	System.out.printf(+toros+" "+velocidad+ " ");

	} while (velocidad<=toros);
	
	//System.out.printf();

		teclado.close();

	}

}
