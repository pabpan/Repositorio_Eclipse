import java.io.*;
import java.util.*;

public class Ejercicio112 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		FileWriter Escribir = null;
		String profesor = "Paco";
		String nombre = "";
		String estado = "";
		String conversacion = "";
		String contestacion = "";
		String linea1 = "Bienvenido al chat con Paco:";
		String linea2 = "----------------------------";
		String linea3 = "Hola que tal, cómo te llamas?";

		File Archivo = new File("chat.txt");
		try {
			Archivo.createNewFile();
			Escribir = new FileWriter(Archivo);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(linea1);
		System.out.println(linea2);
		try {
			Escribir.write(linea1 + "\n");
			Escribir.write(linea2 + "\n");
			Escribir.write(linea3 + "\n");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			do {
				System.out.println(linea3);
				nombre = teclado.nextLine();
			} while (nombre.equals(" "));

			contestacion = (nombre + ": me llamo " + nombre);
			Escribir.write(contestacion + "\n");
			System.out.println(contestacion);
			conversacion = (profesor + ": Hola " + nombre + ", ¿Cómo estás hoy?");
			Escribir.write(conversacion + "\n");
			System.out.println(conversacion);
			System.out.printf(nombre + ": ");
			estado = teclado.nextLine();
			Escribir.write(nombre + ": " + estado + "\n");

			while (!contestacion.contains("vete")) {
				conversacion = (profesor + ": Qué interesante... cuéntame más...");
				Escribir.write(conversacion + "\n");
				System.out.println(conversacion);
				System.out.printf(nombre + ": ");
				contestacion = teclado.nextLine();	
				conversacion = (nombre + ": " + contestacion);
				Escribir.write(conversacion + "\n");

				conversacion = (profesor + ": No me interesa nada, cuéntame otra cosa.");
				Escribir.write(conversacion + "\n");
				System.out.println(conversacion);
				System.out.printf(nombre + ": ");
				contestacion = teclado.nextLine();	
				conversacion = (nombre + ": " + contestacion);
				Escribir.write(conversacion + "\n");
			}

			conversacion = (profesor + ": Nos vemos " + nombre + "!");
			Escribir.write(conversacion);
			System.out.println(conversacion);

			Escribir.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
