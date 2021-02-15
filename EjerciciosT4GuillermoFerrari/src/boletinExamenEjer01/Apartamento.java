package boletinExamenEjer01;

public class Apartamento extends HabitacionEstandar{
	
	
	//atributos
	private boolean servicioLimpieza;
	private double extraServicioLimpieza;
	
	//constructores
	
	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int numDiasOcupacion, int numOcupantes,
			boolean servicioLimpieza, double extraServicioLimpieza) {
		super(precioBase, ocupada, nombreCliente, numDiasOcupacion, numOcupantes);
		this.servicioLimpieza = servicioLimpieza;
		this.extraServicioLimpieza = extraServicioLimpieza;
	}
	
	
	//getters and setters

	public boolean isServicioLimpieza() {
		return servicioLimpieza;
	}

	public void setServicioLimpieza(boolean servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}

	public double getExtraServicioLimpieza() {
		return extraServicioLimpieza;
	}

	public void setExtraServicioLimpieza(double extraServicioLimpieza) {
		this.extraServicioLimpieza = extraServicioLimpieza;
	}

	//ToString

	@Override
	public String toString() {
		return "Apartamento [servicioLimpieza=" + servicioLimpieza + ", extraServicioLimpieza=" + extraServicioLimpieza
				+ super.toString() +"]";
	}


	
	//metodos
	
	@Override
	public double calcularPrecioHabitacion(double precioB, int numDiasOcu, double dineroGastadoServH,
			double des,double extraLimpieza) {
		// TODO Auto-generated method stub
		return super.calcularPrecioHabitacion(super.getPrecioBase(), super.getNumDiasOcupacion(), dineroGastadoServH, des,extraServicioLimpieza)+
				extraServicioLimpieza ;
	}
	
	
	
	
	
	
	
	
	
	

}
