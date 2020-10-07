package Pizzeria;

public class Principal {

	public static void main(String[] args) {

		Pizza p1 = new Pizza("margarita", "mediana");
		System.out.println(p1.estado_pizza());
		Pizza p2 = new Pizza("hawaiana", "familiar");
		System.out.println(p2.estado_pizza());

		System.out.println(Pizza.totalpedidos);
		
		p1.servir();
		System.out.println(p1.estado_pizza());
		p1.servir();

		System.out.println(Pizza.totalpedidos);
		System.out.println(Pizza.totalservidos);
	}

}
