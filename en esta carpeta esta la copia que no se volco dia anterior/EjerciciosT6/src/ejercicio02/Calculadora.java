package ejercicio02;

public class Calculadora {

	
	
	//atributos
	
	private int numero1;
	private int numero2;
	
	//constructores
	
	public Calculadora(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	//getters and setters

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	
	//toString 
	
	@Override
	public String toString() {
		return "Calculadora [numero1=" + numero1 + ", numero2=" + numero2 + "]";
	}
	
	//métodos
	
	//método para calcular la suma de 2 números enteros
	
	public int calcularSuma(int a, int b) {
		
		return a+b;
	}
	
	//método para calcular la resta de 2 números enteros
	
	public int calcularResta(int a,int b) {
		
		return a-b;
	}
	
	//método para calcular la multiplicación de 2 números enteros
	
	public int calcularMultiplicacion(int a,int b) {
		
		return a*b;
	}
	
	//método para calcular la división de 2 números enteros
	
	public int calcularDivision(int a,int b)throws ArithmeticException {
		
		return a/b;
	}
	
	//método para calcular la raiz cuadrada de un número 
	
	public int calcularRaizCuadrada(int a)throws ArithmeticException {
		
		return (int) Math.sqrt(a);
	}
}
