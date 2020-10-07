import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio120 {

	public static void main(String[] args) {

		File Archivo = new File("Ejercicio120.txt");
		File Archivo1 = new File("Ejercicio120_salida.txt");

		Scanner teclado1 = new Scanner(System.in);
		String palabra_borrar = "";
		boolean encontrado = false;

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

			System.out.println("Introduzca la palabra a borrar del fichero de entrada: ");
			palabra_borrar = teclado1.nextLine();

			if (palabra_borrar == "") {
				System.out.println("No ha tecleado ninguna palabra. Fin del programa.");
			} else {
				try {
					Scanner teclado = new Scanner(Archivo);
					FileWriter Escribir1 = new FileWriter(Archivo1);

					while (teclado.hasNext()) {
						String linea = teclado.nextLine();
						linea = linea.replaceAll(palabra_borrar, "");
						linea = linea.replaceAll("  ", " ");
						Escribir1.write(linea);
						Escribir1.write("\n");
					}
					Escribir1.close();

				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
