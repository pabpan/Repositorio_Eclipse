/*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 08/11/2019
 * DESC.: PERIMETRO
*/


import java.util.*;

public class perimetro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int lado1, lado2, perimetro;
		
		do {
			
			lado1=teclado.nextInt();
			lado2=teclado.nextInt();
			
			if (lado1>=0 && lado2>=0) {
			
			perimetro=lado1+lado1+lado2+lado2;
			
			System.out.println(perimetro);
			}
			
		}while (lado1>=0 && lado2>=0);
				
		teclado.close();
	}

}
