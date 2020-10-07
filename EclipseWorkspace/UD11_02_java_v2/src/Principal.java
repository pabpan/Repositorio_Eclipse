import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int pelis = 0;
		String titulo, autor, formato, actor_principal, actriz_principal;
		int duracion = 0;
		ListaMultimedia lista1 = new ListaMultimedia(10);

		while (pelis != 3) {
			System.out.println("Introduce el título de la película");
			titulo = teclado.nextLine();
			System.out.println("Introduce al autor de la película");
			autor = teclado.nextLine();
			System.out.println("Introduce el formato de la película");
			formato = teclado.nextLine();
			System.out.println("Introduce la duración de la película");
			duracion = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Introduce el actor principal de la película");
			actor_principal = teclado.nextLine();
			System.out.println("Introduce la actriz principal de la película");
			actriz_principal = teclado.nextLine();
			Pelicula peli1 = new Pelicula(actor_principal, actriz_principal, titulo, autor, formato, duracion);
			lista1.add(peli1);
			pelis++;
		}

		System.out.println(lista1);
		Pelicula busca = new Pelicula("a", "b", "c", "d", "e", 1);
		int posicion = lista1.indexOf(busca);
		Pelicula recupera = (Pelicula) lista1.get(posicion);
		System.out.println("POS " + posicion + ":" + recupera.toString());
	}

}
