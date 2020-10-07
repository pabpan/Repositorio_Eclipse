import java.util.*;

public class Tripulante {
	
	private String nombre_tripulante;
	private int edad_tripulante;
	private String rango_tripulante;
	
	public Tripulante (String nombre, int edad, String rango){
		
		this.nombre_tripulante=nombre;
		this.edad_tripulante=edad;
		this.rango_tripulante=rango;
		
	}
	
	public String get_tripulante () {
		
		return rango_tripulante+" "+nombre_tripulante+" "+"("+edad_tripulante+")";
	}
	
	
}
