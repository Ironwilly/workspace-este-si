package ejercicio05;

import java.util.Comparator;

public class ComparaPorApellido implements Comparator <Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		
		
		String apellidoP1 = p1.getApellido();
		String apellidoP2 = p2.getApellido();
		
		
		return (apellidoP1.toLowerCase().compareTo(apellidoP2.toLowerCase()));
	}
	
	

}
