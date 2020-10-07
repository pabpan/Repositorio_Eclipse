import java.util.Scanner;

/*
  * NOMBRE: PABLO SUÁREZ
 * FECHA: 04/11/2019
 * DESC.: CALCULADORA LETRA DNI
 */

public class Ejercicio55 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		
		int dni, resto;
        char [] letra= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		System.out.printf("Introduzca su DNI: ");	
		dni=teclado.nextInt();

		resto=dni%23;
        System.out.println("Tu letra es "+letra[resto]);
		
        teclado.close();
	}

}
