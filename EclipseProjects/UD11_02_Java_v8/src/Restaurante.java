import java.util.*;

public class Restaurante implements Interface_Restaurante {

	private String nombre_restaurante;
	private String telefono_restaurante;
	private ArrayList<Mesa> lista_mesas = new ArrayList<Mesa>();

	Restaurante(String nombre_restaurante, String telefono_restaurante) {
		this.nombre_restaurante = nombre_restaurante;
		this.telefono_restaurante = telefono_restaurante;
	}

	public void montarMesa(Mesa m) {
		lista_mesas.add(m);
	}

	public void recogerMesa(Mesa m) {
		Iterator iter = lista_mesas.iterator();
		Mesa mesa_aux;
		Mesa mesa_aux1 = null;

		while (iter.hasNext()) {
			mesa_aux = (Mesa) iter.next();

			if ((mesa_aux.getnumMesa()) == m.getnumMesa()) {
				mesa_aux1 = mesa_aux;
			} else {
				System.out.println(mesa_aux.obtenerDatosMesa());
			}
		}
		lista_mesas.remove(mesa_aux1);

	}

	public void listarMesas() {

		if (lista_mesas.size() == 0) {
			System.out.println("Todas las mesas estan recogidas");
		}
		Iterator iter = lista_mesas.iterator();
		Mesa mesa_aux;
		while (iter.hasNext()) {
			mesa_aux = (Mesa) iter.next();
			System.out.println(mesa_aux.obtenerDatosMesa());
		}
	}

	public double calcular_caja() {

		double suma = 0.0;

		Iterator iter = lista_mesas.iterator();
		Mesa mesa_aux;
		while (iter.hasNext()) {
			mesa_aux = (Mesa) iter.next();
			mesa_aux.calcular_factura();
			suma += mesa_aux.calcular_factura();
		}
		return suma;
	}

}
