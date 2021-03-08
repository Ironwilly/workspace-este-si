package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear una pequeña lista con los datos personales de algunas personas, y{
		 * mostrarla por pantalla de forma NO ordenada y de forma ordenada (elegid la
		 * forma de ordenar vosotros, podéis empezar con orden natural, es decir,
		 * alfabéticamente y después crear otra “no natural”).
		 */
	
		int menu1;
		
		List<Persona> personas = new ArrayList<Persona>();
		
		personas.add(new Persona("Pablito","Mate Frito",31,"67856934q","pablito@gmail.com"));
		personas.add(new Persona("Jaimito","Logía Griega",16,"56437834w","jaimito@gmail.com"));
		personas.add(new Persona("Manolito","Lerable Mente",44,"89764687m","manolito@gmail.com"));
		personas.add(new Persona("Luisito","Noruega Ballesteros",9,"44563476l","luisito@gmail.com"));
		
		
		System.out.println("Lista sin ordenar de personas: \t");
		
		for(Persona pe : personas) {
			
			System.out.println(pe + "\t");
			
		}
		
		do { 
		System.out.println("****************************************************\r\n"
				+ "**** 1--> Ordenar por edad                      ****\r\n"
				+ "**** 2--> Ordenar alfabeticamente por nombre    ****\r\n"
				+ "**** 3--> Ordenar alfabéticamente por apellidos ****\r\n"
				+ "**** 4--> Ordenar alfabéticamente por email     ****\r\n"
				+ "**** 5--> Ordenar por dni                       ****\r\n"
				+ "**** 0--> Salir                                 ****\r\n"
				+ "****************************************************");
		
		menu1=Leer.datoInt();
		
		switch(menu1) {
		
		case 1:
			
			Collections.sort(personas);
			System.out.println("Así queda la lista de personas ordenadas por edad: \n");
			
			for (Persona pe : personas) {
				System.out.println(pe);
			}
			
			break ;
			
		case 2:
			
			Collections.sort(personas, new CompararPorNombre());
			System.out.println("Así queda la lista de personas ordenadas por nombre: \n");
			for(Persona pe : personas) {
				System.out.println(pe);
			}
			
			break;
			
		case 3:
			
			Collections.sort(personas, new CompararPorApellidos());
			System.out.println("Así queda la lista de personas ordenadas por apellidos: \n");
			
			for(Persona pe : personas) {
				
				System.out.println(pe);
			}
			
			break;
			
		case 4:
			
			Collections.sort(personas, new CompararPorEmail());
			System.out.println("Así queda la lista de personas ordenadas por email: \n");
			
			for(Persona pe : personas) {
				
				System.out.println(pe);
			}
			
			break;
		case 5:
			Collections.sort(personas,new CompararPorDni());
			System.out.println("Así queda la lista de personas ordenadas por dni: \n");
			
			for(Persona pe :personas) {
				System.out.println(pe);
			}
		break;
		case 0:
			System.out.println("¡Hasta pronto!");
			
			break;
			default :
				System.out.println("Número erróneo, prueba de nuevo \n");
		
		}
		
		
		
		
		}while(menu1 !=0);
	}

}
