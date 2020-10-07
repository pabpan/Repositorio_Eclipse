 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 02/10/2019
 * DESC.: NÚMERO SECRETO
 */

public class Ejercicio3 {
	
	public static void main(String[] args) {
	
		/*DECLARAMOS LAS VARIABLES*/

		int cp=46018, movil=651151112, fijo=961506550;
		String NIF="44877847V", nombre="Pablo Suárez Pantaleón", dir="C/ Ramón de Castro 12-8", poblacion="Valencia", fecha_nac="15/05/1983";
		
		/* IMPRIMIMOS POR PANTALLA*/
		
		System.out.print("El alumno " + nombre + " de NIF " + NIF + " nació el " + fecha_nac + "\n\ny reside actualmente en " + dir + ", " + cp + ", " + poblacion + " .\n\nSus teléfonos de contacto son: " + fijo + " y " + movil + " .");

	}

}