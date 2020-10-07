 /*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 16/10/2019
 * DESC.: KM/H
 */

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
	/*INICIALIZAMOS EL TECLADO*/
	Scanner teclado = new Scanner(System.in);
		
	/*DECLARAMOS LAS VARIABLES*/
		
	int km;
	double m=0.0000d;
		
	/*IMPRIMIMOS POR PANTALLA*/
	System.out.printf("Introduce los km/h: ");
	km=teclado.nextInt();
	
	/*REALIZAMOS LAS OPERACIONES*/
	
	m=km/3.6;
	/*PARA SACAR UNOS DECIMALES EN CONCRETO HAY QUE HACER UN MATHROUD DE LA CIFRA MULTIPLICADO
	 *POR X Y DIVIDIDO ENTRE Xd*/
	m=Math.round(m*10000)/10000d;
	
	System.out.printf("\nLa velocidad de "+km+"km/h en m/s es: "+m);

	teclado.close();

	}

}


/*Escribe un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura“Programación” para obtener la media deseada.
 * Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen, un60%*/