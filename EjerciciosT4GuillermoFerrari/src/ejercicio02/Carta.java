package ejercicio02;

public class Carta extends Documento {

	// atributo

	private String fecha = "03/02/2021";

	// constructor

	public Carta(String encabezado, String fecha) {
		super(encabezado);
		this.fecha = fecha;
	}

	// getters and setters

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	// to String

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + ", getEncabezado()=" + getEncabezado() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	// método

	public void imprimirDatos() {

		System.out.println("\n\n\t Fecha: "+fecha);

	}

}
