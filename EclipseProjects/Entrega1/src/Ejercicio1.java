 /*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 18/10/2019
 * DESC.: PIEDRA, PAPEL O TIJERAS
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEEC POR TECLADO*/
import java.util.Scanner; 
/*IMPORTAMOS LA LIBRERÍA RANDOM PARA CREAR NÚMEROS ALEATORIOS*/
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);/*INICIALIZAMOS LA LECTURA POR TECLADO*/
		Random random = new Random();/*INICIALIZAMOS LA CREACIÓN DE RANDOM*/
		
		/*DECLARAMOS VARIABLES*/
		
		/*int aleatorio, eleccion;
		int piedra=0;
		int papel=1;
		int tijera=2;*/
		
		int aleatorio;
		String piedra1="piedra";
		String papel1="papel";
		String tijera1="tijeras";
		String eleccion1;
		
		/*CREAMOS EL ALEATORIO*/
		
		aleatorio=random.nextInt(3); /*PIEDRA=0, PAPEL=1, TIJERAS=2*/
				
		/*IMPRIMIMOS POR PANTALLA*/
		
		/*System.out.println("Elije una opción:\n\n0.- Piedra\n1.- Papel\n2.- Tijeras\n");
		eleccion0=teclado.nextInt();*/

		System.out.println("Elije una opción:\n\nPiedra\nPapel\nTijeras\n");
		eleccion1=teclado.nextLine();
		
		/*REALIZAMOS LAS OPERACIONES*/
		
		if (eleccion1.equalsIgnoreCase(piedra1) || eleccion1.equalsIgnoreCase(papel1) || eleccion1.equalsIgnoreCase(tijera1))
		{
		if (eleccion1.equalsIgnoreCase(piedra1)) {
			if (aleatorio==0)
				System.out.println("\nVAYA, HA HABIDO EMPATE");
			if (aleatorio==1)
				System.out.println("\nVAYA, HAS PERDIDO");
			if (aleatorio==2)
				System.out.println("\nVAYA, HAS GANADO");
		}
		if (eleccion1.equalsIgnoreCase(papel1)) {
			if (aleatorio==0)
				System.out.println("\nVAYA, HAS GANADO");
			if (aleatorio==1)
				System.out.println("\nVAYA, HA HABIDO EMPATE");
			if (aleatorio==2)
				System.out.println("\nVAYA, HAS PERDIDO");
		}
		if (eleccion1.equalsIgnoreCase(tijera1)) {
			if (aleatorio==0)
				System.out.println("\nVAYA, HAS PERDIDO");
			if (aleatorio==1)
				System.out.println("\nVAYA, HAS GANADO");
			if (aleatorio==2)
				System.out.println("\nVAYA, HA HABIDO EMPATE");
		}
		if (aleatorio==0) {System.out.println("\nLA MÁQUINA HABÍA ELEGIDO PIEDRA\n");}
		if (aleatorio==1) {System.out.println("\nLA MÁQUINA HABÍA ELEGIDO PAPEL\n");}
		if (aleatorio==2) {System.out.println("\nLA MÁQUINA HABÍA ELEGIDO TIJERAS\n");}
		}
		else System.out.println("FIN JUEGO");

		teclado.close();

	}

}		
		
		/*if (eleccion==aleatorio) {*/ /*SI EL NÚMERO INTRODUCIDO ES IGUAL AL NÚMERO ALEATORIO HAY EMPATE*/
			/*System.out.println("VAYA, HA HABIDO EMPATE");
		}*/
		
		/*SI EL ALEATORIO ES IGUAL A 0 (PIEDRA)*/
		/*if (eleccion!=aleatorio && aleatorio!=1 && aleatorio!=2) {
			if (eleccion==1) {System.out.println("VAYA, HAS GANADO --> PIEDRA CONTRA PAPEL GANAS TÚ");}
			if (eleccion==2) {System.out.println("VAYA, HAS PERDIDO --> PIEDRA CONTRA TIJERAS PIERDES TÚ");}
			}*/
		
		/*SI EL ALEATORIO ES IGUAL A 1 (PAPEL)*/
		/*if (eleccion!=aleatorio && aleatorio!=0 && aleatorio!=2) {
			if (eleccion==0) {System.out.println("VAYA, HAS PERDIDO --> PAPEL CONTRA PIEDRA PIERDES TÚ");}
			if (eleccion==2) {System.out.println("VAYA, HAS GANADO --> PAPEL CONTRA TIJERAS GANAS TÚ");}
			}*/
		
		/*SI EL ALEATORIO ES IGUAL A 2 (TIJERAS)*/
		/*if (eleccion!=aleatorio && aleatorio!=0 && aleatorio!=1) {
			if (eleccion==0) {System.out.println("VAYA, HAS GANADO --> TIJERAS CONTRA PIEDRA GANAS TÚ");}
			if (eleccion==1) {System.out.println("VAYA, HAS PERDIDO --> TIJERAS CONTRA PAPEL PIERDES TÚ");}
			}
		
		if (aleatorio==0) {System.out.println("\nLA MÁQUINA HABÍA ELEGIDO PIEDRA\n");}
		if (aleatorio==1) {System.out.println("\nLA MÁQUINA HABÍA ELEGIDO PAPEL\n");}
		if (aleatorio==2) {System.out.println("\nLA MÁQUINA HABÍA ELEGIDO TIJERA\n");}*/
		


