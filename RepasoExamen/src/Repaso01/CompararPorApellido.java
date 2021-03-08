package Repaso01;

import java.util.Comparator;

public class CompararPorApellido implements Comparator <Persona>{
	
	public int compare (Persona pe1, Persona pe2) {
		
		String apellidope1 = pe1.getApellido();
		String apellidope2 = pe2.getApellido();
		
		
		return (apellidope1.toLowerCase().compareTo(apellidope2.toLowerCase()));
	}
	
	

}
