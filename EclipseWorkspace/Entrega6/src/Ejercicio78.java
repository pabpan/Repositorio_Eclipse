/*
* NOMBRE: PABLO SUÁREZ
* FECHA: 04/12/2019
* DESC.: AHORCADO
*/

import java.util.*;

public class Ejercicio78 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String palabra_elegida;
		String asteriscos = "";
		int fallos = 0;

		System.out.printf("Introduzca una palabra a adivinar:");
		palabra_elegida = teclado.nextLine(); //LEEMOS LA PALABRA ELEGIDA

		for (int i = 0; i < palabra_elegida.length(); i++) { //TRANSFORMA LA PALABRA ELEGIDA A ASTERISCOS

			asteriscos = asteriscos + "*";
		}

		do { //HACEMOS UN BUCLE PARA PEDIR LAS LETRAS
			System.out.printf("Introduzca una letra: ");
			char letra_usuario = teclado.nextLine().charAt(0);
			boolean existe = false; //INICIALIZAMOS UN BOOLEANO SIEMPRE A FALSE COMO QUE CUANDO EMPIEZA ENTIENDE QUE LA LETRA NO EXISTE

			for (int i = 0; i < palabra_elegida.length(); i++) { //RECORREMOS LA PALABRA ELEGIDA

				if (palabra_elegida.charAt(i) == letra_usuario) { //LA PALABRA ELEGIDA EN LA POSICIÓN I ES IGUAL A LA LETRA DEL USUARIO
					String primera = asteriscos.substring(0, i); //DIVIDE LA PALABRA EN UNA PARTE
					String segunda = asteriscos.substring(i + 1); //DIVIDE LA PALABRA EN OTRA PARTE
					asteriscos = primera + letra_usuario + segunda; //ASIGNA A ASTERISCOS LA PRIMERA PARTE (COMO ASTERISCOS), LA LETRA Y LA SEGUNDA PARTE (COMO ASTERISCOS)
					existe = true; //SI EXISTE LA LETRA EL BOOLEANO CAMBIA A TRUE
					if (asteriscos.equals(palabra_elegida)) {
						System.out.println("HAS GANADO");
					}
				}	
			}
			System.out.println("PALABRA: "+asteriscos);

			if (existe == false) { //CUANDO EL BOOLEANO ES FALSE ENTRA EN EL SWITCH
				switch (fallos) {

				case 0:
					System.out.println("Error " + (fallos + 1) + " de 8, te pinto la horca");
					break;
				case 1:
					System.out.println("Error " + (fallos + 1) + " de 8, te pinto la cabeza");
					break;
				case 2:
					System.out.println("Error " + (fallos + 1) + " de 8, te pinto el cuerpo");
					break;
				case 3:
					System.out.println("Error " + (fallos + 1) + " de 8, te pinto el brazo izquierdo");
					break;
				case 4:
					System.out.println("Error " + (fallos + 1) + " de 8, te pinto el brazo derecho");
					break;
				case 5:
					System.out.println("Error " + (fallos + 1) + " de 8, te pinto la pierna derecha");
					break;
				case 6:
					System.out.println("Error " + (fallos + 1) + " de 8, te pinto la pierna izquierda");
					break;
				case 7:
					System.out.println("Error " + (fallos + 1) + " de 8, ¡AHORCADO!");
					System.out.println("La palabra era: "+palabra_elegida);
					break;
				}
				fallos++; //AUMENTA EL CONTADOR DE FALLOS
			}

			
		} while (fallos < 8 && !asteriscos.equals(palabra_elegida)); //PEDIMOS LETRAS HASTA QUE LOS FALLOS SEAN MENOR A 8 (0 AL 7)

	}

}
