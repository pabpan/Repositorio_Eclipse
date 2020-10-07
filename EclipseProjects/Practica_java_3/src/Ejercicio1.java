 /*
 * NOMBRE: PABLO SUÁREZ  
 * FECHA: 11/10/2019
 * DESC.: INFIEL
 */

/*IMPORTAMOS LA LIBRERÍA SCANNER PARA LEER POR TECLADO*/

import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
	 Scanner teclado = new Scanner(System.in);
	 
	 /*DECLARAMOS LAS VARIABLES*/
 
	 String resp_SI = "SI";
	 String resp_NO = "NO";
	 String respuesta;
	 
	 int resultado=0;
	 
	 do {
		 System.out.println("Responde con SI o NO");
		 System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
		 respuesta=teclado.nextLine();
		 if (respuesta.equals(resp_SI))
		 {  
			resultado=resultado+3;
		 }}
	while ((!respuesta.equals(resp_NO)) && (!respuesta.equals(resp_SI)));
	 
	do {
		 System.out.println("2. Ha aumentado sus gastos de vestuario");
		 respuesta=teclado.nextLine();
		 if (respuesta.equals(resp_SI))
		 {  
		resultado=resultado+3;
		 }}
	while ((!respuesta.equals(resp_NO)) && (!respuesta.equals(resp_SI)));
	
	do { 
	    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
		 respuesta=teclado.nextLine();
		 if (respuesta.equals(resp_SI))
		 {  
				resultado=resultado+3;
		 }}
	while ((!respuesta.equals(resp_NO)) && (!respuesta.equals(resp_SI)));
	
	do {
		 System.out.println("4. Ahora se asea con más frecuencia");
		 respuesta=teclado.nextLine();
		 if (respuesta.equals(resp_SI))
		 {  
				resultado=resultado+3;
		 }}
	while ((!respuesta.equals(resp_NO)) && (!respuesta.equals(resp_SI)));
	
	do {
		 System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
		 respuesta=teclado.nextLine();
		 if (respuesta.equals(resp_SI))
		 {  
				resultado=resultado+3;
		 }}
	while ((!respuesta.equals(resp_NO)) && (!respuesta.equals(resp_SI)));
	
	do {
		 System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
		 respuesta=teclado.nextLine();
		 if (respuesta.equals(resp_SI))
		 {  
				resultado=resultado+3;
		 }}
	while ((!respuesta.equals(resp_NO)) && (!respuesta.equals(resp_SI)));
	
	do {
		 System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
		 respuesta=teclado.nextLine();
		 if (respuesta.equals(resp_SI))
		 {  
				resultado=resultado+3;
		 }}
	while ((!respuesta.equals(resp_NO)) && (!respuesta.equals(resp_SI)));
	
	do {
		 System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
		 respuesta=teclado.nextLine();
		 if (respuesta.equals(resp_SI))
		 {  
				resultado=resultado+3;
		 }}
	while ((!respuesta.equals(resp_NO)) && (!respuesta.equals(resp_SI)));
	
	do {
		 System.out.println("9. Has notado que últimamente se perfuma más.");
		 respuesta=teclado.nextLine();
		 if (respuesta.equals(resp_SI))
		 {  
				resultado=resultado+3;
		 }}
	while ((!respuesta.equals(resp_NO)) && (!respuesta.equals(resp_SI)));
	
	do {
		 System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
		 respuesta=teclado.nextLine();
		 if (respuesta.equals(resp_SI))
		 {  
				resultado=resultado+3;
		 }}
		 		
	while ((!respuesta.equals(resp_NO)) && (!respuesta.equals(resp_SI))); 
	
	 System.out.println(resultado);
	 
	 if ( resultado <= 10 ) {
	      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel!");
	 }
	 	else if ( resultado <= 22) {
	 		System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");    
	 }
	 		else if (resultado <=30) {
	      System.out.print("\nTu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. \nTe aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
	 }
	 
	teclado.close();
	
	}
}