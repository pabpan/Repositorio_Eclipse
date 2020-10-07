/*
  * NOMBRE: PABLO SUÁREZ
 * FECHA: 06/10/2019
 * DESC.: CORREO ELECTRONICO
 */

import java.util.*;

public class Ejercicio62 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String correo, arroba="@", punto=".";
		
		System.out.printf("Introduce tu dirección de correo electrónico: ");
		correo=teclado.nextLine();
		
		if (correo.indexOf(arroba) > -1){
						
			String[] separada= correo.split("@");
			
			if (correo.charAt(0) != '@') {
				
				if (separada[0].length() > 4) {
				
					if (separada[1].indexOf(punto) > -1) {
						
						String[] separada2 = separada[1].split("\\.");
	
						if (separada2[0].length() > 3) {
							
							if (separada2[1].equals("com") || separada2[1].equals("es") ||separada2[1].equals("or") || separada2[1].equals("gob")) {
								
								System.out.println("El correo cumple todas los requisitos");
								System.out.println(correo);

							}
							
						}
						else
							System.out.printf("El nombre del dominio tiene que tener un mínimo de 3 caracteres");

					}
					else
						System.out.printf("No has introducido el dominio del correo");

				}
				else 
					System.out.printf("La primera parte del correo no puede tener menos de 4 caracteres");
				
			}
			else 
				System.out.printf("Formato incorrecto, no puede comenzar por @");
		}
		else
			System.out.printf("Formato incorrecto, no contiene @");

				
	teclado.close();	
	}
		
}


