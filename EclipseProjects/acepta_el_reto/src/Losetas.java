import java.util.*;

public class Losetas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int casos;
		int vertical, horizontal, blancas, negras, superficie;

		casos = teclado.nextInt();
		
		for (int i = 0; i < casos; i++) {

			vertical = teclado.nextInt();
			horizontal = teclado.nextInt();

			superficie = vertical * horizontal;

			if (superficie % 2 != 0) { // es impar
				blancas = (superficie / 2) + 1;
				negras = superficie / 2;
			} else {
				blancas = (superficie / 2);
				negras = superficie / 2;
			}
			System.out.println(blancas +" "+negras);

		}

	}

}
