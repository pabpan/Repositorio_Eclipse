//PABLO SUÁREZ
//PRÁCTICA EVALUABLE
//29-01-2020

import java.util.*;

public class Ejercicio92 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();

		HashMap<String, Integer> EUROVISION = new HashMap<String, Integer>();

		String nombre_pais = "", max_pais = "";
		int contador_paises = 0, votos_aleatorio = 0, maximo = 0;

		System.out.println("Bienvenido al Festival de Eurovisión");

		while (!nombre_pais.equals("salir") || contador_paises<3)  {

			System.out.println("Introduzca el nombre del país " + contador_paises);
			nombre_pais = teclado.nextLine();
			nombre_pais.toLowerCase();

			if (nombre_pais.equals("salir")) {
				break;
			}

			votos_aleatorio = aleatorio.nextInt(13) + 1;

			if (maximo < votos_aleatorio) {
				maximo = votos_aleatorio;
				max_pais = nombre_pais;
			}

			EUROVISION.put(nombre_pais, votos_aleatorio);

			contador_paises++;
		}

		if (nombre_pais.equals("salir") && contador_paises>3) {

			System.out.println(EUROVISION);
			System.out.println(
					"Con las puntuaciones repartidas, el país ganador es: " + max_pais + " con " + maximo + " puntos.");
			nombre_pais = "";

			while (!nombre_pais.equals("salir")) {

				if (nombre_pais.equals("salir")) {
					break;
				} else {
					System.out.println("Introduzca el nombre de país para saber su puntuación");
					nombre_pais = teclado.nextLine();
				}

				if (!EUROVISION.containsKey(nombre_pais)) {
					if (nombre_pais.equals("salir")) {
						System.out.println("FIN DEL PROGRAMA");
						break;
					}
					System.out.println("El país no existe");
				} else {
					System.out.println(nombre_pais + " ha recibido " + EUROVISION.get(nombre_pais) + " votos.");

				}

			}
		} else if (nombre_pais.equals("salir") && contador_paises<3) {
			System.out.println("NO PUEDES SALIR");
		}

	}
}
