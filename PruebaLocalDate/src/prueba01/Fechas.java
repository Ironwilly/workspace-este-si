package prueba01;

import java.time.LocalDate;
import java.time.Period;

public class Fechas {
	
	
	
	public static void fecha() {
		
		LocalDate hoy = LocalDate.now();
		
		System.out.println("La fecha de hoy es: "+hoy);
		
		int dias = 2;
		int diass = 3;
		Period periodo = Period.ofDays(dias);
		System.out.println("Tras sumar el periodo: " + hoy.plus(periodo));
		
		
	}

}
