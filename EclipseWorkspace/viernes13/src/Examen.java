import java.util.*;

public class Examen {
	
	private Alumno alumno;
	private Asignatura asignatura;
	private int nota;
	private String calificacion;
	
	public Examen (Alumno alumno, Asignatura asignatura, int nota) {
		
		this.alumno=alumno;
		this.asignatura=asignatura;
		this.nota=nota;
		if (this.nota < 5) {
			this.calificacion = "SUSPENDIDO";
		}else {
			this.calificacion = "APROVADO";
		}
		
	}
	
	public Alumno get_Datos_Alumno() {
		
		return alumno;
		
	}
	
	public Asignatura get_Datos_Asignatura(){
		
		return asignatura;
	}
	
	public int get_Nota () {
		
		return nota;
		
	}
	
	public String get_Calificacion() {
		
		return calificacion;
		
	}

}
