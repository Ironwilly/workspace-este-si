package ejercicio12corregido;

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
		
		double topeApr=5.0,notamedia = 0.00, nota = 0.00, sumanota = 0.00;
		int suspensos = 0;
		int denominador = 6;
		double cero=0.0, diez=10.0;
		
		System.out.println("Bienvenido al programa que le ayuda"
				+ " a calular su media y suspensos");
		do {
			 
			suspensos=0;
			sumanota=0.0;
			System.out.println("Pulsa 0 para salir o 1 para calcular");
			parar=Leer.datoInt();
	
			switch (parar) {

			case 1:
				
				for (int i = 0; i < denominador; i++) {

					System.out.println("Introduzca la nota:");
					nota = Leer.datoDouble();
					
					//No se hace así, no con if
					if (nota<cero||nota>diez) {
						if (nota <20)
						System.out.println("Nota no válida");
						nota=Leer.datoDouble();
					}
					
					
					
					while (nota<cero||nota>diez) {
						System.out.println("Nota no válida");
						System.out.println("Mete nueva nota");
						nota=Leer.datoDouble();
					}
					sumanota = sumanota + nota;

					if (nota <topeApr) {
						
						suspensos++;
					}

				}
				

				notamedia = sumanota / denominador;
				System.out.printf("La nota media es: %.2f" ,notamedia);
				System.out.println("El número de aprobados es:" + (denominador-suspensos));
				System.out.println("El número de suspensos es:" + suspensos);


				break;
			case 0:
				System.out.println("saliendo...");
				
				break;
			default:
				System.out.println("¡Error! Opción incorrecta");
				break;

			}
		} while (parar != 0);

		System.out.println("Salistes!");

	}

}
