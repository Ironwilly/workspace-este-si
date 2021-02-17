package repasando2;

public abstract class Producto {
	
	
	//atributos
	
	private double precioBase;
	private int unidades;
	private String nombre;
	private boolean vendido;
	
	//constructores
	public Producto(double precioBase, int unidades, String nombre, boolean vendido) {
		super();
		this.precioBase = precioBase;
		this.unidades = unidades;
		this.nombre = nombre;
		this.vendido = vendido;
	}

	
	//getters and setters
	
	public double getPrecioBase() {
		return precioBase;
	}





	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}





	public int getUnidades() {
		return unidades;
	}





	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public boolean isVendido() {
		return vendido;
	}





	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}




	//ToString

	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", unidades=" + unidades + ", nombre=" + nombre + ", vendido="
				+ vendido + "]";
	}

	//métodos
	
	public abstract double calcularPvp (double porcentaje,double suplemento);
	
	
	
	

}
