import java.util.*;

public class Ejercicio90 {

//	Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio anterior.El programa irá pidiendo
//	que el usuario teclee la traducción al inglés de cada una de estas palabras y
//	comprobará si son correctas. Al final, el programa deberá mostrar 
//	cuántas respuestas son válidas y cuántas son erróneas.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();

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

		int contador_validas = 1, contador_errores = 1, palabras = 1, total = 0;
		String traduccion;

		while (total < 5) {
			Object[] crunchifyKeys = map.keySet().toArray();
			Object key = crunchifyKeys[new Random().nextInt(crunchifyKeys.length)];
			System.out.println(map.get(key));
			System.out.println("Escribe la traducción:");
			traduccion = teclado.nextLine();
			if (traduccion.equals(key)) {
				contador_validas++;
			} else {
				contador_errores++;
			}
			total++;
		}
		System.out.println("Has tenido un total de " + (contador_errores - 1) + " fallos y un total de "
				+ (contador_validas - 1) + " aciertos");
	}

}
