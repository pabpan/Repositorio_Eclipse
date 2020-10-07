import java.io.*;
import java.util.*;

public class Ejercicio110 {

	public static void main(String[] args) {

		File Archivo1 = new File("salida1.txt");
		File Archivo2 = new File("salida2.txt");
		File Archivo3 = new File("salida3.txt");

		try {
			Archivo3.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			Scanner teclado = new Scanner(Archivo1);
			Scanner teclado1 = new Scanner(Archivo2);

			while (teclado.hasNext() && teclado1.hasNext()) {
				String aux = teclado.nextLine();
				String aux1 = teclado1.nextLine();
				FileWriter Escribir3 = new FileWriter(Archivo3, true);
				Escribir3.write(aux+"\n");
				Escribir3.write(aux1+"\n");
				Escribir3.close();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
