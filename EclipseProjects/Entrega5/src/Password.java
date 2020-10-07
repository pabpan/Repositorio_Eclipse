 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 13/11/2019
 * DESC.: PASSWORD
 */

import java.util.*; 

public class Password {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//DECLARAMOS LAS VARIABLES
		String password, arroba="@";
		//VARIABLE ERROR PARA EL BUCLE
		int error; 
		//VARIABLES PARA COMPROBAR LOS FOR
		int minusculas, mayusculas, digitos; 
				
		System.out.println("El password ha de tener las siguientes restricciones:"
				+ "1.- Al menos 8 caracteres"
				+ "2.- Al menos la mitad del password ha de estar en minúsuclas"
				+ "3.- Al menos dos mayúsculas"
				+ "4.- al menos 3 números"
				+ "5.- No incluis el carácter @");		
		
		do {
		//VARIABLES PARA COMPROBAR LOS FOR	
		error=0;
		minusculas=0;
		mayusculas=0;
		digitos=0;
		
		System.out.printf("\nIntroduzca su password: ");
		password=teclado.nextLine();

		//REALIZAMOS LAS OPERACIONES
		
		for (int i = 0; i < password.length(); i++) {
			
			if (Character.isLowerCase(password.charAt(i))) {
				minusculas++;}
		}
		
		for (int j = 0; j < password.length(); j++) {
			
			if (Character.isUpperCase(password.charAt(j))) {
				mayusculas++;}
		}
		
		for (int k = 0; k < password.length(); k++) {
			
			if (Character.isDigit(password.charAt(k))) {
				digitos++;}
		
		}
		
		if (password.length()<8) {
			System.out.println("El tamaño del password ha de ser, al menos, 8 caracteres y el suyo es de "+password.length());
			error++;
			}
		if (minusculas<password.length()/2) {
			System.out.println("Debe tener la mitad en minúsculas");
			error++;
			}
	
		if (mayusculas<2) {
			System.out.println("Debe contener al menos 2 mayúsculas");
			error++;
		}
		if (digitos<3) {
			System.out.println("Debe contener al menos 3 dígitos");
			error++;
		}
		if (password.indexOf(arroba) > -1){
			System.out.println("La contraseña no puede contener el símbolo @");
			error++;
		}	
		
		}while (error!=0);
		
	 System.out.println("LA CONTRASEÑA ES CORRECTA");
	 
	 teclado.close();
	}
}
