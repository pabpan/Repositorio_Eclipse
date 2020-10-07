import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		int rounds = 1;
		int contador_batallas = 1;
		int contador_victorias1 = 0;
		int contador_victorias2 = 0;
		int golpe = 0;
		Luchador ganador;

		Luchador luchador1 = new Luchador("Ryu", 100);
		Luchador luchador2 = new Luchador("Ken", 100);
		Escenario escenario1 = new Escenario("El Templo de Pekín");

		while (rounds <= 3 && contador_victorias1 <= 2 && contador_victorias2 <= 2) {

			if (luchador1.getVida() == 100 || luchador2.getVida() == 100) {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("ROUND " + contador_batallas + "... FIGHT!!");
				System.out.println("Comienza la pelea entre " + luchador1.getNombre() + " y " + luchador2.getNombre()
						+ " en el " + escenario1.getNombre());
				System.out.println("-----------------------------------------------------------------");
			}

			golpe = aleatorio.nextInt(50);

			if (luchador1.getVida() < 0) {
				luchador1.setVida(0);
			}

			System.out.println(luchador1.getNombre() + " golepa a " + luchador2.getNombre() + " con una instendidad de "
					+ golpe + "     " + luchador1.getNombre() + " " + luchador1.getVida() + " - "
					+ luchador2.getNombre() + " " + (luchador2.getVida() - golpe));
			luchador2.setVida(luchador2.getVida() - golpe);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (luchador2.getVida() < 0) {
				luchador2.setVida(0);
			}
			golpe = aleatorio.nextInt(50);

			System.out.println(luchador2.getNombre() + " golepa a " + luchador1.getNombre() + " con una instendidad de "
					+ golpe + "     " + luchador1.getNombre() + " " + (luchador1.getVida() - golpe) + " - "
					+ luchador2.getNombre() + " " + (luchador2.getVida()));
			luchador1.setVida(luchador1.getVida() - golpe);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (luchador1.getVida() <= 0) {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("El GANADOR de este round es: " + luchador2.getNombre());
				System.out.println("-----------------------------------------------------------------");
				contador_batallas++;
				contador_victorias2++;
				luchador1.setVida(100);
				luchador2.setVida(100);
				rounds++;
			}

			if (luchador2.getVida() <= 0) {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("El GANADOR de este round es: " + luchador1.getNombre());
				System.out.println("-----------------------------------------------------------------");
				contador_batallas++;
				contador_victorias1++;
				luchador2.setVida(100);
				luchador1.setVida(100);
				rounds++;
			}

		}

		if (contador_victorias1 > contador_victorias2) {
			ganador = luchador1;
		} else {
			ganador = luchador2;
		}

		System.out.println("El ganador de la pelea ha sido: " + ganador.getNombre());

		Luchador luchador3 = new Luchador("Mr. Bison", 100);
		Escenario escenario2 = new Escenario("Bison Mansion");
		ganador.setVida(100);
		contador_victorias1 = 0;
		contador_victorias2 = 0;
		contador_batallas = 1;
		rounds = 1;

		while (rounds <= 3 && contador_victorias1 <= 2 && contador_victorias2 <= 2) {

			if (ganador.getVida() == 100 || luchador3.getVida() == 100) {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("ROUND " + contador_batallas + "... FIGHT!!");
				System.out.println("Comienza la pelea entre " + ganador.getNombre() + " y " + luchador3.getNombre()
						+ " en el " + escenario2.getNombre());
				System.out.println("-----------------------------------------------------------------");
			}

			golpe = aleatorio.nextInt(50);

			if (ganador.getVida() < 0) {
				ganador.setVida(0);
			}

			System.out.println(ganador.getNombre() + " golepa a " + luchador3.getNombre() + " con una instendidad de "
					+ golpe + "     " + ganador.getNombre() + " " + ganador.getVida() + " - " + luchador3.getNombre()
					+ " " + (luchador3.getVida() - golpe));
			luchador3.setVida(luchador3.getVida() - golpe);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (luchador3.getVida() < 0) {
				luchador3.setVida(0);
			}
			golpe = aleatorio.nextInt(50);

			System.out.println(luchador3.getNombre() + " golepa a " + ganador.getNombre() + " con una instendidad de "
					+ golpe + "     " + ganador.getNombre() + " " + (ganador.getVida() - golpe) + " - "
					+ luchador3.getNombre() + " " + (luchador3.getVida()));
			ganador.setVida(ganador.getVida() - golpe);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (ganador.getVida() <= 0) {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("El GANADOR de este round es: " + luchador3.getNombre());
				System.out.println("-----------------------------------------------------------------");
				contador_batallas++;
				contador_victorias2++;
				ganador.setVida(100);
				ganador.setVida(100);
				rounds++;
			}

			if (luchador3.getVida() <= 0) {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("El GANADOR de este round es: " + ganador.getNombre());
				System.out.println("-----------------------------------------------------------------");
				contador_batallas++;
				contador_victorias1++;
				luchador3.setVida(100);
				ganador.setVida(100);
				rounds++;
			}

		}

		if (contador_victorias1 > contador_victorias2) {
			ganador = ganador;
		} else {
			ganador = luchador3;
		}

		System.out.println("El ganador de la pelea ha sido: " + ganador.getNombre());

	}

}
