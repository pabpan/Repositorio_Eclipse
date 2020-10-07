import java.util.*;

public class Flota {

	private String nombre_flota;
	
	private ArrayList<Nave> Lista_naves;

	public Flota(String nombre) {

		this.nombre_flota = nombre;
	}
	
	public void anyadir_nave(Nave nave) {
		
		Lista_naves.add(nave);
	}

	public String getNombre_flota() {
		return nombre_flota;
	}
}
