package ejemplo1;

public class Producto {
	
	
	//atributos
	private String nombre;
	private double precio;
	private int cantidad;
	
	
	
	
	//constructores
	public Producto(String nombre, double precio, int cantidad) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}


	//getters and setters


	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public double getPrecio() {
		return precio;
	}




	public void setPrecio(double precio) {
		this.precio = precio;
	}




	public int getCantidad() {
		return cantidad;
	}




	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	//to string

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
	//metodo usando array pasado desde fuera
	
	public double calcularPrecioFinal(int []listadoDescuentos) {
		
		double precioFinal=precio;
		
		for(int i= 0;i<listadoDescuentos.length;i++) {
			
			
			precioFinal=precioFinal - listadoDescuentos[i];
					
					
		}
		
		return precioFinal;
		
		
		
		
		
	}
	
	
 
	
	

}
