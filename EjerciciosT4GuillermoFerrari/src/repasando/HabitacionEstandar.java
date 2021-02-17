package repasando;

public class HabitacionEstandar {
	
	//atributos
	private double precioBase;
	private boolean ocupada;
	private int numOcupantes;
	private int numDias;
	
	
	//Constructores
	
	public HabitacionEstandar(double precioBase, boolean ocupada, int numOcupantes, int numDias) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.numOcupantes = numOcupantes;
		this.numDias = numDias;
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








	public int getNumOcupantes() {
		return numOcupantes;
	}








	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}








	public int getNumDias() {
		return numDias;
	}








	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	
	//ToString


	@Override
	public String toString() {
		return "HabitacionEstandar [precioBase=" + precioBase + ", ocupada=" + ocupada + ", numOcupantes="
				+ numOcupantes + ", numDias=" + numDias + "]";
	}



	//Métodos
	
	
	public double calcularPrecioHabi(double descuento) {
		
		return precioBase * numDias;
	}




	
	
	
	

}
