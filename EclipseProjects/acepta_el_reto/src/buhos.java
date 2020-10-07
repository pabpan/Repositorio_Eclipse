import java.util.*;

public class buhos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String palindromo, cadena_normal, cadena_reves="";
		String frase="";

		System.out.println("frase");
		frase = teclado.nextLine();
		
		String letras[] = new String[frase.length()];

		for (int i = 0; i < letras.length; i++) {
			
			/*CADENA NORMAL*/
			
			letras[i]=Character.toString(frase.charAt(i));

		}
		
		cadena_normal=frase;

		/*CADENA INVERTIDA*/
		
        for (int i = cadena_normal.length()-1; i>=0; i--){

            cadena_reves += cadena_normal.charAt(i);

        }
        
        /*COMPARARLA*/
        
        if (cadena_normal.contentEquals(cadena_reves)) {
        	
        	System.out.println("Es palindromo");
        }

//		while (!frase.equals("XXX")) {
//
//			
//		}

	}

}
