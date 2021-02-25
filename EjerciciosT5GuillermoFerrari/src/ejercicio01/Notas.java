package ejercicio01;

import java.util.*;

public class Notas {
	
	//atributos
	
	private String nombre;
	private String telefono;
	private String email;
	
	//constructores 
	
	public Notas(String nombre, String telefono, String email) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}
	
	//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	//ToString
	
	@Override
	public String toString() {
		return "Notas [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}