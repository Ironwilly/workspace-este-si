package ejercicio39;

import java.util.Arrays;
import java.util.Random;

public class Alumno {
	
	/*
	Crea una clase que se llame Alumno cuyas características sean Nombre, apellidos, id y un array de int para 
	las notas de sus asignaturas.

	Crear métodos en esa misma clase que hagan lo siguiente:

	Rellenar el array de forma aleatoria con notas. El mayor y menor valor de una nota se dará como parámetro.
	Calcular la nota media.
	Mostrar las notas en forma de tabla.
	Dar la mejor nota obtenida.
	Devolver el número de suspensos.
	Debe tener un main donde se prueben todas las funcionalidades (no es obligatorio que haya menú, pero sí 
			que se repita hasta que el usuario diga) con un solo objeto tipo Alumno.
			*/
	
	//atributos
	
	private String nombre;
	private String apellidos;
	private int id;
	private int notas[];
	
	
	//constructores
	
	public Alumno(String nombre, String apellidos, int id, int[] notas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.notas = notas;
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


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int[] getNotas() {
		return notas;
	}


	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	//to string
	
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", notas="
				+ Arrays.toString(notas) + "]";
	}

	//métodos
	
	//notas aleatorias
	
	public void calcularNotas(int desde, int hasta) {
		
		
		Random  r;
		int ale=0;
		r = new Random(System.nanoTime());
		for(int i=0;i<notas.length;i++) {
			
			
			
			
			
			ale=r.nextInt(hasta-desde+1)+desde;	
			notas[i]=ale;
			
		}
		
		//método calcular nota media
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
