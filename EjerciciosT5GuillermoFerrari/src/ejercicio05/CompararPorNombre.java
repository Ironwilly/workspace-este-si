package ejercicio05;

import java.util.Comparator;

public class CompararPorNombre implements Comparator <Persona>{
	
	public int compare (Persona pe1, Persona pe2) {
		
		String nombrepe1 = pe1.getNombre();
		String nombrepe2 = pe2.getNombre();
		
		
		return (nombrepe1.toLowerCase().compareTo(nombrepe2.toLowerCase()));
	}

}
