import java.util.*;

public class Criogenizacion {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		long max = 0, min, cont_max = 0, cont_min = 0;

		long intentos = teclado.nextInt();

		for (int i = 0; i < intentos; i++) {

			long numero = teclado.nextInt();

			min = numero;
			cont_min = 0;
			cont_max = 0;
			max = 0;

			while (numero != 0) {

				if (numero > max) {
					max = numero;
					cont_max = 1;
				} else if (max == numero) {
					cont_max++;
				}

				if (numero < min && numero != 0) {
					min = numero;
					cont_min = 1;
				} else if (min == numero) {
					cont_min++;
				}
				numero = teclado.nextInt();
			}
			System.out.println(min + " " + cont_min + " " + max + " " + cont_max);

		}

	}
}
