import java.io.ObjectInputStream.GetField;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		boolean repetir = true;
		ArrayList<Mascota> lista_mascotas = new ArrayList<Mascota>();

		while (repetir = true && opcion != 6) {

			System.out.println("-----------------------------");
			System.out.println(
					"1-Dar de alta una mascota\n" + "2-Escuchar perros y gatos\n" + "3-Escuchar periquitos y conejos\n"
							+ "4-Escuchar gatos y periquitos\n" + "5-Escuchar perros y conejos\n" + "6-Salir");
			System.out.println("-----------------------------");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				Dar_de_alta_mascota(lista_mascotas);
				break;
			case 2:
				Escuchar_perros_y_gatos(lista_mascotas);
				break;
			case 3:
				Escuchar_periquitos_y_conejos(lista_mascotas);
				break;
			case 4:
				Escuchar_gatos_y_periquitos(lista_mascotas);
				break;
			case 5:
				Escuchar_perros_y_conejos(lista_mascotas);
				break;
			case 6:
				Salir();
				repetir = false;
				break;

			default:
				break;
			}
		}
	}

	public static void Dar_de_alta_mascota(ArrayList<Mascota> lista_mascotas) {
		Scanner teclado = new Scanner(System.in);
		String tipo = "";
		String nombre = "";

		while (true) {
			System.out.println("Introduzca el tipo de mascota a dar de alta (P-Perro/G-gato/Q-Periquito/C-Conejo):");
			tipo = teclado.nextLine();

			if (tipo.toUpperCase().equals("P")) {
				tipo = "perro";
				System.out.println("Introduzca el nombre de la mascota");
				nombre = teclado.nextLine();
				Perro perro1 = new Perro(nombre);
				perro1.setNombre(nombre);
				perro1.hacer_sonido();
				lista_mascotas.add(perro1);
				System.out.println("Se ha dado de alta a un perro de nombre " + nombre + ".");
				break;
			} else if (tipo.toUpperCase().equals("G")) {
				tipo = "gato";
				System.out.println("Introduzca el nombre de la mascota");
				nombre = teclado.nextLine();
				Gato gato1 = new Gato(nombre);
				gato1.setNombre(nombre);
				gato1.hacer_sonido();
				lista_mascotas.add(gato1);
				System.out.println("Se ha dado de alta a un gato de nombre " + nombre + ".");
				break;
			} else if (tipo.toUpperCase().equals("Q")) {
				tipo = "periquito";
				System.out.println("Introduzca el nombre de la mascota");
				nombre = teclado.nextLine();
				Periquito periquito1 = new Periquito(nombre);
				periquito1.setNombre(nombre);
				periquito1.hacer_sonido();
				lista_mascotas.add(periquito1);
				System.out.println("Se ha dado de alta a un periquito de nombre " + nombre + ".");
				break;
			} else if (tipo.toUpperCase().equals("C")) {
				tipo = "conejo";
				System.out.println("Introduzca el nombre de la mascota");
				nombre = teclado.nextLine();
				Conejo conejo1 = new Conejo(nombre);
				conejo1.setNombre(nombre);
				conejo1.hacer_sonido();
				lista_mascotas.add(conejo1);
				System.out.println("Se ha dado de alta a un conejo de nombre " + nombre + ".");
				break;
			}
		}

	}

	public static void Escuchar_perros_y_gatos(ArrayList<Mascota> lista_mascotas) {
		Recorrer_arraylist(lista_mascotas, "perro", "gato");
	}

	public static void Escuchar_periquitos_y_conejos(ArrayList<Mascota> lista_mascotas) {
		Recorrer_arraylist(lista_mascotas, "periquito", "conejo");
	}

	public static void Escuchar_gatos_y_periquitos(ArrayList<Mascota> lista_mascotas) {
		Recorrer_arraylist(lista_mascotas, "gato", "periquito");
	}

	public static void Escuchar_perros_y_conejos(ArrayList<Mascota> lista_mascotas) {
		Recorrer_arraylist(lista_mascotas, "perro", "conejo");
	}

	public static void Salir() {
		System.out.println("Gracias por utilizar el programa de Mascotas");
	}

	public static void Recorrer_arraylist(ArrayList<Mascota> lista_mascotas, String tipo1, String tipo2) {

		Iterator iter = lista_mascotas.iterator();

		Mascota mascota_aux;
		while (iter.hasNext()) {
			mascota_aux = (Mascota) iter.next();

			if (mascota_aux.getTipo().equals(tipo1) || mascota_aux.getTipo().equals(tipo2)) {
				mascota_aux.hacer_sonido();
			}
		}
	}
}
