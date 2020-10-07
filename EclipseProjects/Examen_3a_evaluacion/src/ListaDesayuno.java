import java.util.*;

public class ListaDesayuno {

	private ArrayList<Bolleria> lista_bolleria;

	public ListaDesayuno() {
		lista_bolleria = new ArrayList<Bolleria>();
	}

	public void anyadir_bollo(Bolleria b) {
		lista_bolleria.add(b);
	}

	public String toString() {
		String resultado = "";
		Iterator iter = lista_bolleria.iterator();
		Bolleria bollo_aux = null;
		while (iter.hasNext()) {
			bollo_aux = (Bolleria) iter.next();
			resultado = resultado + bollo_aux.toString() + "\n----------------------\n";
		}
		return resultado;
	}


}
