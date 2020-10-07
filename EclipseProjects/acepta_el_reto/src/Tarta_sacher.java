import java.util.*;

public class Tarta_sacher {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int aux, casos, horizontal, vertical;
		int total_tableta, esperados;

		casos = teclado.nextInt();

		for (int i = 0; i < casos; i++) {

			horizontal = teclado.nextInt();
			vertical = teclado.nextInt();
			esperados = teclado.nextInt();

			total_tableta = horizontal * vertical;

			aux = (esperados / total_tableta) + 1;

			if (esperados == total_tableta) {
				aux = (esperados / total_tableta);
			}
			System.out.println(aux);
		}
	}
}
