package ejercicio16T2;

public class Calculo {

	// atributos

	double resultado;

	// constructores

	public Calculo(double resultado) {

		this.resultado = resultado;

	}

	// metodo calcular suma

	public double calcularSuma(double a, double b) {

		resultado = a + b;
		return resultado;
	}
	// Metodo calcular resta

	public double calcularResta(double a, double b) {

		resultado = a - b;
		return resultado;

	}

	// Metodo calcular multiplicacion

	public double calcularMultiplicacion(double a, double b) {

		resultado = a * b;
		return resultado;

	}

	// Metodo calcular division
	public double calcularDivision(double a, double b) {

		resultado = a / b;
		return resultado;

	}

	
	// Método número par
	public boolean calcularPar(int a) {
		
		if (a%2 ==0) {
			
			return true;
			
		}else {
			return false;
		}
		
	}
	
}
