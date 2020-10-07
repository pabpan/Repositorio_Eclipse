/*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 26/11/2019
 * DESC.: TRES EN RAYA
 */

import java.util.*;

public class Ejercicio70 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		Random aleatorio = new Random();
		
		int x,y,posx, posy;
		char tirada_usuario='X';
		char tirada_maquina='O';
		boolean resultado=false;
		
		char matriz[][]= new char [3][3];	//DECLARAMOS UNA MATRIZ DE X FILAS E Y COLUMNAS

		for (int i = 0; i < matriz.length; i++) { //RELLENAMOS MATRIZ CON GUIONES
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]='-';	
			}
		}
		
		System.out.println("Binevenido al juego de tres en raya");
		
		do {
		
			do {	
				System.out.println("Introduce fila y columna de tu tirada:"); //BUCLE PARA TIRADA
				x=teclado.nextInt();
				y=teclado.nextInt();
					
				if (x>=3 || y>=3 || x<0 || y<0) {
					System.out.println("La fila está fuera de tablero!!"
							+ "Valores posibles 0, 1, 2");
				}
				
				if (matriz[x][y]!='-') {
						System.out.println("La posición está ocupada");
				}
 
			}while (x<0 || y<0 || x>=3 || y>=3 || matriz[x][y]!='-');
		
			if (matriz[x][y]=='-') {
				matriz[x][y]= tirada_usuario; //RELLENAMOS CON UNA X LA TIRADA DEL USUARIO
				}
	
			
			for (int i = 0; i < matriz.length; i++) { //IMPRIMIR LA MATRIZ POR PATANLLA
				for (int j = 0; j < matriz.length; j++) {			
					System.out.print(matriz[i][j]);	
				}
				System.out.println();
			}
			
				System.out.println("Ahora tira la máquina");
			
			do  { //TIRA LA MÁQUINA EN UNA POSICIÓN VACÍA
				posx=aleatorio.nextInt(3);
				posy=aleatorio.nextInt(3);
						
			}while(matriz[posx][posy]!='-');
				
				matriz[posx][posy]=tirada_maquina;
					
			for (int i = 0; i < matriz.length; i++) { //IMPRIMIMOS LA MATRIZ POR PANTALLA
				for (int j = 0; j < matriz.length; j++) {			
					System.out.print(matriz[i][j]);	
				}System.out.println();
			}

			//recorrer toda la matriz y contar espacios que hay, si no hay espacios acabamos
			//que el usuario haya hecho las 3 tiradas correctas
			
			resultado = ha_ganado_usuario(matriz);
			
			if (resultado == false) {
				resultado = ha_ganado_maquina(matriz);

				if (resultado == false) {
					resultado = si_tablero_lleno(matriz);

				}
			}		
			
		}while (resultado == false);
		teclado.close();
    }//main 
	
	public static boolean ha_ganado_usuario(char[][] matriz) {
		
		boolean res=false;
		
		if ((matriz[0][0]=='X' && matriz[0][1]=='X' && matriz[0][2]=='X') || 
			
		(matriz[1][0]=='X' && matriz[1][1]=='X' && matriz[1][2]=='X') ||
		
		(matriz[2][0]=='X' && matriz[2][1]=='X' && matriz[2][2]=='X') ||
		
		(matriz[0][0]=='X' && matriz[1][0]=='X' && matriz[2][0]=='X') ||
		
		(matriz[0][1]=='X' && matriz[1][1]=='X' && matriz[2][1]=='X') ||
		
		(matriz[0][2]=='X' && matriz[1][2]=='X' && matriz[2][2]=='X') ||
		
		(matriz[0][0]=='X' && matriz[1][1]=='X' && matriz[2][2]=='X') ||
		
		(matriz[0][2]=='X' && matriz[1][1]=='X' && matriz[2][0]=='X'))
		
		{
		
			res = true;
			System.out.println("HAS GANADO!!");

		}
		return (res);
	}
	
	public static boolean ha_ganado_maquina(char[][] matriz) {
		
		boolean res=false;
		
		if ((matriz[0][0]=='O' && matriz[0][1]=='O' && matriz[0][2]=='O') || 
			
		(matriz[1][0]=='O' && matriz[1][1]=='O' && matriz[1][2]=='O') ||
		
		(matriz[2][0]=='O' && matriz[2][1]=='O' && matriz[2][2]=='O') ||
		
		(matriz[0][0]=='O' && matriz[1][0]=='O' && matriz[2][0]=='O') ||
		
		(matriz[0][1]=='O' && matriz[1][1]=='O' && matriz[2][1]=='O') ||
		
		(matriz[0][2]=='O' && matriz[1][2]=='O' && matriz[2][2]=='O') ||
		
		(matriz[0][0]=='O' && matriz[1][1]=='O' && matriz[2][2]=='O') ||
		
		(matriz[0][2]=='O' && matriz[1][1]=='O' && matriz[2][0]=='O'))
		
		{
		
			res = true;
			System.out.println("HAS PERDIDO!!");

		}
		return (res);
	}
	
	public static boolean si_tablero_lleno(char[][] matriz) {
		
		boolean res=true;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j]=='-'){
					res = false;				
				}else
					System.out.println("EL TABLERO ESTÁ LLENO!!");

			}
		}
		return (res);

	}
	
	
}//clase
