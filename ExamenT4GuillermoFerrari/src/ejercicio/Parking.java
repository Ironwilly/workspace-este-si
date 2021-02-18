package ejercicio;

import java.util.Arrays;

public class Parking {

	
	//atributos
	
	private String direccion;
	Vehiculo lista[];
	
	//constructores
	public Parking(String direccion, Vehiculo[] lista) {
		super();
		this.direccion = direccion;
		this.lista = lista;
	}
	
	//getters and setters

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Vehiculo[] getLista() {
		return lista;
	}

	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}
	
	//ToString

	@Override
	public String toString() {
		return "Parking [direccion=" + direccion + ", lista=" + Arrays.toString(lista) + "]";
	}
	
	
	//métodos
	
	public double calcularPrecioUnVehiculo(Vehiculo v,double cantidad) {
		
		return v.getTiempoEstacionado()*cantidad;
		
	}
	
	public double calcularPrecioLista(Vehiculo lista[],double cantidad,double extra) {
		
		double resultado =0.0;
		
		for(int i=0;i<lista.length;i++) {
			
			resultado = resultado + lista[i].calcularPrecio(cantidad, extra);
			
			
			
		}
		return resultado;
	}
	
	public double calcularRecaudadoMotos(Vehiculo lista[],double cantidad, double extra) {
		
		double recaudado =0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i] instanceof Moto){
				
				recaudado = recaudado + lista[i].calcularPrecio(cantidad, extra);
				
			}
		}
		return recaudado;
	}
	
	
	
}
