import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Perro perro1 = new Perro("Snoopy", "24/05/2005", 25, RazaPerro.Beagle, "Microchip001");
		Gato gato1 = new Gato("Garfield", "27/07/2012", 120, RazaGato.Comun, "Microchip002");
		Pajaro pajaro1 = new Pajaro("Piolín", "12/07/2016", 1, RazaPajaro.Canario, true);
		Reptil reptil1 = new Reptil("Godzilla", "12/01/1420", 19800, RazaReptil.LagartoGigante, true);
		
		ClinicaVeterinaria clinica1 = new ClinicaVeterinaria();
		clinica1.Insertar_Comentario("Pulgas", "Perro sarnoso");
		
		clinica1.Insertar_Animal(perro1);
		clinica1.Insertar_Animal(gato1);
		clinica1.Insertar_Animal(pajaro1);
		clinica1.Insertar_Animal(reptil1);
		
		clinica1.toString();
		
		clinica1.Busca_animal("Snoopy").setComentarios_animal("Viene acompañado de su hermano Spike");
		clinica1.Busca_animal("Garfield").setComentarios_animal("Llega a la consulta con un empacho de Lasaña");
		clinica1.Busca_animal("Piolín").setComentarios_animal("Repite continuamente ‘Me parece que he visto a un lindo gatito’");
		clinica1.Busca_animal("Godzilla").setComentarios_animal("Sufre heridas de su pelea contra Gamera");
		System.out.println();

		
		System.out.println(clinica1.toString());

	}

}
