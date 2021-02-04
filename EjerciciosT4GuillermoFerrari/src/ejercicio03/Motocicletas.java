package ejercicio03;

public class Motocicletas extends Vehiculos{
	
	//atributos
	
	private double cilindrada;
	private double cv;
	
	
	//constructores
	public Motocicletas(double impuesto, double cilindrada, double cv) {
		super(impuesto);
		this.cilindrada = cilindrada;
		this.cv = cv;
		
	}
	
	//getters and setters

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getCv() {
		return cv;
	}

	public void setCv(double cv) {
		this.cv = cv;
	}

	
	
	//to string

	@Override
	public String toString() {
		return "Motocicletas [cilindrada=" + cilindrada + ", cv=" + cv + "]";
	}
	
	
	//métodos
	


public double calcularImpuesto(double impuesto, double porcentajePotencia,double porcentajeCilindrada,double impMercancias) {
	
	double impMoto;
	int denominador = 100;
	
	impMoto = super.calcularImpuesto(impuesto,porcentajePotencia, porcentajeCilindrada,impMercancias) + (porcentajePotencia*cv/denominador);
		
		return impMoto;
	}
	
	
	
	
	
	
	
	
	

}
