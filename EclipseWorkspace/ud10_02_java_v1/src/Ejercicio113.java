import java.io.*;
import java.util.*;

public class Ejercicio113 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String frase1 = "Bienvenido al programa de generación de páginas web";
		String linea = "--------------------------------------------------------------------------";
		String datos1 = ("Introduzca el título (<title>) de la página web:");
		String datos2 = ("Introduzca el texto del rotulo h1 (<h1>) de la página web:");
		String datos3 = ("Introduzca el texto del parrafo p (<p>) de la pagina web:");
		String datos4 = ("Introduzca la página web que se enlazará en la etiqueta <a href=>:");
		String salida = ("Pagina web creada!, gracias por utilizar este programa...");
		String usuario1 = "";
		String usuario2 = "";
		String usuario3 = "";
		String usuario4 = "";

		FileWriter Escribir = null;

		File Archivo = new File("index.html");

		try {
			Archivo.createNewFile();
			Escribir = new FileWriter(Archivo);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(frase1);
			System.out.println(linea);
			System.out.println(datos1);
			usuario1 = teclado.nextLine();
			Escribir.write("<html>" + "\n");
			Escribir.write("<title>" + usuario1 + "</title>" + "\n");
			System.out.println(datos2);
			usuario2 = teclado.nextLine();
			Escribir.write("<h1>" + usuario2 + "</h1>" + "\n");
			System.out.println(datos3);
			usuario3=teclado.nextLine();
			Escribir.write("<p>" + usuario3 + "</p>" + "\n");
			System.out.println(datos4);
			usuario4=teclado.nextLine();
			Escribir.write("<a href = \"http://"+usuario4+"\">Esto es un enlace</a>"+"\n");			Escribir.write("<html>" + "\n");
			Escribir.write("<html>");
			Escribir.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Pagina web creada!, gracias por utilizar este programa...");
	}

}
