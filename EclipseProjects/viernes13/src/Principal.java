import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int nota = -1;

		ArrayList<Alumno> Lista_Alumnos = new ArrayList<Alumno>();
		ArrayList<Asignatura> Lista_Asignaturas = new ArrayList<Asignatura>();

		Alumno A1 = new Alumno("Pablo", "Suárez", "44877847V", "1DAM", 37);
		Lista_Alumnos.add(A1);
		Alumno A2 = new Alumno("Axel", "Párez", "12345678V", "1DAM", 32);
		Lista_Alumnos.add(A2);

		// IMPRIMIMOS EL MÉTODO DATOS_ALUMNO
		System.out.println("--- DATOS ALUMNOS ---\n");
		A1.Datos_Alumno();
		A2.Datos_Alumno();
		System.out.println();

		// OTRA MANERA DE DEVOLVER EL MÉTODO ALTERNATIVO
		// System.out.println(A1.Datos_Alumno_alternativo());

		// CREAMOS LAS ASIGNATURAS
		System.out.println("--- CREAMOS ASIGNATURAS ---\n");
		Asignatura As1 = new Asignatura("Programación", 256, "JAVA PARA BURROS", "Paco Pérez");
		Lista_Asignaturas.add(As1);
		Asignatura As2 = new Asignatura("BBDD", 180, "SQL WORKBENCH", "Lucía Gimeno");
		Lista_Asignaturas.add(As2);

		// IMPRIMIMOS LOS DATOS DE LA ASIGNATURA
		As1.Datos_Asignatura();
		As2.Datos_Asignatura();
		System.out.println();

		System.out.println("--- CONFIRMACIÓN DE MATRICULACIÓN ---\n");

		// MATRICULAMOS A LOS ALUMNOS
		A1.Matricular(As1);
		A2.Matricular(As1);
		System.out.println();

		// QUEREMOS SABER QUE ALUMNOS TIENE MÁS DE 60 AÑOS
		// LO RECORREMOS CON UN ITERATOR

		System.out.println("--- POBLACIÓN DE RIESGO DE ALUMNOS MAYORES QUE 30 ---\n");
		Iterator iter = Lista_Alumnos.iterator();
		Alumno alumno_aux;
		while (iter.hasNext()) {
			alumno_aux = (Alumno) iter.next();
			if (alumno_aux.get_Edad_Alumno() >= 32) {
				System.out.println(alumno_aux.get_Nombre_Alumno() + " es población de riesgo porque tiene "
						+ alumno_aux.get_Edad_Alumno());
			}
		}

		// PABLO VA A HACER UN EXAMEN DE PROGRAMACIÓN

		System.out.println("\n--- PABLO VA A HACER UN EXÁMEN ---\n");
		while (nota == -1 || nota > 10) {
			System.out.printf("Dime la nota del examen: ");
			nota = Leer_Nota();
			System.out.println();
		}

		Examen E1 = new Examen(A1, As1, nota);

		// QUEREMOS QUE SALGA EL MENSAJE PABLO HA SACADO EN PROGRAMACIÓN UN 10 Y ESTÁ
		// APROBADO

		Alumno alumno_aux1 = E1.get_Datos_Alumno();
		Asignatura asignatura_aux = E1.get_Datos_Asignatura();

		System.out.println(alumno_aux1.get_Nombre_Alumno() + " ha sacado en " + asignatura_aux.get_Asignatura() + " un "
				+ E1.get_Nota() + " y eso es un " + E1.get_Calificacion());

	}

	public static int Leer_Nota() {
		Scanner teclado = new Scanner(System.in);
		int nota = -1;
		try {
			nota = teclado.nextInt();
		} catch (Exception e) {
			System.out.println("Tiene que ser un valor numérico");
		}
		return nota;

	}

}
