package ejercicio03;

public class Termometro {
	
	//atributos 
	
	private double temperaturaCelsius;
	
	//constructores
	
	public Termometro() {
		super();
		
	}

	public Termometro(double temperaturaCelsius) {
		super();
		this.temperaturaCelsius = temperaturaCelsius;
	}

	//getters and setters
	
	public double getTemperaturaCelsius() {
		return temperaturaCelsius;
	}

	public void setTemperaturaCelsius(double temperaturaCelsius) {
		this.temperaturaCelsius = temperaturaCelsius;
	}

	//toString
	
	@Override
	public String toString() {
		return "Termometro [temperaturaCelsius=" + temperaturaCelsius + "]";
	}
	
	//métodos
	
	//método para pasar de celsius a fahrenheit
	
	public double pasarCelsiusAFahrenheit(double grados) {
		double numerador = 9;
		double denominador = 5;
		double elementoASumar = 32;
		
		return (grados *(numerador/denominador))+ elementoASumar;
	}
	
	
	
	

}
