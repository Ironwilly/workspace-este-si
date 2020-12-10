package ejemplo1;

import java.util.Arrays;

public class Trabajador {

	// atributos

	private String nombre;
	private double[] horasTrabajadas;
	private double precioHora;

	// constructor
	public Trabajador(String nombre, double[] horasTrabajadas, double precioHora) {

		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.precioHora = precioHora;
	}

	// getter and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double[] getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double[] horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

	// toString

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", horasTrabajadas=" + Arrays.toString(horasTrabajadas)
				+ ", precioHora=" + precioHora + "]";
	}

	
	//metodo que calcula el sueldo de un trabajador
	
	public double calcularSueldo() {
		
		
		double sumaHoras=0.0;
		for(int i=0;i<horasTrabajadas.length;i++) {
			
			sumaHoras=sumaHoras +horasTrabajadas[i];
			
			
			
		}
		
		return sumaHoras*precioHora;
	}
	
	//metodo para calcular sueldo neto
	
	public double calcularSueldoNeto(double porc) {
		
		double total, den=100.0, sueldoNeto;
		
		total=calcularSueldo();
		sueldoNeto=total-total*porc/den;
		return sueldoNeto;
	}
	
	
	
}
