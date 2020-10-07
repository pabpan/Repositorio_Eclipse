package Ejercicio104;

public class Division104 {

	public static int division(int dividendo, int divisor) throws Exception {

		try {

			return (dividendo / divisor);

		} catch (ArithmeticException e) {

			throw e;
		}

	}

}
