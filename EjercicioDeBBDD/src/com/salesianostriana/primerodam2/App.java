package com.salesianostriana.primerodam2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.salesianostriana.primerodam.dao.CrudAlumnoEnMemoria;
import com.salesianostriana.primerodam.dao.ICrudAlumno;
import com.salesianostriana.primerodam.modelo.Alumno;
import com.salesianostriana.primerodam.servicios.AlumnoServicio;



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
		
		
		long id;
		String nombre;
		String apellidos;
		LocalDate fechaNacimiento;
		String email;
		int menu1;
		
		List<Alumno> ListaAlumnos = new ArrayList<Alumno>();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1 --> Agregar alumno\r\n"
					+ "0 --> Salir \n");
		String aux0 = sc.nextLine();
		menu1 = Integer.parseInt(aux0);
		
		
		switch(menu1) {
		
		case 1:
		
		System.out.println("Diga el id del alumno \n");
		String aux1= sc.nextLine();
		id = Long.parseLong(aux1);
		System.out.println("Diga el nombre del alumno \n");
		nombre = sc.nextLine();
		System.out.println("Diga los apellidos del alumno \n");
		apellidos = sc.nextLine();
		System.out.println("Diga la fecha de nacimiento del alumno \n");
		String aux2 = sc.nextLine();
		fechaNacimiento = LocalDate.parse(aux2);
		System.out.println("Diga el email del alumno \n");
		email= sc.nextLine();
		

		Alumno al = new Alumno( id,  nombre,  apellidos,  fechaNacimiento,  email);
		
	
		AlumnoServicio aluSer = new AlumnoServicio();
		
		
		System.out.println(al);
		
		
		break;
		
		case 2:
			
			
			
		
		
		}
		
		}while(menu1 !=0);
		
		
	}

}
