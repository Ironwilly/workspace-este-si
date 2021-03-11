package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una pequeña lista con los datos personales de algunas personas, y
		 * mostrarla por pantalla de forma NO ordenada y de forma ordenada (elegid la
		 * forma de ordenar vosotros, podéis empezar con orden natural, es decir,
		 * alfabéticamente y después crear otra “no natural”).
		 * 
		 */
		
		int menu1;
		
		
		List <Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.add(new Persona ("Manolito","Torres",26,"67854678m","627543678"));
		listaPersonas.add(new Persona ("Juanito","Casas",19,"56368354w","601596329"));
		listaPersonas.add(new Persona ("Sara","Carrasco",35,"67754367p","706496359"));
		listaPersonas.add(new Persona ("Manolita","Aguilera",28,"77546934r","615969475"));
		listaPersonas.add(new Persona ("Pedrito","Rasta",32,"56783597z","606467943"));
		
		
			System.out.println("La lista de personas sin ningún tipo de orden es: \n");
		System.out.println(listaPersonas+"\n\n");
		do {
		System.out.println("===================================================\r\n"
				+ "*** 1 ---> Ordenar alfabéticamente por nombre   ***\r\n"
				+ "*** 2 ---> Ordenar alfabéticamente por apellido ***\r\n"
				+ "*** 3 ---> Ordenar por edad                     ***\r\n"
				+ "*** 4 ---> Ordenar por DNI                      ***\r\n"
				+ "*** 5 ---> Ordenar por número movil             ***\r\n"
				+ "*** 0 ---> Salir                                ***\r\n"
				+ "===================================================");
		
		
		
		menu1 = Leer.datoInt();
		
		switch(menu1) {
		
		case 1:
			System.out.println("La lista de personas ordenadas alfabéticamente por nombre es: \n");
			Collections.sort(listaPersonas);
			System.out.println(listaPersonas + "\n");
			
			break;
			
		case 2:
			System.out.println("La lista de personas ordenadas alfabéticamente por apellido es: \n");
			Collections.sort(listaPersonas, new ComparaPorApellido());
			System.out.println(listaPersonas+"\n");
		
				
			break;
			
		case 3:
			System.out.println("La lista de personas ordenadas por edad es: \n");
			Collections.sort(listaPersonas,new ComparaPorEdad());
			System.out.println(listaPersonas +"\n");
			
			break;
			
		case 4:
			System.out.println("La lista de personas ordenadas por DNI es: \n");
			Collections.sort(listaPersonas,new ComparaPorDni());
			System.out.println(listaPersonas + "\n");
			
			break;
			
		case 5:
			System.out.println("La lista de personas ordenadas por número de movil es: \n");
			Collections.sort(listaPersonas,new ComparaPorMovil());
			System.out.println(listaPersonas + "\n");
			
			break;
			
		case 0:
			System.out.println("¡Hasta pronto!");
			
			break;
			
			default:
				System.out.println("Número erróneo, intentalo de nuevo.");
				
				break;
				
		
		}
		
		}while(menu1 !=0);
		
		
		
	}

}
