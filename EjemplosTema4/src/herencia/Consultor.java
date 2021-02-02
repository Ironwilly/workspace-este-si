package herencia;

public class Consultor extends Trabajador {
	
	/* ponemos la palabra extends para heredar de la clase Trabajador */
	/* unicamente ponemos los atributos no comunes en la clase heredada*/
	
	private int horas;
	private double tarifa;
	
	
	//constructor consultor
	public Consultor(String nombre, String puesto, int horas, double tarifa) {
		super(nombre, puesto); // el super es una llamada al constructor de la clase madre
		this.horas = horas;
		this.tarifa = tarifa;
	}

	//getters and setters

	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getTarifa() {
		return tarifa;
	}


	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	
	
	//to string (con metodos heredados))
	
	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + ", getNombre()=" + getNombre() + ", getPuesto()="
				+ getPuesto() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
	//metodos
	
	public double calcularPaga() {
		
		
		return horas * tarifa;
	}
	
	
	
	
	
	
	
	

}
