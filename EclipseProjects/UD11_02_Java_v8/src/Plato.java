import java.util.*;

public class Plato implements Interface_Plato {

	private String nombre_plato;
	private float precio;
	private ArrayList<Ingrediente> lista_ingredientes = new ArrayList<Ingrediente>();

	public Plato(String nombre_plato) {
		this.nombre_plato = nombre_plato;
		this.precio = precio;
		this.lista_ingredientes = lista_ingredientes;

		for (int i = 0; i < 1; i++) {

			if ((this.nombre_plato.charAt(i) == 'a') || (this.nombre_plato.charAt(i) == 'e')
					|| (this.nombre_plato.charAt(i) == 'i') || (this.nombre_plato.charAt(i) == 'o')
					|| (this.nombre_plato.charAt(i) == 'u')) {
				this.precio=10;
			} else {
				this.precio = 5;
			}
		}
	}

	public void anyadir_ingrediente(Ingrediente i) {
		lista_ingredientes.add(i);
	}

	public String consultar_ingredientes() {

		Iterator iter = lista_ingredientes.iterator();
		Ingrediente ingrediente_aux = null;
		while (iter.hasNext()) {
			ingrediente_aux = (Ingrediente) iter.next();
			System.out.println(ingrediente_aux.detalle_Ingrediente());
		}

		return "---------------------------------------";

	}

	public double getPrecio() {
		return this.precio;
	}

	public String getNombre() {
		return "- " + this.nombre_plato + ".";
	}

}
