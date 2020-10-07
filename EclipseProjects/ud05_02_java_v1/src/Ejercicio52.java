 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 29/10/2019
 * DESC.: ARRAY 100 POSICIONES
 */

public class Ejercicio52 {

	public static void main(String[] args) {
		
		/*DECLARAMOS VARIABLES*/
		
		int v[]= new int [100];
		int suma=0,
			media;
		
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		for (int i=0; i<v.length; i++)
		{
			v[i]=i+1;
			
			System.out.println(i);
			
			suma +=(i+1); //igual a suma=suma+(i+1)
			
		}
		System.out.println("La suma de los 100 primeros números es: "+suma);
		
		
		media=suma/v.length;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("La media de los 100 primeros números es: "+media);

	}

}
