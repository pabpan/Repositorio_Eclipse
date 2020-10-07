package Ejercicio106;

import java.util.*;

public class Principal106 {

	public static void main(String[] args) throws Exception {

		int numero=0;

		try {
			Primo106.EsPrimo(numero);

		} catch (InputMismatchException e) {
			throw new Exception("No es un entero");
		}
	}

}
