 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 26/10/2019
 * DESC.: NEGATIVOS O PSITIVOS
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 

public class Ejercicio49 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int numero, contador=0, contador1=0, contador2=0;
		
		/*REALIZAMOS LAS OPERACIONES*/

		
		do {
			
			System.out.printf("Introduce un número (positivo o negativo): ");
			numero=teclado.nextInt();
			
			if (numero>=0)
				contador1++;	
			else
				contador2++;
			contador++;
		}
		while (contador!=10);
		
		System.out.println("Postivos: "+contador1+" y negativos: "+contador2);

		
		System.out.println("Fin del programa");
	
		teclado.close();

	}

}
