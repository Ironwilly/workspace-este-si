package ejercicio02;

public class TarjetaDeVisita extends Documento{
	
	
	//atributos 
	
	
	private String nombre = " Lucas";
	private String apellidos = "García Navarro";
	private String email = "lucasgarcianavarro@gmail.com";
	private String telefono = "666555444";
	
	
	//constructores
	
	public TarjetaDeVisita(String encabezado, String nombre, String apellidos, String email, String telefono) {
		super(encabezado);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	//to String
	
	
	@Override
	public String toString() {
		return "TarjetaDeVisita [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", telefono="
				+ telefono + "]";
	}
	
	
	//métodos
	
       public void imprimirDatos() {
		
		System.out.println(nombre+"\t"+apellidos+"\nEmail: "+email+"\nTeléfono: "+telefono);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
