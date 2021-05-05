package prueba01;

public class Calculo {
	
	private int a;
	private int b;
	
	
	public Calculo(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "Calculo [a=" + a + ", b=" + b + "]";
	}
	
	
	//métodos
	
	public int dividir(int a1, int b1) {
		
		return a1/b1;
	}
	
	
	public double raizCuadrada(int a1) {
		
		return Math.sqrt(a1);
	}
	
	
	static void mostrarAviso1(int a1, int b1)throws Aviso{
		
		throw new Aviso ("Aviso primero");
	}

	static void mostrarAviso2(int a1)throws Aviso{
		
		throw new Aviso ("Aviso segundo");
	}
}
