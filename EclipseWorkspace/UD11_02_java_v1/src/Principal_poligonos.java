import java.util.*;

public class Principal_poligonos {
	
	public static void main(String[] args) {

		Punto puntos1 = new Punto(0, 0);
		Punto puntos2 = new Punto(0, 1);
		Punto puntos3 = new Punto(1, 0);
		Punto puntos4 = new Punto(1, 1);	
		Punto[] array_puntos = {puntos1, puntos2, puntos3, puntos4};
		Poligono poligono = new Poligono(array_puntos);
		System.out.println(poligono);
		poligono.trasladar(4, -3);
		System.out.println(poligono);
		poligono.escalar(2, 2);
		System.out.println(poligono);
		System.out.println(poligono.numVertices());
	}

}
