import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Vehiculo[] vehiculos = new Vehiculo[4];
		Remolque remolque1 = new Remolque(5000);

		Coche coche1 = new Coche("2490GBK", 4);
		Coche coche2 = new Coche("3890HBJ", 3);
		Camion camion1 = new Camion("1925GVD");
		camion1.pon_remolque(remolque1);
		Camion camion2 = new Camion("7894HUR");
		camion2.pon_remolque(remolque1);

		vehiculos[0] = coche1;
		vehiculos[1] = coche2;
		vehiculos[2] = camion1;
		vehiculos[3] = camion2;

		for (int i = 0; i < vehiculos.length; i++) {
			System.out.println(vehiculos[i].toString());
			System.out.println("**********************");
		}

		try {
			vehiculos[0].acelerar(120);
			vehiculos[1].acelerar(120);
			vehiculos[2].acelerar(90);
			vehiculos[3].acelerar(90);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Camion camion_aux = (Camion) vehiculos[3];
		camion_aux.quita_remolque();
		vehiculos[3] = camion_aux;

		for (int i = 0; i < vehiculos.length; i++) {
			System.out.println(vehiculos[i].toString());
			System.out.println("**********************");
		}
		try {
			vehiculos[2].acelerar(20);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
