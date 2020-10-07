import java.util.*;

public class Alumno {
	
	private String nombre;
	private String apellido1;
	private String dni;
	private String curso;
	private int edad;
	
	private ArrayList<Asignatura> Lista_Asignaturas = new ArrayList<Asignatura>();

	public Alumno(String nombre, String apellido1, String dni, String curso, int edad) {
		
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.dni=dni;
		this.curso=curso;
		this.edad=edad;
		
	}
	
	public void Datos_Alumno() {
		
		System.out.println(dni + ": " + nombre + " " + apellido1 + ", " + edad + " (" + curso + ")"); 
		
	}
	
//	OTRA FORMA DE HACER DATOS_ALUMNO	
//	public String Datos_Alumno_alternativo() {
//		
//		return dni + ": " + nombre + " " + apellido1 + ", " + edad + " (" + curso + ")";
//		
//	}
	
	public void Matricular(Asignatura As1) {
		
		Lista_Asignaturas.add(As1);
		System.out.println("El alumno " + nombre + " se ha matriculado de " + As1.get_Asignatura());
		
	}
	
	public int get_Edad_Alumno() {
		
		return edad;
		
	}
	
	public String get_Nombre_Alumno() {
		
		return nombre;
	}
}
