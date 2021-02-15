package ejercicio05;

public class EmpleadoFijo extends Empleado{
	
	//atributos
	
	private double impuestos;
	
	//constructores

	public EmpleadoFijo(String nombre, double sueldoBase, double recaudadoVentas, int numEmpleado, double impuestos) {
		super(nombre, sueldoBase, recaudadoVentas, numEmpleado);
		this.impuestos = impuestos;
	}
	
	// getters and setters

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	
	//to String 
	
	@Override
	public String toString() {
		return "EmpleadoFijo [impuestos=" + impuestos + ", getNombre()=" + getNombre() + ", getSueldoBase()="
				+ getSueldoBase() + ", getRecaudadoVentas()=" + getRecaudadoVentas() + ", getNumEmpleado()="
				+ getNumEmpleado()  ;
	}
	
	
	//métodos 
	
	public double calcularImpuestos(double sueldoBase, double impuestos) {
		
		int denominador = 100;
		
		
		return (super.getSueldoBase()*impuestos)/100;
	}

	

	@Override
	public double calcularSueldo() {
		

		
		return super.getSueldoBase() - calcularImpuestos(super.getSueldoBase(), impuestos);
		
		
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	

}
