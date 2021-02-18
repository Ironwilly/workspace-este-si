package ejercicio;

public class Vehiculo {
	
	//atributos
	
	String matricula;
	int tiempoEstacionado;
	
	//constructores
	public Vehiculo(String matricula, int tiempoEstacionado) {
		super();
		this.matricula = matricula;
		this.tiempoEstacionado = tiempoEstacionado;
	}

	//getters and setters
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getTiempoEstacionado() {
		return tiempoEstacionado;
	}

	public void setTiempoEstacionado(int tiempoEstacionado) {
		this.tiempoEstacionado = tiempoEstacionado;
	}

	
	//ToString
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", tiempoEstacionado=" + tiempoEstacionado + "]";
	}
	
	
	
	
	//métodos
	
	public double calcularPrecio(double cantidad,double extra) {
		
		return tiempoEstacionado*cantidad;
	}

}
