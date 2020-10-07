
public class Profesional {
	
	private String nombre;
	private int edad;
	private int num_oscars;
	private String tipo;
	static int numactores=0;
	static int numdirectores=0;
	static int numproductores=0;

	
	public Profesional(String tipo, String nombre, int edad, int num_oscars) {
		this.nombre=nombre;
		this.tipo = tipo;
		this.num_oscars = num_oscars;
		this.edad = edad;
		
		if (tipo.equals("Actor")){
			numactores++;
		}
		
		if (tipo.equals("Director")) {
			numdirectores++;
		}
		
		if (tipo.equals("Productor")) {
			numproductores++;
		}
	}
	
	public int get_numoscars() {
		return num_oscars;
	}
	
	public String get_nombre() {
		return nombre;
	}
	
	public String get_tipo() {
		return nombre;
	}
	

}
