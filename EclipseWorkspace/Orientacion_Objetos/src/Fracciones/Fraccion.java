package Fracciones;

import java.util.*;

public class Fraccion {

	Scanner teclado = new Scanner(System.in);

	private int numerador, denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public Fraccion invertir() {
		Fraccion invertida = new Fraccion(this.denominador, this.numerador);
		return invertida;
	}

	public void escribir_fraccion() {
		System.out.println(numerador + "/" + denominador);
	}

	public Fraccion multiplicar(Fraccion f) {
		Fraccion multiplicacion = new Fraccion(0, 0);
		int mult1, mult2;
		mult1 = this.numerador * f.getNumerador();
		mult2 = this.denominador * f.getDenominador();
		multiplicacion.setNumerador(mult1);
		multiplicacion.setDenominador(mult2);
		return multiplicacion;
	}

	public Fraccion dividir(Fraccion f) {
		Fraccion division = new Fraccion((this.numerador*f.getDenominador()),(this.denominador*f.getNumerador()));
		return division;
	}
}
