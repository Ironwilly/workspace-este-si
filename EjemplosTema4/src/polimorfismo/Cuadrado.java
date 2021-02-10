package polimorfismo;

public class Cuadrado extends Figura {

	
	//atributo
	private double lado;

	//constructor
	public Cuadrado() {
		
	}    //constructor vacio (sin parametros)
	
	
	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}

	//getter and setter

	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	
	
	//metodos
	

	
	
	public void mostrarLados() {
		System.out.println("Solo estoy en la clase cuadrado "
				+ "porque los demas no tienen lados "
				+ "en concreto tengo 4 lados");
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}


	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}
	
	

	
	
	
}
