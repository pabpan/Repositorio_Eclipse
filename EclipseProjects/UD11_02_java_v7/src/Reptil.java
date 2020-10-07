enum RazaReptil {
	Tortuga, Iguana, DragonDeComodo, LagartoGigante
}

public class Reptil extends Animal {

	private RazaReptil raza_reptil;
	private boolean venenoso;

	public Reptil(String nombre_animal, String fecha_nacimiento_animal, double peso_animal, RazaReptil raza_reptil,
			boolean venenoso) {
		super(nombre_animal, fecha_nacimiento_animal, peso_animal);
		this.raza_reptil = raza_reptil;
		this.venenoso = venenoso;
	}

	public String toString() {

		return "Ficha Reptil\n" + "Nombre: " + this.nombre_animal + "\nRaza: " + this.raza_reptil
				+ "\nFeacha de Nacimiento: " + this.fecha_nacimiento_animal + "\nPeso: " + this.peso_animal + " Kg.\n"
				+ "Venenoso: " + this.venenoso + "\nComentarios:" + this.comentarios_animal + ".";
	}
}
