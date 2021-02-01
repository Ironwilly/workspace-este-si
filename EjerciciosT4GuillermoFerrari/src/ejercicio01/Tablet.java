package ejercicio01;

import utilidades.Leer;

public class Tablet extends Ordenador{
	
	//atributos
	private double pulgadasTa;
	private double bateria;
	
	//constructores
	public Tablet(int capacidadHd, double frecuCpu, double precioBase, int ram, double pulgadasTa, double bateria) {
		super(capacidadHd, frecuCpu, precioBase, ram);
		this.pulgadasTa = pulgadasTa;
		this.bateria = bateria;
	}
	
	//getters and setters

	public double getPulgadasTa() {
		return pulgadasTa;
	}

	public void setPulgadasTa(double pulgadasTa) {
		this.pulgadasTa = pulgadasTa;
	}

	public double getBateria() {
		return bateria;
	}

	public void setBateria(double bateria) {
		this.bateria = bateria;
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Tablet [pulgadasTa=" + pulgadasTa + ", bateria=" + bateria + ", capacidadHd=" + capacidadHd
				+ ", frecuCpu=" + frecuCpu + ", precioBase=" + precioBase + ", ram=" + ram + "]";
	}
	
	
	//metodos
	
	public double calcularPrecioFinal(int porcentaje) {
		
		
		int denominador = 100;
		double precioFinal;
		int plusSeguro = 15;
		
	
		
		
		precioFinal =precioBase + (precioBase*porcentaje)/denominador  + plusSeguro;
		return precioFinal;
		
		
		
	}



	
	
	
	
	
	
	
	
	
	
	

}
