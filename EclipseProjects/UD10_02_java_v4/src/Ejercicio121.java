import java.util.*;
import java.io.*;

public class Ejercicio121 {

	public static void main(String[] args) {

		File Archivo_entrada = new File("ejer121.xml");
		int cuenta_libros = 0;
		int nota = 0;

		try {

			Scanner teclado = new Scanner(Archivo_entrada);
			while (teclado.hasNext()) {
				String linea = teclado.nextLine();
				if (linea.contains("<LIBRO>")) {
					cuenta_libros++;
					nota = nota + procesar_libro(teclado);
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		double resultado = ((float)nota/cuenta_libros);
		System.out.printf("Se han procesado %s libros y la nota media es: %.2f", cuenta_libros, resultado);
	}

	public static int procesar_libro(Scanner teclado) {

		String linea = teclado.nextLine();
		String[] palabras = linea.split("<TITULO>");
		String[] palabras1 = palabras[1].split("</TITULO>");
		String titulo = palabras1[0] + ".txt";

		File Archivo_salida = new File(titulo);
		FileWriter Escribir = null;

		try {
			Archivo_salida.createNewFile();
			Escribir = new FileWriter(Archivo_salida);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		linea = teclado.nextLine();
		String autor = procesar_etiqueta(linea, "AUTOR");
		linea = teclado.nextLine();
		String editorial = procesar_etiqueta(linea, "EDITORIAL");
		linea = teclado.nextLine();
		String categoria = procesar_etiqueta(linea, "CATEGORIA");
		linea = teclado.nextLine();
		String isbn = procesar_etiqueta(linea, "ISBN");
		linea = teclado.nextLine();
		String nota = procesar_etiqueta(linea, "NOTA");
		int nota_int = Integer.parseInt(nota.substring(1, nota.length() - 1));
		linea = teclado.nextLine();
		String comentarios = procesar_etiqueta(linea, "COMENTARIOS");

		try {
			Escribir.write("---------------------\n");
			Escribir.write("Autor: " + autor + "\n");
			Escribir.write("Editorial: " + editorial + "\n");
			Escribir.write("Categoria: " + categoria + "\n");
			Escribir.write("ISBN: " + isbn + "\n");
			Escribir.write("NOTA: " + nota + "\n");
			Escribir.write("COMENTARIOS: " + comentarios + "\n");
			Escribir.write("---------------------\n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			Escribir.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return nota_int;
	}

	public static String procesar_etiqueta(String linea, String etiqueta) {
		String etiqueta_ini = "<" + etiqueta + ">";
		String etiqueta_fin = "</" + etiqueta + ">";
		String[] palabras = linea.split(etiqueta_ini);
		String[] palabras1 = palabras[1].split(etiqueta_fin);
		return (palabras1[0]);
	}
}
