/*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 02/10/2019
 * DESC.: NÚMERO SECRETO
 */

public class Ejercicio13 {

	public static void main(String[] args) {

		/*DECLARAMOS LAS VARIABLES*/
		int entrada=9, palomitas=6;
		double refresco, palomitas_dulces, total;
		double dinero_patricia, dinero_elena, dinero_oscar;
				
		/*REALIZAMOS LAS OPERACIONES*/
		
		refresco=palomitas/2;
		palomitas_dulces=Math.pow(refresco, 3);
		dinero_patricia=entrada+palomitas+refresco+palomitas_dulces;
		dinero_elena=dinero_patricia;
		dinero_oscar=entrada+refresco;
		total=dinero_patricia+dinero_elena+dinero_oscar;
		
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Patricia ha gastado "+dinero_patricia+ "€.\n\n");
		System.out.println("Elena ha gastado "+dinero_elena+ "€.\n\n");
		System.out.println("Óscar ha gastado "+dinero_oscar+ "€.\n\n");
		System.out.println("En total la broma les ha salido por " +total+ " Euros.");
	
	}

}
