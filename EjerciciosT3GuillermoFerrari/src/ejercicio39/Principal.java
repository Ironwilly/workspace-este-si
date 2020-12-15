package ejercicio39;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
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
		
		
		
		String nombreTeclado;
		String apellidosTeclado;
		int idTeclado;
		int notasTeclado[] ;
		int desde,hasta;
		int numeroNotas;
		int aleTeclado;
		int notasCalculada;
		int total;
		
		
		Alumno a1;
		
		System.out.println("Diga el nombre del alumno");
		nombreTeclado=Leer.dato();
		System.out.println("Diga los apellidos del alumno");
		apellidosTeclado=Leer.dato();
		System.out.println("Diga el id del alumno");
		idTeclado=Leer.datoInt();
		System.out.println("Diga el número de notas del alumno");
		numeroNotas=Leer.datoInt();
		System.out.println("Diga la nota menor");
		desde=Leer.datoInt();
		System.out.println("Diga la nota mayor");
		hasta=Leer.datoInt();
		notasTeclado=new int[numeroNotas];
		
		
		a1=new Alumno(nombreTeclado,apellidosTeclado,idTeclado,notasTeclado);
		
		a1.calcularNotas(desde, hasta);
		
		System.out.println("Las notas del alumno son "+a1);
		
		
		
		
		
		
		
		
		
		
	}

}
