import java.util.*;

public class Mesa implements Interface_Mesa {

	private int num_mesa;
	private int num_personas;
	private String estado = "LIBRE";
	private String ubicacion;
	private ArrayList<Plato> lista_platos = new ArrayList<Plato>();
	private int contador = 0;

	public Mesa(int num_mesa, String ubicacion) {
		this.num_mesa = num_mesa;
		this.ubicacion = ubicacion;
	}

	public String obtenerDatosMesa() {
		return "(" + this.num_mesa + ", " + this.num_personas + ", " + this.ubicacion + ", " + this.estado + ")";
	}

	public int getnumMesa() {
		return this.num_mesa;
	}

	public void liberarMesa() {
		this.estado = "LIBRE";
		if (this.estado.equals("LIBRE")) {
			this.num_personas = 0;
		} else {
			this.num_personas=num_personas;
		}
	}

	public void ocuparMesa() {
		this.estado = "OCUPADA";
		contador++;
	}

	public void setNum_personas(int num_personas) {
		this.num_personas = num_personas;
	}

	public void pedirPlato(Plato p) {
		lista_platos.add(p);
	}

	public void detalle_platos() {
		Iterator iter = lista_platos.iterator();
		Plato plato_aux = null;
		while (iter.hasNext()) {
			plato_aux = (Plato) iter.next();
			System.out.println(plato_aux.getNombre());
		}
	}

	public double calcular_factura() {
		double suma = 0.0;

		Iterator iter = lista_platos.iterator();
		Plato plato_aux = null;
		while (iter.hasNext()) {
			plato_aux = (Plato) iter.next();
			suma = suma + plato_aux.getPrecio();
		}
		return suma;
	}

	@Override
	public void pedirPalo(Plato p) {
		// TODO Auto-generated method stub
		
	}
}
