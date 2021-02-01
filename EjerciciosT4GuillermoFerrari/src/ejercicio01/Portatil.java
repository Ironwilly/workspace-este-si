package ejercicio01;

import utilidades.Leer;

public class Portatil extends Ordenador{
	
	
	
	//atributos
	private double pulgadas;
	private double peso;
	
	//constructores
	public Portatil(int capacidadHd, double frecuCpu, double precioBase, int ram, double pulgadas, double peso) {
		super(capacidadHd, frecuCpu, precioBase, ram);
		this.pulgadas = pulgadas;
		this.peso = peso;
	}

	//getters and setters
	public double getPulgadas() {
		return pulgadas;
	}


	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	//toString
	@Override
	public String toString() {
		return "Portatil [pulgadas=" + pulgadas + ", peso=" + peso + ", capacidadHd=" + capacidadHd + ", frecuCpu="
				+ frecuCpu + ", precioBase=" + precioBase + ", ram=" + ram + "]";
	}
	
	
	//metodos
	
	public double calcularPrecioFinal(int porcentaje) {
		
		
		int denominador = 100;
		double precioFinal;
		int descuento = 8;
		
	
		
		
		precioFinal = (precioBase + (precioBase*porcentaje)/denominador);
	    precioFinal = precioFinal - (precioFinal*descuento)/denominador ;
		return precioFinal;
		
		
		
	}

	
	
	
	
	

}
