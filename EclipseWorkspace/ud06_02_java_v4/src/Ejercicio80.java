/*
* NOMBRE: PABLO SUÁREZ 
* FECHA: 10/12/2019
* DESC.: BINARIO
*/

import java.util.*;

public class Ejercicio80 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el número para pasar a binario:");
		int num = teclado.nextInt();
		System.out.println("El resultado es: " + binario(num));
		teclado.close();
	}

	public static String binario(int n) {

		String res = "";

		if (n != 0)
			res += binario(n / 2) + (n%2);

		return res;

	}
}
