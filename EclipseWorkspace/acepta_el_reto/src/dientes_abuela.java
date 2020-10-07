import java.util.*;

public class dientes_abuela {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int casos = 0;
		int boca_arriba;
		int boca_abajo;

		casos = teclado.nextInt();

		do {

			int arriba[] = new int[6];

			for (int i = 0; i < arriba.length; i++) {
				boca_arriba = teclado.nextInt();
				arriba[i] = boca_arriba;
			}

			int abajo[] = new int[6];

			for (int i = 0; i < abajo.length; i++) {
				boca_abajo = teclado.nextInt();
				arriba[i] = boca_abajo;
			}
			
			for (int i = 0; i < abajo.length; i++) {

				int suma=arriba[i]+abajo[i];
				
				if (arriba[i] == abajo[i + 1]) {
					System.out.println("SI");

				} else
					System.out.println("NO");

			}

			casos--;

		} while (casos > 0);

	}

}
