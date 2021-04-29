package ejercicio04;

public class CEcuacion2Grado {
	
	//atributos
	
	private int a;
	private int b;
	private int c;
	
	//contructores 
	
	public CEcuacion2Grado(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	

	//getters and setters
	
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

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	//toString 
	
	@Override
	public String toString() {
		return "CEcuacion2Grado [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	//métodos
	
	
	public double  calcularEcuacion2Grado1(int a1,int b1, int c1) {
		
	
		
		return (-b1 + Math.sqrt((b1*b1)-(4*a1*c1)))/(2*a1);
		
		
	
	}
	
	
	public double  calcularEcuacion2Grado2(int a1,int b1, int c1) {
		
		
		return (-b1 - Math.sqrt((b1*b1)-(4*a1*c1)))/(2*a1);
		    
		
		
	}
	
	public double calcularDiscriminante(int a1,int b1,int c1) {
		
		return b1*b1 - 4*a1*c1;
		
	}
	
	public double raizUnica(int a1,int b1,int c1) {
		
		return a1-c1/b1;
	}
	

}
