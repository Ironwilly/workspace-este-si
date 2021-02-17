package repasando;

import java.util.Arrays;

public class GestionDeHabitaciones {

	//atributo
	private HabitacionEstandar lista [];

	
	//constructor
	public GestionDeHabitaciones(HabitacionEstandar[] lista) {
		super();
		this.lista = lista;
	}


	//getters and setters
	public HabitacionEstandar[] getLista() {
		return lista;
	}


	public void setLista(HabitacionEstandar[] lista) {
		this.lista = lista;
	}


	
	//ToString
	@Override
	public String toString() {
		return "GestionDeHabitaciones [lista=" + Arrays.toString(lista) + "]";
	}
	
	//métodos
	
	
	public double calcularPrecioHabitacion(int numLista,double descuento) {
		
		return lista[numLista-1].calcularPrecioHabi(descuento);
	}
	
	public double calcularRecaudacionTotal(double descuento) {
		
		double sumaTotal =0;
		for (int i=0;i<lista.length;i++) {
			if(lista[i].isOcupada()) {
				sumaTotal = sumaTotal + lista[i].calcularPrecioHabi(descuento);
				
			}
			
		}
		return sumaTotal;
	}
	
	public void mostrarHabLibres() {
		
		for(int i=0;i<lista.length;i++) {
			if(lista[i].isOcupada()) {
				
			}else {
				System.out.println(lista[i].toString());
			}
		}
	}
	
	
	public void mostrarFactura(int numLista, double descuento) {
		
		System.out.println("***********************\r\n"
				+ "***********************\r\n"
				+ "Precio base -------> " + lista[numLista-1].getPrecioBase() +"\r\n"
				+ "Número ocupantes -->" + lista[numLista-1].getNumOcupantes() +"\r\n"
				+ "Número de días ---->" + lista[numLista-1].getNumDias() +"\r\n"
				
				+ "\r\n"
				+ "total ------------->" + lista[numLista-1].calcularPrecioHabi(descuento) +"\r\n"
				+ "***********************\r\n"
				+ "***********************");
	}
	
	
	
	
}
