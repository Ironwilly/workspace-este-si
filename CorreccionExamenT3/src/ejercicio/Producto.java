package ejercicio;

public class Producto {

	
	//atributo
	
	String nombre;    /// A LOS ATRIBUTOS NO SE LE DAN NUNCA VALORES INICIALES,SOLO A LAS VARIABLES EN LA PRINCIPAL (MAIN)
	double precioBase;
	int seccion;          //los nombres de los atributos siempre empiezan en minusculas
	boolean rebajado;
	double pvp;
	
	
	//constructores
	
	public Producto(String nombre, double precioBase, int seccion, boolean rebajado, double pvp) {
		this.nombre=nombre;
		this.precioBase=precioBase;
		this.seccion=seccion;
		this.rebajado=rebajado;
		this.pvp=pvp;
		
	}
	
	public Producto(String nombre, double precioBase, int seccion, boolean rebajado) {
		this.nombre=nombre;
		this.precioBase=precioBase;
		this.seccion=seccion;
		this.rebajado=rebajado;
		
		
	}

	
	//to string
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", seccion=" + seccion + ", rebajado="
				+ rebajado + ", pvp=" + pvp + "]";
	}
	
	
	//metodo pvp
	public double calcularPvp(double porcGanancia) {  // La palabra public indica que partes del programa tiene acceso a ese codigo
		double den=100.0;
		double resultado;
		
		pvp=precioBase+((precioBase*porcGanancia)/den);
		
		return pvp;
		
		
	}
	
	//metodo aplicar descuento
	
	public double aplicarDescuento(double porcDescuento) {
		
		double den=100.0;
		double resul=0.0;
		if (rebajado) {
			resul=pvp-(pvp*porcDescuento)/den;
			
			
		}else {
			
			resul=pvp;
		}
			
		return resul;
		
		
	}
	
	//metodo cambio a libras
	public double cambiarALibras(double cambio) {
		
		return pvp*cambio;
		
	}
	
	//metodo para imprimir
	
	
	public void imprimirGanga() {
		
		double tope=3.0;
		if (pvp<tope) {
			
			System.out.println("Menuda ganga!!");
		}
		
		
	}
	
	
	
	
	
}
