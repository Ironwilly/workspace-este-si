package repasando2;

public class Movil extends Producto{

	//atributos
	
	private String marca;
	private String modelo;
	
	//constructores
	
	public Movil(double precioBase, int unidades, String nombre, boolean vendido, String marca, String modelo) {
		super(precioBase, unidades, nombre, vendido);
		this.marca = marca;
		this.modelo = modelo;
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


	
	//ToString

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + super.toString() + "]";
	}


	//Métodos

	@Override
	public double calcularPvp(double porcentaje,double suplemento) {
		
		int denominador = 100;
		
		return super.getPrecioBase() + (super.getPrecioBase()*porcentaje)/denominador;
	}


	

	
	
	
	
	
}
