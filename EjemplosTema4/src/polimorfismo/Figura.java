package polimorfismo;

public abstract class Figura {
	
	
	// atributos
	private String nombre;
	private String color;
	
	
	//constructores
	
	
	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}
	
	public Figura() {
		
	}

	
	// getters and setter

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	
	//to String 
	
	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}
	
	
	// metodos
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
	
	public void metodoSoloDeFigura() {
		System.out.println("Solo estoy en la clase figura, sin sobrescribir en las hijas");
	}
	
	
	
	
	

}
