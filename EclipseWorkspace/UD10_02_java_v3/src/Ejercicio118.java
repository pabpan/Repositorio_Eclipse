import java.io.*;
import java.util.*;

public class Ejercicio118 {

	public static void main(String[] args) {

		File Archivo = new File("Ejercicio118.txt");

		try {

			Archivo.createNewFile();
			FileWriter Escribir = new FileWriter(Archivo);
			Escribir.write("Hola Don Pepito\n");
			Escribir.write("Hola Don José");
			Escribir.close();
			Scanner teclado = new Scanner(Archivo);
			String palabra = "";

			while (teclado.hasNext()) {
				palabra = teclado.next();
				String espacio = " ";
				for (int i = 0; i < palabra.length(); i++) {
					if (Character.isUpperCase(palabra.charAt(i))) {
						System.out.print(Character.toLowerCase(palabra.charAt(i)));
						
					} else {
						System.out.print(Character.toUpperCase(palabra.charAt(i)));
					}
				}
				System.out.print(" ");
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
