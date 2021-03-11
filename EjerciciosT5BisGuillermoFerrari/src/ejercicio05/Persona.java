package ejercicio05;

public class Persona implements Comparable <Persona>{
	
	//atributos
	
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	private String movil;
	
	//constructores
	public Persona(String nombre, String apellido, int edad, String dni, String movil) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.movil = movil;
	}

	
	//getters and setters 
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}


	//ToString
	
	@Override
	public String toString() {
		return "\n"+"Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", movil="
				+ movil +"]" ;
	}


	
	//Métodos
	
	//Orden natural por nombre alfabéticamente
	@Override
	public int compareTo(Persona p1) {
		
		
		
		return (this.nombre.compareTo(p1.nombre));
	}
	
	
	
	
	
	
	

}
