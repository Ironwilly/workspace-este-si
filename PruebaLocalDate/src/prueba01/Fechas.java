package prueba01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Fechas {
	
	
	
	public static void fecha() {
		
		LocalDate hoy = LocalDate.now();
		
		System.out.println("La fecha de hoy es: "+hoy);
		
		int dias = 2;
		int diass = 3;
		Period periodo = Period.ofDays(dias);
		System.out.println("Tras sumar el periodo: " + hoy.plus(periodo));
		
		
	}

	
	public static TemporalAdjuster dayOfWeekInMonth() {
	    return TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.FRIDAY);
	}
	
	
	

	
	
	

}
