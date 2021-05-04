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
		 * Metodos: constructor sin par�metros, constructor con (todos los) par�metros, getters y setters, hashCode, equals, toString. 
		 * M�s m�todos:getEdad(): debe devolver la edad del alumno a 31/12 del a�o en curso. 
		 * Paquete com.salesianostriana.primerodam.dao Interfaz CrudAlumno. M�todos List<Alumno>
		 * findAll() Alumno findOne(long id) void insert(Alumno alumno) void edit(Alumno
		 * alumno) void delete(Alumno alumno) 
		 * 
		 * Clase CrudAlumnoEnMemoria. Debe implementar el interfaz CrudAlumno. Almacenar� los alumnos en un
		 * ArrayList<Alumno>. Paquete com.salesianostriana.primerodam.servicios Clase
		 * AlumnoServicio. Utiliza una instancia de CrudAlumno. Debe tener un m�todo por
		 * cada m�todo de CrudAlumno. Es lo que se conoce como un envoltorio.
		 * Tambi�n tendr� el m�todo List<Alumno> getByOrdenAlfabetico(), que devolver�
		 * todos los alumnos por orden alfab�tico (�qu� tal usando api stream y
		 * lambdas?) Tambi�n tendr� el m�todo List<Alumno> getByEdad(), que devolver�
		 * todos los alumnos por orden alfab�tico (�qu� tal usando api stream y
		 * lambdas?) 
		 * 
		 * Paquete com.salesianostriana.primerodam 
		 * Clase App. 
		 * M�todo main
		 * Utilizar� una instancia de AlumnoServicio. Insertar� como datos de ejemplo a
		 * algunos alumnos de la clase. Mostrar� dichos alumnos por orden alfab�tico.
		 * Editar� un alumno A�adir� uno nuevo Mostrar� los alumnos por orden de edad a 31/12.
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
