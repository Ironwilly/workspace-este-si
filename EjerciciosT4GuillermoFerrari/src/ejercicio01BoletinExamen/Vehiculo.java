package ejercicio01BoletinExamen;

public class Vehiculo {

	// atributos
	private double costeFabricacion;

	// constructores
	public Vehiculo(double costeFabricacion) {
		super();
		this.costeFabricacion = costeFabricacion;
	}

    //getters and setters
	public double getCosteFabricacion() {
		return costeFabricacion;
	}

	public void setCosteFabricacion(double costeFabricacion) {
		this.costeFabricacion = costeFabricacion;
	}

	
	//ToString
	
	@Override
	public String toString() {
		return "Vehiculo [costeFabricacion=" + costeFabricacion + "]";
	}
	
	
	//Metodos
	
	public double calcularPvp(double costeFab,double imp) {
		
		return costeFabricacion;
	}
	

	
	
	
}
