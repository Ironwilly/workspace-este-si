package boletinExamenEjer01;

public class HabitacionEstandar {
	
	
	//atributos
	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int numDiasOcupacion;
	private int numOcupantes;
	
	//Constructores
	public HabitacionEstandar(double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupacion,
			int numOcupantes) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.numDiasOcupacion = numDiasOcupacion;
		this.numOcupantes = numOcupantes;
	}

	//getters and setters
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumDiasOcupacion() {
		return numDiasOcupacion;
	}

	public void setNumDiasOcupacion(int numDiasOcupacion) {
		this.numDiasOcupacion = numDiasOcupacion;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	//ToString
	
	@Override
	public String toString() {
		return "HabitacionEstandar [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente="
				+ nombreCliente + ", numDiasOcupacion=" + numDiasOcupacion + ", numOcupantes=" + numOcupantes + "]";
	}
	
	//metodos
	
	public double calcularPrecioHabitacion( double precioB, int numDiasOcu, double dineroGastadoServH,double des,double extraLimpieza) {
		
		return precioBase*numDiasOcupacion;
	}

	
	
	
	
	

}
