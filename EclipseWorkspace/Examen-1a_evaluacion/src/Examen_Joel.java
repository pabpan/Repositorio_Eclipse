//Pablo Suárez Pantaleón
//22-11-19
//HUNDIR LA FLOTA


import java.util.*;

public class Examen_Joel {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int x, y, contador=0, conta_trans=0;
		char tablero[][]= new char [6][6];
		String nombre;
		
		System.out.println("Bienvenido al juego de Hundir la flota de 6x6, introduzca su nombre: ");
		nombre=teclado.nextLine();
		System.out.println("Hola, capitán "+nombre+". Déjeme que le ayude a configurar su flota.");

		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				tablero[i][j]='_';
			}
		}
		
		do {
			if (conta_trans==0) {
			System.out.println("Introduzca la posición de su transatlántico 1 de 3 o 'stop' para dejar de introducir datos");
			}
			if (conta_trans==1) {
				System.out.println("Introduzca la posición de su transatlántico 2 de 3 o 'stop' para dejar de introducir datos");
				}
			if (conta_trans==2) {
				System.out.println("Introduzca la posición de su transatlántico 3 de 3 o 'stop' para dejar de introducir datos");
				}
			x=teclado.nextInt();
			y=teclado.nextInt();
			
			tablero[x][y+contador]='T';
			contador++;	
			conta_trans++;
			
		}while (contador<4 && conta_trans<3);
		
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println("");
		}
		
		
			
		
		
		teclado.close();
	}	
}

