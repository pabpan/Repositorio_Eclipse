public class Asignatura {
	
	private String nombre_asignatura;
	private int horas;
	private String libro;
	private String profesor;
	private String obligatoria;
	
	public Asignatura(String nombre_asignatura, int horas, String libro, String profesor) {
		
		this.nombre_asignatura=nombre_asignatura;
		this.horas=horas;
		this.libro=libro;
		this.profesor=profesor;
		
		if (nombre_asignatura.equals("Programación")) {
			this.obligatoria="Sí";
		}else {
			this.obligatoria="No";
		}
		
	}

	public void Datos_Asignatura() {
		
		System.out.println(nombre_asignatura + " de " + horas + " con el libro " + libro + " impartida por " + profesor + " y " + obligatoria + " es oblitoria.");
	}
	
	public String get_Asignatura() {
		
		return nombre_asignatura;
		
	}
}
