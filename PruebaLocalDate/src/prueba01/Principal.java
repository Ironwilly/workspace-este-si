package prueba01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Fechas fe = new Fechas();
		
		fe.fecha();
		
		LocalTime hora = LocalTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("'Son las ' h' Horas 'mm 'minutos' ss 'segundos'");
		System.out.println(hora.format(f));
		
		
		LocalDateTime today = LocalDateTime.parse("2021-03-18T10:26");
		System.out.println(today);
		
		
	LocalDate fecha = LocalDate.now();
	DateTimeFormatter f4 = DateTimeFormatter.ofPattern("dd  MMM yyyy E ");
	String este = fecha.format(f4);
	LocalDate fech = LocalDate.parse(este, f4);
	System.out.println(este);
	
	
	LocalDate fecha1 = LocalDate.parse("2021-03-22");
	LocalDate nuevaFecha = fecha1.plusDays(10);
	System.out.println(fecha1);
	System.out.println(nuevaFecha+"\n");
	
	LocalDate fecha2 = LocalDate.parse("2021-03-22");
	LocalDate nuevaFecha2 = fecha2.plusMonths(3);
	System.out.println(fecha2);
	System.out.println(nuevaFecha2+"\n");
		
	
	LocalDate fecha3 = LocalDate.parse("2021-03-22");
	LocalDate nuevaFecha3 = fecha3.plusWeeks(15);
	System.out.println(fecha3);
	System.out.println(nuevaFecha3 +"\n");
	
	LocalDate fecha4 = LocalDate.parse("2021-03-22");
	LocalDate nuevaFecha4 = fecha4.plusYears(10);
	System.out.println(fecha4);
	System.out.println(nuevaFecha4 +"\n");
	
	System.out.println(LocalDate.parse("2021-03-22").isBefore(LocalDate.parse("2022-03-22")));
	System.out.println(LocalDate.parse("2021-03-22").isAfter(LocalDate.parse("2022-04-04")));
	System.out.println(LocalDate.parse("2044-02-02").isLeapYear());
	
	
	System.out.println(LocalDate.parse("2031-07-14").getDayOfWeek());
	
	
	  LocalDate localDate = LocalDate.parse("1971-01-01");
      System.out.println("LocalDate                : " + localDate);
      System.out.println("LocalDate.toEpochDay()   : " + localDate.toEpochDay());
      
      
      LocalDate copyLocalDate = LocalDate.ofEpochDay(localDate.toEpochDay());
      System.out.println("Copied LocalDate         : " + copyLocalDate);
      
      LocalDate fecha5 = LocalDate.parse("2021-03-22");
      ZonedDateTime zonedDateTime = fecha5.atStartOfDay(ZoneId.of("America/Los_Angeles"));
      System.out.println("ZonedDateTime : " + zonedDateTime);
	
	
	
	}

}
