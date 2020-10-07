 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 02/10/2019
 * DESC.: NÚMERO SECRETO
 */

public class Ejercicio12 {

	public static void main(String[] args) {

		/*DECLARAMOS LAS VARIABLES*/
		
		int total, votos_podemos=10, votos_psoe=20, votos_pp=10, votos_ciudadanos=10, votos_vox=10, grupo_izquierda, grupo_derecha;
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		grupo_izquierda=(votos_podemos+votos_psoe);
		grupo_derecha=(votos_pp+votos_ciudadanos+votos_vox);
		total=(grupo_izquierda+grupo_derecha);
		/*IMPRIMIMOS POR PANTALLA*/
		
		System.out.println("Los votos de la izquierda son " +grupo_izquierda+ " que constituyen un "+((grupo_izquierda*100)/total)+ 
				"% \n\ndel total y los votos de la derecha son "+grupo_derecha+ " que constituyen el "+((grupo_derecha*100)/total)+ "% del total.");

	}

}
