package ejercicio1;

public class Impresora {

	// atributos

	double precio;
	String marca;
	boolean laser;
	boolean multifuncion;

	// constructores

	public Impresora(double precio, String marca, boolean laser, boolean multifuncion) {

		this.precio = precio;
		this.marca = marca;
		this.laser = laser;
		this.multifuncion = multifuncion;

	}

	public Impresora(double precio, String marca) {

		this.precio = precio;
		this.marca = marca;
		
		

	}
	public Impresora() {

		
		
		

	}

}
