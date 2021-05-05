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
