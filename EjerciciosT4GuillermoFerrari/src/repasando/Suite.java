package repasando;

public class Suite extends HabitacionEstandar{
	
	
	//atributos
	private double metrosCuadrados;
	private double consumoServHab;
	
	//constructores 
	
	public Suite(double precioBase, boolean ocupada, int numOcupantes, int numDias, double metrosCuadrados,
			double consumoServHab) {
		super(precioBase, ocupada, numOcupantes, numDias);
		this.metrosCuadrados = metrosCuadrados;
		this.consumoServHab = consumoServHab;
	}
	
	//getters and setters

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getConsumoServHab() {
		return consumoServHab;
	}

	public void setConsumoServHab(double consumoServHab) {
		this.consumoServHab = consumoServHab;
	}

	
	//ToString
	
	@Override
	public String toString() {
		return "Suite [metrosCuadrados=" + metrosCuadrados + ", consumoServHab=" + consumoServHab + super.toString() +"]";
	}

	
	//métodos
	
	@Override
	public double calcularPrecioHabi(double descuento) {
		
		int denominador = 100;
		
		return super.calcularPrecioHabi(descuento) + consumoServHab - (super.getPrecioBase()*descuento)/denominador;
	}
	
	
	
	
	
	
	
	

}
