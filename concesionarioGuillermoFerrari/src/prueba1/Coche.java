package prueba1;

public class Coche {
	
	
	//atributos
	
	private String marca;
	private String modelo;
	private int potencia;
	private String color;
	
	//constructores 
	
	public Coche(String marca, String modelo, int potencia, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.color = color;
	}

	
	//getters and setters
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	//toString

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", color=" + color + "]";
	}
	
	
	
	
	
	
	

}
