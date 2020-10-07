import java.util.*;

public class zapping {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int canal1 = 1, canal2 = 1, canales = 99, recorrido = 0;

		do {

			canal1 = teclado.nextInt();
			canal2 = teclado.nextInt();

			if (canal1 != 0 && canal2 != 0) {

				if (canal1 > canal2) {
					int aux = canal1;
					canal1 = canal2;
					canal2 = aux;
				}

				if (canal1 <= canales) {
					recorrido = canal2 - canal1;
					if (recorrido > 49) {
						recorrido = canal1 + (canales - canal2);
					}
				}

				System.out.println(recorrido);
			}
		} while (canal1 != 0 && canal2 != 0);

	}

}
