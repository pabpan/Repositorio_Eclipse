
public class Coche extends Vehiculo {

	private int num_puertas;
	
	public Coche (String matricula, int num_puertas) {
		super (matricula);
		this.num_puertas = num_puertas;
	}

	public int getNum_puertas() {
		return num_puertas;
	}
}
