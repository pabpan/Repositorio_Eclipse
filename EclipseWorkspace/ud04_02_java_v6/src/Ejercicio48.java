 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 26/10/2019
 * DESC.: MEDIA NÚMEROS
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 


public class Ejercicio48 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int numero_introducido, media=0, suma=0;
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		
		do {
			
			System.out.println("Introduce un número");
			numero_introducido=teclado.nextInt();
			
			if (numero_introducido>=0) {
				
				media=(numero_introducido+suma)/2;		
				System.out.printf("La media es: "+media+"\n");
				suma=media;
			}
			else
				System.out.println("\nEl número introducido es negativo\n");				
		}
		while (numero_introducido>=0);
		
		System.out.println("Fin del programa");



		teclado.close();

	}

}
