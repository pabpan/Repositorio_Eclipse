 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 02/10/2019
 * DESC.: NÚMERO SECRETO
 */

public class Ejercicio15 {

	public static void main(String[] args) {

		/*DECLARAMOS LAS VARIABLES*/

		double precio=100, general=1.21, reducido=1.10, superreducido=1.04, descuento1, descuento2, descuento3;
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		descuento1=precio/general;
		descuento2=precio/reducido;
		descuento3=precio/superreducido;

		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("El importe de tu producto es de "+precio+" euros.\n\n");
		System.out.println("Si tu producto tuviera un IVA General, su importe descontando el IVA sería : "+descuento1+".\n\n");
		System.out.println("Si tu producto tuviera un IVA Reducido, su importe descontando el IVA sería : "+descuento2+".\n\n");
		System.out.println("Si tu producto tuviera un IVA Superreducido, su importe descontando el IVA sería : "+descuento3+".");

	}

}