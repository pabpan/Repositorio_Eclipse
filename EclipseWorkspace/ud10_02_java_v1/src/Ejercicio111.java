import java.io.*;
import java.util.*;

public class Ejercicio111 {

	public static void main(String[] args) {
		
		File Archivo3 = new File("salida3.txt");
		ArrayList<Integer> ejercicio111 = new ArrayList();

		try {
			Scanner teclado = new Scanner(Archivo3);
			
			while (teclado.hasNext()) {
				int aux = teclado.nextInt();
				if (aux%5==0) {
					ejercicio111.add(aux);
				}
			}
			
			Iterator iter = ejercicio111.iterator();
			int aux;
			while (iter.hasNext()) {
				aux = (int) iter.next();
				System.out.println(aux);		
			}
			
		
		} catch (IOException e) {		
			System.out.println(e.getMessage());
		}
	}
}
