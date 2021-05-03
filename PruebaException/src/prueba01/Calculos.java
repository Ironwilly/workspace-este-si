package prueba01;

public class Calculos {
	
	private int a;
	private int b;
	
	
	public Calculos(int a, int b) {
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
		return "Calculos [a=" + a + ", b=" + b + "]";
	}
	
	
	
	//métodos
	
	//método dividir
	
	public int dividir(int a1, int b1) {
		
		return a1/b1;
	}
	
	
	//método raiz cuadrada 
	
	public double raizCuadrada(int a1) {
		
		return Math.sqrt(a1);
	}

	//metodos de aviso
	
static void mostrarAlerta1(int a1,int b1)throws Alerta {
		
		throw new Alerta("mensaje de alerta1");
	}
static void mostrarAlerta2(int a1,int b1)throws Alerta {
	
	throw new Alerta("mensaje de alerta2");
	
}

static void mostrarAlerta3(int a1)throws Alerta{
	
	throw new Alerta("Mensaje de alerta3");
}
}
