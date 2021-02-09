package ejemploApuntes;

public class Circulo extends Figura {
	private double radio;

	public Circulo() {
	}

	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularArea() {
// TODO Auto-generated method stub
		return Math.PI * radio * radio;
	}

	@Override
	public double calcularPerimetro() {
// TODO Auto-generated method stub
		return 2 * Math.PI * radio;
	}

	public void mostrarRadianes() {
		System.out.println(
				"Solo estoy en la clase C�rculo, porque los dem�s no pueden tener radianes en concreto tengo 2 piradianes");
	}
}