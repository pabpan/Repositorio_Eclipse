package Ejercicio106;

import java.util.*;

public class Primo106 {

	public static Integer EsPrimo(int numero) throws Exception {
		Scanner teclado = new Scanner(System.in);

		int num = 0, contador = 0;

		try {

			System.out.println("Introduce un número:");
			num = teclado.nextInt();

			for (int i = 1; i < num + 1; i++) {

				if (num % i == 0) {
					contador++;
				}
			}

			if (contador == 2) {
				throw new Exception("El numero es primo");
			} else
				throw new Exception("No es primo");

		} catch (ArithmeticException e) {
			throw new Exception("No se puede dividir por cero");
		}
	}
}
