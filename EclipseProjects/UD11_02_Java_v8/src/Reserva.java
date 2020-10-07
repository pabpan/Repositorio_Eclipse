import java.util.*;
public class Reserva {

	private String fecha_reserva;
	private int hora_reserva;
	private int numero_personas_reserva;
	private Mesa mesa_asignada_cliente;
	private Cliente cliente_realiza_reserva;
	private ArrayList<Reserva> lista_reservas = new ArrayList<Reserva>();

	public Reserva(String fecha_reserva, int hora_reserva, int numero_personas_reserva, Mesa mesa_asignada_cliente,
			Cliente cliente_realiza_reserva) {

		this.fecha_reserva = fecha_reserva;
		this.hora_reserva = hora_reserva;
		this.numero_personas_reserva = numero_personas_reserva;
		this.mesa_asignada_cliente = mesa_asignada_cliente;
		this.cliente_realiza_reserva = cliente_realiza_reserva;

		mesa_asignada_cliente.setNum_personas(numero_personas_reserva);
		mesa_asignada_cliente.ocuparMesa();
	}	
}