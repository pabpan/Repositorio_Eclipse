package ud08_02_java_POOv5;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		int numero_salas, num_sala, opcion;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Bienvenido a Kinepolis, ¿De cuántas salas dispone tu cine?");

		numero_salas = teclado.nextInt();

		HashMap<Integer, Queue<Cliente>> salas_cine = new HashMap<Integer, Queue<Cliente>>();

		for (int i = 1; i <= numero_salas; i++) {

			Queue<Cliente> colaClientes = new LinkedList<Cliente>();
			salas_cine.put(i, colaClientes);
		}

		do {

			System.out.println("----------- Menu Kinepolis -------------\n" + "1-Encolar cliente en una sala\n"
					+ "2-Desencolar cliente de la sala\n" + "3-Información de una sala\n" + "4-Estado del cine\n"
					+ "5-Salir\n");

			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:

				do {
					System.out.println("¿Sobre qué sala desea realizar la operación?");
					num_sala = teclado.nextInt();

					if (num_sala > numero_salas || num_sala < 1) {
						System.out.println("Valor de sala introducido erróneo. "
								+ "Introduzca valores desde el 1 hasta el " + numero_salas);
					}
				} while (num_sala < 1 || num_sala > numero_salas);

				teclado.nextLine();

				System.out.println("Introduzca nombre del nuevo cliente para la cola " + num_sala);
				String nombre = teclado.nextLine();
				System.out.println("Introduzca su edad:");
				int edad = teclado.nextInt();
				teclado.nextLine();
				Cliente cliente = new Cliente(nombre, edad);
				salas_cine.get(num_sala).add(cliente);
				System.out
						.println("Añadimos a la cola " + num_sala + " el cliente " + nombre + " de " + edad + " años.");
				System.out.println();
				break;

			case 2:

				System.out.println("Sobre que sala desea realizar la operacion?");
				do {
					num_sala = teclado.nextInt();
					if (num_sala > numero_salas || num_sala < 1) {
						System.out.println("Valor de sala erroneo. Introduca valores del 1 al " + numero_salas + ":");
					}
				} while (num_sala > numero_salas || num_sala < 1);
				teclado.nextLine();

				System.out.println("Desencolamos al primero de la cola de la sala " + num_sala);
				salas_cine.get(num_sala).remove();

				break;

			case 3:
				System.out.println("Sobre que sala desea realizar la operacion?");
				num_sala=teclado.nextInt();
				teclado.nextLine();
				System.out.println("La sala "+num_sala+" tiene esperando a los siguientes clientes:");
				muestraClientes(salas_cine.get(num_sala));
				break;
			case 4:

				for (int i = 1; i <= numero_salas; i++) {			
					System.out.println("Clientes de la sala " + i +":");
					muestraClientes(salas_cine.get(i));
				}
				System.out.println();
				break;

			default:
				break;
			}
		} while (opcion != 5);
		System.out.println("Gracias por venir a kinepolis.");
		teclado.close();
	}

	private static void muestraClientes(Queue<Cliente> clientes) {
		Iterator<Cliente> iter2 = (clientes).iterator();
		while (iter2.hasNext()) {
			Cliente c1 = (Cliente) iter2.next();
			System.out.println(c1.getCliente());
		}
	}
}
