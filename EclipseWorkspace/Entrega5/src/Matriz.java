/*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 13/11/2019
 * DESC.: MATRIZ
 */

import java.util.*;

public class Matriz {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int filas, columnas, inferior, superior, numero;
		int [][] matriz;
		int contador=0;
		
		System.out.println("Introduzca el número de filas de la matriz");
		filas=teclado.nextInt();
		System.out.println("Introduzca el número de filas de la matriz");
		columnas=teclado.nextInt();
		
		matriz=new int [filas][columnas];
		
		System.out.println("Introduzca el rango inferior de la matriz");
		inferior=teclado.nextInt();
		System.out.println("Introduzca el rango superior de la matriz");
		superior=teclado.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				
				matriz[i][j]=aleatorio.nextInt((superior-inferior)+1)+inferior;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("¿Qué número quieres buscar en la matriz?");
		numero=teclado.nextInt();
		
		if (numero<=superior && numero>=inferior) {
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (numero==matriz[i][j]) {
						contador++;
					}
				}
			}
			
		if (contador>0) {	
		System.out.println("El valor "+numero+" está en la matriz y aparace "+contador+" veces");
		}else
			System.out.println("El valor no está en la matriz");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				if (numero==matriz[i][j]) {
					System.out.println("Lo encuentro en la posición ["+i+", "+j+"].");
				}
			}
		}
		
		}
		
teclado.close();
}
}