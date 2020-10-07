import java.io.*;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		boolean repetir = true;

		ArrayList<String> Agenda = new ArrayList<String>();
		int opcion = 0;
		Scanner teclado = new Scanner(System.in);

		while (repetir == true) {
			System.out.println("-----------MENU-----------\n" + "1.- Dar de alta un contacto en la agenda\n"
					+ "2.- Dar de baja un contacto en la agenda\n" + "3.- Listar agenda\n" + "4.- Salir\n");
			System.out.println("Introduzca una opción:");

			try {
				opcion = teclado.nextInt();
				teclado.nextLine();
			} catch (InputMismatchException e) {
				System.out.printf("¡No es un entero!");
			} 

			switch (opcion) {
			case 1:
				Dar_de_alta(Agenda);
				break;
			case 2:
				Dar_de_baja(Agenda);

				break;
			case 3:
				Listar_agenda(Agenda);
				break;
			case 4:
				Salir(Agenda);
				repetir = false;
				break;
			default:
				break;
			}

		}
	}

	public static void Dar_de_alta(ArrayList<String> Agenda) {

		Scanner teclado = new Scanner(System.in);
		String nombre = "";
		boolean encontrado = false;

		System.out.println("Introduzca el nombre del nuevo contacto:");
		nombre = teclado.nextLine();
		String nombre_buscado = nombre.toLowerCase();

		// RESULTA QUE NO ME VAN LOS ITERATORS

		Iterator iter = Agenda.iterator();
		String aux;
		while (iter.hasNext()) {
			aux = (String) iter.next();
			String aux_min = aux.toLowerCase();
			if (aux_min.equals(nombre_buscado)) {
				encontrado = true;
				break;
			}
		}
		if (encontrado == false) {
			Agenda.add(nombre_buscado);
			System.out.println("Alta realizada con éxito!. Número de contactos en la agenda: " + Agenda.size());
		} else {
			System.out.println("ERROR: El contacto ya existe en la agenda");
		}
	}

	public static void Dar_de_baja(ArrayList<String> Agenda) {

		Scanner teclado = new Scanner(System.in);
		String nombre = "";
		boolean encontrado = false;

		System.out.println("Introduzca el nombre del contacto a borrar:");
		nombre = teclado.nextLine();
		String nombre_buscado = nombre.toLowerCase();

		Iterator iter = Agenda.iterator();
		String aux;
		while (iter.hasNext()) {
			aux = (String) iter.next();
			String aux_min = aux.toLowerCase();
			if (aux_min.equals(nombre_buscado)) {
				encontrado = true;
				break;
			}
		}
		if (encontrado == true) {
			Agenda.remove(nombre_buscado);
			System.out.println("Baja realizada con éxito!. Número de contactos en la agenda: " + Agenda.size());
		} else {
			System.out.println("ERROR: El contacto no existe en la agenda");
		}
	}

	public static void Listar_agenda(ArrayList<String> Agenda) {

		if (Agenda.size() == 0) {
			System.out.println("¡AGENDA VACÍA!");
		}

		Iterator iter = Agenda.iterator();
		String aux;
		while (iter.hasNext()) {
			aux = (String) iter.next();
			System.out.println(aux);
		}
	}

	public static void Salir(ArrayList<String> Agenda) {

		FileWriter Escribir = null;
		File Archivo = new File("Agenda.txt");

		try {
			Archivo.createNewFile();
			Escribir = new FileWriter(Archivo);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			Iterator iter = Agenda.iterator();
			String aux;
			while (iter.hasNext()) {
				aux = (String) iter.next();
				if (aux == null) {
					System.out.println("La agenda no tiene contactos");
				} else {
					Escribir.write(aux + "\n");
				}
			}
			Escribir.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("¡Gracias por utilizar esta agenda!");
	}

}
