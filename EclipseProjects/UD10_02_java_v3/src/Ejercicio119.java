import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Scanner;

public class Ejercicio119 {

	public static void main(String[] args) {

		File Archivo = new File("Ejercicio119.txt");
		Scanner teclado1 = new Scanner(System.in);
		String palabra_buscada = "";
		boolean encontrado = false;
		boolean mensaje_encontrado=false;
		int numero_linea = 1;

		try {
			Archivo.createNewFile();
			FileWriter Escribir = new FileWriter(Archivo);
			Escribir.write("Hola Don Pepito\n");
			Escribir.write("Hola Don José\n");
			Escribir.write("Pasó usted por mi casa por su casa yo pasé\n");
			Escribir.write("Vió usted a mi abuela a su abuela yo la ví\n");
			Escribir.write("Adiós Don Pepito\n");
			Escribir.write("Adiós Don José");
			Escribir.close();

			System.out.println("¿Qué palabra quieres buscar en el fichero de entrada?");
			palabra_buscada = teclado1.nextLine();

			if (palabra_buscada == "") {
				System.out.println("No ha tecleado ninguna palabra. Fin del programa.");
			} else {
				try {
					Scanner teclado = new Scanner(Archivo);
					while (teclado.hasNext()) {
						String linea = teclado.nextLine();
						String[] palabras = linea.split(" ");
						encontrado = buscar_palabra(palabras, palabra_buscada);
						if (encontrado == true) {
							System.out.println("Encontrado en la línea: "+numero_linea);
							System.out.println(linea);
							mensaje_encontrado=true;
						}
						numero_linea++;
					}

				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				if (!mensaje_encontrado) {
					System.out.println("La palabra " + palabra_buscada + " no se encuentra en el fichero.");
				}
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static boolean buscar_palabra(String[] palabras, String palabra_buscada) {
		boolean resultado = false;
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].equals(palabra_buscada)) {
				resultado = true;
			}
		}
		return resultado;
	}

}
