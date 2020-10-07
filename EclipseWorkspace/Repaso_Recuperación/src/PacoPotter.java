import java.util.*;

public class PacoPotter {

	private static ArrayList<Libro> Lista_Libros = new ArrayList<Libro>();
	private static ArrayList<Alumno> Lista_Alumnos = new ArrayList<Alumno>();
	private static ArrayList<Prestamo> Lista_Prestamos = new ArrayList<Prestamo>();
	static int contador_alumnos = 1;
	static int contador_libros = 1;

	public static void main(String[] args) {
		boolean exit = false;

		int opcion = 0;

		while (opcion != 6 && exit == false) {

			Scanner teclado = new Scanner(System.in);
			System.out.println("Bienvenido a la biblioteca de Hogwarts\n" + "-------------------------------\n"
					+ "1-Dar de alta un libro\n" + "2-Dar de alta un alumno\n" + "3-Prestar un libro\n"
					+ "4-Devolver un libro\n" + "5-Resumen de la biblioteca\n" + "9-Salir\n"
					+ "-------------------------------");

			opcion = teclado.nextInt();
			teclado.nextLine();
			if (opcion == 6) {
				opcion = 9;
			}

			switch (opcion) {
			case 1:
				Alta_Libro(Lista_Libros);
				break;
			case 2:
				Alta_Alumno(Lista_Alumnos);
				break;
			case 3:
				Prestar_Libro(Lista_Alumnos);
				break;
			case 4:
				Devolver_Libro(Lista_Alumnos, Lista_Libros);
				break;
			case 5:
				Resumen_Biblioteca();
				break;
			case 9:
				Salir();
				exit = true;
				break;
			default:
				break;
			}/* FIN SWITCH */
		} /* FIN WHILE */

	}/* FIN MAIN */

	private static void Salir() {
		System.out.println("Gracias por usar la biblioteca de Hogwarts");
	}

	private static void Resumen_Biblioteca() {

		Iterator iter = Lista_Libros.iterator();
		Iterator iter1 = Lista_Alumnos.iterator();
		Iterator iter2 = Lista_Prestamos.iterator();

		Libro libro_aux = null;
		Alumno alumno_aux = null;
		Prestamo prestamo_aux = null;

		System.out.println("Libros dados de alta:\n");
		System.out.println("-------------------------------");
		while (iter.hasNext()) {
			libro_aux = (Libro) iter.next();
			System.out.println("	- " + libro_aux.getTitulo_libro() + " escrito por: " + libro_aux.getAutor_libro()
					+ " tiene " + libro_aux.getNum_paginas_libro() + " pags. | " + libro_aux.getEstado_libro());
		}

		System.out.println("Clientes dados de alta:\n");
		System.out.println("-------------------------------");
		while (iter1.hasNext()) {
			alumno_aux = (Alumno) iter1.next();
			System.out.println("	- Alumno de NIF: " + alumno_aux.getDni() + " y nombre: "
					+ alumno_aux.getNombre_alumno() + " tiene " + alumno_aux.getEdad() + " años.");
		}

		System.out.println("Prestamos efectuados:\n");
		System.out.println("-------------------------------");
		while (iter2.hasNext()) {
			prestamo_aux = (Prestamo) iter2.next();
			System.out.println("	- " + prestamo_aux.getLibro_nuevo().getTitulo_libro() + " | "
					+ prestamo_aux.getLibro_nuevo().getAutor_libro() + " | "
					+ prestamo_aux.getLibro_nuevo().getNum_paginas_libro() + " pags. prestado a: "
					+ prestamo_aux.getAlumno_nuevo().getDni() + " | "
					+ prestamo_aux.getAlumno_nuevo().getNombre_alumno() + " | "
					+ prestamo_aux.getAlumno_nuevo().getEdad());
		}
	}

