
public class Collar extends Perla implements Interface_Collar {

	protected Perla[] lista_perlas = new Perla[3];
	protected double longitud;

	public Collar(Perla[] lista_perlas, double longitud) { 
		this.longitud = longitud;
		this.lista_perlas=lista_perlas;
	}

	public String toString() {

		String auxiliar = "";
		for (int i = 0; i < lista_perlas.length; i++) {

			String perla = "- Perla de " + lista_perlas[i].getmaterial() + " que pesa " + lista_perlas[i].getpeso_perla() + ". PVP: "
					+ lista_perlas[i].getprecio() + " €.\n";
			auxiliar += perla;
		}
		return "El collar tiene una cadena de " + this.longitud + " cm. y las siguientes perlas:\n"+auxiliar;
	}

}