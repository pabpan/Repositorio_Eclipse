
public class Alumno {

	private String dni;
	private String nombre_alumno;
	private int edad;

	public Alumno(String dni, String nombre_alumno, int edad) {

		this.dni=dni;
		this.nombre_alumno=nombre_alumno;
		this.edad=edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre_alumno() {
		return nombre_alumno;
	}

	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
