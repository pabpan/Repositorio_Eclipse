import java.util.*;
public class Ejercicio71_jorge {

	public static void main(String[] args) {
		int num;
		int cont = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca el numero a comprobar. Despues se comprobaran del 2 al 1000");
		num = teclado.nextInt();
		if (esPrimo(num))
		{
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}
		
		for(int i = 2 ; i <= 1000; i++)
		{
			if(esPrimo(i) && cont <4)
			{
				System.out.print("\t" + i);
				cont++;
			}else if(esPrimo(i) && cont == 4)
			{
				System.out.println();
				System.out.print("\t" + i);
				cont = 0;
			}
		}
	}
	
	public static boolean esPrimo (int n)
	{
		int contador=2;
		boolean esPrim=true;
		while((esPrim) && (contador != n))
		{
			if(n%contador==0)
			{
				esPrim = false;
			}
			contador++;
		}
		return esPrim;
	}

}
