package Cafeteria;

public class Cafetera {

	int cantidad_actual;
	int capacidad_máxima;

	public Cafetera(int capacidad_máxima) {
		this.capacidad_máxima = capacidad_máxima;
		this.cantidad_actual = 0;
	}

	public void llenar_cafetera() {

		cantidad_actual = capacidad_máxima;
		System.out.println("La cafetera está llena, hay disponibles: " + cantidad_actual + " cl.");
	}

	public void servir_taza(int cantidad_solicitada) {

		if (cantidad_actual == 0) {
			System.out.println("Lo siento, la cafetera está vacía");
		} else {

			if (cantidad_actual < cantidad_solicitada) {

				System.out.println("Lo siento, solo te he podido servir " + cantidad_actual + " cl.");
				cantidad_actual = 0;
			} else {
				System.out.println("Servimos una taza de " + cantidad_solicitada + "cl. y quedan en la cafetera "
						+ (cantidad_actual - cantidad_solicitada) + " cl.");
				cantidad_actual -= cantidad_solicitada;
			}
		}
	}

	public void vaciar_cafetera() {
		cantidad_actual = 0;
		System.out.println("Cafetera vacía");
	}

	public void agregar_cafe(int cantidad_solicitada) {

		if (cantidad_actual == capacidad_máxima) {
			System.out.println("La cafetera está llena, hay disponibles: " + cantidad_actual + " cl.");
		} else {
			if (cantidad_solicitada > capacidad_máxima) {
				System.out.println("La cantidad actual es: " + cantidad_actual + " cl. en una cafetera de "
						+ capacidad_máxima + " cl. No se puede agregar " + cantidad_solicitada
						+ " porque desbordaría la cafetera");
			} else {
				cantidad_actual += cantidad_solicitada;
				System.out.println("Agregamos " + cantidad_solicitada + " cl. y quedan en la cafetera "
						+ cantidad_actual + " cl.");
			}
		}

	}

	public int getCantidad_actual() {
		return cantidad_actual;
	}

	public void setCantidad_actual(int cantidad_actual) {
		this.cantidad_actual = cantidad_actual;
	}

	public int getCapacidad_máxima() {
		return capacidad_máxima;
	}

	public void setCapacidad_máxima(int capacidad_máxima) {
		this.capacidad_máxima = capacidad_máxima;
	}

}
