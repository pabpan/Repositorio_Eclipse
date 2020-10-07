 /*
 * NOMBRE: PABLO SUÁREZ  
 * FECHA: 16/10/2019
 * DESC.: ENTERO
 */

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*INICIALIZAMOS EL TECLADO*/
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS LAS VARIABLES*/
		int N;
		
		/*IMPRIMIMOS POR PANTALLA*/

		System.out.printf("Introduzca el valor de N:  ");
		N=teclado.nextInt();

		/*123/100=1,23, como es entero no muestra el decimal*/
		System.out.println("Primera cifra de: "+N+" --> " +N/100);
		/*123/10=12,3, mostraría 12, pero con el símbolo "%" mostramos el resto de 12/10=2*/
		System.out.println("Segunda cifra de: "+N+" --> " +((N/10)%10));
		/*Con "%"10 mostramos el resto de 123/10*/
		System.out.println("Tercera cifra de: "+N+" --> " +N%10);

		/*REALIZAMOS LAS OPERACIONES*/

		teclado.close();

	}

}


/*Escribe un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura“Programación” para obtener la media deseada.
 * Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen, un60%*/