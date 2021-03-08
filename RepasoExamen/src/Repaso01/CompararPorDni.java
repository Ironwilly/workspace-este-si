package Repaso01;

import java.util.Comparator;



public class CompararPorDni implements Comparator <Persona>{
	
	public int compare (Persona pe1, Persona pe2) {
		
		String dnipe1 = pe1.getDni();
		String dnipe2 = pe2.getDni();
		
		return (dnipe1.toLowerCase().compareTo(dnipe2.toLowerCase()));
		
		
		
	}
	
	
	

}
