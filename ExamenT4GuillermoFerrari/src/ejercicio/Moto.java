package ejercicio;

public class Moto extends Vehiculo{

	
	//atributros
	private int cc;

	
	//constructores
	public Moto(String matricula, int tiempoEstacionado, int cc) {
		super(matricula, tiempoEstacionado);
		this.cc = cc;
	}

	//getters and setters

	public int getCc() {
		return cc;
	}


	public void setCc(int cc) {
		this.cc = cc;
	}

	//ToString
	
	@Override
	public String toString() {
		return "Moto [cc=" + cc + super.toString() + "]";
	}

	
	//métodos
	
	@Override
	public double calcularPrecio(double cantidad, double extra) {
		
		int denominador = 2;
		double pagar =0 ;
		int tam = 49;
		
		if(cc < tam) {
			
			pagar=pagar + super.calcularPrecio(cantidad, extra)/denominador;
			
		}else {
			pagar=pagar + super.calcularPrecio(cantidad, extra);
		}
		
		return pagar;
	}
	
	
	
	
	
	
	
	
	
	
}
