/*
* NOMBRE: PABLO SUÁREZ 
* FECHA: 10/12/2019
* DESC.: BOOM
*/

import java.util.*;

public class Ejercicio79 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número a partir del cual haremos la cuenta atrás...");
		int numero_usuario = teclado.nextInt();
		cuentatras(numero_usuario);
		teclado.close();
	}

	public static void cuentatras(int n) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(n);
		if (n > 0) {
			n--;
			cuentatras(n);
		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("BOOM!");
		}
	}
}