 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 04/10/2019
 * DESC.: FACTURA
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/

import java.util.Scanner; 

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		String nombre, apellidos, domicilio, concepto, concepto1, concepto2, concepto3, concepto4;
		int NIF, horas, horas1, horas2, horas3, horas4; 
		double precio, precio1, precio2, precio3, precio4, importe, importe1, importe2, importe3, importe4, bruto, descuento, descuento1, total;
	
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.printf("Introduce el nombre: ");
		nombre=teclado.nextLine();
		System.out.printf("Introduce los apellidos: ");
		apellidos=teclado.nextLine();
		System.out.printf("Introduce el DNI: ");
		NIF=teclado.nextInt();
		teclado.nextLine();
		System.out.printf("Introduce el domicilio: ");
		domicilio=teclado.nextLine();
		
		System.out.printf("Horas realizadas de mantenimiento: ");
		horas=teclado.nextInt();
		teclado.nextLine();
		System.out.printf("En concepto de HW, SW, REDES, WEB o VARIOS: ");
		concepto=teclado.nextLine();
		System.out.printf("Precio de la hora: ");
		precio=teclado.nextInt();
		teclado.nextLine();
		precio=(horas*precio);
		importe=precio;

		System.out.printf("Horas realizadas de mantenimiento: ");
		horas1=teclado.nextInt();
		teclado.nextLine();
		System.out.printf("En concepto de HW, SW, REDES, WEB o VARIOS: ");
		concepto1=teclado.nextLine();
		System.out.printf("Precio de la hora: ");
		precio1=teclado.nextInt();
		teclado.nextLine();
		precio1=(horas1*precio1);
		importe1=precio1;
		
		System.out.printf("Horas realizadas de mantenimiento: ");
		horas2=teclado.nextInt();
		teclado.nextLine();
		System.out.printf("En concepto de HW, SW, REDES, WEB o VARIOS: ");
		concepto2=teclado.nextLine();
		System.out.printf("Precio de la hora: ");
		precio2=teclado.nextInt();
		teclado.nextLine();
		precio2=(horas2*precio2);
		importe2=precio2;
		
		System.out.printf("Horas realizadas de mantenimiento: ");
		horas3=teclado.nextInt();
		teclado.nextLine();
		System.out.printf("En concepto de HW, SW, REDES, WEB o VARIOS: ");
		concepto3=teclado.nextLine();
		System.out.printf("Precio de la hora: ");
		precio3=teclado.nextInt();
		teclado.nextLine();
		precio3=(horas3*precio3);
		importe3=precio3;
		
		System.out.printf("Horas realizadas de mantenimiento: ");
		horas4=teclado.nextInt();
		teclado.nextLine();
		System.out.printf("En concepto de HW, SW, REDES, WEB o VARIOS: ");
		concepto4=teclado.nextLine();
		System.out.printf("Precio de la hora: ");
		precio4=teclado.nextInt();
		teclado.nextLine();
		precio4=(horas1*precio1);
		importe4=precio4;

		System.out.printf("Descuento a aplicar: ");
		descuento=teclado.nextInt();
		System.out.printf("La factura final es: \n\n\n");	
		System.out.println(" ---------------------------------------------------------------");
		System.out.println("| CLIENTE: "+nombre+" "+apellidos+"                DNI: "+NIF+"");
		System.out.println("| DOMICILIO: "+domicilio+".");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("| CANTIDAD   |   CONCEPTO-REFERENCIA   |   PRECIO   |   IMPORTE |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("|" 		+horas+"  		"+concepto+"		"+precio+"		"+importe);
		System.out.println("|" 		+horas1+"  		"+concepto1+"		"+precio1+"  	"+importe1);
		System.out.println("|" 		+horas2+"  		"+concepto2+"		"+precio2+"  	"+importe2);
		System.out.println("|" 		+horas3+"  		"+concepto3+"		"+precio3+"  	"+importe3);
		System.out.println("|" 		+horas4+" 		"+concepto4+"		"+precio4+"  	"+importe4);
		System.out.println(" ---------------------------------------------------------------|");
		bruto=importe+importe1+importe2+importe3+importe4;
		descuento1=((bruto*descuento)/100);
		total=bruto-descuento1;
		System.out.println( "TOTAL BRUTO: "+bruto+"  |  DESCUENTO: "+descuento1+"  |  TOTAL: " +total);


		teclado.close();
	}

}
