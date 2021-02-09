package ejemploApuntes;


public abstract class Figura {
	private String nombre, color;

	/*
	 * Es interesante el hecho de que sea una clase abstracta puesto que una figura
	 * es un objeto general, no sabemos c�mo calcular su �rea o su per�metro si no
	 * concretamos qu� tipo de figura es de todas formas se podr�a hacer
	 * perfectamente sin necesidad de que la clase Figura sea abstracta
	 */
	public Figura() {
	}

	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}

	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	public void metodoSoloDeFigura() {
		System.out.println("Solo estoy en la clase Figura, sin sobrescribir en las hijas");
	}
}

	
