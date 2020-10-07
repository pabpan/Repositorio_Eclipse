package Ordenadores;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		int suma;
		int a, b, c;

		System.out.println("=======ENCENDER ORDENADORES=======\n");
		Ordenador ordenador1 = new Ordenador("I3", 16, 512, 300);
		ordenador1.encender_ordenador();
		System.out.print("Le cambio el procesador al Pc1 por un ");
		ordenador1.set_procesador("I10");
		System.out.println(ordenador1.get_procesador());
		Ordenador ordenador2 = new Ordenador("I5", 8, 256, 500);
		ordenador2.encender_ordenador();
		System.out.println("El procesador del Pc2 es un " + ordenador2.get_procesador());
		Ordenador ordenador3 = new Ordenador("I7", 32, 1024, 800);
		ordenador3.encender_ordenador();
		System.out.println("El procesador del Pc3 es un " + ordenador3.get_procesador());

		System.out.println("\n=======PRECIO ORDENADORES=======\n");
		System.out.println("Se han creado: " + Ordenador.num_ordenadores + " ordenadores.");
		a = ordenador1.get_precio();
		b = ordenador2.get_precio();
		c = ordenador3.get_precio();
		suma = ordenador1.get_precio() + ordenador2.get_precio() + ordenador3.get_precio();
		System.out.println("El precio total gastado es: " + suma + " €");

		ArrayList<String> ordenadores = new ArrayList<String>();
		ordenadores.add(ordenador1.get_ordenador());
		ordenadores.add(ordenador2.get_ordenador());
		ordenadores.add(ordenador3.get_ordenador());
		
		java.util.Iterator<String> iter = ordenadores.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		
//		for (int i = 0; i < ordenadores.size(); i++) {
//			System.out.println(ordenadores.get(i));
//		}
		
		System.out.println("\n=======ENTRAR EN INTERNET=======\n");
		ordenador1.navegar_internet();
		ordenador2.navegar_internet();
		ordenador3.navegar_internet();

		System.out.println("\n=======APAGAR ORDENADORES=======\n");
		System.out.println("Vamos a apagar los ordenadores");
		ordenador1.apagar_ordenador();
		System.out.print(" PC1\n");
		ordenador2.apagar_ordenador();
		System.out.print(" PC2\n");
		ordenador3.apagar_ordenador();
		System.out.print(" PC3\n");

	}

}