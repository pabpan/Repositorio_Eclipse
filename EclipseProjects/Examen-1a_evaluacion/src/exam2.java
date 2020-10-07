import java.util.*;

public class exam2 {

	public static void main(String[] args) {
				
		Scanner teclado = new Scanner(System.in);
		
		int x=4, y=4;
		
		String v[][]= new String [x][y];
		
		int opcion;
		String W, S, A, D;
		
		System.out.println("Bienvenido al laberinto de Paco"
				+ "Estás en la casilla 0,0. ¿Cuál es tu próximos movimiento?");
		
		opcion=teclado.nextInt();
		
	switch (opcion) {
		
		case 1:
			
			W();
			
			break;
			
		case 2:
			
			S();
			
			break;
		case 3:
			
			A();
			
			break;
		case 4:
			
			D();
			
			break;
		}
	}
			public static void W() {
				int x=4, y=4;	
				String v[][]= new String [x][y];
				
				for (int i = 0; i < v.length; i++) {
					for (int j = 0; j < v.length; j++) {
						if (i==0 || j==1) {
						//	v[]
						}
					}
				}
				
	}
			public static void S() {
				int x=4, y=4;	
				String v[][]= new String [x][y+1];

			}
			public static void A() {
				int x=4, y=4;	
				String v[][]= new String [x][y+1];

			}
			public static void D() {
				int x=4, y=4;	
				String v[][]= new String [x][y+1];

			}
}
