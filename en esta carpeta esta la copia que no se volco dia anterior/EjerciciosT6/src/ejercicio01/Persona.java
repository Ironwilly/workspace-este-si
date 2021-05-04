package ejercicio01;

import java.util.Scanner;

public class Persona {
	
	//atributos
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String DNI;
	
	
	
	//constructor
	public Persona(String nombre, String apellidos, int edad, String DNI) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		DNI = DNI;
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


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = DNI;
	}

	//toString
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", DNI=" + DNI + "]";
	}
	
	
	//métodos
	
	public void LeerDatosPersonales() throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		
		do {
		try {
	 System.out.println("Diga el nombre ");
	 nombre = sc.nextLine();
	 System.out.println("Diga los apellidos ");
	 apellidos = sc.nextLine();
	 System.out.println("Diga la edad ");
	 String aux = sc.nextLine();
	 edad = Integer.parseInt(aux);
	 System.out.println("Diga el DNI ");
	 DNI = sc.nextLine();
	 
	 System.out.println("Tus datos personales son: " + nombre +" "+ apellidos +" "+ edad+" " + DNI+" ");
	 continuar = false;
		}catch (NumberFormatException numberFormatException) {
			
			System.err.printf("\nException: %s\n",
			 numberFormatException);
		}
		
		}while(continuar);
	 
	}
	
	
	

}
