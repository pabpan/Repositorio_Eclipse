
public class Multimedia {

	protected String titulo;
	protected String autor;
	protected String formato;
	protected int duracion;

	public Multimedia(String titulo, String autor, String formato, int duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String toString() {

		return this.titulo + ", " + this.autor + ", " + this.formato + ", " + this.duracion + ".";
	}

	public boolean equals(Multimedia m) {

		boolean resultado = false;

		if (this.titulo.equals(m.getTitulo()) && this.autor.equals(m.getAutor())) {
			resultado = true;
		}

		return resultado;

	}
}
