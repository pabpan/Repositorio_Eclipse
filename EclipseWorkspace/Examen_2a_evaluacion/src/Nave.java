import java.util.*;

public class Nave {
	
	private String nombre_nave;
	
	private ArrayList<Tripulante> Lista_tripulantes = new ArrayList<Tripulante>();
		
	public Nave (String nombre) {
		
		this.nombre_nave=nombre;
	}
	
	public void anyadir_tripulante(Tripulante t) {

		Lista_tripulantes.add(t);
	}
	
	public String getNombre_nave() {
		return nombre_nave;
	}
	
	public void recorrer_tripulantes() {
		Iterator iter = Lista_tripulantes.iterator();
		while (iter.hasNext()) {
			Tripulante t = (Tripulante)iter.next();
			System.out.println(t.get_tripulante());
		}
	}
	
}
