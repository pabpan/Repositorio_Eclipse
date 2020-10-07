/*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 05/11/2019
 * DESC.: MATRIZ
*/

import java.util.*;

public class Ejercicio58 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		//DECLARAMOS LAS VARIABLES		
		int fila, columna;
		int matriz[][];
		
		//PEDIMOS AL USUARIO EL RECORRIDO DE LA MATRIZ
		System.out.println("¿Cuántas filas quieres mostrar?");
		fila=teclado.nextInt();
		System.out.println("¿Cuántas columnas quieres mostrar?");
		columna=teclado.nextInt();
		
		//INICIALIZAMOS LA MATRIZ
		matriz=new int [fila][columna];
		
		//INICIALIZAMOS EL RECORRIDO TANTO DE LAS FILAS COMO DE LAS COLUMNAS
		for (int i=0; i<fila; i++) {
			for (int j=0; j<columna; j++) {
				System.out.printf("Introduce posición %s,%s: ",i,j);
				matriz[i][j]=teclado.nextInt();	//LE SOLICITAMOS AL USUARIO QUE VAYA RELLENANDO LOS VALORES DE LA MATRIZ			
			}
		}
		
		System.out.println("\nSu vector es: \n");
		
		//VOLVEMOS A HACER EL RECORRIDO PARA QUE IMPRIMA LOS VALORES QUE AHORA TIENE ALMACENADOS
		for (int i=0; i<fila; i++) {
			for (int j=0; j<columna; j++) {
				System.out.print(matriz[i][j]);	
			}
		System.out.println();
		}
	}

}
