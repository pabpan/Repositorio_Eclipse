import java.util.*;

public class Ejercicio91 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int opcion = 0;
		ArrayList<String> GruposMusicales = new ArrayList();

		while (opcion != 7) {

			System.out.println("-GRUPOS MUSICALES-\n" + "1-Agregar grupos al final de la lista\n"
					+ "2-Agregar grupos en una posicion concreta\n" + "3-Recuperar grupo en una posicion determinada\n"
					+ "4-Modificar grupo en una posicion determinada\n" + "5-Posicion del grupo de la lista\n"
					+ "6-Imprimir lista\n" + "7-Salir del programa\n" + "Introduzca una opcion");

			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				GruposMusicales = agregar_final(GruposMusicales);
				break;
			case 2:
				GruposMusicales = agregar_grupo(GruposMusicales);
				break;
			case 3:
				GruposMusicales = recuperar_grupo(GruposMusicales);
				break;
			case 4:
				GruposMusicales = modificar_grupo(GruposMusicales);
				break;
			case 5:
				GruposMusicales = posicion_grupo(GruposMusicales);
				break;
			case 6:
				GruposMusicales = imprimir_lista(GruposMusicales);
				break;
			case 7:
				System.out.println("HA SALIDO DEL PROGRAMA");
				break;
			default:
				break;
			}
		}
	}

	public static ArrayList<String> agregar_final(ArrayList<String> grupo_musica) {

		Scanner teclado = new Scanner(System.in);

		String nombre_grupo;

		System.out.println("Introduce el nombre del grupo");
		nombre_grupo = teclado.nextLine();
		grupo_musica.add(nombre_grupo);
		return grupo_musica;
	}

	public static ArrayList<String> agregar_grupo(ArrayList<String> grupo_musica) {

		Scanner teclado = new Scanner(System.in);

		int posicion;
		String nombre_grupo;

		System.out.println("¿En qué posición lo quieres poner?");
		posicion = teclado.nextInt();
		teclado.nextLine();

		if (grupo_musica.contains(posicion)) {
			System.out.println("La posición está ocupada");
		}
		if (posicion == grupo_musica.size()) {
			System.out.println("Introduce el nombre del grupo");
			nombre_grupo = teclado.nextLine();
			grupo_musica.add(posicion, nombre_grupo);
		}
		if (posicion >= grupo_musica.size()) {
			System.out.println("No puede introducirlo en esa posicion");
		}
		return grupo_musica;

	}

	public static ArrayList<String> recuperar_grupo(ArrayList<String> grupo_musica) {

		Scanner teclado = new Scanner(System.in);

		int posicion;

		System.out.println("De qué posición quieres ver el grupo?");
		posicion = teclado.nextInt();
		if (posicion >= grupo_musica.size()) {
			System.out.println("La posicion no se encuentra en la lista");
		} else
			System.out.println(grupo_musica.get(posicion));
		return grupo_musica;
	}

	public static ArrayList<String> modificar_grupo(ArrayList<String> grupo_musica) {

		Scanner teclado = new Scanner(System.in);

		int posicion;
		String nombre_grupo;

		System.out.println("Qué posición quieres modificar?:");
		posicion = teclado.nextInt();
		teclado.nextLine();

		if (posicion >= grupo_musica.size()) {
			System.out.println("La posicion no se encuentra en la lista");
		} else {
			System.out.println("En la posicion " + posicion + "se encuentra: " + grupo_musica.get(posicion));
			System.out.println("Nombre del nuevo grupo:");
			nombre_grupo = teclado.nextLine();
			grupo_musica.add(posicion, nombre_grupo);
		}

		return grupo_musica;
	}

	public static ArrayList<String> posicion_grupo(ArrayList<String> grupo_musica) {
		
		Scanner teclado = new Scanner(System.in);

		String nombre_grupo;
		System.out.println("Qué grupo quieres buscar?");
		nombre_grupo = teclado.nextLine();
		
		for (int i = 0; i < grupo_musica.size(); i++) {
			if (grupo_musica.contains(nombre_grupo)) {
				System.out.println("El grupo "+nombre_grupo+" está en la posición "+ i);
			}else
				System.out.println("El grupo no está en la lista");
		}		
		return grupo_musica;
	}

	public static ArrayList<String> imprimir_lista(ArrayList<String> GruposMusicales) {
		System.out.println(GruposMusicales);
		return GruposMusicales;
	}
}
