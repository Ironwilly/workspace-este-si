package ejercicio05;

import java.util.Comparator;

public class ComparaPorMovil implements Comparator <Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {

		String movilP1 = p1.getMovil();
		String movilP2 = p2.getMovil();
		
		return movilP1.toLowerCase().compareTo(movilP2.toLowerCase());
	}

	
	
}
