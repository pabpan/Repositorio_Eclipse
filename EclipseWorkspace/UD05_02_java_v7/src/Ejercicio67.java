 /*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 26/11/2019
 * DESC.: RELLENAR MATRIZ CON 1, 2, 3 O 4 
 */

import java.util.Scanner;

public class Ejercicio67 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int x, y;
		
		do { //PREGUNTAMOS HASTA QUE LAS DIMENSIONES DE X E Y SEAN IGUALES Y PARES

		System.out.println("Introduce las dimensiones de la matriz: ");
		x = teclado.nextInt();
		y = teclado.nextInt();
		
		if  (x!=y || x<=1 || y<=1) {
			System.out.println("¡La matriz debe ser cuadrada y mínimo de 2x2, y par!");

		}
		
		}while (x!=y || x<=1 || y<=1 || x%2!=0 || y%2!=0); 
		
		int matriz[][]= new int [x][y];	//DECLARAMOS UNA MATRIZ DE X FILAS E Y COLUMNAS
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i<matriz.length/2 && j<matriz.length/2) { 
					matriz[i][j]=1;
				}
				if (j>=matriz.length/2 && i>=matriz.length/2) {
					matriz[i][j]=4;
				}
				if (j<matriz.length/2 && i>=matriz.length/2) { 
					matriz[i][j]=3;
				}
				if (j>=matriz.length/2 && i<matriz.length/2) {
					matriz[i][j]=2;
				}
		
			}
		}
			
		for (int i=0; i < matriz.length; i++) {
			for (int j=0; j < matriz.length; j++) {
		          System.out.print(matriz[i][j]);
		        }
		      System.out.println();
		    }
		teclado.close();
	}
}