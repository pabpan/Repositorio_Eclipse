 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 04/12/2019
 * DESC.: PINTAR PALOTES
 */

import java.util.*;

public class Ejercicio77 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String numeros, numeros1;
		char separada;
		
		System.out.printf("Introduce una cadena de números: ");
		numeros = teclado.nextLine();
		
		for (int i = 0; i < numeros.length(); i++) { //RECORREMOS LA CADENA DE NÚMEROS
			
			separada=numeros.charAt(i); //SEPARAMOS LOS NÚMEROS DE LA CADENA
			numeros1=Character.toString(separada); //PASAMOS LA CADENA SEPARADA DE CARACTERES A UN STRING
			System.out.printf(convierteEnPalotes(Integer.parseInt(numeros1))); //CONVERTIMOS DE NUEVO A UN ENTERO QUE NOS VA A DAR LA FUNCIÓN
			
			if (i!=numeros.length()-1) { //MIENTRAS NO SEA IGUAL AL ÚLTIMO CARACTER DE LA CADENA PINTAMOS UN SEPARADOR
				System.out.printf("-");
			}
		}	
	teclado.close();
	}

	public static String convierteEnPalotes(int n) { //FUNCIÓN PARA PINTAR PALOTES
				
		String palotes;
		
		switch (n) {
		
		case 0:
			palotes=" ";
			break;
		case 1:
			palotes="|";

			break;
		case 2:
			palotes="||";
			break;
		case 3:
			palotes="|||";
			break;
		case 4:
			palotes="||||";
			break;
		case 5:
			palotes="|||||";
			break;
		case 6:
			palotes="||||||";
			break;
		case 7:
			palotes="|||||||";
			break;
		case 8:
			palotes="||||||||";
			break;
		case 9:
			palotes="|||||||||";
			break;
		default:
			palotes="Caracter no válido";			
			break;	
		}
		return palotes;
	}
}
