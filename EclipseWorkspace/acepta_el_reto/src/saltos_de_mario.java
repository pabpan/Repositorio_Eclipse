import java.util.*;

public class saltos_de_mario {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int aux = 0, casos, muro, escalones;
		int abajo, arriba;

		casos = teclado.nextInt();

		for (int j = 0; j < casos; j++) {
			abajo = 0;
			arriba = 0;

			muro = teclado.nextInt();

			for (int i = 0; i < muro; i++) {
				escalones = teclado.nextInt();
				if (i != 0) {
					if (aux > escalones) {
						abajo++;
					} else if (aux < escalones) {
						arriba++;
					}
				}
				aux = escalones;
			}System.out.println(arriba+" "+abajo);
		}
	}

}
