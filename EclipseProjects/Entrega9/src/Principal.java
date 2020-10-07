
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Luchador L1 = new Luchador("Ryu");
		Luchador L2 = new Luchador("Ken");
		Luchador ganador;
		Luchador L3 = new Luchador("MrBison");
		Escenario E1 = new Escenario("Templo de Pekín", L1, L2);
		ganador=E1.Pelea(L1, L2);
		Escenario E2 = new Escenario("Bison Mansion", ganador, L3);
		ganador=E2.Pelea(ganador, L3);

	}
}
