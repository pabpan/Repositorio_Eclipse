
public abstract class Animal {

	protected String nombre_animal;
	protected String fecha_nacimiento_animal;
	protected double peso_animal;
	protected String comentarios_animal;

	public Animal(String nombre_animal, String fecha_nacimiento_animal, double peso_animal) {
		this.nombre_animal = nombre_animal;
		this.fecha_nacimiento_animal = fecha_nacimiento_animal;
		this.peso_animal = peso_animal;
	}

	public double getPeso_animal() {
		return peso_animal;
	}

	public void setPeso_animal(double peso_animal) {
		this.peso_animal = peso_animal;
	}

	public String getComentarios_animal() {
		return comentarios_animal;
	}

	public void setComentarios_animal(String comentarios_animal) {
		this.comentarios_animal = comentarios_animal;
	}

	public String getNombre_animal() {
		return nombre_animal;
	}

	public String getFecha_nacimiento_animal() {
		return fecha_nacimiento_animal;
	}
	
	public abstract String toString();
}
