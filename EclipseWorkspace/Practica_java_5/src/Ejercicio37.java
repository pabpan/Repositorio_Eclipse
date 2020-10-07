 /*
 * NOMBRE: PABLO SUÁREZ 
 * FECHA: 23/10/2019
 * DESC.: EJES
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 


public class Ejercicio37 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*DECLARAMOS VARIABLES*/
		
		int x, y, abcisa;
	
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Introduce el valor de x: ");
		x=teclado.nextInt();
		System.out.println("Introduce el valor de y: ");
		y=teclado.nextInt();
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		if (x>0 && y>0){
			System.out.printf("El centro de %s y %s está en el primer cuadrante",x, y);
		}
		else if (x<0 && y>0) {
			System.out.printf("El centro de %s y %s está en el segundo cuadrante",x, y);
		}
		else if (x<0 && y<0){
			System.out.printf("El centro de %s y %s está en el tercer cuadrante",x, y);
		}
		else if (x>0 && y<0){
			System.out.printf("El centro de %s y %s está en el cuarto cuadrante",x, y);
		}
		else if (x!=0 && y==0){
			System.out.printf("El eje de abcisas de %s y %s está en x"+x,x, y);
		}
		else if (x==0 && y!=0){
			System.out.printf("El eje de abcisas de %s y %s está en y"+y,x, y);
		}
		else if (x==0 && y==0){
			System.out.printf("El centro se encuentra en origo",x, y);
		}
		teclado.close();

	}

}
