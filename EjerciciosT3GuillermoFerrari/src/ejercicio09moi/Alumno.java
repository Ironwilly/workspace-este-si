package ejercicio09moi;

import java.util.Arrays;
import java.util.Random;

import utilidades.Leer;

public class Alumno {
	
	private int id;
	private String nombre;
	private String apellidos;
	private double [] notas;
	
	//Construtores
	
	public Alumno(int id, String nombre, String apellidos, double[] notas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notas = notas;
	}

	
	
	
	//Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}



	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", notas="
				+ Arrays.toString(notas) + "]";
	}
	
	
	//Métodos
	
	
	public void mostarNotas () {
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i+1) + "\t");
		}
		System.out.println();
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + "\t");
		}
		System.out.println();
	}
	
	
	public double calcularMedia (int nNotas) {
		double sumaNotas = 0;
		
		for (int i = 0; i < notas.length; i++) {
			sumaNotas = sumaNotas + notas[i];
		}
		
		 return sumaNotas / nNotas;
	}
	
	public int calcularNumeroSuspensos () {
		double aprobado = 5.0;
		int suspensos =0;
		
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < aprobado) {
				suspensos++;
			}
		}
		
		return suspensos;
	}
	
	
}
