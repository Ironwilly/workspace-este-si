package ejercicio9;

import java.util.Arrays;
import java.util.Random;

import utilidades.Leer;

public class Alumno {
	
	//atributos
	
	private String nombre;
	private String curso;
	private double []notas;
	
	//Constructores
	public Alumno(String nombre, String curso, double[] notas) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.notas = notas;
	}
	
	//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	//To string
	
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	
	//métodos
	
	//cargar arrays
	
	public void cargarNotas() {
		
		
		
		for(int i=0;i<notas.length;i++) {
			
			System.out.println("Introduzca una nota del alumno ");
			//notas[i]=Leer.datoDouble(); /// esto esta mal,nunca se LEE POR TECLADO dentro de un metodo, las lecturas van en el main
			
			//
			
		}
			
			
		}
		
		
		//calcular la nota media del alumno
		
		public double calcularMedia() {
		
		double media;
		
		media=media+cargarNotas
		
		
	}
	
	

}
