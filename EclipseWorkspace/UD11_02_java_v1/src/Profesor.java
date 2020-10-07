
public class Profesor extends Persona {
	
	private int sueldo;
	private String centro_imparte;
	private String lugar_trabajo;
	
	public Profesor (int sueldo, String centro_imparte, String lugar_trabajo, String nombre, int dni, int edad, String residencia) {
		
		super(nombre, dni, edad, residencia);
		this.sueldo=sueldo;
		this.centro_imparte =centro_imparte;
		this.lugar_trabajo=lugar_trabajo;	
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getCentro_imparte() {
		return centro_imparte;
	}

	public void setCentro_imparte(String centro_imparte) {
		this.centro_imparte = centro_imparte;
	}

	public String getLugar_trabajo() {
		return lugar_trabajo;
	}

	public void setLugar_trabajo(String lugar_trabajo) {
		this.lugar_trabajo = lugar_trabajo;
	}
	
	public boolean coincide_centro(String centro_imparte, String residencia) { 
		
		boolean coincide=false;
		this.centro_imparte=centro_imparte;
		
		if (this.centro_imparte.equals(this.residencia)) {
			coincide = true;
		}
		
		return coincide;
	}

}
