/*
* NOMBRE: PABLO SUÁREZ 
* FECHA: 11/12/2019
* DESC.: RIMAS
*/

import java.util.*;

public class Ejercicio83 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int frase = 0; //INCIALIZAMOS "FRASE" A 0, POR EL SWITCH DEL MÉTODO "elegir_frase_maquina"
		int errores = 1; //INICIALIZAMOS LOS ERRORES A 1

		System.out.println("COMIENZA LA BATALLA DE INSULTOS DE MONKEY ISLANSD!");

		do { //EMPEZAMOS UN BUCLE QUE TERMINARÁ CUANDO SE CUMPLA LA CONDICIÓN DEL WHILE

			String cadena = elegir_frase_maquina(frase); //CREAMOS UNA VARIABLE STRING DONDE GUARDAMOS EL TEXTO DE LA FRASE 0....4
			
			System.out.println(cadena); //IMPRIMIMOS LA PRIMERA FRASE DE LA MÁQUINA

			String respuesta = elegir_opcion_humano(); //CREAMOS UNA VARIABLE STRING DONDE METEMOS EL TEXTO DEL MÉTODO "elegir_opcion_humano" QUE ELIGE EL USUARIO

			if (cadena.substring(cadena.length() - 2).equals(respuesta.substring(respuesta.length() - 2))) { 
			//HACEMOS UN SUBSTRING DE LOS DOS ÚLTIMOS CARACTERES DE LA FRASE DE LA MÁQUINA Y DE LA FRASE DEL USUARIO
			//SI LOS DOS ÚTIMOS CARACATERES DE LAS FRASES SON IGUALES
				System.out.println("Punto para mí"); //IMPRIMIRÁ
				frase++; //INCREMENTAMOS LA FRASE DE LA MÁQUINA PARA QUE IMPRIMA LA SIGUIENTE CUANDO SE CUMPLA LA CONDICIÓN
			} else { //SI NO SE CUMPLE LA CONDICIÓN
				System.out.println("Fallo " + errores + " de 3! Me han hecho pupita! Inténtalo de nuevo!"); //IMPRIME EL N'UMERO DE ERROR INCIALIZADO A 1
				errores++; //SIEMPRE QUE NO SE CUMPLA AUMENTARÁ EL CONTADOR DE ERRORES
				if (errores == 4) { //HASTA QUE EL NÚMERO DE ERRORES SEA IGUAL A 4 QUE SALDTÁ DEL PROGRAMA
					System.out.println("FIN DEL PROGRAMA, HAS FALLADO 3 VECES");
					break;
				}
			}

		} while (frase >= 0 && frase < 5); //BUCLE HASTA QUE LA FRASE DEL MÉTODO "elegir_frase_maquina" SEA 4
		if (errores < 4) {
			System.out.println("ENHORABUENA! HAS GANADO LA BATALLA DE INSULTOS DE MONKEY ISLAND!"); //SI NO LLEGA AL TOTAL DE ERRORES PERMITIDOS IMRPIMIRÁ QUE RIMA TODO
		}

	}

	public static String elegir_frase_maquina(int n) {
		String frase = "";
		switch (n) {
		case 0:
			frase = "1-Eres tan repulsivo como una mona marrana";
			break;
		case 1:
			frase = "2-Mis ataques ahn dejado islas enteras sin poblados";
			break;
		case 2:
			frase = "3-Tu cara haría vomitar hasta el cerdo menos aseado";
			break;
		case 3:
			frase = "4-Mis habilidades con la espada son muy veneradas";
			break;
		case 4:
			frase = "5-Piedad, te lo ruego, no más insultos por favor";
			break;
		}
		return frase;
	}

	public static String elegir_opcion_humano() {

		Scanner teclado = new Scanner(System.in);

		System.out.println("a) Que pena que todas esten inventadas\n"
				+ "b) Y eso sin contar a las otras con las que te has citado\n"
				+ "c) Tu olor y tu cara me recuerdan a un queso sin frescor\n"
				+ "d) Eso es porque me parezco mucho a tu hermana\n"
				+ "e) Con tu aliento, seguro que todos fueron asfixiados");
		String respuesta;
		respuesta = teclado.nextLine();

		String frase1 = "";

		switch (respuesta) {

		case "a":
			frase1 = "Que pena que todas esten inventadas";
			break;
		case "b":
			frase1 = "Y eso sin contar a las otras con las que te has citado";
			break;
		case "c":
			frase1 = "Tu olor y tu cara me recuerdan a un queso sin frescor";
			break;
		case "d":
			frase1 = "Eso es porque me parezco mucho a tu hermana";
			break;
		case "e":
			frase1 = "Con tu aliento, seguro que todos fueron asfixiados";
			break;
		default:
			System.out.println("La letra no es correcta");
		}

		return frase1;
	}

}
