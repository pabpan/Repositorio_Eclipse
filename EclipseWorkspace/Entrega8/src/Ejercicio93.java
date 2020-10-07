import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio93 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String nombres = "";
		int numero_personas = 0;

		while (!nombres.equals("salir") || !nombres.equals("nadie")) {

			if (nombres.equals("salir") || nombres.equals("nadie")) {
				System.out.println("FIN DEL PROGRAMA");
				break;
			} else

				System.out.println("Introduzca nombres para ENTRAR separados"
						+ " por @, 'nadie' para que no entre nadie o 'salir'" + "para finalizar el progrma");
			nombres = teclado.nextLine();

			if (nombres.contains("@")) {
				String[] partes = nombres.split("@");
				Queue<String> colacine = new LinkedList<String>();
				for (int i = 0; i < partes.length; i++) {
					colacine.add(partes[i]);
				}
				System.out.println(colacine);

				while (colacine.size() > numero_personas) {

					System.out.println("Introduzca el número de personas para SALIR de la cola");
					numero_personas = teclado.nextInt();
					teclado.nextLine();

					if (numero_personas > colacine.size()) {
						System.out.println("No pueden salir " + numero_personas + " porque en la cola" + " solo hay "
								+ colacine.size() + " personas");
					} else {
						for (int i = 0; i < numero_personas; i++) {
							colacine.remove();
						}
						System.out.println("Estado de la cola después de SALIR");
						System.out.println(colacine);
					}

				}
			} else {
				if (nombres.equals("salir") || nombres.equals("nadie")) {
					System.out.println("FIN DEL PROGRAMA");
					break;
				} else {
					System.out.println("La línea " + nombres + " no tiene @");
				}

			}
		}
	}

}
