 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 15/10/2019
 * DESC.: BANDERA ESPAÑA
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEER POR TECLADO*/

import java.util.Scanner; 

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int area, altura, anchura;
		double precio=0.00, precio_base=0.01, bordado=2.50, sin_bordado=0.0, envio=3.25;
		String pregunta1, resp_si="s", resp_no="n";
	
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.printf("Introduzca la altura de la bandera en cm: ");
		altura=teclado.nextInt();
		System.out.printf("Introduzca la anchura de la bandera en cm: ");
		anchura=teclado.nextInt();
		teclado.nextLine();

		System.out.printf("¿Quiere escudo bordado? (s/n)");
		pregunta1=teclado.nextLine();
	
		System.out.println("\nGracias. Aquí tiene el desglose de su compra");
		
		/*REALIZAMOS LAS OPERACIONES*/

		area=altura*anchura;
		precio_base=precio_base*area;
		
		/*IMPRIMIMOS POR PANTALLA LOS RESULTADOS*/

		System.out.println("\nBandera de "+area+"cm2:  		"+precio_base+" €");
		
		/*REALIZAMOS LAS CONDICIONES PARA EL RESULTADO CON/SIN BORDADO*/
		
		/*CON BORDADO*/
		if (pregunta1.contentEquals(resp_si))	
				{
			precio=precio_base+bordado;
			System.out.println("Con escudo: 			"+bordado+" €");
			System.out.println("Gastos de envío: 		" +envio);
			System.out.println("Total: 				" +(precio_base+bordado+envio)+" €");			
				}
		/*SIN BORDADO*/
		else if (pregunta1.contentEquals(resp_no))	
				{
			precio=precio_base+sin_bordado;
			System.out.println("Sin escudo: 			"+sin_bordado+" €");
			System.out.println("Gastos de envío: 		" +envio);
			System.out.println("Total: 				" +(precio_base+sin_bordado+envio)+" €");
				}
		
		teclado.close();
		
	}
}
	
	
		





/*La tienda online http://www.banderadeespana.com/ vende banderas personalizadas de la máxima
calidad y nos ha pedido hacer un configurador que calcule el precio según el alto y el ancho.


El precio base de una bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un
escudo bordado, el precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas.*/