 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 04/10/2019
 * DESC.: NÚMERO SECRETO
 */

import java.util.Scanner; /*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/


public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int var,Bites,KB,MB;
		long Bytes;
		float GB,TB;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Introduce un valor en MB: ");
		var=teclado.nextInt();
		System.out.println("\n");
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		Bytes=var*(1024*1024);
		KB=var*1024;
		MB=var;
		GB=var*1024;
		TB=var*(1024*1024);
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("TABLA DE EQUIVALENCIAS DE "+var+"\n");
		System.out.println("MEDIDA	|	SIMBOLOGÍA	|	EQUIVALENCIA	|	EQUIVALENCIA EN BYTES");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("KiloByte|	KB		|	"+var*1024+" KB  	|	"+Bytes/1024+" bytes");
		System.out.println("MegaByte|	MB		|	"+var+" MB  		|	"+Bytes+" bytes");
		System.out.println("GigaByte|	GB		|	"+GB+" MB  	|	"+GB*MB*Bytes+" bytes");
		System.out.println("TeraByte|	TB		|	"+TB+" GB  	|	"+TB*GB*var*Bytes+" bytes");




		teclado.close();

	}

}
