package ejercicioEnClase;

public abstract class Producto {
	
	
	
	//atributos
	private String nombre;
	private double precioBase;
	private double pvp;
	
	//constructores
	
	public Producto(String nombre, double precioBase, double pvp) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.pvp = pvp;
	}
	
	
	//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	
	//To String


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", pvp=" + pvp + "]";
	}
	
	// metodos
	
	public abstract double calcularPvp(double descuento, int topeDias);
	
	
	
	
	
	
	
	
	
	
	
	

}
