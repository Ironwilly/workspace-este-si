package ejercicio05;

import java.util.Comparator;

public class CompararPorApellidos implements Comparator <Persona>{
	
	public int compare (Persona pe1, Persona pe2) {
		
		String apellidospe1 =pe1.getApellidos();
		String apellidospe2 = pe2.getApellidos();
		
		return (apellidospe1.toLowerCase().compareTo(apellidospe2.toLowerCase()));
		
	}

}
