package ejercicio05;

import java.util.Comparator;

public class CompararPorEmail implements Comparator <Persona>{
	
	public int compare (Persona pe1, Persona pe2) {
		
		
		String emailpe1 = pe1.getEmail();
		String emailpe2 = pe2.getEmail();
		
		return (emailpe1.toLowerCase().compareTo(emailpe2.toLowerCase()));
		
	}

}
