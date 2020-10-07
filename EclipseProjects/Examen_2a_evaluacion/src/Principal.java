import java.io.ObjectInputStream.GetField;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int opcion;

		ArrayList<Nave> Lista_naves = new ArrayList<Nave>();

		do {

			System.out.println("--------------- Menú de la galaxia ---------------\n" + "1.- Alta de nave"
					+ "               4.- Consultar nave\n" + "2.- Alta de tripulante"
					+ "         5.- Consultar flota\n" + "3.- Alta de flota" + "              0.- Salir\n"
					+ "--------------------------------------------------");

			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {

			case 1:

				String nombre;

				System.out.println("Introduzca nombre de la nave:");
				nombre = teclado.nextLine();

				Nave nave = new Nave(nombre);

				Lista_naves.add(nave);

				break;

			case 2:

				String nombre_nave, nombre_tripulante;
				int edad;
				String rango;

				System.out.println("Introduzca nombre de la nave donde desea dar de alta al tripulante:");
				nombre_nave = teclado.nextLine();

				//ITERATOR PARA RECORRER NAVES

				Nave n;

				Iterator iter = Lista_naves.iterator();

				boolean encontrado = false;

				while (iter.hasNext()) {

					n = (Nave) iter.next();

					String nombre_aux = n.getNombre_nave();

					if (nombre_aux.equals(nombre_nave)) {

						System.out.println("Introduzca el nombre del tripulante para la nave " + nombre_nave);
						nombre_tripulante = teclado.nextLine();
						System.out.println("Introduzca la edad del nuevo tripulante:");
						edad = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Introduzca su rango (Soldado, Capitan, Comandante):");
						rango = teclado.nextLine();

						Tripulante tripulante = new Tripulante(nombre_tripulante, edad, rango);
						n.anyadir_tripulante(tripulante);

						encontrado = true;

					}

				}

				if (encontrado == false) {
					System.out.println("Nave no encontrada");

				}

				break;

			case 3:
//				
//				String nombre_flota, nombre_nave_flota; 
//				
//				//Se solicita el nombre de la flota
//				System.out.println("Introduzca nombre para su flota:");
//				nombre_flota=teclado.nextLine();
//				
//				do {
//					//y después el programa se mete en un bucle hasta teclear ‘salir’.
//					//En este bucle, el programa solicitará los nombres de las naves a incluir en la flota, de forma que:
//					System.out.println("Introduzca nombre de nave para añadir a la flota "+ nombre_flota+" (hasta teclear 'salir'):");
//					nombre_nave_flota=teclado.nextLine();
//					nombre_nave_flota.toLowerCase();
//					//Si la nave existe en la lista de naves, se añade al listado de naves de esa flota.
//					
//					Flota flota = new Flota(nombre_flota);
//					
//					Flota f;
//					
//					Iterator<Flota> iter1 =Flota.Lista_naves.iterator();
//					
//					while (iter.hasNext()) {
//						
//						f = (Flota) iter.next();
//						
//						String nombre_aux = n.getNombre_nave();
//						
//							if (nombre_aux.equals(nombre_nave_flota)) {
//						
//							f.anyadir_nave(nombre_aux);
//						
//					}else {
//						
//						//Si la nave no existe en la lista de naves, el programa informa de la situación
//						System.out.println("Nave no encontrada");
//						
//					}
//													
//				}while (nombre_nave_flota!="salir");
//								
				break;

			case 4:

				encontrado = false;

				System.out.println("Introduzca el nombre de la nave:");
				nombre_nave = teclado.nextLine();

				//ITERATOR PARA RECORRER NAVES
				
				Nave m;

				Iterator iter1 = Lista_naves.iterator();

				while (iter1.hasNext()) {

					m = (Nave) iter1.next();

					String nombre_aux = m.getNombre_nave();

					if (nombre_aux.equals(nombre_nave)) {

						m.recorrer_tripulantes();

					}

				}
				

				break;

//			case 5:
//				
//				//Se solicita, primero de todo, el nombre de la flota a consultar:
//
//				System.out.println("Introduzca el nombre de la flota:");
//				nombre_flota=teclado.nextLine();
//				
//				if ( FLOTA EXISTE) {
//					
//					//Si la flota existe en la lista de flotas, el programa informará del número de naves de la flota y
//					//los nombres de cada una de ellas.
//					
//				}else {
//					
//					//Si la nave no existe en la lista de naves, el programa informa de la situación
//					System.out.println("Flota no encontrada");
//					
//				}
////				-Si la flota no existe en la lista de flotas, el programa informa de la situación y vuelve al
////				programa principal.
////				-Si la flota existe en la lista de flota
//				
//				break;

			default:

				break;
			}
		} while (opcion != 0);
	}
}