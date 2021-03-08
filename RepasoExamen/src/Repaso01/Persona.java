package Repaso01;

public class Persona implements Comparable <Persona>{
	
	//atributos
	
	private  String nombre;
	private String apellido;
	private String dni;
	private int edad;
	
	//Constructores
	
	public Persona(String nombre, String apellido, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}

	//Getters and setters
	
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	//ToString
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + "]";
	}

	

	
	//Métodos
	//orden natural por edad

	@Override
	public int compareTo(Persona p) {
		// TODO Auto-generated method stub
		
		if(this.edad < p.edad) {
			return -1;
		}else {
			if(this.edad > p.edad) {
				return 1;
			}
			return 0;
			}
		}

	
	
	
	

}
