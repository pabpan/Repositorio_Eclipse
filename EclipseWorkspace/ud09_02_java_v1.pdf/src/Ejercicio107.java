import java.util.*;

public class Ejercicio107 {

	public static void main(String[] args) throws Exception, ExcepcionIntervalo {

		Scanner teclado = new Scanner(System.in);

		int opcion;
		menu();
		opcion = teclado.nextInt();

		while (opcion != 4) {

			try {

				switch (opcion) {
				case 1:
					leer_entero();
					break;
				case 2:
					leer_entero_mayor();
					break;
				case 3:
					Leer_irreal();
					break;
				case 4:
					System.out.println("Gracias por utilizar este menu.");
					break;
				default:
					break;

				}

			} catch (ExcepcionIntervalo e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void Leer_irreal() throws Exception {
		Scanner teclado = new Scanner(System.in);

		try {
			int numero = teclado.nextInt();
		} catch (Exception e) {
			throw new ExcepcionIntervalo("No es irreal");
		}

	}

	public static void leer_entero_mayor() throws Exception {
		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt();

		if (numero <= 100) {
			throw new ExcepcionIntervalo("El numero " + numero + " es inferior a 100");
		}
	}

	public static void leer_entero() throws Exception {
		Scanner teclado = new Scanner(System.in);

		try {
			int numero = teclado.nextInt();
		} catch (Exception e) {
			throw new Exception("No es un entero");
		}

	}

	public static void menu() {
		System.out.println("1.- Leer un número entero\n" + "2.- Leer un número entero que sea mayor de 100\n"
				+ "3.- Leer un número entero que sea irreal\n" + "4.- Salir del programa");

	}

}
