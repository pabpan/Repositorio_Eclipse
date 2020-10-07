
public class Pez {

	private String nombre_propio;
	private int numero_escamas;
	protected int peso_gramos;

	public Pez(String nombre_propio, int numero_escamas, int peso_gramos) {
		this.nombre_propio = nombre_propio;
		this.numero_escamas = numero_escamas;
		this.peso_gramos = peso_gramos;
	}

	public String getNombre_propio() {
		return nombre_propio;
	}

	public void setNombre_propio(String nombre_propio) {
		this.nombre_propio = nombre_propio;
	}

	public int getNumero_escamas() {
		return numero_escamas;
	}

	public void setNumero_escamas(int numero_escamas) {
		this.numero_escamas = numero_escamas;
	}

	public int getPeso_gramos() {
		return peso_gramos;
	}

	public void setPeso_gramos(int peso_gramos) {
		this.peso_gramos = peso_gramos;
	}

	public String calibre(int peso_gramos) {
		this.peso_gramos = peso_gramos;
		String calibre = null;

		if (this.peso_gramos < 100) {
			calibre = "pequeño";
		}
		if (this.peso_gramos >= 100 && this.peso_gramos < 300) {
			calibre = "mediano";
		}
		if (this.peso_gramos >= 300 && this.peso_gramos < 500) {
			calibre = "grande";
		}
		if (this.peso_gramos >= 500) {
			calibre = "cachalote";
		}

		return calibre;
	}
}
