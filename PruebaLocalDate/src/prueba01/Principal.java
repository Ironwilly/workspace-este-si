package prueba01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;



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
      
      
      int ordinal = 3;
      String dow = "Friday";
      System.out.println(fe.dayOfWeekInMonth());
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
	
      
      LocalDate fechaRef  = LocalDate.of(2021,Month.MARCH,23);
      System.out.println(fechaRef);
      LocalDate fechaFinal  = fechaRef.with(TemporalAdjusters.dayOfWeekInMonth(5, DayOfWeek.FRIDAY));
      System.out.println(fechaFinal);
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      
      LocalDate fechaRef2 = LocalDate.of(2021, 06, 23);
      System.out.println(fechaRef2);
      
      LocalDate primerDiaMes = fechaRef2.with (TemporalAdjusters.firstDayOfMonth ()); 
      System.out.println (primerDiaMes);
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      LocalDate fechaRef3 = LocalDate.of(2021, 06, 24);
      System.out.println(fechaRef3);
      
      LocalDate primerDiaProxMes = fechaRef3.with(TemporalAdjusters.firstDayOfNextMonth());
      System.out.println(primerDiaProxMes);
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      
      LocalDate fechaRef4 = LocalDate.now();
      System.out.println(fechaRef4);
      
      LocalDate primerDiaProxYear = fechaRef4.with(TemporalAdjusters.firstDayOfNextYear());
      System.out.println(primerDiaProxYear);
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      LocalDate fechaRef5 = LocalDate.now();
      System.out.println(fechaRef5);
      
      LocalDate primerDiaActualYear = fechaRef5.with(TemporalAdjusters.firstDayOfYear());
      System.out.println(primerDiaActualYear);
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      LocalDate formatoNormal = LocalDate.now();
      System.out.println(formatoNormal);
      System.out.println("\n");
      String miFormato = "MM.yyyy.dd";
      DateTimeFormatter miFormato2 = DateTimeFormatter .ofPattern(miFormato);
      System.out.println(miFormato);
      System.out.println(miFormato2.format(localDate.of(2021, 06, 22)));
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
	
      
      LocalDate fechaActual1 = LocalDate.now();

      
      System.out.println(fechaActual1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
      System.out.println(fechaActual1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
      System.out.println(fechaActual1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
	
	}

}
