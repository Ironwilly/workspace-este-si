package ejercicio03;

public class Furgonetas extends Vehiculos {

	// Atributos

	private double cilindrada;
	private double cv;
	private String combustible;

	// Contructores
	public Furgonetas(double impuesto, double cilindrada, double cv, String combustible) {
		super(impuesto);
		this.cilindrada = cilindrada;
		this.cv = cv;
		this.combustible = combustible;
	}

	// Getters and Setters

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

	// To String

	@Override
	public String toString() {
		return "Furgonetas [cilindrada=" + cilindrada + ", cv=" + cv + ", combustible=" + combustible + "]";
	}

	// Métodos

	public double calcularImpuesto(double impuesto, double porcentajePotencia, double porcentajeCilindrada,
			double impMercancias) {

		double impFurgoneta;

		impFurgoneta = super.calcularImpuesto(impuesto, porcentajePotencia, porcentajeCilindrada, impMercancias)
				+ impMercancias;

		return impFurgoneta;
	}

}
