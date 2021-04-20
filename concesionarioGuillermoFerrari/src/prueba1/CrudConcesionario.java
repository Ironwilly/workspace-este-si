package prueba1;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.time.temporal.ChronoUnit.DAYS;;





public class CrudConcesionario {
	
	
	
	//atributos
	private List<Coche> ListaDeCoches;

	//constructor
	
	public CrudConcesionario(List<Coche> listaDeCoches) {
		super();
		ListaDeCoches = listaDeCoches;
	}
	
	//getters and setters

	public List<Coche> getListaDeCoches() {
		return ListaDeCoches;
	}

	public void setListaDeCoches(List<Coche> listaDeCoches) {
		ListaDeCoches = listaDeCoches;
	}

	
	//toString
	@Override
	public String toString() {
		return "Concesionario [ListaDeCoches=" + ListaDeCoches + "]";
	}
	
	
	
	//métodos
	
	//buscar por marca de coche 
	


	
	public void buscarMarcaStream(String marca) {
		
		 ListaDeCoches
				.stream()
				.filter(x -> x.getMarca().equalsIgnoreCase(marca))
				.forEach(x -> System.out.println(x));
				
	}
	
	

	
	
	//buscar por color
	
	public void buscarColorStream (String color) {
		
		ListaDeCoches
				.stream()
				.filter(x -> x.getColor().equalsIgnoreCase(color))
				.forEach(x -> System.out.println(x));
				
		
	}
	
	
	
	//buscar por modelo
	

	
	public void buscarModeloStream (String modelo) {
		
		
		 ListaDeCoches
				.stream()
				.filter(x -> x.getModelo().equalsIgnoreCase(modelo))
				.forEach(x -> System.out.println(x));
	}
	
	//ordenar lista por orden alfabetico de marca
	
	public void ordenarPorMarca() {
		
		ListaDeCoches = ListaDeCoches
		.stream()
		.sorted((co1,co2)-> co1.getMarca().compareToIgnoreCase(co2.getMarca()))
		.collect(Collectors.toList());
		
	}
	
	//ordenar lista por orden alfabetico modelo
	
	public void ordenarPorModelo() {
		
		ListaDeCoches = ListaDeCoches
				.stream()
				.sorted((co1,co2)-> co1.getModelo().compareToIgnoreCase(co2.getModelo()))
				.collect(Collectors.toList());
	}
	
	//ordernar lista por potencia
	
	public void ordenarPorPotencia() {
		
		ListaDeCoches = ListaDeCoches
				.stream()
				.sorted(Comparator.comparingInt(x -> x.getPotencia()))
				.collect(Collectors.toList());
	}
	
	//fecha actual
	
	public void mostrarFechaYHoraActual() {
		
		LocalDateTime fecharef = LocalDateTime.now();
		
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd ' del ' MM ' del año' YYYY 'a la hora ' kk':'mm ");
		System.out.println(fecharef.format(patron));
		
		
	}
	
	
	//método agregar coche
	
	public void agregarCoche(Coche co) {
		
		ListaDeCoches.add(co);
	}
	
	//método para calcular la antigüedad del coche
	
	
	public void calcularAntiguedad(String fecha1) {
		
	
		
		  LocalDate fecha2 = LocalDate.now();
	        LocalDate fecha3 = LocalDate.parse(fecha1, DateTimeFormatter.ISO_LOCAL_DATE);

	        Period antiguedad = fecha2.until(fecha3);
	        System.out.println("Su coche tiene una antigüedad de : "+antiguedad);
		
		
	}

}
