package ejemploAcceso;

public class Producto {

	// a los atributos le vamos a poner private, y a lo demas public
	
	private String nombre;
		private double precio;
		
		public Producto(String nombre, double precio) {
			
			this.nombre = nombre;
			this.precio = precio;
		}


		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		
		
		
		
	
	
}
