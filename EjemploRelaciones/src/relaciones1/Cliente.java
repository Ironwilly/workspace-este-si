package relaciones1;

public class Cliente {

	//atributos
	
	private String nombre;
	private int edad;
	private String dni;
	
	
	//constructores 
	
	public Cliente(String nombre, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		
		
	}

	//getters and setter

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

	
	//to string
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	
	
}
