
public class Napolitana extends Bolleria {

	private int sabor_relleno_napolitana;
	private String relleno_napolitana;

	public Napolitana(double peso_napolitana, String relleno_napolitana) {
		super(peso_napolitana);
		this.relleno_napolitana = relleno_napolitana;
	}

	public String toString() {
		return "Napolitana de " + this.peso + " g. con relleno de " + this.relleno_napolitana + "de sabor "
				+ this.sabor_relleno_napolitana + "PVP: " + this.precio + " €.";
	}

}
