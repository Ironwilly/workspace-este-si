package Repaso01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

		String cadenaABuscar;
		String buscando;

		List<Persona> personas = new ArrayList<Persona>();

		personas.add(new Persona("Manolito", "Torres", "45655789w", 32));
		personas.add(new Persona("Juanito", "Casas", "35328845z", 41));
		personas.add(new Persona("Jaimito", "Pérez", "67875643q", 20));
		personas.add(new Persona("Luisito", "Vega", "97685745t", 18));
		personas.add(new Persona("Pedrito", "García", "67754635p", 20));

		for (Persona pe : personas) {
			System.out.println(pe + "\n");
		}
		System.out.println(" ");
		System.out.println(" ");

		Collections.sort(personas);
		for (Persona pe : personas) {
			System.out.println(pe + "\n");
		}

		System.out.println(" ");
		System.out.println(" ");
		Collections.sort(personas, new CompararPorDni());
		for (Persona pe : personas) {
			System.out.println(pe + "\n");
		}
		System.out.println(" ");
		System.out.println(" ");
		Collections.sort(personas, new CompararPorApellido());
		for (Persona pe : personas) {
			System.out.println(pe + "\n");
		}

		System.out.println(" ");
		System.out.println(" ");
		Collections.sort(personas, new CompararPorNombre());
		for (Persona pe : personas) {
			System.out.println(pe + "\n");
		}

		System.out.println("Pon la cadena a buscar: ");
		cadenaABuscar = Leer.dato();
		
		List<String> listaNombres = new ArrayList<String>();

		listaNombres.add("Juan");
		listaNombres.add("Jesús");
		listaNombres.add("Bartolo");
		
		
		
	
		
		

		
			
			for(Persona pe :personas) {
				
				pe.getNombre();
				Iterator<Persona> it = pe.iterator();
				
				while (it.hasNext()) {

				    buscando = it.next();
					System.out.println("buscando....." + buscando);

					if (buscando.contains(cadenaABuscar)) {

						System.out.println("cadena encontrada!!!");
					} else {
						System.out.println("no existe esa cadena");
					}
					
				}
			}

		

	}

}
