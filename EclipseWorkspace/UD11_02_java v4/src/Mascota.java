
public abstract class Mascota {
	
	protected String nombre;
	protected String tipo;


	public Mascota(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void hacer_sonido();
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
