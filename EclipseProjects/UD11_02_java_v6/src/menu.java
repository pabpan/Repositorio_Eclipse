import java.util.*;

public class menu {

	public static void main(String[] args) {
/*---------------------------------------- CAPTURAR EXCEPCIONES EN EL MENÚ -*/
		try {
			boolean exit = false;
			int opcion = 0;
			while (exit == false) {
				Scanner teclado = new Scanner(System.in);
				mostrar_menu();
				opcion = teclado.nextInt();
				teclado.nextLine();
				switch (opcion) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					mostrar_salir();
					exit = true;
					break;
				default:
/*---------------------------------------- PARA CUALQUIER OPCIÓN DIFERENTE A LAS DEL MENÚ -*/
					System.out.println("\n*****************************");
					System.out.println("* ¡ELIGE UNA OPCIÓN VÁLIDA! *");
					System.out.println("*****************************\n");
					break;
				}
			} 
/*---------------------------------------- CAPTURAR EXCEPCIÓN DE INTRODUCIR UN CARÁCTER -*/
		}
		catch (InputMismatchException e) {
			System.out.println("\n*******************************************");
			System.out.println("* ¡La opción introducida no es un número! *");
			System.out.println("*     SE PROCEDE A CERRAR EL PROGRAMA     *");
			System.out.println("*******************************************\n");	
		}
	}
/*---------------------------------------- SALIR DEL PROGRAMA -*/
	private static void mostrar_salir() {
		System.out.println("\n************************************************");
		System.out.println("* Gracias por venir a la Pizzeria di Guiseppe! *");
		System.out.println("************************************************\n");	
	}
/*---------------------------------------- MENÚ PRINCIPAL -*/
	private static void mostrar_menu() {
		System.out.println("*****************************************");
		System.out.println("* BENVENUTTI A LA PIZZERIA DI GUISEPPE! *");
		System.out.println("*****************************************\n");
		System.out.println("1-Dar de alta una pizza en el menú\n" + 
				"2-Dar de alta un cliente\n" + 
				"3-Hacer un pedido\n" + 
				"4-Regreso del repartidor\n" + 
				"5-Listar pedidos\n" + 
				"6-Salir");
		System.out.println("\n*****************************************\n");
		System.out.print("Introduce una opción --> ");
	}
}
