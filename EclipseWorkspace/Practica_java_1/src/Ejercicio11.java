 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 02/10/2019
 * DESC.: NÚMERO SECRETO
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		
		/*DECLARAMOS LAS VARIABLES*/

		int altura=178, peso=74000;
		double imc;

		/*REALIZAMOS LAS OPERACIONES*/
		
		imc=((altura/100)/(Math.pow((peso/1000), 2)));

		System.out.println("El IMC calculado es "+imc);
	}

}
