enum RazaGato {
		Comun, Siames, Persa, Angora, ScottishFold
	}

public class Gato extends Animal {

	private RazaGato raza_gato;
	private String microchip;

	public Gato(String nombre_animal, String fecha_nacimiento_animal, double peso_animal, RazaGato raza_gato,
			String microchip) {
		super(nombre_animal, fecha_nacimiento_animal, peso_animal);
		this.raza_gato = raza_gato;
		this.microchip = microchip;
	}

	public String toString() {
		
		return "Ficha Gato\n" + "Nombre: " + this.nombre_animal + "\nRaza: " + this.raza_gato
				+ "\nFeacha de Nacimiento: " + this.fecha_nacimiento_animal + "\nPeso: " + this.peso_animal + " Kg.\n"
				+ "Microchip: " + this.microchip + "\nComentarios:" + this.comentarios_animal + ".";
	}
	
	
}
