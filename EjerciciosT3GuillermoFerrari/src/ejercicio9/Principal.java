package ejercicio9;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*. Crear un programa para poner las notas de un alumno. El programa debe poder poner notas a un
		solo alumno, mostrar todas sus notas por pantalla, modificar una nota, calcular la media y dar su
		número de suspensos.
		Se puede debe hacer guardando las notas en un array de doubles en lugar de una variable para cada
		nota. (Opcional) Se puede añadir al programa la posibilidad de usar el programa para varios alumnos,
		con lo que debemos usar un array de alumnos (array de objetos tipo Alumno).
		*/
		
		String nombreTeclado;
		String cursoTeclado;
		double []notasTeclado;
		int tam;
		double nuevaNota;
		
		
		
		
		Alumno a1;
		
		
		System.out.println("Diga el nombre del alumno");
		nombreTeclado=Leer.dato();
		System.out.println("Diga el curso del alumno");
		cursoTeclado=Leer.dato();
		System.out.println("Diga el número de notas del alumno");
		tam=Leer.datoInt();
		notasTeclado=new double[tam];
		
		
		
        a1=new Alumno(nombreTeclado,cursoTeclado,notasTeclado);
        
        a1.cargarNotas();
        
        System.out.println("Las notas son \n"+a1);
        
        
        
        System.out.println("Diga la nota nueva que quieres guardar ");
        nuevaNota=Leer.datoDouble();
        
        a1.setNotas(notasTeclado);
        System.out.println("La nueva nota es "+a1);
        
        
        
        
		
		
		
		
	}

}
