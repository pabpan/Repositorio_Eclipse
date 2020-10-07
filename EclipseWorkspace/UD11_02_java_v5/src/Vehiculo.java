
public class Vehiculo {

	protected String matricula;
	protected double velocidad;
	
	public Vehiculo (String matricula) {
		
		this.matricula = matricula;
		this.velocidad = 0;
	}
	
	public String toString() {
		return "Matrícula: " + this.matricula +", Velocidad: " + this.velocidad;
	}
	
	public void acelerar (double velocidad) throws Exception {
		this.velocidad = velocidad;
	}
	
}
