package ejercicio05;

import java.util.Comparator;

public class ComparaPorDni implements Comparator <Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		
		String dniP1 = p1.getDni();
		String dniP2 = p2.getDni();
		
		
		
		return (dniP1.toLowerCase().compareTo(dniP2.toLowerCase()));
	}

	
	
}
