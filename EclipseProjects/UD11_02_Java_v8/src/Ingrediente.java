
public class Ingrediente implements Interface_Ingrediente {
	
	private String nombre_ingrediente;
	private int cantidad;
	
	Ingrediente (String nombre_ingrediente, int cantidad) {
		
		this.nombre_ingrediente=nombre_ingrediente;
		this.cantidad=cantidad;	
	}
	
	public String detalle_Ingrediente() {
		return "- " +this.nombre_ingrediente +", " + this.cantidad +" gramos.";
	}
}