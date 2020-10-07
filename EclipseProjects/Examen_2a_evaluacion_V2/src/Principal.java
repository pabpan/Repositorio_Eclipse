import java.security.PublicKey;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		int opcion = 0;
		opcion = pintar_menu();

		ArrayList<Profesional> lista_profesionales = new ArrayList<Profesional>();
		ArrayList<Pelicula> lista_pelis = new ArrayList<Pelicula>();
		ArrayList<Profesional> lista_actores = new ArrayList<Profesional>();

		while (opcion != 6) {
			opcion = pintar_menu();

			switch (opcion) {
			case 1:
				alta_profesional("Director", lista_profesionales);

				break;

			case 2:
				alta_profesional("Actor", lista_profesionales);

				break;

			case 3:
				alta_profesional("Productor", lista_profesionales);

				break;

			case 4:
				alta_peliculas(lista_profesionales, lista_pelis, lista_actores);

				break;

			case 5:
				resumen_peliculas(lista_pelis);

				break;

			default:

				break;
			}
		}
		System.out.println("Gracias por utilizar el videoclub");

	}

	public static int pintar_menu() {

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		System.out.println("1.- Alta director" + "2.- Alta actor" + "3.- Alta Productor" + "4.- Alta película"
				+ "5.- Listado peliculas" + "6.- Salir");
		return opcion;

	}

	public static void alta_profesional(String tipo, ArrayList<Profesional> lista_profesionales) {

		Scanner teclado = new Scanner(System.in);
		Profesional p;

		System.out.println("Vamos a dar de alta un: " + tipo);

		System.out.println("Nombre");
		String nombre = teclado.nextLine();
		System.out.println("Edad:");
		int edad = teclado.nextInt();
		System.out.println("Numero Oscars:");
		int num_oscars = teclado.nextInt();

		p = new Profesional(tipo, nombre, edad, num_oscars);
		lista_profesionales.add(p);

		int num_profesional = 0;

		switch (tipo) {

		case "Actor":
			num_profesional = Profesional.numactores;
			break;

		case "Director":
			num_profesional = Profesional.numdirectores;
			break;
		case "Productor":
			num_profesional = Profesional.numproductores;
			break;
		}

	}

	public static void alta_peliculas(ArrayList<Profesional> lista_prof, ArrayList<Pelicula> lista_pelis, ArrayList<Profesional> lista_actores) {
		Scanner teclado = new Scanner(System.in);
		boolean encontrado;
		String titulo;
		String director;
		String productor;
		String actor;
		Profesional p;
		String nom_profesional = "";
		String tipo_profesional = "";
		Profesional director_encontrado = null;
		Profesional productor_encontrado = null;

		System.out.println("Titulo:");
		titulo = teclado.nextLine();

		encontrado = false;
		while (encontrado == false) {

			System.out.println("Director");
			director = teclado.nextLine();

			Iterator iter = lista_prof.iterator();
			while (iter.hasNext()) {
				p = (Profesional) iter.next();
				nom_profesional = p.get_nombre();
				tipo_profesional = p.get_tipo();
				if (nom_profesional.equals(director) && (tipo_profesional.equals("Director"))) {
					encontrado = true;
					director_encontrado=p;
				}
			}
		}

		encontrado = false;
		while (encontrado == false) {

			System.out.println("Productor");
			productor = teclado.nextLine();

			Iterator iter = lista_prof.iterator();

			while (iter.hasNext()) {
				p = (Profesional) iter.next();
				nom_profesional = p.get_nombre();
				tipo_profesional = p.get_tipo();
				if (nom_profesional.equals(productor) && (tipo_profesional.equals("Productor"))) {
					encontrado = true;
					productor_encontrado = p;
				}
			}
		}

		System.out.println("Ahora vamos a introducir los actores de " + titulo
				+ ", pulse en cualquier momento salir para dejar\n" + "de introducirlos:");
		encontrado = false;
		while (true) {

			System.out.println("Actor:");
			actor = teclado.nextLine();

			if (actor.equals("salir")) {
				break;
			}

			Iterator iter = lista_prof.iterator();

			while (iter.hasNext()) {
				p = (Profesional) iter.next();
				nom_profesional = p.get_nombre();
				tipo_profesional = p.get_tipo();
				if (nom_profesional.equals(actor) && (tipo_profesional.equals("Actor"))) {
					encontrado = true;
					lista_actores.add(p);
				}
			}
		}
		
		Pelicula peli = new Pelicula(titulo, director_encontrado, productor_encontrado, lista_actores);
		lista_pelis.add(peli);
	}
	
	public static void resumen_peliculas(ArrayList<Pelicula> lista_pelis) {
		
		Iterator iter = lista_pelis.iterator();
		
		Pelicula peli;
		
		while (iter.hasNext()) {
			peli=(Pelicula)iter.next();
			
		}
	}
}
