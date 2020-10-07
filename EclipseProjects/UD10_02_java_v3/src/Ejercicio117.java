import java.io.*;
import java.util.*;

public class Ejercicio117 {

	public static void main(String[] args) {

		File Archivo = new File("Ejercicio117.txt");

		try {

			Archivo.createNewFile();
			FileWriter Escribir = new FileWriter(Archivo);
			Escribir.write("Hola Don Pepito\n");
			Escribir.write("Hola Don José");
			Escribir.close();
			Scanner teclado = new Scanner(Archivo);

			while (teclado.hasNextLine()) {
				String linea = teclado.nextLine();
				String linea_sin_espacios = "";
				String palabras[] = linea.split(" ");
				for (int i = 0; i < palabras.length; i++) {
					linea_sin_espacios += palabras[i];
				}
				System.out.println(linea_sin_espacios);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
