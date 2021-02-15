package boletinExamenEjer01;

public class Suite extends HabitacionEstandar{

	
	//atributos
	
	private double metrosCuadrados;
	private double dineroGastadoServHab;
	private double descuento;
	
	//constructores
	
	public Suite(double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupacion, int numOcupantes,
			double metrosCuadrados, double dineroGastadoServHab, double descuento) {
		super(precioBase, ocupada, nombreCliente, numDiasOcupacion, numOcupantes);
		this.metrosCuadrados = metrosCuadrados;
		this.dineroGastadoServHab = dineroGastadoServHab;
		this.descuento = descuento;
	}

	
	//getters and setters
	
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getDineroGastadoServHab() {
		return dineroGastadoServHab;
	}

	public void setDineroGastadoServHab(double dineroGastadoServHab) {
		this.dineroGastadoServHab = dineroGastadoServHab;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	//ToString

	@Override
	public String toString() {
		return "Suite [metrosCuadrados=" + metrosCuadrados + ", dineroGastadoServHab=" + dineroGastadoServHab
				+ ", descuento=" + descuento + super.toString() + "]";
	}


	//metodos
	
	@Override
	public double calcularPrecioHabitacion(double precioB, int numDiasOcu, double dineroGastadoServH,double des,double extraLimpieza) {
		// TODO Auto-generated method stub
		
		int denominador = 100;
		
		return super.calcularPrecioHabitacion( super.getPrecioBase(),  super.getNumDiasOcupacion(), 
				dineroGastadoServHab, descuento,extraLimpieza)+dineroGastadoServHab -
				((super.calcularPrecioHabitacion( super.getPrecioBase(),  super.getNumDiasOcupacion(), 
						dineroGastadoServHab, descuento,extraLimpieza))*descuento)/denominador;
	}
	
	
	
	
	
	
	
	
	
	
}
