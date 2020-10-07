/*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 02/10/2019
 * DESC.: INTERCAMBIAR VARIABLES
 */

public class Ejercicio7 {

	public static void main(String[] args) {
	int a=3, b=8, aux=0; /*DEFINIMOS VARIABLES*/
		
	System.out.println("Al principio del programa, el valor de a es " + a + " y el valor de b es " + b + ".");
	/*INTERCAMBIAMOS VARIABLES CON UN AUXILIAR*/
	aux=a;
	a=b;
	b=aux;
	
	System.out.println("Después del intercambio, el valor de a es " + a + " y el valor de b es " + b + ".");

	}

}
