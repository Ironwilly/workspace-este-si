package repasando;

public class Apartamento extends HabitacionEstandar{
	
	//atributos
	private double extraServLimpieza;
	private boolean servLimpieza;
	
	//constructores
	public Apartamento(double precioBase, boolean ocupada, int numOcupantes, int numDias, double extraServLimpieza,
			boolean servLimpieza) {
		super(precioBase, ocupada, numOcupantes, numDias);
		this.extraServLimpieza = extraServLimpieza;
		this.servLimpieza = servLimpieza;
	}
	
	//getters and setters 

	public double getExtraServLimpieza() {
		return extraServLimpieza;
	}

	public void setExtraServLimpieza(double extraServLimpieza) {
		this.extraServLimpieza = extraServLimpieza;
	}

	public boolean isServLimpieza() {
		return servLimpieza;
	}

	public void setServLimpieza(boolean servLimpieza) {
		this.servLimpieza = servLimpieza;
	}

	//ToString
	
	@Override
	public String toString() {
		return "Apartamento [extraServLimpieza=" + extraServLimpieza + ", servLimpieza=" + servLimpieza + super.toString() +"]";
	}

	
	//métodos
	@Override
	public double calcularPrecioHabi(double descuento) {
		
		
		return super.calcularPrecioHabi(descuento)+extraServLimpieza;
	}
	
	
	
	
	
	

}
