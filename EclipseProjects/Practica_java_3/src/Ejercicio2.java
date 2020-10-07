 /*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 11/10/2019
 * DESC.: NÓMINA
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/

import java.util.Scanner; 

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int trabajo, dias_viaje, estado;
		double sueldo_base=0, dietas, sueldo_bruto, IRPF=0, sueldo_neto, retencion;
	
		/*IMPRIMIMOS POR PANTALLA*/
					
		System.out.println("¿Cuál es tu cargo?");
		System.out.println("	1.- Programador Junior");
		System.out.println("	2.- Programador Senior");
		System.out.println("	3.- Jefe de proyecto");
		trabajo=teclado.nextInt();
				
		System.out.println("¿Cuántos días has estado de viaje visitando clientes durante el mes?");
		dias_viaje=teclado.nextInt();
		
		System.out.println("¿Cuál es tu estado civil?");
		System.out.println("	1.- Soltero");
		System.out.println("	2.- Casado");
		estado=teclado.nextInt();		
		
		/*REALIZAMOS EL SWITCH DEL SALARIO SEGÚN TRABAJO*/

		switch (trabajo)
		{
		case 1:
			sueldo_base=950;
			break;
		case 2:
			sueldo_base=1200;
			break;
		case 3:
			sueldo_base=1600;
			break;
		default:
			System.out.println("Elije una de las 3 opciones");
		}
				
		/*CALCULAMOS LAS DIETAS Y EL SUELDO BRUTO*/

		dietas = dias_viaje * 30;
		sueldo_bruto=sueldo_base+dietas;
		
		/*REALIZAMOS EL IF PARA EL ESTADO CIVIL*/
		
		if (estado==1) {
			IRPF=25;}
			else if (estado==2){
				IRPF=20;}
			else {
				System.out.println("Debe elegir un estado civil");
		}
		
		/*CALCULAMOS LA RETENCIÓN Y EL SUELDO NETO*/
		
		retencion=((sueldo_bruto*IRPF)/100);
		sueldo_neto=sueldo_bruto-retencion;
		
		/*IMPRIMIMOS POR PANTALLA LOS RESULTADOS*/
		
		System.out.println("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮");
		System.out.println("▮ Sueldo Base:                           "+sueldo_base+"▮");
		System.out.println("▮ Dietas: ( "+dias_viaje+" viajes ) 			  "+dietas+"▮");
		System.out.println("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮");
		System.out.println("▮ Sueldo Bruto:                          "+sueldo_bruto+"▮");
		System.out.println("▮ Retención IRPF: "+IRPF+"%                   "+retencion+"▮");
		System.out.println("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮");
		System.out.println("▮ Sueldo Neto:                  	 "+sueldo_neto+"▮");
		System.out.println("▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮▮");

		teclado.close();
	}

}