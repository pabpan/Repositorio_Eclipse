import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		//IMPORTANDO LA FECHA ACTUAL
		
		Date fecha=new Date();
		Calendar cal= new GregorianCalendar();
		cal.setTimeInMillis(fecha.getTime());
		
		System.out.println("1.- Longitud de una cadena\n" + 
				"2.- Comparación de dos cadenas\n" + 
				"3.- Concatenación de dos cadenas\n" + 
				"4.- Obtener subcadenas\n" + 
				"5.- Invertir cadenas\n" + 
				"6.- Es palíndromo\n" + 
				"9.- Salir");
		
		/*DECLARAMOS VARIABLES*/
		
		
		int seleccion;
		
		System.out.printf("Introduce la opción deseada: ");
		seleccion=teclado.nextInt();

		
		switch (seleccion) {
		
		case 1:
			
			longitud();
			
			break;
			
		case 2:
			
			comparar();
			
			break;
		case 3:
			
			concatenacion();
			
			break;
		case 4:
			
			subcadenas();
			
			break;
		case 5:
			
			invertir();
			
			break;
		case 6:
			
			palindromo();
			
			break;
		case 9:
			
			break;
		}
	}
	
	public static void longitud() {
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena;	
		
		System.out.printf("Introduce una cadena: \n");
		cadena=teclado.nextLine();
		System.out.printf("Tiene "+cadena.length()+" caracteres");
		
	}
	
	public static void comparar() {
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena1, cadena2;	
		
		System.out.printf("Introduce una cadena: \n");
		cadena1=teclado.nextLine();
		System.out.printf("Introduce otra cadena: \n");
		cadena2=teclado.nextLine();
		
		if (cadena1.compareTo(cadena2) > 0) {
			System.out.printf("La primera cadena es mayor");
		}
		else
			System.out.printf("La segunda cadena es mayor");
		}
	
	public static void concatenacion() {	
	
		Scanner teclado = new Scanner(System.in);
		
		String cadena1, cadena2;	
		
		System.out.println("Introduce una cadena:");
		cadena1=teclado.nextLine();
		System.out.println("Introduce otra cadena:");
		cadena2=teclado.nextLine();
		System.out.printf("Las cadenas concatenadas es igual a: "+cadena1+cadena2);	
		}
	
	public static void subcadenas() {
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		int x1, x2;
		
		System.out.println("Introduce una cadena:");
		cadena=teclado.nextLine();
		System.out.println("Introduce el inicio de la subcadena");
		x1=teclado.nextInt();
		System.out.println("Introduce el inicio de la subcadena");
		x2=teclado.nextInt();
		
		System.out.println(cadena.substring(x1-1, x2));
		
	}
	
	public static void invertir() {
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena, invertida="";
		
		System.out.println("Introduce una cadena:");
		cadena=teclado.nextLine();
		
		int x;
		
		for (x=cadena.length()-1; x>=0; x--) {
			
		invertida=invertida+cadena.charAt(x);
					
		} 
		System.out.println("La cadena invertida es: "+invertida);

	}

	public static void palindromo(){
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena, invertida="";
		
		System.out.println("Introduce una cadena:");
		cadena=teclado.nextLine();
		cadena=cadena.toLowerCase();
		
		for (int x=cadena.length()-1; x>=0; x--) {
			
			invertida=invertida+cadena.charAt(x);
						
			} 
		
		if (cadena.equals(invertida)){
			System.out.printf("\nLa cadena %s SI es palíndromo\n", cadena);
			}
			else{
				System.out.printf("\nLa cadena %s NO es palíndromo\n", cadena);
			}


		
		
	}
	
}
