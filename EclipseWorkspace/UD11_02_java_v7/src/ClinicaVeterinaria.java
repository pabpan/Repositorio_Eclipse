import java.util.*;

public class ClinicaVeterinaria {

	private ArrayList<Animal> lista_animales;

	public ClinicaVeterinaria() {

		this.lista_animales = new ArrayList<Animal>();
	}

	public void Insertar_Animal(Animal animal) {
		this.lista_animales.add(animal);
	}

	public Animal Busca_animal(String nombre) {

		boolean encontrado = false;
		Iterator iter = lista_animales.iterator();
		Animal animal_aux = null;
		
		while (iter.hasNext()) {
			animal_aux = (Animal) iter.next();
			if (animal_aux.getNombre_animal().equals(nombre)) {
				encontrado = true;
				System.out.println("Animal encontrado: " + nombre);
				break;
			}
		}
		if (encontrado =false) {
			System.out.println("Animal no encontrado: " + nombre);
			animal_aux = null;
			return animal_aux;
		}
		return animal_aux;
	}

	public void Insertar_Comentario(String nombre, String comentario) {

		Animal animal = Busca_animal(nombre);
		if (animal != null) {
			animal.setComentarios_animal(comentario);
		}
	}

	public String toString() {
		String fichas_animales = "";
		Iterator iter = lista_animales.iterator();
		Animal animal_aux = null;
		
		while (iter.hasNext()) {
			animal_aux = (Animal) iter.next();
			fichas_animales = fichas_animales + animal_aux.toString() + "\n----------------------\n";
		}
		return fichas_animales;
	}
}