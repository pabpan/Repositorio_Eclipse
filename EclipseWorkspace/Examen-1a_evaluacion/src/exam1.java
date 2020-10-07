import java.util.*;


public class exam1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		//DECLARACIÓN DE VARIABLES
		int x, y, precio_total;
		String cadena = "Paco";
		int contador=0, c_p=0, c_a=0, c_c=0, c_o=0;

	    	
	    do {
			System.out.println("Introduzca dimensiones de la bandera de Paco (min 4x4):");
			y=teclado.nextInt();
			x=teclado.nextInt();
			
			if (y<4) {
				System.out.println("La dimensión en X es inferior a 4");
	    	}
			
			if (x<4) {
				System.out.println("La dimensión en Y es inferior a 4");
	    	}		
	    }while(x<4 || y<4);

			if (x>=4 && y>=4) {
	
				for (int i = 0; i < x+2; i++) {
					for (int j = 0; j < y+2; j++) {
						if (i==0 || j==0 || i==x+1 || j==y+1) {
							System.out.printf("@");
						}
						else {
								System.out.print(cadena.charAt(contador));	
								if (contador==0) {
									c_p++;
								}
								if (contador==1) {
									c_a++;
								}
								if (contador==2) {
									c_c++;
								}
								if (contador==3) {
									c_o++;
								}
									if (contador==3) {
										contador=0;
									}
										else contador++;									
						}
					}System.out.println();
				}System.out.println();	
			}
			
			precio_total=c_p+c_a+c_c+c_o;
			
			System.out.println("Imprimir esta bandera costaría: "+precio_total+" ya que hay que imprimir:");
			System.out.println(c_p+" letras P por valor de: "+c_p*10+"€.");
			System.out.println(c_a+" letras a por valor de: "+ c_a*5+"€.");
			System.out.println(c_c+" letras c por valor de: "+c_c*5+"€.");
			System.out.println(c_o+"letras o por valor de: "+c_o*5+"€.");
		 
			
	    	
	    teclado.close();
	}
}
