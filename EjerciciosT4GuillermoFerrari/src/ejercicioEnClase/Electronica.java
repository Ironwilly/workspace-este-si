package ejercicioEnClase;

public class Electronica extends Producto{
	
	//atributos
	
	double impuesto;
	boolean seguro;
	
	//constructores
	
	public Electronica(String nombre, double precioBase, double pvp, double impuesto, boolean seguro) {
		super(nombre, precioBase, pvp);
		this.impuesto = impuesto;
		this.seguro = seguro;
	}

	
	// getters and setters
	
	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}


	
	//To String
	
	@Override
	public String toString() {
		return "Electronica [impuesto=" + impuesto + ", seguro=" + seguro + super.toString() + "]";
		
	}
	
	//metodos
	 
	
	
	
	
	@Override
	public double calcularPvp(double descuento, int topeDias) {
		int denominador = 100;
		return super.getPvp()+(super.getPvp()*impuesto)/denominador;
	}
	
	
	@Override
	public double calcularPvp(double descuento, int topeDias) {
double totalSeguro;
		
		double precioSeguro = 20;
		
		
		if(seguro == true) {
			totalSeguro= calcularImpuesto(precio) +precioSeguro;
		}else {
			
			totalSeguro = calcularImpuesto(precio);
		}
		return totalSeguro;
	}


	public double calcularSeguro(double precio) {
		double totalSeguro;
		
		double precioSeguro = 20;
		
		
	
	
	
	

}
