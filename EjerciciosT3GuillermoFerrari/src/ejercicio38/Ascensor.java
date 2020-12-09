package ejercicio38;

import utilidades.Leer;

public class Ascensor {

	// atributos

	private int plantaActual;
	private int plantaFinal;
	private int pesoMax = 750;

	// constructores

	public Ascensor(int plantaActual, int plantaFinal, int pesoMax) {

		this.plantaActual = plantaActual;
		this.plantaFinal = plantaFinal;
		this.pesoMax = pesoMax;

	}
	
	//getters and setters

	public int getPlantaActual() {
		return plantaActual;
	}

	public void setPlantaActual(int plantaActual) {
		this.plantaActual = plantaActual;
	}

	public int getPlantaFinal() {
		return plantaFinal;
	}

	public void setPlantaFinal(int plantaFinal) {
		this.plantaFinal = plantaFinal;
	}

	public int getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}

	
	//Tostring
	
	@Override
	public String toString() {
		return "Ascensor [plantaActual=" + plantaActual + ", plantaFinal=" + plantaFinal + ", pesoMax=" + pesoMax + "]";
	}

	//métodos
	
	//método mostrar si sube 
	
	public void subirBajar(int plantaActual) {
	 int pisoA;
	 int pisoF;
	 
	 pisoA=Leer.datoInt();
	 pisoF=Leer.datoInt();
	 if(pisoF>pisoA) {
		 
		 System.out.println("🡡");
		 
		 
	 }else {
		 System.out.println("🡣");
	 }
	 
	 
	
	 
	 
	}

}
