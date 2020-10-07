
public class Perro extends Mascota {

	@Override
	public void hacer_sonido() {
		System.out.println("Hola, me llamo " + nombre + ", soy un perro y hago guau.");
	}

	public Perro(String nombre) {
		super(nombre);
		tipo = "perro";
	}

}
