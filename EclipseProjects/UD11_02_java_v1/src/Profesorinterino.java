
public class Profesorinterino {

	private String tipo_baja;
	private int dias_baja;

	public Profesorinterino(String tipo_baja, int dias_baja) {

		this.tipo_baja = tipo_baja;
		this.dias_baja = dias_baja;
	}

	public String getTipo_baja() {
		return tipo_baja;
	}

	public void setTipo_baja(String tipo_baja) {
		this.tipo_baja = tipo_baja;
	}

	public int getDias_baja() {
		return dias_baja;
	}

	public void setDias_baja(int dias_baja) {
		this.dias_baja = dias_baja;
	}

	public int meses_trabajo(int dias_baja) { 

		int mes = 30;
		int duracion_curso = 250;
		int duracion_total = 0;
		this.dias_baja = dias_baja;

		duracion_total = (duracion_curso - dias_baja / mes);

		return duracion_total;
	}

}
