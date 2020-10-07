import java.util.*;

public class Elefantes {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int contador_kilos, kilos_totales, suma_kilos=0, resultado = 0, aux = 0;

		kilos_totales = teclado.nextInt();

		int kilos_introducidos = teclado.nextInt();

		while (kilos_introducidos != 0) {

			while (suma_kilos != kilos_totales) {
				suma_kilos = kilos_totales - aux;
				resultado++;

				if (suma_kilos <= kilos_totales) {
					kilos_introducidos = 0;
				}
			}
			System.out.println(resultado);

		}
	}
}
