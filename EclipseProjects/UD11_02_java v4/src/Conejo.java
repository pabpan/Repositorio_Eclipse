
public class Conejo extends Mascota {

	@Override
	public void hacer_sonido() {
		System.out.println("Hola, me llamo " + nombre + ", soy un conejo y hago rabit rabiitt.");
	}

	public Conejo(String nombre) {
		super(nombre);
		tipo = "conejo";
	}

}
