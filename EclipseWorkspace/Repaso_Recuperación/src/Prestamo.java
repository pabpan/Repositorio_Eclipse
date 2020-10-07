
public class Prestamo {

	private Libro libro_nuevo;
	private Alumno alumno_nuevo;

	public Prestamo(Libro libro_nuevo, Alumno alumno_nuevo) {

		this.libro_nuevo = libro_nuevo;
		this.alumno_nuevo = alumno_nuevo;
	}

	public Libro getLibro_nuevo() {
		return libro_nuevo;
	}

	public void setLibro_nuevo(Libro libro_nuevo) {
		this.libro_nuevo = libro_nuevo;
	}

	public Alumno getAlumno_nuevo() {
		return alumno_nuevo;
	}

	public void setAlumno_nuevo(Alumno alumno_nuevo) {
		this.alumno_nuevo = alumno_nuevo;
	}
	
	
}
