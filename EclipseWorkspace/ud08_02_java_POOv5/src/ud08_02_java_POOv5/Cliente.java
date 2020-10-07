package ud08_02_java_POOv5;

import java.util.*;

public class Cliente {

	private String nombre;
	private int edad;

	public Cliente(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getCliente() {
		return nombre + "," + edad + " .";
	}

}
