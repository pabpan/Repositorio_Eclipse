 /*
   * NOMBRE: PABLO SUÁREZ
 * FECHA: 06/10/2019
 * DESC.: VECTORES
 */

import java.util.*; 

public class Ejercicio61 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int opcion, tamaño;	
		
		System.out.println("¿Cuántas posiciones quieres en el vector?");
		tamaño=teclado.nextInt();
		
		int v[] = new int[tamaño];	
		
		do {
			System.out.println("----------------------------------------");
			System.out.println("1. Rellenar vector\n" +
					"2. Rellenar automáticamente el vector\n" +
					"3. Modificar posición vector\n" +
					"4: Consultar una posición\n" +
					"5: Consultar el estado del vector\n" +
					"6: Ordenar ascendentemente el vector\n" +
					"9: FIN");
			System.out.println("-----------------------------------------");

			
			System.out.printf("\nIntroduce una opción: ");
			opcion=teclado.nextInt();
			System.out.println();
			
		switch (opcion) {
		
		case 1: 

			int valor;

			for (int x=0; x<v.length;x++) {
				
				System.out.printf("Introduce un valor: ");
				valor=teclado.nextInt();
				v[x]=valor;
			}
			
			break;
			
		case 2:
			
			Random aleatorio = new Random();
			
			for (int x=0; x<v.length;x++) {			
				v[x]=aleatorio.nextInt(99)+1;
				}
						
			break;
			
		case 3:
			
			System.out.println("¿Qué posición quieres modificar?");
			int posicion=teclado.nextInt();
			
			if (posicion<v.length) {
				
				System.out.println("¿Qué valor le quieres dar?");
				int nuevo_valor=teclado.nextInt();
				v[posicion]=nuevo_valor;
				}
			else 			
				System.out.println("El vector no tiene esa posición");

			break;
			
		case 4:
			
			System.out.println("¿Qué posición quieres consultar?");
			int posicion1=teclado.nextInt();
			
			if (posicion1<v.length) {
				
				System.out.println("El valor de la posición: "+posicion1+" es: "+v[posicion1]);
				}
			else 			
				System.out.println("El vector no tiene esa posición");

			break;
			
		case 5:
			
			System.out.print("[");
			
			for (int x=0; x<tamaño; x++) {
				System.out.print(v[x]);
				
				if (x<v.length-1)
					System.out.print(",");
			}
			
			System.out.println("]");
			
			break;

		case 6:
			
			 Arrays.sort(v);
					
			 break;
			 
		case 9:
			
			System.out.println("Gracias por utilizar este menú");
			
			break;
		}
	
		}
		
		while(opcion!=9);

		teclado.close();

	}

}
