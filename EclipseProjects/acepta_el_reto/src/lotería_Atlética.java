import java.util.*;

public class lotería_Atlética {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int casos, terminaciones, contador = 0, posible = 0;
		System.out.println("cuantos casos");
		casos = teclado.nextInt();

		while (casos > 0) {

			int terminaciones_usuario;
			System.out.println("cuantas terminaciones puedes optar");
			terminaciones = teclado.nextInt();
			System.out.println("Que terminaciones");
			terminaciones_usuario = teclado.nextInt();

			if (terminaciones_usuario % 2 != 0) {
				System.out.println("es impar");
			} else {

				while (contador < terminaciones_usuario) {

					terminaciones_usuario = terminaciones_usuario / 2;
					posible = terminaciones_usuario;
					contador++;
				}
				System.out.println(posible);
			}

			casos--;
		}

	}

}
