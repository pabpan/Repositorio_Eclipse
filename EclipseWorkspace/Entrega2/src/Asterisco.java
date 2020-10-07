 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 22/10/2019
 * DESC.: ASTERISCO
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 

public class Asterisco {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int num, x, y;
	
		/*REALIZAMOS LAS OPERACIONES*/
		do {
			System.out.printf("Introduce la atura (Debes ser un número impar mayor o igual a 3): ");
			num=teclado.nextInt();
		}
		while (num%2==0 || num<3);
		
		for (x=0; x<num; x++) {
		
			for (y=0; y<num; y++) {
				if ((x==y) || (x+y==(num-1))) {
					System.out.print("*");
				}
				else { 		
					System.out.print(" ");
					}
				}System.out.println();
			}
		

		teclado.close();

	}

}
/*Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se debe
comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.*/