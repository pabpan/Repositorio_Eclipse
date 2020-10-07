import java.util.*;

public class Ejercicio87 {

	public static void main(String[] args) {

		Random aleatorio = new Random();

		int tamanyo_lista = aleatorio.nextInt(10) + 10;

		ArrayList<Integer> aleatorios = new ArrayList<Integer>();

		for (int i = 0; i < tamanyo_lista; i++) {
			aleatorios.add(aleatorio.nextInt(100));
		}

		int suma = 0, media = 0, maximo = 0, minimo = 0;

		for (int i = 0; i < aleatorios.size(); i++) {
			suma += aleatorios.get(i);

			if (maximo < aleatorios.get(i)) {
				maximo = aleatorios.get(i);
			}
			if (minimo > aleatorios.get(i)) {
				minimo = aleatorios.get(i);
			}
		}

		System.out.print(aleatorios+"\n\n");
		System.out.println("La suma total es "+suma);
		media = suma / tamanyo_lista;
		System.out.println("La media es " + media);
		System.out.println("El máximo es " + maximo);
		System.out.println("El mínimo es " + minimo);

	}

}
