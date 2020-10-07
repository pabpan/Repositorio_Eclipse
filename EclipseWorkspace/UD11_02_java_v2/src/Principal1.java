import java.util.*;

public class Principal1 {

	public static void main(String[] args) {

		ListaMultimedia lista1 = new ListaMultimedia(10);
		
		Disco disco1 = new Disco("a", "b", "c", 1, "d");
		Disco disco2 = new Disco("e", "f", "g", 1, "h");
		Disco disco3 = new Disco("i", "j", "k", 1, "l");
		lista1.add(disco1);
		lista1.add(disco2);
		lista1.add(disco3);
		System.out.println(lista1);
		Disco busca = new Disco("a", "b", "c", 1, "d");
		int posicion = lista1.indexOf(busca);
		Disco recupera = (Disco)lista1.get(posicion);
		System.out.println("POS " + posicion + ": " + recupera );
	}

}
