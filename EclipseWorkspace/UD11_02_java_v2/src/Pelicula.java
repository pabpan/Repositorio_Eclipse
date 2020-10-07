
public class Pelicula extends Multimedia {

	private String actor_principal;
	private String actriz_principal;

	public Pelicula(String actor_principal, String actriz_principal, String titulo, String autor, String formato,
			int duracion) {

		super(titulo, autor, formato, duracion);
		this.actor_principal = actor_principal;
		this.actriz_principal = actriz_principal;

	}

	public String getActor_principal() {
		return actor_principal;
	}

	public void setActor_principal(String actor_principal) {
		this.actor_principal = actor_principal;
	}

	public String getActriz_principal() {
		return actriz_principal;
	}

	public void setActriz_principal(String actriz_principal) {
		this.actriz_principal = actriz_principal;
	}

	public String toString() {
		return this.titulo + ", " + this.autor + ", " + this.formato + ", " + this.duracion + ", "
				+ this.actor_principal + ", " + this.actriz_principal + ".";
	}

}
