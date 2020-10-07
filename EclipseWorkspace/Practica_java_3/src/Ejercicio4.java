 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 15/10/2019
 * DESC.: NOTA TRIMESTRE
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		double nota1, nota2, media;
		String recuperacion;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.printf("Nota del primer control: ");
		nota1=teclado.nextDouble();
		System.out.printf("Nota del segundo control: ");
		nota2=teclado.nextDouble();	
		teclado.nextLine();
				
		/*CALCULAMOS LA MEDIA*/
		
		media=((nota1+nota2)/2);
			
		if (media>5) {
			System.out.printf("Tu nota de programación es "+media);	/*SI LA MEDIA ES MAYOR QUE 5*/
		}
		else { /*SI LA MEDIA ES MENOR QUE 5*/
				System.out.printf("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");	
				recuperacion=teclado.nextLine();
				
				
				 if (recuperacion.equals("apto")) /*SI ES APTO*/
				 {  
					media=5;
					System.out.printf("Tu nota de programación es: "+media);	
				 }
				 
				 else if (recuperacion.equals("no apto")) /*SI NO ES APTO*/
				 {  
					media=4.5;
					System.out.printf("Tu nota de programación es: "+media);	
				 }
			}

		teclado.close();

	}

}
