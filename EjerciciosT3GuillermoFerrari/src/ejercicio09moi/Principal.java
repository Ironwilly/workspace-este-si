package ejercicio09moi;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		Alumno a1;
		int menu,salir=0,nNotas = 0,id, notaModifica;
		double valorNota;
		double []notas;
		String nombre, apellidos;
		
		System.out.println("-----------------------------SENECA------------------------------------");
		System.out.println("=======================================================================");
		
		System.out.println("Introduzca la id del alumno");
		id=Leer.datoInt();
		System.out.println("Introduzca el nombre del alumno");
		nombre=Leer.dato();
		System.out.println("Introduzca los apellidos del alumno");
		apellidos=Leer.dato();
		
		System.out.println("Indica cúantas notas vas a introducir");
		nNotas=Leer.datoInt();
		
		notas = new double [nNotas];
		
		
		a1 = new Alumno (id,nombre,apellidos,notas);
		
		for (int i = 0; i < nNotas; i++) {
			System.out.println("Inroduzca nota:");
			notas[i] = Leer.datoDouble();
		}
		
		System.out.println("Notas introducidas con éxito\n\n");
		
		
		
		do {
			
			
			System.out.println("1. Mostrar notas");
			System.out.println("2. Modificar nota");
			System.out.println("3. Calcular media");
			System.out.println("4. ¿Número de suspensos?");
			System.out.println("0. Cerrar aplicacion");
			
			System.out.println("\n Introduzca una opción");
			menu=Leer.datoInt();
			
			switch (menu) {
			case 1:
				a1.mostarNotas();
				break;
			case 2:
				System.out.println("¿Qué nota quieres modificar");
				notaModifica=Leer.datoInt();
				
				System.out.println("Escribe el nuevo valor:");
				valorNota = Leer.datoDouble();
				
				notas[notaModifica-1] = valorNota;
				
				a1.setNotas(notas);
				
				System.out.println("Nota modificada con éxito");
				break;
			case 3:
				System.out.printf("La media de las notas es: %.2f",a1.calcularMedia(nNotas));
				System.out.println();
				break;
			case 4:
				System.out.println("El número de suspensos es " + a1.calcularNumeroSuspensos());
				break;
			case 0:
				System.out.println("Cerrando aplicación...");
				break;
			}
			
		}while(menu != salir);
	}

}
