package prueba1;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Collections;
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
	
	public Coche buscarMarcaStream(String marca) {
		
		return ListaDeCoches
				.stream()
				.filter(x -> x.getMarca().equalsIgnoreCase(marca))
				.findAny()
				.orElse(null);
	}
	
	
	//buscar por color
	
	public Coche buscarColorStream (String color) {
		
		return ListaDeCoches
				.stream()
				.filter(x -> x.getColor().equalsIgnoreCase(color))
				.findAny()
				.orElse(null);
		
	}
	
	//buscar por modelo
	
	public Coche buscarModeloStream (String modelo) {
		
		
		return ListaDeCoches
				.stream()
				.filter(x -> x.getModelo().equalsIgnoreCase(modelo))
				.findAny()
				.orElse(null);
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
				.sorted()
				.collect(Collectors.toList());
	}
	
	//fecha actual
	
	public void mostrarFechaYHoraActual() {
		
		LocalDateTime fecharef = LocalDateTime.now();
		
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd ' del ' MM ' del año' YYYY '\nHora ' hh':'mm ");
		System.out.println(fecharef.format(patron));
		
		
	}
	
	//agregar coche
	
	

}
