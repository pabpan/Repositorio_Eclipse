/*
* NOMBRE: PABLO SUÁREZ 
* FECHA: 10/12/2019
* DESC.: AREA 51
*/

import java.util.*;

public class Ejercicio73 {

	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	
	String parte1="";
	String parte2="";
	int pos;
	System.out.println("Introduzca la transmisión a cifrar:");
	String transmision = teclado.nextLine();
	if (transmision.indexOf("el area 51")==-1){
		System.out.println("el area 51 no aparece en la transmisión");
	}else {
		while (transmision.indexOf("el area 51")!=-1) {
			pos=transmision.indexOf("el area 51");
			parte1="";
			parte2="";
			parte1=transmision.substring(0, pos);
			parte2=transmision.substring(pos+10);
			transmision=parte1 + "Murcia" + parte2;
		}
		System.out.println(transmision);
		}
	}
}
