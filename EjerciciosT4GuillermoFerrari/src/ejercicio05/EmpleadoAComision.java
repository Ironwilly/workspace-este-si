package ejercicio05;

public class EmpleadoAComision extends Empleado{
	
	//atributo 
	
	private double incentivos;

	//constructor
	
	public EmpleadoAComision(String nombre, double sueldoBase, double recaudadoVentas, int numEmpleado,
			double incentivo) {
		super(nombre, sueldoBase, recaudadoVentas, numEmpleado);
		this.incentivos = incentivo;
	}
	
	
	
	//getters and setters

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}



	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}



	@Override
	public double getSueldoBase() {
		// TODO Auto-generated method stub
		return super.getSueldoBase();
	}



	@Override
	public void setSueldoBase(double sueldoBase) {
		// TODO Auto-generated method stub
		super.setSueldoBase(sueldoBase);
	}



	@Override
	public double getRecaudadoVentas() {
		// TODO Auto-generated method stub
		return super.getRecaudadoVentas();
	}



	@Override
	public void setRecaudadoVentas(double recaudadoVentas) {
		// TODO Auto-generated method stub
		super.setRecaudadoVentas(recaudadoVentas);
	}



	@Override
	public int getNumEmpleado() {
		// TODO Auto-generated method stub
		return super.getNumEmpleado();
	}



	@Override
	public void setNumEmpleado(int numEmpleado) {
		// TODO Auto-generated method stub
		super.setNumEmpleado(numEmpleado);
	}



	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}
	
	//to String
	
	
	@Override
	public String toString() {
		return "EmpleadoAComision [incentivo=" + incentivos + ", getNombre()=" + getNombre() + ", getSueldoBase()="
				+ getSueldoBase() + ", getRecaudadoVentas()=" + getRecaudadoVentas() + ", getNumEmpleado()="
				+ getNumEmpleado() + ", getIncentivo()=" + getIncentivos() + "]";
	}
	

	
	//métodos 
	
	
	public double calcularIncentivos(double recaudado,double porcentaje) {
		
		int denominador=100;
		

		
		return  (super.getRecaudadoVentas()*porcentaje)/denominador;
		
		 
	}
	
	




	



	@Override
	public double calcularSueldo() {
		
		
		
		return super.getSueldoBase() + calcularIncentivos(super.getRecaudadoVentas(), incentivos);
	}

	
	
	
	
	
	
	

}
