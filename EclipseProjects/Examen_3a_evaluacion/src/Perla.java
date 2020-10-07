import java.util.Random;

public class Perla implements Interface_Perla {

	protected String material_perla;
	protected int peso_perla;
	protected double precio_perla;

	public Perla() {

		this.material_perla = material_aleatorio();
		this.peso_perla = peso_aleatorio();
		this.precio_perla = calcular_precio();

	}

	public int peso_aleatorio() {
		int peso_aleatorio = (int) ((Math.random() * 51) + 50);
		return peso_aleatorio;
	}

	public String material_aleatorio() {

		Random aleatorio = new Random();
		String[] material = { "plata", "oro", "platino", "rodio" };
		int opciones = aleatorio.nextInt(3);
		String material_seleccionado = material[opciones];
		return material_seleccionado;

	}

	public double calcular_precio() {

		double precio_gramo = 0;

		if (this.material_perla == "plata") {
			precio_gramo = 2.25 * this.peso_perla;
		}
		if (this.material_perla == "oro") {
			precio_gramo = 10 * this.peso_perla;
		}
		if (this.material_perla == "platino") {
			precio_gramo = 12 * this.peso_perla;
		}
		if (this.material_perla == "rodio") {
			precio_gramo = 7.5 * this.peso_perla;
		}
		return precio_gramo;
	}

	public double getprecio() {
		return this.precio_perla;
	}
	public String getmaterial() {
		return this.material_perla;
	}
	public int getpeso_perla() {
		return this.peso_perla;
	}

}
