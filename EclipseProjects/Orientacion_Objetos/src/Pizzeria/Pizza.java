package Pizzeria;

import java.util.*;

public class Pizza {

	private String tamanyo;
	private String tipo;
	private String estado;
	public static int totalpedidos = 0;
	public static int totalservidos = 0;

	public Pizza(String tipo_entrada, String tamanyo_entrada) {
		tamanyo = tamanyo_entrada;
		tipo = tipo_entrada;
		estado = "pedida";
		totalpedidos++;

	}

	public String estado_pizza() {
		return "Pizza de tipo " + tipo + " y tamaño " + tamanyo + ". Estado: " + estado;
	}

	public void servir() {

		if (estado.equals("servida")) {
			System.out.println("Esta pizza ya se ha servido");

		} else {
			estado = "servida";
			totalpedidos--;
			totalservidos++;
		}
	}

}
