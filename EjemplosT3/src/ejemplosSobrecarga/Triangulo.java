package ejemplosSobrecarga;

public class Triangulo {
	
	
	
	//atributos
	
	private double base;
	private double altura;
	private String tipo;
	
	
	//constructores
	
	public Triangulo (double base, double altura, String tipo) {
		
		this.base=base;
		this.altura=altura;
		this.tipo=tipo;
	}
		//vamos a sobrecargar el constructor, que es tener un mismo contructor con mismo nombre, pero le cambiamos los parametros
		
		
		public Triangulo (double base, double altura) {
			
			this.base=base;
			this.altura=altura;
			
		}


		
		
		
		//getter and setters
		
		// los set solo se utilizan para modificar el valor de un atributo ( es decir, cuando haya q machacar el valor original)
		// los get solo se utilizan para mostrar el valor del atributo
		
		public double getBase() {
			return base;
		}


		public void setBase(double base) {
			this.base = base;
		}


		public double getAltura() {
			return altura;
		}


		public void setAltura(double altura) {
			this.altura = altura;
		}


		public String getTipo() {
			return tipo;
		}


		public void setTipo(String tipo) {
			this.tipo = tipo;
		}


		//to string
		
		
		@Override
		public String toString() {
			return "Triangulo [base=" + base + ", altura=" + altura + ", tipo=" + tipo + "]";
		}
		
		
		
		//metodos
		
		public double calcularArea () {
			
			
			double dos = 2.0;
			
			return (base*altura)/dos;
		}
		
		
		//este es una prueba de metodo con sobrecarga (mirar en apuntes metodos sobrecarga)
		public double calcularArea (double cantidad) {
			
			double dos=2.0;
			return ((base*altura)/dos)- cantidad;
			
		}
		
		
		
		
		
		
		
	
	
	
	
	
	
	

}


