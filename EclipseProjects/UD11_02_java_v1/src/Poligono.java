
public class Poligono {

	private Punto[] puntos;

	public Poligono(Punto[] puntos) {

		this.puntos = puntos;
	}

	public void trasladar(int x, int y) {
		for (int i = 0; i < puntos.length; i++) {
			puntos[i].setX(puntos[i].getX() + x);
			puntos[i].setY(puntos[i].getY() + y);
		}
	}

	public void escalar(int x, int y) {
		for (int i = 0; i < puntos.length; i++) {
			puntos[i].setX(puntos[i].getX() * x);
			puntos[i].setY(puntos[i].getY() * x);
		}
	}

	public int numVertices() {
		return this.puntos.length;
	}

	public String toString() {

		String resultado ="";
		
		for (int i = 0; i < puntos.length; i++) {
			resultado = resultado + "(" + puntos[i].getX() + "," + puntos[i].getY() + ")";
		}
		
		return resultado;
		
	}
}
