import java.security.Principal;

public abstract class Bolleria{

	protected double peso;
	protected double precio;

	public Bolleria(double peso) {

		this.peso = peso;
		this.precio = peso*0.1;		
	}

	public double getPrecio() {
		double precio = this.precio * 1.10 * this.peso;
		return precio;
	}

	public abstract String toString();

}
