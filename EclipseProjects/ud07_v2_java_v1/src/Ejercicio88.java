import java.util.*;

public class Ejercicio88 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("usuario1", "contraseña1");
		map.put("usuario2", "contraseña2");
		map.put("usuario3", "contraseña3");

		String usuario, contrasenya;
		int fallos_usuario = 1, fallos_contrasenya = 0;

		while (fallos_usuario < 4 && fallos_contrasenya < 3) {

			System.out.printf("Introduce tu nombre de usuario: \n");
			usuario = teclado.nextLine();

			if (map.containsKey(usuario)) {

				while (fallos_contrasenya < 3) {
					System.out.printf("Introduce tu contraseña: \n");
					contrasenya = teclado.nextLine();
					if (map.containsValue(contrasenya)) {
						System.out.println("Has accedido al área restringida");
						break;
					} else {
						fallos_contrasenya++;
						if (fallos_contrasenya == 3) {
							System.out.println("¡NO PUEDES ACCEDER AL SISTEMA!");
						} else {
							System.out.println("Contraseña incorrecta");
							System.out.println("Fallo " + fallos_contrasenya + "/3");
						}
					}
				}
			} else {
				fallos_usuario++;
				if (fallos_usuario == 4) {
					System.out.println("El usuario no existe");
				}
			}
		}

	}
}
