import java.util.*;

public class ejerciciof {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int T, N, M, X;

		T = teclado.nextInt();

		for (int i = 0; i < T; i++) {

			N = teclado.nextInt();
			M = teclado.nextInt();

			int matriz[][] = new int[N][M];

			for (int j = 0; j < N; j++) {

				for (int j2 = 0; j2 < M; j2++) {

					matriz[j][j2] = teclado.nextInt();

				}

			}

			for (int j = 0; j < matriz.length; j++) {

				for (int j2 = 0; j2 < matriz.length - 1; j2++) {

					int aux = matriz[j][j2];

					if (matriz[j][j2 + 1] > aux) {
						
						System.out.println("INVÁLIDA");

					} else {

						for (int j3 = 0; j3 < matriz.length - 1; j3++) {

							for (int j4 = 0; j4 < matriz.length; j4++) {

								int aux1 = matriz[j3][j4];

								if (matriz[j3 + 1][j4] < aux1) {

								}
							}
						}
						System.out.println("VÁLIDA");

					}

				}
			}

		}
	}
}
