import java.util.*;

public class Escenario {

	private Luchador L1, L2;
	private String nombre;
	private String escenario;

	public Escenario(String nombre, Luchador L1, Luchador L2) {

		this.nombre = nombre;
		this.L1 = L1;
		this.L2 = L2;
	}

	public Luchador Pelea(Luchador L1, Luchador L2) {
		Luchador ganador = null;
		int rounds_L1 = 0, rounds_L2 = 0, golpe1 = 0, golpe2 = 0, rounds_ganados = 1;

		Random aleatorio = new Random();

		System.out.println("Comienza la pelea entre " + L1.getNombre() + " y " + L2.getNombre() + " en " + this.nombre);

		int vidaL1;
		int vidaL2;

		while (rounds_L1 <= 2 && rounds_L2 <= 2 && rounds_ganados < 4) {

			System.out.println("ROUND " + (rounds_ganados) + " FIGHT!!!");

			L1.setVida(100);
			L2.setVida(100);

			while (L1.getVida() > 0 && L2.getVida() > 0) {

				golpe1 = aleatorio.nextInt(50) + 1;

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				vidaL1 = L1.getVida();
				vidaL2 = L2.getVida() - golpe1;

				if (vidaL2 <= 0) {
					vidaL2 = 0;
					L2.setVida(0);
					ganador = L1;
					rounds_L1++;
					rounds_ganados++;
				} else {
					L2.setVida(vidaL2);
				}

				System.out.println(L1.getNombre() + " golpea a " + L2.getNombre() + " con una" + " intensidad de "
						+ golpe1 + "     " + L1.getNombre() + ":" + L1.getVida() + " - " + L2.getNombre() + ":"
						+ L2.getVida());
				if (L2.getVida() > 0) {
					golpe2 = aleatorio.nextInt(50) + 1;

					vidaL2 = L2.getVida();
					vidaL1 = L1.getVida() - golpe2;

					if (vidaL1 <= 0) {
						vidaL1 = 0;
						L1.setVida(0);
						ganador = L2;
						rounds_L2++;
						rounds_ganados++;
					} else {
						L1.setVida(vidaL1);
					}

					 try {
					 Thread.sleep(1000);
					 } catch (InterruptedException e) {
					 e.printStackTrace();
					 }

					System.out.println(L2.getNombre() + " golpea a " + L1.getNombre() + " con una" + " intensidad de "
							+ golpe2 + "     " + L1.getNombre() + ":" + L1.getVida() + " - " + L2.getNombre() + ":"
							+ L2.getVida());
				}
			}
			System.out.println("Gana " + ganador.getNombre());

		}
		return ganador;
	}

}