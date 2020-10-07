import java.util.*;
import java.io.*;

public class Ejercicio114 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		File Carpeta = null;
		
		int num_carpetas = 0;
		String nom_carpetas = "";

		System.out.println("¿Cuántes carpetas quieres crear en el escritorio?");
		num_carpetas = teclado.nextInt();
		teclado.nextLine();
		System.out.println("¿Qué nombre quiere que aparezca en las carpetas?");
		nom_carpetas = teclado.nextLine();
		
		for (int i = 1; i < (num_carpetas + 1) ; i++) {
			Carpeta = new File ("/home/pabpan/Escritorio/" + nom_carpetas + Integer.toString(i));
			Carpeta.mkdir();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
