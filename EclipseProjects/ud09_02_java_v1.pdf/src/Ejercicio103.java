import java.util.*;

class Ejercicio103 {

	public static void main(String[] args) throws Exception {

		Scanner teclado = new Scanner(System.in);
		int numerador, denominador;

		try {

			System.out.println("Introduce nominador:");
			numerador = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Introduce denominador:");
			denominador = teclado.nextInt();
			teclado.nextLine();
						
			System.out.println("La división entre " + numerador + " y " + denominador + " es: " + (numerador / denominador));
		} catch (InputMismatchException e) {
			System.out.println("No es un entero");
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir entre 0");
		}
	}
	
	public static int division(int dividendo, int divisor) throws Exception {

		try {
			return (dividendo / divisor);
		} catch (ArithmeticException e) {
			throw e;
		}
	}
}
