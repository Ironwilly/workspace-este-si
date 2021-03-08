package ejercicio05;

public class Persona implements Comparable <Persona> {
	
	//atributos
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	private String email;
	
	//constructores 
	
	public Persona(String nombre, String apellidos, int edad, String dni, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//To String

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni + ", email="
				+ email + "]";
	}

	
	//métodos
	
	
	//orden natural simple basado en el atributo edad
	
	@Override
	public int compareTo(Persona p) {
		// TODO Auto-generated method stub
		
		
		if(this.edad<p.edad) {
			
			return -1;
		}else {
			
		if(this.edad>p.edad){
			return 1;
		}
		}
		
		return 0;
	}
	
	
	
	
	
	
	

}
