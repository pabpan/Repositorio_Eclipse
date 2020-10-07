
public class Periquito extends Mascota {

	@Override
	public void hacer_sonido() {
		System.out.println("Hola, me llamo " + nombre + ", soy un periquito y hago pio piooo.");
	}

	public Periquito(String nombre) {
		super(nombre);
		tipo = "periquito";
	}

}
