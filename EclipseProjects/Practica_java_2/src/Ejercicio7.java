 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 08/10/2019
 * DESC.: INFORME
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEER POR TECLADO*/
import java.util.Scanner; 

public class Ejercicio7 {

	public static void main(String[] args) {
		
		/*INICIALIZAMOS EL TECLADO*/
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int anyo=0000, mes=00, dias=00;
		String NIF="00000000X", nombre, dir;
		double sal, ret, neto, x;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.print("Introduzca la fecha de nacimiento en formato AAAA MM DD: ");
		anyo=teclado.nextInt();
		mes=teclado.nextInt();
		dias=teclado.nextInt();
		teclado.nextLine();
		System.out.print("Introduzca NIF: ");
		NIF=teclado.nextLine();
		System.out.print("Introduzca nombre: ");
		nombre=teclado.nextLine();
		System.out.print("Introduzca dirección: ");
		dir=teclado.nextLine();
		System.out.print("Introduzca Salario: ");
		sal=teclado.nextDouble();
		System.out.print("Introduzca Retención: ");
		ret=teclado.nextDouble();
		System.out.println("\n\nINFORME DEL TRABAJADOR");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Nombre.........................: "+nombre);
		System.out.println("Dirección......................: "+dir);
		System.out.println("NIF............................: "+NIF);
		System.out.println("Fecha de nacimiento............: "+dias+ "del mes "+mes+ " del año "+anyo);
		System.out.println("Salario bruto..................: "+sal);
		System.out.println("Retención......................: "+ret);

		/*REALIZAMOS LAS OPERACIONES*/

		x=(sal*ret)/100;
		neto=sal-x;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Salario neto...................: "+neto);
		System.out.println("-------------------------------------------------------------------------------");

		teclado.close();
	}

}
