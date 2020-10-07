
import java.util.*;

public class Suma_de_digitos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String cadena;
		int suma = 0, separado = 0;
		int salida;
		
		do {
			cadena = teclado.nextLine();
			salida = Integer.parseInt(cadena);

			if (salida > 0) {

				for (int i = 0; i < cadena.length(); i++) {
					separado = Character.getNumericValue(cadena.charAt(i));
					suma += separado;
					
					if (i==(cadena.length()-1)) {
						System.out.print(separado+" = "+ suma);
					}else {
						System.out.print(separado+" + ");
					}
				}
			}
			System.out.println();
		} while (salida > 0);
	}

}
