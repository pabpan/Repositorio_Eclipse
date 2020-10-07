package Aerolineas;

import java.util.*;

public class Billete {

	Scanner teclado = new Scanner(System.in);

	private String origen, destino, dia_ida, dia_vuelta, billete, estado;

	private static int contador=1;
	int num_billete;
	
	public Billete(String origen, String destino, String dia_ida, String dia_vuelta) {

		this.origen = origen;
		this.destino = destino;
		this.dia_ida = dia_ida;
		this.dia_vuelta = dia_vuelta;

		this.billete = num_billete+": "+origen+"-"+destino+" IDA: "+dia_ida+" VUELTA: "+dia_vuelta;
		System.out.println("Billete comprado");
		estado="VIGENTE";
		
		num_billete=contador;
		contador++;
	}
	
	public String getBillete() {
		return num_billete+": "+origen+"-"+destino+" IDA: "+dia_ida+" VUELTA: "+dia_vuelta;
		
	}
	
	public String getEstado() {
		return estado;
	}
	
	public int getid() {
		return num_billete;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
