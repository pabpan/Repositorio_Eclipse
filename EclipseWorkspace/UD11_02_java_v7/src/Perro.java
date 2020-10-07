import java.util.*;

enum RazaPerro {
		PastorAleman, Husky, FoxTerrier, Dalmata, Beagle, SanBernardo
	}

public class Perro extends Animal {

	private RazaPerro raza_perro;
	private String microchip;

	public Perro(String nombre_animal, String fecha_nacimiento_animal, double peso_animal, RazaPerro raza_perro,
			String microchip) {
		super(nombre_animal, fecha_nacimiento_animal, peso_animal);
		this.raza_perro = raza_perro;
		this.microchip = microchip;
	}

	public String toString() {
		return "Ficha Perro\n" + "Nombre: " + this.nombre_animal + "\nRaza: " + this.raza_perro
				+ "\nFecha de Nacimiento: " + this.fecha_nacimiento_animal + "\nPeso: " + this.peso_animal + " Kg.\n"
				+ "Microchip: " + this.microchip + "\nComentarios:" + this.comentarios_animal + ".";
	}
}
