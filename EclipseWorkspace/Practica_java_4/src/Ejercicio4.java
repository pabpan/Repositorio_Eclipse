 /*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 16/10/2019
 * DESC.: NOTA
 */

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*INICIALIZAMOS EL TECLADO*/
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS LAS VARIABLES*/
		double nota1, deseada, media;
		
		/*IMPRIMIMOS POR PANTALLA*/

		System.out.printf("Introduce la nota del primer examen: ");
		nota1=teclado.nextDouble();
		System.out.printf("¿Qué nota quieres sacar en el trimestre? ");
		deseada=teclado.nextDouble();
		
		/*REALIZAMOS LAS OPERACIONES*/

		media=(deseada-(0.4*nota1))/0.6;
		System.out.printf("Para tener un "+deseada+" en el trimestre necesitas sacar un "+media+" en el segundo trimestre");
						
		teclado.close();

	}

}


/*Escribe un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura“Programación” para obtener la media deseada.
 * Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen, un60%*/