package ejercicio03;

public class Vehiculos {

	
	//atributos
	
	private double impuesto ;

	
	//constructores 
	
	public Vehiculos(double impuesto) {
		super();
		this.impuesto = impuesto;
		
		
	}

	//getters and setters
	
	
	public double getImpuesto() {
		return impuesto;
	}


	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	
	//To String

	@Override
	public String toString() {
		return "Vehiculos [impuesto=" + impuesto + "]";
	}
	
	//métodos
	
	public double calcularImpuesto(double impuesto, double porcentajePotencia,double porcentajeCilindrada,double impMercancias) {
		
		return impuesto;
	}
	
	
	
	
	
	
	
}
