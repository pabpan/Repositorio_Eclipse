 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 04/10/2019
 * DESC.: NÚMERO SECRETO
 */

import java.util.Scanner; /*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int num1,num2, suma, resta, multiplicacion;
		double division;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Introduce x: ");
		num1=teclado.nextInt();
		System.out.println("Introduce y: ");
		num2=teclado.nextInt();
		teclado.nextLine();
		System.out.println("\n");

		
		/*REALIZAMOS LAS OPERACIONES*/
		
		suma=num1+num2;
		resta=num1-num2;
		multiplicacion=num1*num2;
		division=num1/num2;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Los valores introducidos son: "+num1+" y "+num2+"\n");
		System.out.println("	SUMA	RESTA	PRODUCTO     COCIENTE");
		System.out.println("---------------------------------------------");
		System.out.println("x="+num1+" y="+num2+"   "+suma+"	    "+resta+"         "+multiplicacion+"	  "+division);

		/*FIN DEL PROGRAMA*/

		teclado.close();
	}

}
