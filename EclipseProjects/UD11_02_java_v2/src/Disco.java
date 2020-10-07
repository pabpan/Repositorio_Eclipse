public class Disco extends Multimedia {

	private String genero;

	public Disco(String titulo, String autor, String formato, int duracion, String genero) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}
	
	public String setGenero(String genero) {
		return genero;
	}

	public String toString() {
		String resultado = "";
		resultado = this.titulo + "|" + this.autor + "|" + this.formato + "|" + this.duracion + "|" + this.genero;
		return resultado;
	}
}