package ejercicio01BoletinExamen;

public class Automovil extends Vehiculo{

	
	//atributos
	
	private double impuestos = 6;
	
	//constructores

	public Automovil(double costeFabricacion, double impuestos) {
		super(costeFabricacion);
		this.impuestos = impuestos;
	}
	
	//getters and setters

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	
	//toString

	@Override
	public String toString() {
		return "Automovil [impuestos=" + impuestos + super.toString() +"]";
	}

	
	
	//Metodos

	@Override
	public double calcularPvp(double costeFab,double imp) {
		
		return super.getCosteFabricacion() + impuestos;
	}
	
	
	
	
	
	

	
	

	
	

	//toString


	
	
	
	
	
	
	
	
	
	
	
}
