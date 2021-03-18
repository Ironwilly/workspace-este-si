package prueba01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
	LocalDate fecha2 = LocalDate.parse(este, f4);
	System.out.println(este);
		
	}

}
