
public class Pelicula extends Contenido {
	
	private int num_nominaciones;
	private int num_oscars_ganados;
	
	public Pelicula (String titulo, String productora, int anyo_publicacion, boolean visto_o_no, int num_nominaciones, int num_oscars_ganados) {
		
		super (titulo, productora, anyo_publicacion, visto_o_no);
		this.num_nominaciones = num_nominaciones;
		this.num_oscars_ganados = num_oscars_ganados;
	}

	public int getNum_nominaciones() {
		return num_nominaciones;
	}

	public void setNum_nominaciones(int num_nominaciones) {
		this.num_nominaciones = num_nominaciones;
	}

	public int getNum_oscars_ganados() {
		return num_oscars_ganados;
	}

	public void setNum_oscars_ganados(int num_oscars_ganados) {
		this.num_oscars_ganados = num_oscars_ganados;
	}	
	
}
