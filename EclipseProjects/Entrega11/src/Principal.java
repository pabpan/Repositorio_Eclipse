import java.util.*;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Pelicula> lista_pelis = new ArrayList<Pelicula>();
		ArrayList<Serie> lista_series = new ArrayList<Serie>();

		Scanner teclado = new Scanner(System.in);
		boolean repetir = true;
		int opcion = 0;

		while (repetir = true && opcion != 6) {
			System.out.println("-----------------------------\n" + "1-Dar de alta una pelicula\n"
					+ "2-Dar de alta una serie\n" + "3-Ver un contenido\n" + "4-Listar contenido\n"
					+ "5-Listar contenido pendiente por ver\n" + "6-Salir\n" + "-----------------------------");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				alta_pelicula(lista_pelis);
				break;
			case 2:
				alta_serie(lista_series);
				break;
			case 3:
				ver_contenido(lista_pelis, lista_series);
				break;
			case 4:
				listar_contenido(lista_pelis, lista_series);
				break;
			case 5:
				pendiente_ver(lista_pelis, lista_series);
				break;
			case 6:
				salir();
				repetir = false;
				break;
			default:
				break;
			}
		}

	}

	public static void alta_pelicula(ArrayList<Pelicula> lista_pelis) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca titulo de la pelicula:");
		String titulo = teclado.nextLine();
		System.out.println("Introduzca productora de la pelicula:");
		String productora = teclado.nextLine();
		System.out.println("Introduzca año de publicacion:");
		int anyo_publicacion = teclado.nextInt();
		boolean visto_o_no = false;
		System.out.println("Numero de nominaciones a los oscars:");
		int num_nominaciones = teclado.nextInt();
		System.out.println("Numero de oscars ganados:");
		int num_oscars_ganados = teclado.nextInt();

		if (num_oscars_ganados > num_nominaciones) {
			System.out.println("ERROR!, mas oscars ganados que nominaciones!");
			System.out.println("Numero de nominaciones a los oscars:");
			num_nominaciones = teclado.nextInt();
			System.out.println("Numero de oscars ganados:");
			num_oscars_ganados = teclado.nextInt();
		}

		Pelicula peli1 = new Pelicula(titulo, productora, anyo_publicacion, visto_o_no, num_nominaciones,
				num_oscars_ganados);
		lista_pelis.add(peli1);
		System.out.println("La película " + titulo + " ha sido dada de alta correctamente!");

	}

	public static void alta_serie(ArrayList<Serie> lista_series) {

		Scanner teclado = new Scanner(System.in);
		boolean finalizada_o_no = false;

		System.out.println("Introduzca titulo de la serie:");
		String titulo = teclado.nextLine();
		System.out.println("Introduzca productora de la serie:");
		String productora = teclado.nextLine();
		System.out.println("Introduzca año de publicacion:");
		int anyo_publicacion = teclado.nextInt();
		boolean visto_o_no = false;
		System.out.println("Introduzca numero de temporadas:");
		int num_temporadas = teclado.nextInt();
		teclado.nextLine();
		if (num_temporadas == 0) {
			System.out.println("ERROR!, " + titulo + " debería tener, al menos 1 temporada!");
			System.out.println("Introduzca numero de temporadas:");
			num_temporadas = teclado.nextInt();
			teclado.nextLine();
		}
		System.out.println("¿La serie está finalizada o no? (S/N)");
		String terminada = teclado.nextLine();
		terminada.toUpperCase();
		if (!terminada.equals("S") || !terminada.equals("N")) {
			System.out.println("¿La serie está finalizada o no? (S/N)");
			terminada = teclado.nextLine();
		}
		if (terminada.equals("S")) {
			finalizada_o_no = true;
		} else if (terminada.equals("N")) {
			finalizada_o_no = false;
		}

		Serie serie1 = new Serie(titulo, productora, anyo_publicacion, visto_o_no, num_temporadas, finalizada_o_no);
		lista_series.add(serie1);
		System.out.println("La serie " + titulo + " ha sido dada de alta correctamente!");
	}

	public static void ver_contenido(ArrayList<Pelicula> lista_pelis, ArrayList<Serie> lista_series) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el titulo del contenido que quiere visualizar:");
		String titulo = teclado.nextLine();

		Iterator iter = lista_pelis.iterator();
		Pelicula peli_aux;
		while (iter.hasNext()) {
			peli_aux = (Pelicula) iter.next();
			if (titulo.equals(peli_aux.getTitulo())) {
				System.out.println("El contenido " + titulo + " marcado como visto!.");
				peli_aux.setVisto_o_no(true);
			} else {
				Iterator iter1 = lista_series.iterator();
				Serie serie_aux;
				while (iter1.hasNext()) {
					serie_aux = (Serie) iter1.next();
					if (titulo.equals(serie_aux.getTitulo())) {
						System.out.println("El contenido " + titulo + " marcado como visto!.");
						serie_aux.setVisto_o_no(true);
					} else {
						System.out.println("El contenido " + titulo + " no existe en Netflix.");
					}
				}
			}
		}

	}

	public static void listar_contenido(ArrayList<Pelicula> lista_pelis, ArrayList<Serie> lista_series) {

		Iterator iter = lista_pelis.iterator();

		Pelicula peli_aux;
		while (iter.hasNext()) {
			peli_aux = (Pelicula) iter.next();
			System.out.println(peli_aux.getTitulo() + "|" + peli_aux.getProductora() + "|"
					+ peli_aux.getAnyo_publicacion() + "|" + peli_aux.isVisto_o_no());
		}
		Iterator iter1 = lista_series.iterator();

		Serie serie_aux;
		while (iter1.hasNext()) {
			serie_aux = (Serie) iter1.next();
			System.out.println(serie_aux.getTitulo() + "|" + serie_aux.getProductora() + "|"
					+ serie_aux.getAnyo_publicacion() + "|" + serie_aux.isVisto_o_no());
		}
	}

	public static void pendiente_ver(ArrayList<Pelicula> lista_pelis, ArrayList<Serie> lista_series) {

		Iterator iter = lista_pelis.iterator();
		Pelicula peli_aux;
		while (iter.hasNext()) {
			peli_aux = (Pelicula) iter.next();
			if (peli_aux.isVisto_o_no() == true) {
				System.out.println("No hay contenido pendiente de ver!");
			} else {
				System.out.println(peli_aux.getTitulo() + "|" + peli_aux.getProductora() + "|"
						+ peli_aux.getAnyo_publicacion() + "|" + peli_aux.isVisto_o_no());
			}
		}

		Iterator iter1 = lista_series.iterator();
		Serie serie_aux;
		while (iter1.hasNext()) {
			serie_aux = (Serie) iter1.next();
			if (serie_aux.isVisto_o_no() == true) {
				System.out.println("No hay contenido pendiente de ver!");
			} else {
				System.out.println(serie_aux.getTitulo() + "|" + serie_aux.getProductora() + "|"
						+ serie_aux.getAnyo_publicacion() + "|" + serie_aux.isVisto_o_no());
			}
		}
	}

	public static void salir() {
		System.out.println("Gracias por utilizar Netflix");

	}
}
