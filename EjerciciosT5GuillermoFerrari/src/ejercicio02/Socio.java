package ejercicio02;

public class Socio {
	
	
	// atributos
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String movil;
	private String email;
	private int numSocio;
	
	
	
	//constructores
	
	public Socio(String nombre, String apellidos, String dni, String movil, String email, int numSocio) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.movil = movil;
		this.email = email;
		this.numSocio = numSocio;
	}


	
	//getters and setters

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getNumSocio() {
		return numSocio;
	}
	
	

	//toString

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", movil=" + movil + ", email="
				+ email + ", numSocio=" + numSocio + "]";
	}



	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}
	
	
	
	
	

	
	
	
	
	
	
	

}
