package prueba1;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.time.temporal.ChronoUnit.DAYS;;




/**
 * 
 * @author Guillermo Ferrari
 * @version 1.1 19/04/2021
 *
 */

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
	
	
	/**
	 * 
	 * Este método busca pasandole el parámetro marca en una lista de coche, la marca a buscar
	 * @param marca es string
	 * 
	 */

	
	public void buscarMarcaStream(String marca) {
		
		 ListaDeCoches
				.stream()
				.filter(x -> x.getMarca().equalsIgnoreCase(marca))
				.forEach(x -> System.out.println(x));
				
	}
	
	
	
	//método ficticio
	

	/**
	 * 
	 * Este método devuelve el resultado de la suma, pasándole 2 parámetros
	 * @param numero1 primer número a sumar
	 * @param numero2 segundo número a sumar
	 * @return devuelve la suma del numero1 + numero2
	 * 
	 */
	
	
	public int sumarDosNumeros(int numero1, int numero2) {
		
		return numero1 + numero2;
		
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
	
	
	

}
