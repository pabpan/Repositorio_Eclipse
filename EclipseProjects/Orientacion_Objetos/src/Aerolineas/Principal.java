package Aerolineas;

import java.io.ObjectInputStream.GetField;
import java.security.DrbgParameters.NextBytes;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String opcion, comprar, origen, destino, dia_ida, dia_vuelta;

		ArrayList<Billete> billetes = new ArrayList<Billete>();

		System.out.println("------------------------------------------------------------");
		System.out.println("Bienvenido a las aerolíneas Paco Airways, ¿qué desea hacer?");
		System.out.println("------------------------------------------------------------\n");

		do {
			System.out.println("1.- Comprar billete de avión\n" + "2.- Cancelar billete avión\n"
					+ "3.- Estado de mi reserva\n" + "S.- Salir");
			System.out.print("OPCIÓN:");
			opcion = teclado.nextLine();
			opcion.toLowerCase();

			switch (opcion) {

			case "1":
				System.out.println("Introduzca orígen, destino, día de ida y día de vuelta separados por @:");
				comprar = teclado.nextLine();

				String[] separado = comprar.split("@");
				origen = separado[0];
				destino = separado[1];
				dia_ida = separado[2];
				dia_vuelta = separado[3];

				Billete b1 = new Billete(origen, destino, dia_ida, dia_vuelta);

				billetes.add(b1);
				break;

			case "2":

				System.out.println("Introduzca el id del billete a cancelar");
				String cancelar_id = teclado.nextLine();

				Billete aux1;
				Iterator iter1 = billetes.iterator();
				while (iter1.hasNext()) {

					aux1 = (Billete) iter1.next();

					if (aux1.getid() == Integer.parseInt(cancelar_id)) {

						if (aux1.getEstado().equals("CANCELADO")) {
							System.out.println("YA ESTÁ CANCELADO");
						} else {
							System.out.println("Billete encontrado, ¿Confirma su cancelación S/N?");
							String confirmar = "";
							confirmar = teclado.nextLine();
							confirmar.toUpperCase();
							if (confirmar.equalsIgnoreCase("S")) {

								aux1.setEstado("CANCELADO");
								System.out.println(aux1.getBillete() + aux1.getEstado());

							} else if (confirmar.equalsIgnoreCase("N")) {
								System.out.println("Operación de cancelación cancelada a su vez.");
							}
						}

					} else
						System.out.println("El billete no existe");
				}

				break;
			case "3":

				System.out.println("¿Qué vuelos desea ver? (V-Vigentes, C-Cancelados, T-Todos");
				String ver = teclado.nextLine();
				ver = ver.toUpperCase();

				if (ver.equals("V")) {
					Billete aux;
					Iterator iter = billetes.iterator();
					while (iter.hasNext()) {
						aux = (Billete) iter.next();
						if (aux.getEstado().equals("VIGENTE")) {
							System.out.println(aux.getBillete() + aux.getEstado());
						}

					}
				}
				if (ver.equals("C")) {
					Billete aux;
					Iterator iter = billetes.iterator();
					while (iter.hasNext()) {
						aux = (Billete) iter.next();
						if (aux.getEstado().equals("CANCELADO")) {
							System.out.println(aux.getBillete() + " " + aux.getEstado());
						}
					}
				}
				if (ver.equals("T")) {
					Billete aux;
					Iterator iter = billetes.iterator();
					while (iter.hasNext()) {
						aux = (Billete) iter.next();
						if (aux.getEstado().equals("VIGENTE") || aux.getEstado().equals("C")) {
							System.out.println(aux.getBillete() + " ESTADO: " + aux.getEstado());
						}

					}
				}

				break;

			case "s":
				break;

			default:
				break;
			}
		} while (!opcion.equals("s"));
		System.out.println("FIN DEL PROGRAMA");

	}

}
