/*
  * NOMBRE: PABLO SUÁREZ
 * FECHA: 04/11/2019
 * DESC.: TAMAÑO ARRAY
 */


import java.util.*;

public class Ejercicio54 {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
			
		int num, num_inferior, num_superior, suma=0;	
		
		System.out.println("Introduzca el tamaño del array:");
		num=teclado.nextInt();
		
		System.out.println("Introduzca límites inferior y superior para generar números aleatorios:");
		num_inferior=teclado.nextInt();
		num_superior=teclado.nextInt();
		
		int v[] = new int [num];
		
		System.out.println("Se ha generado el siguiente array de "+num+" posiciones");	
		for (int i=0; i<v.length; i++) {
			
			v[i]=(int)(aleatorio.nextDouble()*num+num_inferior);
			suma += v[i];
		
				System.out.print("["+v[i]+"]");
				
		}	

		System.out.print("\nLa suma de los elementos es: "+suma);				

		teclado.close();
		
	}

}
