 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 30/10/2019
 * DESC.: FECHAS
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.*;
import java.text.*;


public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//IMPORTANDO LA FECHA ACTUAL
		Date fecha=new Date();
		Calendar cal= new GregorianCalendar();
		cal.setTimeInMillis(fecha.getTime());
		
		System.out.println("1.- Obtener fecha actual\n" + 
				"2.- Obtener hora actual\n" + 
				"3.- Sumar días\n" + 
				"4.- Restar en días\n" + 
				"5.- Anterior o Posterior\n" + 
				"9.- Salir");
		
		/*DECLARAMOS VARIABLES*/
		
		int seleccion;
		
		System.out.printf("Introduce la opción deseada: ");
		seleccion=teclado.nextInt();

		
		switch (seleccion) {
		
		case 1:
			
			fecha_actual();
			
			break;
		
		case 2:
			
			hora_actual();
			
			break;
				
		case 3:
			
			sumar_dias();
			
			break;
			
		case 4:
			
			restar_dias();
			
			break;
		
		case 5:
			
			anterior_posterior();
			
			break;
		
		case 9:
			
			break;
		
		}
	
		
		teclado.close();
		
	}
	
	public static void fecha_actual() {
		
		Date fecha=new Date();
		SimpleDateFormat formatoDelTexto= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatoDelTexto.format(fecha));
		
	}
	
	public static void hora_actual() {
		
		Date fecha=new Date();
		SimpleDateFormat formatoDelTexto= new SimpleDateFormat("hh:mm:ss");
		System.out.println(formatoDelTexto.format(fecha));
		
	}
	
	public static void sumar_dias() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("¿Cuántos días quieres sumar?");
		int dias=teclado.nextInt();

		
		Date fecha=new Date();
		Calendar cal= new GregorianCalendar();
		cal.setTimeInMillis(fecha.getTime());
		cal.add(Calendar.DATE, dias);
		
		SimpleDateFormat formatoDelTexto= new SimpleDateFormat("dd/MM/yyyy");		
		Date fechaSuma=new Date(cal.getTimeInMillis());
		
		System.out.println("Hoy + "+dias+" día sería "+formatoDelTexto.format(fechaSuma));
	
	}

	public static void restar_dias() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("¿Cuántos días quieres restar?");
		int dias=teclado.nextInt();

		
		Date fecha=new Date();
		Calendar cal= new GregorianCalendar();
		cal.setTimeInMillis(fecha.getTime());
		cal.add(Calendar.DATE, -dias);
		
		SimpleDateFormat formatoDelTexto= new SimpleDateFormat("dd/MM/yyyy");		
		Date fecharesta=new Date(cal.getTimeInMillis());
		
		System.out.println("Hoy - "+dias+" día sería "+formatoDelTexto.format(fecharesta));

	}
	
	public static void anterior_posterior() {
		
		Scanner teclado = new Scanner(System.in);	
		
		String fechaString;
		
		Date fecha=new Date();
		
		SimpleDateFormat formatoDelTexto= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Introduce la fecha a comparar (dd/MM/yyyy): ");	
		fechaString=teclado.next();
		
		Date fechaUsuario= null;
		
		try{
			fechaUsuario= formatoDelTexto.parse( fechaString);
			System.out.println("Fecha usuario: "+ formatoDelTexto.format( fechaUsuario));
			}
		catch(ParseException e) {
			e.printStackTrace();
			System.out.println("Fecha INCORRECTA");
		}
		if (fechaUsuario.before(fecha) == true) {
			
			System.out.println("la fecha es anterior");

		}
		else 
			System.out.println("la fecha es posterior");
		}
					
}
