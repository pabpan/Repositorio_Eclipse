public class Magdalena extends Bolleria {
	
	private double peso_magdalena;
	private String tipo_magdalena;
	private boolean lleva_papel;
	
	public Magdalena (double peso_magdalena, String tipo_magdalena, boolean lleva_papel) {
		super (peso_magdalena);
		this.peso_magdalena=peso_magdalena;
		this.tipo_magdalena = tipo_magdalena;
		this.lleva_papel = lleva_papel;
	}

	public String toString() {
		return "Magdalena de " + this.peso_magdalena + "gr. con forma " + this.tipo_magdalena + " y lleva_papel. PVP: " + this.precio
				+ " €.";
	}
}
