import java.util.*;

public class Principal {

	private static ArrayList<Pizza> Lista_Pizzas = new ArrayList<Pizza>();
	private static ArrayList<Pedido> Lista_Pedidos = new ArrayList<Pedido>();
	private static ArrayList<String> Lista_Clientes = new ArrayList<String>();
	private static ArrayList<Pizza> Lista_Pizzas_Pedido = new ArrayList<Pizza>();
	static int motos_restaurante = 0;
	static int total_motos = 0;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		/*---------------------------------------- CAPTURAR EXCEPCIONES EN EL MENÚ -*/
		try {
			boolean exit = false;
			System.out.println("¿De cuantas motos de reparto consta el establecimiento?");
			motos_restaurante = teclado.nextInt();
			total_motos = motos_restaurante;
			int opcion = 0;
			while (exit == false) {
				if (total_motos < 0 && motos_restaurante > total_motos) {
					System.out.println("Tu pedido no se puede atender, no hay motos libres!");
				} else {
					Mostrar_Menu();
				}
				opcion = teclado.nextInt();
				teclado.nextLine();
				switch (opcion) {
				case 1:
					Alta_Pizza(Lista_Pizzas);
					break;
				case 2:
					Alta_Cliente();
					break;
				case 3:
					Hacer_Pedido(Lista_Pedidos);
					break;
				case 4:
					Regreso_Repartidor();
					break;
				case 5:
					Listar_Pedidos(Lista_Pedidos);
					break;
				case 6:
					Mostrar_Salir();
					exit = true;
					break;
				default:
					/*---------------------------------------- PARA CUALQUIER OPCIÓN DIFERENTE A LAS DEL MENÚ -*/
					System.out.println("\n*****************************");
					System.out.println("* ¡ELIGE UNA OPCIÓN VÁLIDA! *");
					System.out.println("*****************************\n");
					break;
				}
			}
			/*---------------------------------------- CAPTURAR EXCEPCIÓN DE INTRODUCIR UN CARÁCTER -*/
		} catch (InputMismatchException e) {
			System.out.println("\n*******************************************");
			System.out.println("* ¡La opción introducida no es un número! *");
			System.out.println("*     SE PROCEDE A CERRAR EL PROGRAMA     *");
			System.out.println("*******************************************\n");
		}
	}

	/*---------------------------------------- ALTA PIZZA -*/
	private static void Alta_Pizza(ArrayList<Pizza> Lista_Pizzas) {
		Scanner teclado = new Scanner(System.in);
		int contador_pizzas = 0;
		int numero_ingredientes = 0;
		int contador_ingredientes = 1;
		String nombre_ingrediente;
		int calorias_pizza = 0;
		int precio_pizza = 0;

		System.out.println("Creemos una pizza nueva!...");
		System.out.println("Introduzca nombre de la nueva pizza:");
		String nombre_pizza = teclado.nextLine();
		System.out.println("Introduzca numero de ingredientes:");
		numero_ingredientes = teclado.nextInt();
		teclado.nextLine();

		String lista_ingredientes[] = new String[numero_ingredientes];

		for (int i = 0; i < numero_ingredientes; i++) {
			System.out
					.println("Introduzca ingrediente " + contador_ingredientes + " de la pizza " + nombre_pizza + ":");
			lista_ingredientes[i] = teclado.nextLine();
			contador_ingredientes++;
		}

		for (int i = 0; i < lista_ingredientes.length; i++) {
			String[] palabra = lista_ingredientes[i].split(",");
			for (int j = 0; j < palabra.length; j++) {
				if (palabra[j].equals("a") || palabra[j].equals("e") || palabra[j].equals("i") || palabra[j].equals("o")
						|| palabra[j].equals("u")) {
					calorias_pizza = calorias_pizza + 10;
				} else {
					precio_pizza += 2;
				}
			}
		}

		Pizza pizza = new Pizza(nombre_pizza, lista_ingredientes, calorias_pizza, precio_pizza);
		Lista_Pizzas.add(pizza);

		contador_pizzas++;
		System.out.println("Pizza " + pizza.getNombre_pizza() + " creada, tiene " + pizza.getNum_calorias()
				+ " calorías y cuesta " + pizza.getPrecio() + " €.");
		System.out.println("Los ingredientes que lleva la pizza son los siguientes:");

		for (int i = 0; i < lista_ingredientes.length; i++) {
			System.out.println("     - " + lista_ingredientes[i]);
			;
		}
	}

	/*---------------------------------------- ALTA CLIENTE -*/
	private static void Alta_Cliente() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca nombre del nuevo cliente:");
		String nombre_cliente = teclado.nextLine();
		Lista_Clientes.add(nombre_cliente);
	}

	/*---------------------------------------- HACER PEDIDO -*/
	private static void Hacer_Pedido(ArrayList<Pedido> Lista_Pedidos) {
		Scanner teclado = new Scanner(System.in);
		int identificador=0000;
		int precio_total=0;

		System.out.println("Introduzca nombre de cliente:");
		String nombre_cliente = teclado.nextLine();

		Iterator iter = Lista_Clientes.iterator();
		String cliente_aux;
		while (iter.hasNext()) {
			cliente_aux=(String)iter.next();
			if (cliente_aux.equals(nombre_cliente)) { 	
				System.out.println("Introduzca nombre de pizza o 'salir' para finalizar el pedido:");
				String nombre_pizza = teclado.nextLine();
				nombre_pizza.toLowerCase();
				while (!nombre_pizza.equals("salir")) {
					Iterator iter1 = Lista_Pizzas.iterator();
					Pizza pizza_aux;
					while (iter1.hasNext()) {
						pizza_aux = (Pizza) iter1.next();
						if (pizza_aux.getNombre_pizza().equals(nombre_pizza)) {							
							Lista_Pizzas_Pedido.add(pizza_aux);		
							precio_total+=pizza_aux.getPrecio();
							System.out.println("Una pizza "+pizza_aux.getNombre_pizza()+" ha sido añadida a tu pedido.");
							identificador++;
							System.out.println("Una moto se va a entregar el pedido numero "+identificador+"!");
							Pedido nuevo_pedido = new Pedido(nombre_cliente, Lista_Pizzas_Pedido, identificador, precio_total);
							Lista_Pedidos.add(nuevo_pedido);				
						} else {
							System.out.println("No existe ninguna pizza que se llame " + nombre_pizza + "!");
						}
					}
					System.out.println("Introduzca nombre de pizza o 'salir' para finalizar el pedido:");
					nombre_pizza = teclado.nextLine();
				}
				
			} else {
				System.out.println("El cliente de nombre " + nombre_cliente + " no existe!");
				System.out.println("Introduzca nombre de cliente:");
				nombre_cliente = teclado.nextLine();
			}
		}

	}

	/*---------------------------------------- REGRESO REPARTIDOR -*/
	private static void Regreso_Repartidor() {
		total_motos=total_motos-1;
		if (total_motos > 0) {
			System.out.println("Ha regresado un motorista. Ahora tienes disponible/s "+total_motos+" moto/s.");
		} else {
			System.out.println("Y están todas las motos en la tienda");
		}
	}

	/*---------------------------------------- LISTAR PEDIDOS -*/
	private static void Listar_Pedidos(ArrayList<Pedido> Lista_pedidos) {
		Scanner teclado = new Scanner(System.in);
		int total_pedido = 0;
		int total_caja = 0;
		
		Iterator iter = Lista_pedidos.iterator();
		Pedido pedido_aux;
		while (iter.hasNext()) {
			pedido_aux=(Pedido)iter.next();
			System.out.println("Pedido número "+pedido_aux.getIdentificador()+" entregado a "+pedido_aux.getNombre_cliente()+":");		
			Iterator iter1 = Lista_Pizzas_Pedido.iterator();
			Pizza pizza_aux;
			while (iter1.hasNext()) {
				pizza_aux = (Pizza) iter1.next();
				System.out.println("     - "+pizza_aux.getNombre_pizza()+"......."+pizza_aux.getPrecio()+"€.");	
				total_pedido+=pizza_aux.getPrecio();
			}
			System.out.println("TOTAL PEDIDO "+pedido_aux.getIdentificador()+": "+total_pedido+"€.");
			total_caja+=total_pedido;
		}
		
		System.out.println("IMPORTE TOTAL EN LA CAJA....."+total_caja+"€.");
				
	}

	/*---------------------------------------- SALIR DEL PROGRAMA -*/
	private static void Mostrar_Salir() {
		System.out.println("\n************************************************");
		System.out.println("* Gracias por venir a la Pizzeria di Guiseppe! *");
		System.out.println("************************************************\n");
	}

	/*---------------------------------------- MENÚ PRINCIPAL -*/
	private static void Mostrar_Menu() {
		System.out.println("*****************************************");
		System.out.println("* BENVENUTTI A LA PIZZERIA DI GUISEPPE! *");
		System.out.println("*****************************************\n");
		System.out.println("1-Dar de alta una pizza en el menú\n" + "2-Dar de alta un cliente\n" + "3-Hacer un pedido\n"
				+ "4-Regreso del repartidor\n" + "5-Listar pedidos\n" + "6-Salir");
		System.out.println("\n*****************************************\n");
		System.out.print("Introduce una opción --> ");
	}

}
