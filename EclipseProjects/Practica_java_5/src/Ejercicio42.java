 /*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 23/10/2019
 * DESC.: TRABAJADOR
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 


public class Ejercicio42 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
	double salario, horas_extra, precio_extra, hora_extra2, total_extra;
		
		/*IMPRIMIMOS POR PANTALLA*/

	System.out.println("¿Cuál es el salario?");
		salario=teclado.nextDouble();
	System.out.println("¿Cuántas horas extras ha trabajado?");
		horas_extra=teclado.nextDouble();
	System.out.println("¿Cuánto vale la hora extra?");
		precio_extra=teclado.nextDouble();
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		total_extra=horas_extra*precio_extra;
				
		if (horas_extra>40){
			
			total_extra=((precio_extra+((precio_extra*50)/100))*horas_extra);
			
			salario=salario+total_extra;
			
			System.out.println("El salario es: "+salario);	
		}
		else {
		salario=salario+total_extra;
		System.out.println("El salario es: "+salario);
		}

		teclado.close();

	}

}
