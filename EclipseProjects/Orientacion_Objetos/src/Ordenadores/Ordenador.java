package Ordenadores;

public class Ordenador {

	private String procesador;
	private int ram;
	private int disco;
	static int num_ordenadores=0;
	private int precio=0;

	// MÉTODO CONSTRUCTOR

	public Ordenador (String proc_entrada, int ram_entrada, int disco_entrada, int precio) {
		procesador=proc_entrada;
		ram=ram_entrada;
		disco=disco_entrada;
		num_ordenadores++;
		this.precio=precio;
	}

	public void encender_ordenador() {
		System.out.println("Encendemos el ordenador con procesador: " + procesador + " y" + " memoria: " + ram
				+ " Gb y disco de " + disco + " Gb."+precio+" €.");
	}

	public void navegar_internet() {
		System.out.println("Navego por internet");
	}

	public void apagar_ordenador() {
		System.out.print("Apago el ordenador");
	}
	public String get_procesador() {
		return procesador;
	}
	public void set_procesador(String proc_entrada) {
		procesador=proc_entrada;
	}
	public int get_precio() {
		return precio;
	}
	public String get_ordenador() {
		return ("Procesador: " + procesador + " ," + " memoria: " + ram
				+ " Gb , disco de " + disco + " Gb -> "+precio+" €.");		
	}

}
