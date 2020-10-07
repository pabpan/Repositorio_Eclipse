import java.io.*;

public class Ejercicio109 {

	public static void main(String[] args) {

		File Archivo1 = new File("salida1.txt");
		File Archivo2 = new File("salida2.txt");

		try {
			Archivo1.createNewFile();
			Archivo2.createNewFile();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {
			FileWriter Escribir1 = new FileWriter(Archivo1);
			FileWriter Escribir2 = new FileWriter(Archivo2);
			int numero = 50;

			for (int i = 0; i < numero; i++) {

				if ((i % 2) != 0) {
					Escribir2.write(Integer.toString(i)+"\n ");
				} else {
					Escribir1.write(Integer.toString(i)+"\n ");
				}
			}
			Escribir1.close();
			Escribir2.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
