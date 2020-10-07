/*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 26/11/2019
 * DESC.: LETRA EXÁMEN
 */

import java.util.*;

public class Ejercicio69 {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		int numero = aleatorio.nextInt(25);
		
		char apellido[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		System.out.print(apellido[numero]);
	}
}