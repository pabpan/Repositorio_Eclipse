/*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 08/11/2019
 * DESC.: INSECTOS
*/

import java.util.*;


public class insectos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int casos, insectos, aracnidos, crustaceos, escalopendra, total=0, contador=0;
		int patas_insectos=6;
		int patas_aracnidos=8;
		int patas_crustaceos=10;
		int anillos_escalopendra;
		int patas_anillo_escalopendra=2;
		int v[];
		
		casos=teclado.nextInt();
		System.out.println();
		v=new int[casos];

		do {
			insectos=teclado.nextInt();
			aracnidos=teclado.nextInt();
			crustaceos=teclado.nextInt();
			escalopendra=teclado.nextInt();
			anillos_escalopendra=teclado.nextInt();
			total=(insectos*patas_insectos)+(aracnidos*patas_aracnidos)+(crustaceos*patas_crustaceos)+ (escalopendra*anillos_escalopendra*patas_anillo_escalopendra);
			v[contador]=total;
			contador++;
		}while (contador<casos);
		
		for (contador = 0; contador < v.length; contador++) {
			System.out.println(v[contador]);
			}
	
		teclado.close();
	}

}
