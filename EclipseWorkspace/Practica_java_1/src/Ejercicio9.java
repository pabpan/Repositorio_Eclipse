 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 02/10/2019
 * DESC.: NÚMERO SECRETO
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		/*DECLARAMOS VARIABLES*/
		int edad=20, america=1492, nadal=19;
		double resultado=0.0, resta=0.0, cociente=0.0;
		
		/*OPERACIONES*/
		cociente=america/edad;
		resta=cociente-nadal;
		resultado=Math.sqrt(resta);
		
		System.out.println("La edad es: " + edad + "\n\nDividiendo el año del descubrimiento de América por esa edad: "
		+ cociente + "\n\nAl cociente le restamos el número de grand slams ganados por Nadal (19): " 
		+resta+ "\n\nEl resultado de la resta anterior es el cuadrado del número secreto, que es: " 
		+resultado);

	}

}
