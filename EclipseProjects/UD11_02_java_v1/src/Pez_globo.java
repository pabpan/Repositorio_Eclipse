
public class Pez_globo extends Pez {

	private int toxinas_mg;

	public Pez_globo(int toxinas_mg, String nombre_propio, int numero_escamas, int peso_gramos) {
		super(nombre_propio, numero_escamas, peso_gramos);
		this.toxinas_mg = toxinas_mg;
	}

	public int getToxinas_mg() {
		return toxinas_mg;
	}

	public void setToxinas_mg(int toxinas_mg) {
		this.toxinas_mg = toxinas_mg;
	}

	public String calificador_riesgo(int toxinas_mg) {
		this.toxinas_mg=toxinas_mg;
		int peso_mg = this.peso_gramos*1000;
		String calificador = null;
		
		if (toxinas_mg < (peso_mg*0.1)) {
			calificador = "inofensivo";
		}
		if (toxinas_mg >= (peso_mg*0.1) && toxinas_mg < (peso_mg*0.2)) {
			calificador = "riesgo moderado";
		}
		if (toxinas_mg >= (peso_mg*0.2)) {
			calificador = "yo no lo haría";
		}
		
		return calificador;
	}
}
