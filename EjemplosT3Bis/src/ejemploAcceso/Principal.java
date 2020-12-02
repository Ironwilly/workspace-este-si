package ejemploAcceso;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p;
		p = new Producto("Patatas", 2.50);  /// no funciona ya al ser privado

		p.setPrecio(14.50);  // usando los getters and setters si se puede acceder al private
		
		
	}
	
	
	
	
	
	

}
