enum RazaPajaro {
	Canario, Periquito, Agaporni
}

public class Pajaro extends Animal {

	private RazaPajaro raza_pajaro;
	private boolean cantor;

	public Pajaro(String nombre_animal, String fecha_nacimiento_animal, double peso_animal, RazaPajaro raza_pajaro,
			boolean cantor) {
		super(nombre_animal, fecha_nacimiento_animal, peso_animal);
		this.raza_pajaro = raza_pajaro;
		this.cantor = cantor;
	}

	public String toString() {

		return "Ficha Pájaro\n" + "Nombre: " + this.nombre_animal + "\nRaza: " + this.raza_pajaro
				+ "\nFeacha de Nacimiento: " + this.fecha_nacimiento_animal + "\nPeso: " + this.peso_animal + " Kg.\n"
				+ "Cantor: " + this.cantor + "\nComentarios:" + this.comentarios_animal + ".";
	}
}
