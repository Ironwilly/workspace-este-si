package trianaSteam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.List;
import java.util.Set;
import static java.time.temporal.ChronoUnit.DAYS;

import java.time.Clock;
import java.time.Instant;

public class Plataforma {
	


	//atributo
	private String nombrePlatf = "TrianaSteam";
	
	
	
	//constructor
	
	
	public Plataforma(String nombrePlatf) {
		super();
		this.nombrePlatf = nombrePlatf;
	}

	
	
	//métodos
	
	//agregar videojuego
	
	
	
	
	
	//elegir la zona dependiendo del lugar que estés
	
	public  void elegirZona (String zona,int year,int mes,int dia) {
		
		Clock hora = Clock.systemDefaultZone();
		LocalDate fechaRef1 = LocalDate.of(year, mes, dia);
		



        Instant ahora = hora.instant();
        
        ZoneId zonaRef1 = ZoneId.of(zona);
        ZonedDateTime zonaRef2 = ZonedDateTime.ofInstant(ahora,zonaRef1);
		
		
		System.out.println(zonaRef2);
		System.out.println(fechaRef1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
	}

	//obtener el identificador de zona
	
	public  void verZona() {
		
		System.out.println("Como referencia puedes ayudarte de las siguientes zonas como ejemplo: \n");
		System.out.println("Europe/Jersey\r\n"
				+ "America/El_Salvador\r\n"
				+ "Africa/Nairobi\r\n"
				+ "Europe/Brussels\r\n"
				+ "Canada/Atlantic\r\n"
				+ "Europe/Rome\r\n"
				+ "Europe/Budapest\r\n"
				+ "America/Detroit");
		/*Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(zoneIds +"\n");*/
	}
	
	//sumar un dia para mostrar fecha de entrega
	
	public  void sumarUnDia (int year,int mes,int dia) {
		int day = 1;
		
		LocalDate fechaRef2 = LocalDate.of(year, mes, dia);
		LocalDate sumarDia = fechaRef2.plusDays(day);
		
		System.out.println(sumarDia);
	
	}
	
	
	//calcular diferencias de días desde que alquila hasta que devuelve el videojuego
	
	public  void diferenciaDeDias(int year,int mes, int dia,int year2,int mes2,int dia2) {
		
		double penalizacion = 3;
		double aPagar ;
		int unidad = 1;
		
		
		LocalDate fechaAlquiler = LocalDate.of(year, mes, dia);
		LocalDate fechaDevolver = LocalDate.of(year2, mes2, dia2);
		
		long numeroDias = DAYS.between(fechaAlquiler, fechaDevolver);
		if(numeroDias >0 && numeroDias <2) {
			System.out.println("No tienes ninguna penalización, la entrega está dentro de plazo correcto.");
			
		}else if(numeroDias <0) {
			
			System.out.println("Estás loco!!, ¿cómo vas a entregar un juego antes de la fecha de alquier?");
		}else {
			
			System.out.println("No has entregado dentro del plazo correcto, "
					+ "se te cobrará una penalización de 3€ por día de demora");
			
			aPagar= (numeroDias-unidad) * penalizacion;
			System.out.println("En este caso,se te cobrará por demora de entrega un total de "+aPagar+" euros");
		}
		
	}
	
	
	//dias que faltan para el próximo 50%
	
	public  void diasQueFaltan () {
		
		LocalDate fechaActual = LocalDate.now();
		System.out.print("Desde la fecha actual "+fechaActual);
		LocalDate primeroMes = fechaActual.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.print(" hasta "+ primeroMes);
		Period diferenciaFecha = primeroMes.until(fechaActual);
		System.out.println(" faltan un periodo de "+diferenciaFecha+" días para la siguiente \n"
				+ "promoción del 50% en alquiler de videojuegos. \n");
		
		
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
			System.out.printf("En este caso el precio por videojuego alquilado es de %.2f euros \n",precio);
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
		System.out.println("***Este descuento se aplicará si no coincide con ningún descuento adicional***");
		
	}
		//mostrar fecha y hora actual
		
		public void mostrarFechaYHora(){
			LocalDateTime fecHora = LocalDateTime.now();
			
			System.out.println(fecHora);
		}
		
	
}
