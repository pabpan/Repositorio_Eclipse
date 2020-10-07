 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 25/10/2019
 * DESC.: NÚMERO SECRETO
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 


public class Ejercicio46 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		String dia;
		int dias=5;
		int horas_dia=24;
		int min_hora=60;
		int jornada_viernes=600;
		int hora_int, min_int, hora_rest, min_rest, total_rest, total_sem;
	
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("¿Qué día es hoy?");
		dia=teclado.nextLine();
		System.out.println("¿Qué hora es?");
		hora_int=teclado.nextInt();
		System.out.println("¿Qué minuto es?");
		min_int=teclado.nextInt();	

		/*REALIZAMOS LAS OPERACIONES*/
		
		switch (dia.toUpperCase()) {
		
			case "LUNES": {
				
				min_rest=min_hora-min_int;
				hora_rest=horas_dia-(hora_int+1);
				total_rest=(hora_rest*60)+min_rest;
				total_sem=((horas_dia*min_hora*(dias-1))-jornada_viernes)+total_rest;
				System.out.println("Minutos restantes: "+total_sem+" minutos.");
				break;
			}
			
			case "MARTES": {
				
				min_rest=min_hora-min_int;
				hora_rest=horas_dia-(hora_int+1);
				total_rest=(hora_rest*60)+min_rest;
				total_sem=((horas_dia*min_hora*(dias-2))-jornada_viernes)+total_rest;
				System.out.println("Minutos restantes: "+total_sem+" minutos.");
				break;
			}
						
			case "MIERCOLES": {
				
				min_rest=min_hora-min_int;
				hora_rest=horas_dia-(hora_int+1);
				total_rest=(hora_rest*60)+min_rest;
				total_sem=((horas_dia*min_hora*(dias-3))-jornada_viernes)+total_rest;
				System.out.println("Minutos restantes: "+total_sem+" minutos.");
				break;
			}
			case "JUEVES": {
				
				min_rest=min_hora-min_int;
				hora_rest=horas_dia-(hora_int+1);
				total_rest=(hora_rest*60)+min_rest;
				total_sem=((horas_dia*min_hora*(dias-4))-jornada_viernes)+total_rest;
				System.out.println("Minutos restantes: "+total_sem+" minutos.");
				break;
			}
			case "VIERNES": {
				
				min_rest=min_hora-min_int;
				hora_rest=horas_dia-(hora_int+1);
				total_rest=(hora_rest*60)+min_rest;
				total_sem=((horas_dia*min_hora*(dias-5))-jornada_viernes)+total_rest;
				System.out.println("Minutos restantes: "+total_sem+" minutos.");
				break;
			}
							
		}
				
		teclado.close();

	}

}