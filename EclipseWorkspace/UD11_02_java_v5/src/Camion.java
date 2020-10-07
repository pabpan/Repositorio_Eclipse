
public class Camion extends Vehiculo {
	
	private Remolque remolque = null;
	
	public void pon_remolque (Remolque remolque) {
		this.remolque=remolque;
	}

	public void quita_remolque () {
		this.remolque=null;
	}
	
	public Camion (String matricula) {
		super (matricula);
	}
	
	public String toString() {
		if (remolque == null) {
			return "Matrícula: " + matricula + ", Velocidad: " + velocidad;
		}else {
			return"Matricula: " + matricula + ", Velocidad: " + velocidad + ", Remolque peso: " + remolque.getPeso();
		}
	}
	
	public void acelerar (double incrementar_velocidad) throws Exception {
		this.velocidad = velocidad + incrementar_velocidad;
		if (velocidad > 100) {
			throw new Exception("Frenando Alonso");
		}
	}
	


}
