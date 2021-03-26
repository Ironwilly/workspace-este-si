package prueba01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.WEEKS;
import static java.time.temporal.ChronoUnit.YEARS;


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
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      
      LocalDate fechaRef6 = LocalDate.now();
      System.out.println(fechaRef6);
      
      LocalDate diaRestado = fechaRef6.minusDays(280);
      System.out.println(diaRestado);
      LocalDate semanaRestada = fechaRef6.minusWeeks(3);
      System.out.println(semanaRestada);
      LocalDate yearRestado = fechaRef6.minusYears(8);
      System.out.println(yearRestado);
      
      
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      
      LocalDate fechaRef9 = LocalDate.now();
      
      LocalDate diasSumados = fechaRef9.plusDays(40);
      System.out.println(diasSumados);
      LocalDate semanasSumadas = fechaRef9.plusWeeks(25);
      System.out.println(semanasSumadas);
      LocalDate mesesSumados = fechaRef9.plusMonths(30);
      System.out.println(mesesSumados);
      LocalDate yearsSumados = fechaRef9.plusYears(20);
      System.out.println(yearsSumados);
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      
      LocalDate fechaRef7 = LocalDate.now();
      LocalDate fechaRef8 = LocalDate.of(1989, 07, 14);
      
      long numeroDeDias = DAYS.between(fechaRef8, fechaRef7);
      long numeroSemanas = WEEKS.between(fechaRef8, fechaRef7);
      long numeroMeses = MONTHS.between(fechaRef8, fechaRef7);
      long numeroYears = YEARS.between(fechaRef8, fechaRef7);
      System.out.println(numeroDeDias);
      System.out.println(numeroSemanas);
      System.out.println(numeroMeses);
      System.out.println(numeroYears);
      
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      
      LocalDate fechaRef10 = LocalDate.of(2021, 11, 18);
      LocalDate fechaRef11 = LocalDate.of(2021,11, 18);
      
      System.out.println(fechaRef10.compareTo(fechaRef11));
      
      LocalDate fechaRef12 = LocalDate.of(2021, 3, 15);
      LocalDate fechaRef13 = LocalDate.of(2015, 6, 11);
      
      System.out.println(fechaRef12.compareTo(fechaRef13));
      
      LocalDate fechaRef14 = LocalDate.of(2001, 8, 15);
      LocalDate fechaRef15 = LocalDate.of(2030, 1, 25);
      
      System.out.println(fechaRef14.compareTo(fechaRef15));
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      DateTimeFormatter miFormato3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
      
      String fechaRef16 = "2010/07/25";
      
      LocalDate cadAnalizada = LocalDate.parse(fechaRef16, miFormato3);
      
      
      System.out.println(miFormato3.format(cadAnalizada)); 
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      LocalDate fechaRef17 = LocalDate.of(2010, 9, 16);
      System.out.println(fechaRef17);
      IsoChronology iso = localDate.getChronology();
      System.out.println(iso);
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      LocalDate fechaRef18 = LocalDate.now();
      System.out.println(fechaRef18);
      System.out.println(fechaRef18.hashCode());
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      LocalDate fechaRef19 = LocalDate.now();
      System.out.println(fechaRef19);
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      LocalDate fechaRef20 = LocalDate.of(2040, 7, 10);
      System.out.println(fechaRef20);
      System.out.println(fechaRef20.isLeapYear());
      System.out.println("\n");
      LocalDate fechaRef21 = LocalDate.of(2041, 7, 10);
      System.out.println(fechaRef21);
      System.out.println(fechaRef21.isLeapYear());
      
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      
      LocalDate fechaRef22 = LocalDate.of(2010, 7, 14);
      LocalDate fechaRef23 = LocalDate.of(2012, 1, 22);
      Period diferenciaFecha = fechaRef22.until(fechaRef23);
      System.out.println(fechaRef22);
      System.out.println(fechaRef23);
      System.out.println(diferenciaFecha);
     
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      LocalDate fechaRef24 = LocalDate.of(2019, 1, 6);
      LocalDate sumaSemanas = fechaRef24.plusWeeks(10);
      System.out.println(fechaRef24);
      System.out.println(sumaSemanas);
     
      
      
      
      
      
     
      
	
	}

}
