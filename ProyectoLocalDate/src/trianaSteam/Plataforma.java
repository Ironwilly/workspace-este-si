package trianaSteam;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.Set;
import static java.time.temporal.ChronoUnit.DAYS;

public class Plataforma {
	


	
	
	//métodos
	
	//agregar videojuego
	
	
	
	
	
	//elegir la zona dependiendo del lugar que estés
	
	public  void elegirZona (String zona,int year,int mes,int dia) {
		
		LocalDate fechaRef1 = LocalDate.of(year, mes, dia);
		
		ZoneId zonaRef1 = ZoneId.of(zona);
		System.out.println(zonaRef1);
		System.out.println(fechaRef1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
	}

	//obtener el identificador de zona
	
	public  void verZona() {
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(zoneIds +"\n");
	}
	
	//sumar un dia para mostrar fecha de entrega
	
	public  void sumarUnDia (int year,int mes,int dia) {
		int day = 1;
		
		LocalDate fechaRef2 = LocalDate.of(year, mes, dia);
		LocalDate sumarDia = fechaRef2.plusDays(day);
		
		System.out.println(sumarDia);
	
	}
	
	
	//calcular diferencias de dias desde que alquila hasta que devuelve el videojuego
	
	public  void diferenciaDeDias(int year,int mes, int dia,int year2,int mes2,int dia2) {
		
		double penalizacion = 3;
		double aPagar ;
		int unidad = 1;
		
		
		LocalDate fechaAlquiler = LocalDate.of(year, mes, dia);
		LocalDate fechaDevolver = LocalDate.of(year2, mes2, dia2);
		
		long numeroDias = DAYS.between(fechaAlquiler, fechaDevolver);
		if(numeroDias <2) {
			System.out.println("No tienes ninguna penalización, la entrega está dentro de plazo correcto.");
			
		}else {
			
			System.out.println("No has entregado dentro del plazo correcto, "
					+ "se te cobrará una penalización de 3€ por día de demora");
			
			aPagar= (numeroDias-unidad) * penalizacion;
			System.out.println("En este caso,se te cobrará por demora de entrega un total de "+aPagar+" euros");
		}
		
	}
	
	
	//fecha actual
	
	public  void diasQueFaltan () {
		
		LocalDate fechaActual = LocalDate.now();
		System.out.print("Desde la fecha actual "+fechaActual);
		LocalDate primeroMes = fechaActual.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.print(" hasta "+ primeroMes);
		Period diferenciaFecha = primeroMes.until(fechaActual);
		System.out.println(" faltan un periodo de "+diferenciaFecha+" días para la siguiente \n"
				+ "promoción de 2x1 en alquiler de videojuegos. \n");
		
		
	}
	
	//calcular si es año bisiesto o no
	
	public  void calcularBisiesto(int year,int mes,int dia) {
		
		double precio =4.95;
		int porcentaje = 30;
		int denominador = 100;
		LocalDate fechaAMirar = LocalDate.of(year, mes, dia);
		if(fechaAMirar.isLeapYear()) {
			System.out.println("Es bisiesto!!, así que tendrás tus alquileres todo el año con un 30% descuento.");
			
			precio = (precio *porcentaje)/denominador + precio;
			System.out.println("En este caso el precio por videojuego alquilado es de "+precio+" euros \n");
		}else{
			System.out.println("ohhh!!!, no es bisiesto, no tienes descuento del 30% este año.");
		};
	}
	
	
	//Mostrar el primer día del mes de la fecha consultada
	
	public  void mostrarDiaPrimeroMes(int year,int mes,int dia) {
		
	
		LocalDate mostrarDia = LocalDate.of(year, mes, dia);
		LocalDate primeroMes = mostrarDia.with(TemporalAdjusters.firstDayOfMonth());
		
		
		System.out.println(primeroMes.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		
		
		
	}
	
	//Calcular 3 semanas para el descuento del 10%
	
	public  void calcularFechaTresSemanas(int year,int mes,int dia) {
		int tres= 3;
		
		LocalDate fechaRef3 = LocalDate.of(year, mes, dia);
		LocalDate sumaSemanas = fechaRef3.plusWeeks(tres);
		System.out.println(sumaSemanas);
		
	}
}
