
public class Contenido {

	protected String titulo;
	protected String productora;
	protected int anyo_publicacion;
	protected boolean visto_o_no;
	
	public Contenido (String titulo, String productora, int anyo_publicacion, boolean visto_o_no) {
		
		this.titulo = titulo;
		this.productora = productora;
		this.anyo_publicacion = anyo_publicacion;
		this.visto_o_no = visto_o_no;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public int getAnyo_publicacion() {
		return anyo_publicacion;
	}

	public void setAnyo_publicacion(int anyo_publicacion) {
		this.anyo_publicacion = anyo_publicacion;
	}

	public boolean isVisto_o_no() {
		return visto_o_no;
	}

	public void setVisto_o_no(boolean visto_o_no) {
		this.visto_o_no = visto_o_no;
	}
	
}
