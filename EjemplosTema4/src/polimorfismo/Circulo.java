package polimorfismo;

public class Circulo extends Figura{

	//atributos
	
	
	private double radio;
	
	// constructores
	
	
	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;
	}
	
	//getter and setter
	

	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	//to string
	

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	//metodos
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * radio*radio;
	}

	

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radio;
	}
	
	
	public void mostrarRadianes() {
		System.out.println("Solo estoy en la clase circulo "
				+ "porque los demas no pueden tener radianes "
				+ "en concreto tengo 2 pi radianes");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
