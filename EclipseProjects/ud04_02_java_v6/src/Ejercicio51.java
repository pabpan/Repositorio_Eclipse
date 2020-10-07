import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n;
		
		System.out.println("Por favor, introduzca la altura (numero impar mayor o igual a 5)");
		n= teclado.nextInt();
		
		if(n>=5 && n%2!=0) {
		
			for( int i=0;i<n;i++) {			
		
				for(int j=0;j<n;j++) {
					
					if (j==0 || i==0 || j==n-1 || i==n-1 || i==n/2){
					
						System.out.print("M");	
					}
					
					else
						System.out.print(" ");	

					}
				
						System.out.println(" ");		

				}
		}

		else
			System.out.println("La altura introducida no es correcta.");

		teclado.close();		

		}
							
	}
		
