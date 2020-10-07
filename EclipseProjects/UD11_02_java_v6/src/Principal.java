import java.util.*;

public class Principal {

	public static void main(String[] args) throws Exception {

		
		menu();

	}

	private static void menu() {

		Scanner teclado = new Scanner(System.in);
		ArrayList<Pelicula> lista_peliculas = new ArrayList<Pelicula>();
		int[] vector;

		int opcion = 0;

		while (opcion != 5) {

			System.out.println("1.- Dar de alta una película\n" + "2.- Listar películas ordenadas por título\n"
					+ "3.- Lista películas ordenadas por valoración\n" + "4.- Salir de la aplicación");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				alta_pelicula(lista_peliculas);
				break;
			case 2:
				ordenar_pelis_valoracion(lista_peliculas);
				break;
			case 3:
				ordenar_pelis_titulo(lista_peliculas);
				break;
			case 4:
				salir();
			case 5:
				recorrer_pelis(lista_peliculas);
			default:
				break;
			}
		}

	}

	private static void salir() {

	}

	private static void alta_pelicula(ArrayList<Pelicula> lista_peliculas) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca titulo de la pelicula:");
		String titulo = teclado.nextLine();
		System.out.println("Introduzca duracion de la pelicula:");
		int duracion = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduzca nota de la pelicula");
		int nota = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Introduzca genero de la pelicula (Comedia,Drama,Terror o Ciencia-Ficcion):");
		String genero = teclado.nextLine();
		genero.toLowerCase();

		Pelicula nueva_peli = new Pelicula(titulo, duracion, nota, genero);
		lista_peliculas.add(nueva_peli);
	}

	// ESTE MÉTODO ES PARA RECORRER AL ARRAYLIST E IMPRIMIRLO PARA PROBAR

	private static void recorrer_pelis(ArrayList<Pelicula> lista_peliculas) {

		Iterator iter = lista_peliculas.iterator();
		Pelicula pelicula_aux;

		while (iter.hasNext()) {
			pelicula_aux = (Pelicula) iter.next();
			System.out.println("- " + pelicula_aux.getTitulo() + ", Duración: " + pelicula_aux.getDuracion()
					+ " min., Valoración: " + pelicula_aux.getValoracion() + "/10, Género: " + pelicula_aux.getGenero()
					+ ".");
		}
	}
	
	private static void ordenar_pelis_valoracion(ArrayList<Pelicula> lista_peliculas) {

		Pelicula[] vector_peliculas = new Pelicula[lista_peliculas.size()];
		Pelicula[] vector_peliculas_aux = new Pelicula[lista_peliculas.size()];

		for (int j = 0; j < lista_peliculas.size(); j++) {
			vector_peliculas[j] = lista_peliculas.get(j);
		}

		for (int i = 0; i < vector_peliculas.length; i++) {

			if (vector_peliculas_aux[i] == null) { 
				vector_peliculas_aux[i] = vector_peliculas[i];
			}

			if (vector_peliculas[i].getValoracion() > vector_peliculas_aux[i].getValoracion()) {
				System.out.println("- " + vector_peliculas[i].getTitulo() + ", Duración: "
						+ vector_peliculas[i].getDuracion() + " min., Valoración: "
						+ vector_peliculas[i].getValoracion() + "/10, Género: "
						+ vector_peliculas[i].getGenero() + ".");
			} else {
				vector_peliculas_aux[i] = vector_peliculas[i];
				System.out.println("- " + vector_peliculas_aux[i].getTitulo() + ", Duración: "
						+ vector_peliculas_aux[i].getDuracion() + " min., Valoración: "
						+ vector_peliculas_aux[i].getValoracion() + "/10, Género: "
						+ vector_peliculas_aux[i].getGenero() + ".");
			}

		}
	}

	private static void ordenar_pelis_titulo(ArrayList<Pelicula> lista_peliculas) {

	}

}
