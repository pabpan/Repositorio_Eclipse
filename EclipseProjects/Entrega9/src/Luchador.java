import java.util.*;

public class Luchador {

	private int vida;
	private String nombre;

	public Luchador(String nombre) {
		this.nombre = nombre;
		this.vida = 100;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

}
