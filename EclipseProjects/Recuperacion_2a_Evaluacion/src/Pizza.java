import java.util.Vector;

public class Pizza {
	
	private String nombre_pizza;
	private String[] lista_ingredientes;
	private int num_calorias;
	private int precio;
	
	public Pizza(String nombre_pizza, String[] lista_ingredientes2, int num_calorias, int precio) {
		super();
		this.nombre_pizza = nombre_pizza;
		this.lista_ingredientes = lista_ingredientes2;
		this.num_calorias = num_calorias;
		this.precio = precio;
	}

	public String getNombre_pizza() {
		return nombre_pizza;
	}

	public void setNombre_pizza(String nombre_pizza) {
		this.nombre_pizza = nombre_pizza;
	}

	public String[] getLista_ingradientes() {
		return lista_ingredientes;
	}

	public void setLista_ingredientes(String[] lista_ingredientes) {
		this.lista_ingredientes = lista_ingredientes;
	}

	public int getNum_calorias() {
		return num_calorias;
	}

	public void setNum_calorias(int num_calorias) {
		this.num_calorias = num_calorias;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
