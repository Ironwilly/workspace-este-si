package ejercicioEnClase;

public class LineaDeVenta {
	
	//atributos
	
	private int cantidad;
	private Producto p;
	
	
	
	//constructores
	
	public LineaDeVenta(int cantidad, Producto p) {
		super();
		this.cantidad = cantidad;
		this.p = p;
		
	}

	
	//getters and setters

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public Producto getP() {
		return p;
	}


	public void setP(Producto p) {
		this.p = p;
	}
	
	
	//To String


	@Override
	public String toString() {
		return "LineaDeVenta [cantidad=" + cantidad + ", p=" + p + "]";
	}


	
	//metodos
	
	public double calcularSubtotal(double descuento,int topeDias ) {
		
		return cantidad*p.calcularPvp(descuento, topeDias); // lo traemos del metodo de calcular pvp en producto
	}

	
	

	
	
}
