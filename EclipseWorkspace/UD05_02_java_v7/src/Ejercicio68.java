 /*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 26/11/2019
 * DESC.: ARRAY DE CARACTERES
 */

import java.util.*;

public class Ejercicio68 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String texto;
		
		System.out.print("Introduce una frase:");
		texto=teclado.nextLine();
		
		char cadena[] = new char [texto.length()];	
				
		for (int i = 0; i < texto.length(); i++) {
			
			if (texto.charAt(i)==' ') {
				cadena[i]='@';
			}else {
				cadena[i]=texto.charAt(i);
			}
				
		}
		System.out.print("[");

		for (int i = 0; i < cadena.length; i++) {
			if (i==0) {
				System.out.print(cadena[i]);
			}else
				System.out.print(", "+cadena[i]);
		}
		System.out.print("]");

		
		
	}

}
