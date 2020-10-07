/*
 * NOMBRE: PABLO SUÁREZ
 * FECHA: 02/10/2019
 * DESC.: CALCULAR RAIZ CUADRADA
 * */

public class Ejercicio6 {

	public static void main(String[] args) {

		int a=2, b=20, c=3;
		double x1=0, x2=0, int_raiz=0;
		
		int_raiz=(b*b)-(4*a*c);
		
		x1=(-b+Math.sqrt(int_raiz))/(2*a);
		x2=(-b-Math.sqrt(int_raiz))/(2*a);
		
		System.out.println("El valor de x siendo a = " + a + " b = " + b + " y c = " + c + " es igual a " + x1 + " y " + x2 + ".");
		
	}

}
