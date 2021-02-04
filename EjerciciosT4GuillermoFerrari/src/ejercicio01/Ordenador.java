package ejercicio01;

import utilidades.Leer;

public class Ordenador {
	
	//atributos
	protected int capacidadHd;
	protected double frecuCpu;
	protected double precioBase;
	protected int ram;
	
	//constructores
	
	public Ordenador(int capacidadHd, double frecuCpu, double precioBase, int ram) {
		super();
		this.capacidadHd = capacidadHd;
		this.frecuCpu = frecuCpu;
		this.precioBase = precioBase;
		this.ram = ram;
	}

	//getters and setters
	public int getCapacidadHd() {
		return capacidadHd;
	}


	public void setCapacidadHd(int capacidadHd) {
		this.capacidadHd = capacidadHd;
	}


	public double getFrecuCpu() {
		return frecuCpu;
	}


	public void setFrecuCpu(double frecuCpu) {
		this.frecuCpu = frecuCpu;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}

	//toString
	
	@Override
	public String toString() {
		return "Ordenador [capacidadHd=" + capacidadHd + ", frecuCpu=" + frecuCpu + ", precioBase=" + precioBase
				+ ", ram=" + ram + "]";
	}
	
	
	
	//metodos
	
	public double calcularPrecioFinal(int ganancias,double porcentajeSeguro) {
		
		
		int denominador = 100;
		double precioFinal;
		
		
		
		
		precioFinal = precioBase + (precioBase*ganancias)/denominador ;
		return  precioFinal;
		
		
		
		
	}
	
	

}
