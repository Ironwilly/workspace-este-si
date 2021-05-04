package com.salesianostriana.primerodam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.salesianostriana.primerodam.dao.CrudAlumnoEnMemoria;
import com.salesianostriana.primerodam.dao.ICrudAlumno;
import com.salesianostriana.primerodam.modelo.Alumno;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
		 * 
		 * 
		 * 
		 * Se pide implementar un proyecto (puede ser un proyecto Java, de los de toda
		 * la vida) que tenga la siguiente estructura:
		 * 
		 * Paquete com.salesianostriana.primerodam.modelo 
		 * Clase Alumno Atributos: id(long), nombre (String), apellidos (String), fechaNacimiento (LocalDate),
		 * email (String). 
		 * 
		 * Metodos: constructor sin parámetros, constructor con (todos los) parámetros, getters y setters, hashCode, equals, toString. 
		 * Más métodos:getEdad(): debe devolver la edad del alumno a 31/12 del año en curso. 
		 * Paquete com.salesianostriana.primerodam.dao Interfaz CrudAlumno. Métodos List<Alumno>
		 * findAll() Alumno findOne(long id) void insert(Alumno alumno) void edit(Alumno
		 * alumno) void delete(Alumno alumno) 
		 * 
		 * Clase CrudAlumnoEnMemoria. Debe implementar el interfaz CrudAlumno. Almacenará los alumnos en un
		 * ArrayList<Alumno>. Paquete com.salesianostriana.primerodam.servicios Clase
		 * AlumnoServicio. Utiliza una instancia de CrudAlumno. Debe tener un método por
		 * cada método de CrudAlumno. Es lo que se conoce como un envoltorio.
		 * También tendrá el método List<Alumno> getByOrdenAlfabetico(), que devolverá
		 * todos los alumnos por orden alfabético (¿qué tal usando api stream y
		 * lambdas?) También tendrá el método List<Alumno> getByEdad(), que devolverá
		 * todos los alumnos por orden alfabético (¿qué tal usando api stream y
		 * lambdas?) 
		 * 
		 * Paquete com.salesianostriana.primerodam 
		 * Clase App. 
		 * Método main
		 * Utilizará una instancia de AlumnoServicio. Insertará como datos de ejemplo a
		 * algunos alumnos de la clase. Mostrará dichos alumnos por orden alfabético.
		 * Editará un alumno Añadirá uno nuevo Mostrará los alumnos por orden de edad a 31/12.
		 * 
		 * 
		 * @author Guillermo Ferrari
		 * 
		 * 
		 * 
		 */
		String fechNacimiento;
		
		Scanner sc = new Scanner(System.in);
		
		Alumno al = new Alumno();
		
	
		CrudAlumnoEnMemoria calm = new CrudAlumnoEnMemoria(new ArrayList<Alumno>());
	
		
		
		
		
	}

}
