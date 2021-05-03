package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;

	public Persona(String nombre, String apellidos, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}

	public Persona() {

	}

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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni + "]";
	}

	public void LeerDatosPersonales() {
		boolean salir=true;
		Scanner sc = new Scanner(System.in);
		String temp;
		String nombre, apellidos, dni;
		int edad;

		do {
			
	
		try {
			// Lectura de nombre por teclado
			System.out.println("Introduce el nombre");
			temp = sc.nextLine();
			nombre = temp.toString();
			// Lectura de apellidos por teclado
			System.out.println("Introduce los apellidos");
			temp = sc.nextLine();
			apellidos = temp.toString();
			// Lectura de dni por teclado
			System.out.println("Introduce la edad");
			temp = sc.nextLine();
			edad = Integer.parseInt(temp);
			// Lectura por teclado del dni
			System.out.println("Introduce el dni");
			temp = sc.nextLine();
			dni = temp.toString();

			salir=false;
		} catch (NumberFormatException i) {
			System.err.printf("\nException: %s\n", i);
			System.out.println("Debes introducir un número entero");
			
		}
		} while (salir);
	}

}
