import java.sql.Array;
import java.util.*;

public class ejerciciod {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String[] ultraprocesados;
		String[] saludables = {};

		String ultraproc, saludable;
		int contador = 0;

		int cantidad_ultraprocesados = teclado.nextInt();
		
		ultraprocesados = new String[cantidad_ultraprocesados];
		
		teclado.nextLine();

		while (cantidad_ultraprocesados > 0) {

			ultraproc = teclado.nextLine();

			ultraprocesados[contador] = ultraproc;

			contador++;
			cantidad_ultraprocesados--;
		}

		int cantidad_saludables = teclado.nextInt();
		teclado.nextLine();
		while (cantidad_saludables > 0) {

			saludable = teclado.nextLine();

			saludables.put(contador, saludable);
			contador++;
			cantidad_saludables--;
		}

		int cantidad_consultar = teclado.nextInt();
		teclado.nextLine();

		while (cantidad_consultar > 0) {

			String comprobar = teclado.nextLine();

			for (int i = 0; i < ultraprocesados.size(); i++) {

				if (ultraprocesados.get(i).equals(comprobar)) {
					System.out.println("ULTRAPROCESADO");
				} else {
					for (int j = 0; j < saludables.size(); j++) {

						System.out.println(saludables.get(j));
						if (saludables.get(j).equals(comprobar)) {
							System.out.println("SALUDABLE");
						} else {
							System.out.println("NO ENCONTRADO");
						}

					}
				}

			}

		}

	}

}
