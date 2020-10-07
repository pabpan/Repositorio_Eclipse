public class Luchador {

	private int vida;
	private String nombre;
	
	public Luchador (String nombre, int vida) {
		
		this.nombre = nombre;
		this.vida=vida;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
