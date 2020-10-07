
public class Cliente implements Interface_Cliente {

	private String nombre_cliente;
	private String telefono_cliente;

	public Cliente(String nombre_cliente, String telefono_cliente) {
		this.nombre_cliente = nombre_cliente;
		this.telefono_cliente = telefono_cliente;
	}

	public String getNombre() {
		return this.nombre_cliente;
	}
	
	
}