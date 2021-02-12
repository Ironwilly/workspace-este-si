package ejercicio05;

public  class Empleado {
	
	
	//atributos
	private String nombre;
	private double sueldoBase;
	private double recaudadoVentas;
	private int numEmpleado;
	
	// constructores
	public Empleado(String nombre, double sueldoBase, double recaudadoVentas, int numEmpleado) {
		super();
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.recaudadoVentas = recaudadoVentas;
		this.numEmpleado = numEmpleado;
	}
	
	public Empleado () {
		
	}
	//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getRecaudadoVentas() {
		return recaudadoVentas;
	}

	public void setRecaudadoVentas(double recaudadoVentas) {
		this.recaudadoVentas = recaudadoVentas;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
	//To string

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", recaudadoVentas=" + recaudadoVentas
				+ ", numEmpleado=" + numEmpleado + "]";
	}
	
	
	//métodos
	
	public  double calcularSueldo() {
		return sueldoBase;
		
	}
		
		
	
	
	
	
	
	
	
	
	
	
	

}
