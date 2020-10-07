 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 03/12/2019
 * DESC.: CAJA TEXTO FUNCIONES
 */

import java.util.*;

public class Ejercicio74 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		String texto_usuario;
		
		System.out.println("Introduce una frase");
		texto_usuario=teclado.nextLine();
		
		imprimeCajaTexto(texto_usuario.toUpperCase());
	}
	
	public static void imprimeCajaTexto(String texto_usuario){
		
		for (int i = 0; i < texto_usuario.length()+4; i++) {		
			System.out.print("*");			
		}System.out.println();		
		System.out.print("*");			
		for (int i = 0; i < texto_usuario.length()+2; i++) {
			System.out.print(" ");			
		}
		System.out.print("*");
		System.out.println();		
		System.out.println("* "+texto_usuario+" *");
		System.out.print("*");			
		for (int i = 0; i < texto_usuario.length()+2; i++) {
			System.out.print(" ");			
		}
		System.out.print("*");
		System.out.println();	
		for (int i = 0; i < texto_usuario.length()+4; i++) {		
			System.out.print("*");
		}
	}
}
