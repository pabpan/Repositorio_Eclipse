 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 24/10/2019
 * DESC.: AUTOESCUELA
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 


public class Ejercicio45 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int a=150, b=325, c=520, d=610, n_practicas;
		int precio_a=15, precio_b=21, precio_c=36, precio_d=50;
		int precio_total;
		String tipo;
	
		/*REALIZAMOS LAS OPERACIONES*/
		
		do {
			
			System.out.println("¿Qué tipo de carnet ha obtenido el cliente?");
			tipo=teclado.nextLine();
		}
		
		while (!tipo.equals("a") && !tipo.equals("b") && !tipo.equals("c") && !tipo.equals("d"));
			
			System.out.println("¿Cuántas prácticas ha realizado?");
			n_practicas=teclado.nextInt();		
		
			if (tipo.equals("a")) {
				precio_total=a+(precio_a*n_practicas);
				System.out.println("El precio total del carnet "+tipo+" es: "+precio_total);
			}
			if (tipo.equals("b")) {
				precio_total=b+(precio_b*n_practicas);
				System.out.println("El precio total del carnet "+tipo+" es: "+precio_total);
			}
			if (tipo.equals("c")) {
				precio_total=c+(precio_c*n_practicas);
				System.out.println("El precio total del carnet "+tipo+" es: "+precio_total);
			}
			if (tipo.equals("d")) {
				precio_total=d+(precio_d*n_practicas);
				System.out.println("El precio total del carnet "+tipo+" es: "+precio_total);
			}
			
			teclado.close();
			
	}

}
