import java.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Pelicula {

	private String titulo;
	private Profesional director;
	private Profesional productor;
	private ArrayList<Profesional> lista_actores = new ArrayList<Profesional>();

	public Pelicula(String titulo, Profesional director, Profesional productor, ArrayList<Profesional> lista_actores) {

		this.titulo = titulo;
		this.director = director;
		this.lista_actores = lista_actores;
	}

	public void imprimir_pelicula() {

		String linea = "";
		Profesional actor;

		linea = titulo + "dirigidad por: " + director + " producida por: " + productor + "interpretada por: ";

		Iterator iter = lista_actores.iterator();

		while (iter.hasNext()) {
			actor = (Profesional) iter.next();
			System.out.println("." + actor.get_nombre());

		}
	}
}
