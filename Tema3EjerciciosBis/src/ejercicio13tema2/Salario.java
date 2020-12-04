package ejercicio13tema2;

public class Salario {

	// atributo

	private double nomina;

	// constructor

	public  Salario(double nomina) {

		this.nomina = nomina;

	}

	// getters and setters

	public double getNomina() {
		return nomina;
	}

	public void setNomina(double nomina) {
		this.nomina = nomina;
	}

	// to string

	@Override
	public String toString() {
		return "Salario [nomina=" + nomina + "]";
	}

	// metodo calcula salario si trabaja <= 40 horas

	public double calcularSalario(double horas) {

		double precio = 16;
		double salario;

		salario = precio * horas;

		return salario;

		
	}

	
	public double calcularSalario2(double horas) {
		
		double precio=16;
		double tope=40;
		double precioExtra=20;
		double salario;
		
        salario= precio*tope + (horas - tope)*precioExtra;
        return salario;
        	
        	
			
			
			
		}
			
			
		
	}

