package ud08_02_java_POOv5.Jean_Pierre;

public class Clientes {
	private String nombre;
	private int edad;

	// Metodo constructor
	public Clientes(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// Metodo para mostrar informacion del objeto
	public void Mostrar() {
		System.out.println(nombre + "," + edad);
	}
}
