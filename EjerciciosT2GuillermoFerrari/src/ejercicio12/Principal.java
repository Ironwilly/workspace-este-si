package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Se desea realizar un programa que gestione las notas de un alumno del centro.
		// Para ello, se necesita leer las notas de las 6 asignaturas de un solo alumno
		// y mostrar
		// por pantalla al final,la nota media y el número de suspensos que tiene.
		// No usar una variable para cada nota, ni es necesario mostrar las notas de
		// cada asignatura,
		// solo la media y el número de suspensos.
		// agregar un bucle DO WHILE.

		int parar;
		do {
			double notamedia = 0.00, nota = 0.00, sumanota = 0.00;
			int suspensos = 0, aprobados = 0;
			int denominador = 6;

			for (int i = 0; i < 6; i = i + 1) {

				System.out.println("Introduzca la nota:");
				nota = Leer.datoDouble();

				sumanota = sumanota + nota;

				if (nota >= 5 && nota <= 10) {
					
					nota = aprobados++;

				} else {
					nota = suspensos++;
				}

			}
			

			notamedia = sumanota / denominador;
			System.out.println("La nota media es:" + notamedia);
			System.out.println("El número de aprobados es:" + aprobados);
			System.out.println("El número de suspensos es:" + suspensos);

			parar = 0;
			switch (parar) {

			case 1:
				
				parar = Leer.datoInt();

				break;
			case 0:
				System.out.println("Pulsa 0 para salir o 1 para repetir");
				parar = Leer.datoInt();

				break;
			default:
				System.out.println("Error!");

			}
		} while (parar != 0);

		System.out.println("Salistes!");

	}

}
