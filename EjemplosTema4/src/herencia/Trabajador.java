package herencia;

public class Trabajador {

	
	private String nombre;
	private String puesto;
	
	
	
	//constructor de un trabajador
	
	public Trabajador(String nombre, String puesto) {
		
		this.nombre = nombre;
		this.puesto = puesto;
	}


	//getter and setter

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getPuesto() {
		return puesto;
	}



	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	//to string
	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + "]";
	}
	
	
	//metodos
	
	public double calcularPaga() {
		return 0.0;
	}
	
	
	
	
}
