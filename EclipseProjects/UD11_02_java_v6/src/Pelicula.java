import java.util.ArrayList;

public class Pelicula {

	private String titulo;
	private int duracion;
	private int valoracion;
	private String genero;

	public Pelicula(String titulo, int duracion, int valoracion, String genero) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.valoracion = valoracion;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPelicula (String titulo, int duracion, int valoracion, String genero) {
		return "- " + this.titulo + ", Duración: " + this.duracion
		+ " min., Valoración: " + this.valoracion + "/10, Género: " + this.genero
		+ ".";
	}
}
