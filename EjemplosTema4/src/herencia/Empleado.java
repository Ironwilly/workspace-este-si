package herencia;

public class Empleado extends Trabajador {

	/* ponemos la palabra extends para heredar de la clase Trabajador */
	/* unicamente ponemos los atributos no comunes en la clase heredada*/
	
	private double sueldo;
	private double impuestos;
	
	
	//constructor empleado
	public Empleado(String nombre, String puesto, double sueldo, double impuestos) {
		super(nombre, puesto);  // el super es una llamada al constructor de la clase madre
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	
	
	//getter and setter

	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public double getImpuestos() {
		return impuestos;
	}


	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}



	//to string (con metodos heredados)
	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", getNombre()=" + getNombre()
				+ ", getPuesto()=" + getPuesto() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	//metodos
	
	public double calcularPaga() {
		super.calcularPaga();   // esto se pone para llamar al metodo de la clase TRABAJADOR, 
								// ya que desde el main, al no ser publica no se puede acceder, agregando esto, 
		                        // se llamaria, y desde el main se invocaria al metodo de la clase empleado, que este invoca al de trabajador
		
		return sueldo - impuestos;
	}
	
	
	
}
