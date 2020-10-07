

public class Ejercicio5 {

	enum dias {
		Lunes, Martes, Miércoles, Jueves, Viernes, Sábados, Domingos;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Odios los " + dias.Lunes + ".");
		System.out.println("Los " + dias.Martes + " paso de la fase de negación a la fase de aceptación.");
		System.out.println("Cuando es "  + dias.Miércoles + " pienso que ya vamos por la mitad de la semana.");
		System.out.println("El previo del Viernes, el " + dias.Jueves + ", es mi día favorito de la semana.");
		System.out.println("El " + dias.Viernes + " suelo quedar con mis amigos para cenar.");
		System.out.println("Los " + dias.Sábados + " me levanto tarde y siempre desayuno tortitas.");
		System.out.println("Me deprimen los " + dias.Domingos + " porque pienso que mañana es " + dias.Lunes + ".");

	}

}
