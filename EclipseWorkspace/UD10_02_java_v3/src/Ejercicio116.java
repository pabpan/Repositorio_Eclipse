import java.io.*;
import java.util.*;

public class Ejercicio116 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		File Archivo = new File("ejercicio116.txt");

		try {
			Archivo.createNewFile();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			FileWriter Escribir = new FileWriter(Archivo);
			Escribir.write("Hola Don Pepito\n");
			Escribir.write("Hola Don José");
			Escribir.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			Leer_palabras(Archivo);
			Leer_caracteres(Archivo);
			Leer_longitud(Archivo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void Leer_palabras(File Archivo) {

		try {
			Scanner teclado = new Scanner(Archivo);
			int num_palabras = 0;
			while (teclado.hasNextLine()) {
				String linea = teclado.nextLine();
				String[] palabras = linea.split(" ");
				num_palabras += palabras.length;
			}
			System.out.println("Número de palabras: " + num_palabras);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void Leer_caracteres(File Archivo) {

		try {
			Scanner teclado = new Scanner(Archivo);
			String cadena = "";
			while (teclado.hasNext()) {
				cadena += teclado.next();
			}
			System.out.println("Número de caracteres: " + cadena.split("").length);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void Leer_longitud(File Archivo) {

		try {
			Scanner teclado = new Scanner(Archivo);
			int num_palabras = 0;
			int num_caracteres = 0;
			String cadena = "";
			
			while (teclado.hasNext()) {
				cadena += teclado.next();
			}
			num_caracteres = cadena.split("").length;
			
			while (teclado.hasNextLine()) {
				String linea = teclado.nextLine();
				String[] palabras = linea.split(" ");
				num_palabras += palabras.length;
			}
			System.out.println("Longitud media de una palabra: "+(float)num_caracteres/num_palabras);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
