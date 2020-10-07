 /*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 16/10/2019
 * DESC.: REDONDO
 */

import java.util.Scanner;


public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*INICIALIZAMOS EL TECLADO*/
		Scanner teclado = new Scanner(System.in);
		
		double radio, longitud, area, esfera;

		System.out.println("Bienvenido al programa donde todo sale redondo!");
		System.out.println("-----------------------------------------------");
		System.out.println("Introduzca el valor del radio:");
		radio=teclado.nextDouble();
		
		/*REALIZAMOS LAS OPERACIONES*/
		longitud=2*Math.PI*radio;
		area=Math.PI*(Math.pow(radio, 2));
		esfera=((4*Math.PI)*Math.pow(radio, 3)/3);
		
		/*IMPRIMIMOS POR PANTALLA EL RESULTADO*/
		System.out.println("La longitud de la circuenferencia es: "+longitud);
		System.out.println("El área de la circuenferencia es: "+area);
		System.out.println("Si fuera una esfera, su volumen sería: "+esfera);
		
		teclado.close();
	}

}
