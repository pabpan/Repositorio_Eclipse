
public class Pez_espada extends Pez {

	private String lugar_pesca;

	public Pez_espada(String lugar_pesca, String nombre_propio, int numero_escamas, int peso_gramos) {
		super(nombre_propio, numero_escamas, peso_gramos);
		this.lugar_pesca = lugar_pesca;
	}

	public String getLugar_pesca() {
		return lugar_pesca;
	}

	public void setLugar_pesca(String lugar_pesca) {
		this.lugar_pesca = lugar_pesca;
	}

	public boolean Es_autentico(String lugar_pesca) {
		this.lugar_pesca = lugar_pesca;
		boolean resultado = false;

		if (this.lugar_pesca.equals("Atlántico") || this.lugar_pesca.equals("Pacífico")) {
			resultado = true;
		} 

		return resultado;
	}

}
