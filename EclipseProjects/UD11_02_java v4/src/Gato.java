
public class Gato extends Mascota {

	@Override
	public void hacer_sonido() {
		System.out.println("Hola, me llamo " + nombre + ", soy un gato y hago miau.");
	}

	public Gato(String nombre) {
		super(nombre);
		tipo = "gato";
	}
}
