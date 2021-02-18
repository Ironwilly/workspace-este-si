package ejercicio;

public class Furgoneta extends Vehiculo{

	//atributos
	
	private double longitud;

	
	//constructores
	public Furgoneta(String matricula, int tiempoEstacionado, double longitud) {
		super(matricula, tiempoEstacionado);
		this.longitud = longitud;
	}


	//getter and setters
	public double getLongitud() {
		return longitud;
	}


	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	//ToString

	@Override
	public String toString() {
		return "Furgoneta [longitud=" + longitud + super.toString() + "]";
	}

	
	//métodos

	@Override
	public double calcularPrecio(double cantidad,double extra) {
		
		int tam =4;
		double pagar=0;
		if(longitud >tam) {
			pagar=pagar + super.calcularPrecio(cantidad,extra) + extra*(longitud - tam);
			
			mostrarAviso();
			
			
		}else {
			pagar=pagar + super.calcularPrecio(cantidad,extra);
		}
		
			
		
		
		return pagar;
	}
	
	
	public void mostrarAviso() {
		int tam2 =8;
		if(longitud >tam2) {
			System.out.println("¡Cuidado,si furgoneta mide mas de 8 metros y debe de aparcar en zona especial!");
		}
	}
	
	
	
	
	
}
