import java.io.ObjectInputStream.GetField;
import java.util.*;

public class Ejercicio89 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("umbrella", "paragüas");
		map.put("book", "libro");
		map.put("chair", "silla");
		map.put("the", "el");
		map.put("of", "de");
		map.put("to", "para");
		map.put("you", "tú");
		map.put("he", "él");
		map.put("she", "ella");
		map.put("it", "eso");
		map.put("we", "nosotros");
		map.put("buy", "comprar");
		map.put("think", "pensar");
		map.put("eat", "comer");
		map.put("sleep", "dormir");
		map.put("one", "uno");
		map.put("two", "dos");
		map.put("three", "tres");
		map.put("four", "cuatro");
		map.put("five", "cinco");

		String palabra_usuario = "";

		while (!palabra_usuario.equals("salir")) {
			System.out.print("Introduce una palabra:");
			palabra_usuario = teclado.nextLine();
			palabra_usuario.toLowerCase();
			if (map.containsKey(palabra_usuario)) {
				System.out.println("La traducción es: " + map.get(palabra_usuario));
			}else
				System.out.println("La palabra no se encuentra");
		}
		if (palabra_usuario.equals("salir")) {
			System.out.println("FIN DEL PROGRAMA");
		}
	}
}
