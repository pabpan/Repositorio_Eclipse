import java.util.*;

public class Ejercicio105 {

	public static void main(String[] args) throws Exception{

		Scanner teclado = new Scanner(System.in);
		
		int vector [] = new int [3];
				
		System.out.println("Introduce las valores de un vector de 3 posiciones:");
		
		try {
		
			vector[0]=teclado.nextInt();
			vector[1]=teclado.nextInt();
			vector[2]=teclado.nextInt();
			vector[3]=teclado.nextInt();
			
		} catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("Se pasa de 3 posiciones");
		}
		
		catch (Exception e) {
			System.out.println("Algo ha fallado");
		}
			}

}
