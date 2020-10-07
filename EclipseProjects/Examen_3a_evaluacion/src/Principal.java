import java.io.*;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Perla[] lista_perlas = new Perla[3];
		Perla p1 = new Perla();
		Perla p2 = new Perla();
		Perla p3 = new Perla();
		lista_perlas[0] = p1;
		lista_perlas[1] = p2;
		lista_perlas[2] = p3;

		Collar collar1 = new Collar(lista_perlas, 12.34);
		System.out.println(collar1.toString());
		Magdalena magdalena1 = new Magdalena(190, "cuadrada", true);
		Magdalena magdalena2 = new Magdalena(83, "redonda", false);
		Napolitana napolitana1 = new Napolitana(210, "Crema");
		Napolitana napolitana2 = new Napolitana(332, "Chocolate");
		ListaDesayuno lista_desayuno = new ListaDesayuno();
		lista_desayuno.anyadir_bollo(magdalena1);
		lista_desayuno.anyadir_bollo(magdalena2);
		lista_desayuno.anyadir_bollo(napolitana1);
		lista_desayuno.anyadir_bollo(napolitana2);
		System.out.println(lista_desayuno.toString());
		
		File Archivo = new File("Examen.txt");

		try {
			Archivo.createNewFile();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			FileWriter Escribir = new FileWriter(Archivo);
			Escribir.write("--------------------\n");
			Escribir.write("------JOYERÍA-------\n");
			Escribir.write("--------------------\n");
			Escribir.write(collar1.toString());
			Escribir.write("--------------------\n");
			Escribir.write("------DESAYUNO------\n");
			Escribir.write("--------------------\n");
			Escribir.write(lista_desayuno.toString());
			Escribir.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
