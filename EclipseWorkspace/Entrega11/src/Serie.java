
public class Serie extends Contenido {

	private int num_temporadas;
	private boolean finalizada_o_no;
	
	public Serie (String titulo, String productora, int anyo_publicacion, boolean visto_o_no, int num_temporadas, boolean finalizada_o_no) {
		
		super (titulo, productora, anyo_publicacion, visto_o_no);
		this.num_temporadas = num_temporadas;
		this.finalizada_o_no = finalizada_o_no;
	}

	public int getNum_temporadas() {
		return num_temporadas;
	}

	public void setNum_temporadas(int num_temporadas) {
		this.num_temporadas = num_temporadas;
	}

	public boolean isFinalizada_o_no() {
		return finalizada_o_no;
	}

	public void setFinalizada_o_no(boolean finalizada_o_no) {
		this.finalizada_o_no = finalizada_o_no;
	}
	
}
