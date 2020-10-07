import java.util.ArrayList;

public class Pedido {
	
	private String nombre_cliente;
	private ArrayList<Pizza> lista_pizzas;
	private int identificador;
	private int precio_pedido;
	
	public Pedido(String nombre_cliente, ArrayList<Pizza> lista_pizzas, int identificador, int precio_pedido) {
		super();
		this.nombre_cliente = nombre_cliente;
		this.lista_pizzas = lista_pizzas;
		this.identificador = identificador;
		this.precio_pedido = precio_pedido;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public ArrayList<Pizza> getLista_pizzas() {
		return lista_pizzas;
	}

	public void setLista_pizzas(ArrayList<Pizza> lista_pizzas) {
		this.lista_pizzas = lista_pizzas;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getPrecio_pedido() {
		return precio_pedido;
	}

	public void setPrecio_pedido(int precio_pedido) {
		this.precio_pedido = precio_pedido;
	}
	
}
