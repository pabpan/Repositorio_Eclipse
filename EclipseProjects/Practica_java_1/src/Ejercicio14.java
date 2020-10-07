 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 02/10/2019
 * DESC.: NÚMERO SECRETO
 */

public class Ejercicio14 {

	public static void main(String[] args) {

		/*DECLARAMOS LAS VARIABLES*/
		
		int a=5, b=5;
		double triangulo, cuadrado, circulo, pi=3.14;
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		triangulo=(b*a)/2;
		cuadrado=Math.pow(a,2);
		circulo=pi*Math.pow(a,2);
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Si "+a+ " fuera la altura y "+b+" la base de un triángulo, el área de ese triángulo sería "+triangulo+ ".\n\n");
		System.out.println("Si "+a+ " fuera un lado de un cuadrado, su área sería "+cuadrado+ ".\n\n");
		System.out.println("Si "+a+ " fuera un radio de un círculo, su área sería "+circulo+ ".\n\n");

	}

}