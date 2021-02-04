package ejercicio03;

public class Coches extends Vehiculos{

	// atributos

	private double cilindrada;
	private double cv;
	private String combustible;

	// constructores

	public Coches(double impuesto, double cilindrada, double cv, String combustible) {
		super(impuesto);
		this.cilindrada = cilindrada;
		this.cv = cv;
		this.combustible = combustible;
	}
	

	// getters and setters

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


	public String getCombustible() {
		return combustible;
	}


	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	// to String

	@Override
	public String toString() {
		return "Coches [cilindrada=" + cilindrada + ", cv=" + cv + ", combustible=" + combustible + "]";
	}



	// métodos

	

	

	public double calcularImpuesto(double impuesto, double porcentajePotencia,double porcentajeCilindrada,double impMercancias) {
		
		double impCoche;
		int denominador = 100;
		
		impCoche = super.calcularImpuesto(impuesto, porcentajePotencia, porcentajeCilindrada,impMercancias) + (porcentajeCilindrada*cilindrada)/denominador;

		return impCoche;
	}


	

	

}
