 /*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 12/11/2019
 * DESC.: 
 */

import java.util.*; //IMPORTAMOS LAS LIBRERÍAS


public class Ejercicio63 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
				
		int tamanyo; //TAMAÑO DEL VECTOR
				
		System.out.println("Introduzca la dimensión del vector: ");
		tamanyo=teclado.nextInt(); //LEEMOS TAMAÑO DEL VECTOR
		int v[] = new int [tamanyo]; //CREAMOS UN VECTOR DEL TAMAÑO QUE INDICA EL USUARIO
		
		int aleatorio; //DECLARAMOS UN ALEATORIO
		
		System.out.println("Tu vector es: ");	

		for (int i=0; i<tamanyo; i++) { //HACEMOS UN FOR PARA RELLENAR EL VECTOR CON ALEATORIOS
			

			aleatorio=random.nextInt(100);	//ALEATORIOS DE HASTA 100 NÚMEROS
			v[i]=aleatorio; //LE DECIMOS QUE EN EL RECORRIDO NOS RELLENE EL VECTOR CON ALEATORIOS
			
			System.out.print(v[i]+" "); //IMPRIMIMOS EL VECTOR

		}
		
		int v1[]; //CREAMOS UN VECTOR NUEVO PARA COMPARAR
		
		v1=Arrays.copyOfRange(v, 0, v.length); //COPIAMOS EL CONTENIDO DEL ANTERIOR EN EL NUEVO
		
		Arrays.sort(v1); //ORDENAMOS EL VECTOR
				
		if (Arrays.equals(v, v1)) { //COMPARAMOS SI LOS DOS VECTORES SON IGUALES
			System.out.println("El vector está ordenado");
		}else
				System.out.println("No está ordenado");	


		
		
	
		teclado.close();

	}

}
