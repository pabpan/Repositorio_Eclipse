
public class Persona {

	private String nombre;
	private int dni;
	private int edad;
	protected String residencia;

	public Persona(String nombre, int dni, int edad, String residencia) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.residencia = residencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	public int anyos_jubilacion(int edad) {
		this.edad = edad;
		int anyos_necesarios = 0;
		int anyos_oficiales = 65;
		anyos_necesarios = (anyos_oficiales - this.edad);
		return anyos_necesarios;
	}

}
