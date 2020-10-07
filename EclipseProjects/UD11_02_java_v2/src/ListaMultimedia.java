
public class ListaMultimedia {

	private Multimedia[] objetos_multimedia;
	int tamanyo;

	public ListaMultimedia(int tamanyo) {

		this.tamanyo = tamanyo;
		objetos_multimedia = new Multimedia[tamanyo];
	}

	public int size() {
		return this.objetos_multimedia.length;
	}

	public boolean add(Multimedia m) {

		boolean resultado = false;

		for (int i = 0; i < objetos_multimedia.length; i++) {
			if (objetos_multimedia[i] == null) {
				objetos_multimedia[i] = m;
				resultado = true;
				break;
			}
		}
		return resultado;
	}

	public Multimedia get(int posicion) {

		return objetos_multimedia[posicion];

	}

	public int indexOf(Multimedia m) {

		int resultado = -1;
		for (int i = 0; i < objetos_multimedia.length; i++) {
			if (objetos_multimedia[i].equals(m)) {
				return i;
			}
		}
		return resultado;
	}

	public String toString() {
		String resultado = "";
		for (int i = 0; i < objetos_multimedia.length; i++) {
			if (objetos_multimedia[i] == null) {
				break;
			}
			resultado = resultado + objetos_multimedia[i] + "\n";
		}
		return resultado;
	}
}
