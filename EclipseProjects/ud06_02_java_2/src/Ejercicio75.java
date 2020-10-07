 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 03/12/2019
 * DESC.: NÚMERO FUNCIONES
 */

import java.util.*;

public class Ejercicio75 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner (System.in);
	
	String cadena, cadena1;
	char separada;
	
	System.out.printf("Introduce una cadena de números: ");
	cadena = teclado.nextLine();
	
	for (int i = 0; i < cadena.length(); i++) {
		
		separada=cadena.charAt(i); //separamos el primer caracter de la cadena
		cadena1=Character.toString(separada); //creamos una cadena auxiliar para cambiar de caracater a string
		System.out.println(convierteEnPalabras(Integer.parseInt(cadena1))); //muestras por pantalla lo que te devuelve la función, pero pasamos el string a enteros
	}
		
	}

	public static String convierteEnPalabras(int separadas) { 
		
		String numeros;
		
		switch (separadas) {
		case 0:
			numeros="cero";
			break;
		case 1:
			numeros="uno";
			break;	
		case 2:
			numeros="dos";
			break;
		case 3:
			numeros="tres";
			break;
		case 4:
			numeros="cuatro";		
			break;
		case 5:
			numeros="cinco";
			break;
		case 6:
			numeros="seis";		
			break;
		case 7:
			numeros="siete";
			break;
		case 8:
			numeros="ocho";			
			break;
		case 9:
			numeros="nueve";			
			break;
		default:
			numeros="Caracter no válido";			
			break;			
		}	
		
		return numeros;
	}
}


