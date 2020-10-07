 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 08/10/2019
 * DESC.: ESTUDIANTE
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEER POR TECLADO*/
import java.util.Scanner; 

public class Ejercicio6 {

	public static void main(String[] args) {
		
		/*INICIALIZAMOS EL TECLADO*/
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int num;
		double n1, n2, n3, media;
		String nombre;
	
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.print("Introduzca número de estudiante: ");
		num=teclado.nextInt();
		teclado.nextLine();
		System.out.print("Introduzca nombre del alumno: ");
		nombre=teclado.nextLine();
		System.out.print("Introduzca nota1: ");
		n1=teclado.nextDouble();
		System.out.print("Introduzca nota2: ");
		n2=teclado.nextDouble();
		System.out.print("Introduzca nota3: ");
		n3=teclado.nextDouble();
		System.out.println("\nAlumno: "+num+"-"+nombre+"	ex.1	ex.2	ex.3	media");
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		media=(n1+n2+n3)/3;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.print("Notas 1era Evaluación	"+n1+"	"+n2+"	"+n3+"	"+media);

		teclado.close();
	}

}