	private static void Devolver_Libro(ArrayList<Alumno> Lista_Alumnos, ArrayList<Libro> Lista_Libros) {

		Scanner teclado = new Scanner(System.in);
		boolean alumno_encontrado = false;
		boolean titulo_encontrado = false;

		while (alumno_encontrado == false) {
			System.out.println("Introduzca DNI del alumno:");
			String dni1 = teclado.nextLine();
			
			Iterator iter = Lista_Alumnos.iterator();
			Alumno alumno_aux = null;
			while (iter.hasNext()) {
				alumno_aux = (Alumno) iter.next();
				if (alumno_aux.getDni().equals(dni1)) {
					alumno_encontrado = true;
				}
			}
		}
		while (titulo_encontrado == false) {
			System.out.println("Introduzca titulo del libro a devolver");
			String titulo1 = teclado.nextLine();

			Iterator iter = Lista_Libros.iterator();
			Libro libro_aux = null;
			while (iter.hasNext()) {
				libro_aux = (Libro) iter.next();
				if (libro_aux.getTitulo_libro().equals(titulo1) && libro_aux.getEstado_libro().equals("PREST")) {
					titulo_encontrado = true;
					libro_aux.setEstado_libro("DISP");
					Lista_Libros.add(libro_aux);
					libro_aux=null;
					System.out.println("Préstamo dado de baja");
				}
			}
		}

	}

	private static void Prestar_Libro(ArrayList<Alumno> Lista_Alumnos) {
		Scanner teclado = new Scanner(System.in);
		boolean alumno_encontrado = false;
		boolean titulo_encontrado = false;
		Alumno alumno_aux1 = null;
		Libro libro_aux1 = null;

		while (alumno_encontrado == false) {
			System.out.println("Introduzca DNI del alumno:");
			String dni1 = teclado.nextLine();
			Iterator iter = Lista_Alumnos.iterator();
			Alumno alumno_aux = null;
			while (iter.hasNext()) {
				alumno_aux = (Alumno) iter.next();
				if (alumno_aux.getDni().equals(dni1)) {
					alumno_encontrado = true;
					alumno_aux1 = alumno_aux;
				}
			}
		}
		while (titulo_encontrado == false) {
			System.out.println("Introduzca titulo del libro a prestar");
			String titulo1 = teclado.nextLine();

			Iterator iter = Lista_Libros.iterator();
			Libro libro_aux = null;
			while (iter.hasNext()) {
				libro_aux = (Libro) iter.next();
				if (libro_aux.getTitulo_libro().equals(titulo1) && libro_aux.getEstado_libro().equals("DISP")) {
					titulo_encontrado = true;
					libro_aux.setEstado_libro("PREST");
					libro_aux1 = libro_aux;
				}
			}
		}
		Prestamo nuevo_prestamo = new Prestamo(libro_aux1, alumno_aux1);
		Lista_Prestamos.add(nuevo_prestamo);
		System.out.println("- " + libro_aux1.getTitulo_libro() + " | " + libro_aux1.getAutor_libro() + " | "
				+ libro_aux1.getNum_paginas_libro() + " pags. prestado a: " + alumno_aux1.getDni() + " | "
				+ alumno_aux1.getNombre_alumno() + " | " + alumno_aux1.getEdad() + " años.");
	}

	private static void Alta_Alumno(ArrayList<Alumno> Lista_Alumnos) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca DNI del alumno numero " + contador_alumnos + ":");
		String dni = teclado.nextLine();
		System.out.println("Introduzca su nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Introduzca su edad:");
		int edad = teclado.nextInt();
		teclado.nextLine();
		Alumno nuevo_alumno = new Alumno(dni, nombre, edad);
		Lista_Alumnos.add(nuevo_alumno);
		contador_alumnos++;

		System.out.println("-------------------------------------------------------");
		System.out.println("Se ha dado de alta el siguiente alumno:\n" + "	- Alumno de NIF: " + dni + " y nombre: "
				+ nombre + " tiene " + edad + " años.");
		System.out.println("-------------------------------------------------------");
	}

	private static void Alta_Libro(ArrayList<Libro> Lista_libros) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca titulo del libro numero " + contador_libros + ":");
		String libro = teclado.nextLine();
		System.out.println("Introduzca su autor:");
		String autor = teclado.nextLine();
		System.out.println("Introduzca numero de paginas:");
		int paginas = teclado.nextInt();
		teclado.nextLine();
		String estado = "DISP";
		Libro alta_libro = new Libro(libro, autor, paginas, estado);
		Lista_libros.add(alta_libro);
		contador_libros++;

		System.out.println("-------------------------------------------------------");
		System.out.println("Se ha dado de alta el siguiente ejemplar:\n" + "	- " + libro + " escrito por: " + autor
				+ " tiene " + paginas + " pags. | " + estado);
		System.out.println("-------------------------------------------------------");
	}

}/* FIN CLASS */
