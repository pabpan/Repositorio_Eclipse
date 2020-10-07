/*
* NOMBRE: PABLO SUÁREZ 
* FECHA: 11/12/2019
* DESC.: DIVISDORES
*/

import java.util.*;

public class Ejercicio82 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número para calcular sus divisores: ");
		int num = teclado.nextInt(); //LEEMOS EL NÚMERO DEL USUARIO
		divisores(num, num); //LLAMAMOS AL MÉTODO IGUALANDO LAS VARIABLES DEL NÚMERO DEL USUARIO  AL CONTADOR 

	}

	public static void divisores(int num, int contador) { //MÉTODO PARA DIVIDIR EL NÚMERO DEL USUARIO

		if (contador == 1) { 
			System.out.println("1"); //CUANDO EL CONTADOR LLEGA AL VALOR 1 IMPRIME SIMPLEMENTE EL 1
		} else {
			if (num % contador == 0) { //SI EL RESTO DE p.ej: 30(NUMERO_USUARIO) DIVIDIDO ENTRE 30(CONTADOR IGUALADO AL NÚMERO_USUARIO) ES IGUAL A 0
				System.out.print(contador + ", "); //IMPRIME EL 30 CON UNA COMA AL FINAL
				divisores(num, contador - 1); //Y VUELVO A LLAMAR AL MÉTODO PERO AHORA EL CONTADOR PASA A VALER 29
			} else
				divisores(num, contador - 1); //COMO EN EL IF ANTERIOR YA NO DA DE RESTO 0, AHORA EL MÉTODO PASA A SER 30, 29
		}
	}
}
