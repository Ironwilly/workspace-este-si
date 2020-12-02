package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea un programa que tenga al menos dos clases modelo, con 4 atributos cada
		// una y sus correspondientes
		// constructores, uno con todos los parámetros, uno con dos parámetros y otro
		// vacío.

		// Crear un objeto en el main con cada uno de los constructores (leyendo los
		// datos por teclado)
		// de las dos clases e imprimir los valores.

		double coste = 0.00;
		int pulgadas = 0;
		String marquita;

		// Portatil 1

		System.out.println("¿Qué precio tiene el portatil?");
		coste = Leer.datoDouble();
		System.out.println("¿Qué tamaño tiene el portatil?");
		pulgadas = Leer.datoInt();
		
		//OJO!!!, LO CORRECTO ES DECLARAR ARRIBA TODO Y ABAJO INSTANCIAR, COMO SIEMPRE
		// EN ESTE CASO EN VEZ DE Portatil p1 = new Portatil(coste, pulgadas, true, true);
		// LO CORRECTO SERIA PONER ARRIBA Portatil p1; y abajo poner p1 = new Portatil(coste, pulgadas, true, true);

		Portatil p1 = new Portatil(coste, pulgadas, true, true);

		System.out.println("El portatil tiene un precio de " + p1.precio + " euros, un tamaño de pantalla de "
				+ p1.tamanyo + " pulgadas, cpu intel " + p1.intel + " y teclado retroiluminado " + p1.tecladoIluminado);

		// Impresora 1

		System.out.println("¿Qué precio tiene la impresora?");
		coste = Leer.datoDouble();
		System.out.println("¿Qué marca es la impresora?");
		marquita = Leer.dato();

		Impresora im1 = new Impresora(coste, marquita, false, true);

		System.out.println("La impresora tiene un precio de " + im1.precio + " euros, es de la marca " + im1.marca
				+ " .Impresion por laser " + im1.laser + " ,multifunción " + im1.multifuncion);

		// Portatil 2

		System.out.println("¿Qué precio tiene el portatil?");
		coste = Leer.datoDouble();
		System.out.println("¿Qué tamaño tiene el portatil?");
		pulgadas = Leer.datoInt();

		Portatil p2 = new Portatil(coste, pulgadas);

		System.out.println("El portatil tiene un precio de " + p2.precio + " euros, un tamaño de pantalla de "
				+ p2.tamanyo + " pulgadas");

		// Impresora 2

		System.out.println("¿Qué precio tiene la impresora?");
		coste = Leer.datoDouble();
		System.out.println("¿Qué marca es la impresora?");
		marquita = Leer.dato();

		Impresora im2 = new Impresora(coste, marquita);

		System.out.println("La impresora tiene un precio de " + im2.precio + " euros, es de la marca " + im2.marca);

		// Portatil 3

		System.out.println("¿Qué precio tiene el portatil?");
		coste = Leer.datoDouble();
		System.out.println("¿Qué tamaño tiene el portatil?");
		pulgadas = Leer.datoInt();

		Portatil p3 = new Portatil();

		System.out.println("El portatil tiene un precio de " + p3.precio + " euros, un tamaño de pantalla de "
				+ p3.tamanyo + " pulgadas");

		// Impresora 3

		System.out.println("¿Qué precio tiene la impresora?");
		coste = Leer.datoDouble();
		System.out.println("¿Qué marca es la impresora?");
		marquita = Leer.dato();

		Impresora im3 = new Impresora();

		System.out.println("La impresora tiene un precio de " + im3.precio + " euros, es de la marca " + im3.marca);

	}

}
