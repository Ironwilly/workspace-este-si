package ejercicio06arrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Mostrar por pantalla solo los elementos pares (ojo, no los de índice par) de
		// un array cargado por el usuario desde el teclado. Tamaño 10.

		int tam = 10, par = 0, divisor = 2;
		int[] posiciones;

		posiciones = new int[tam];

		for (int i = 0; i < posiciones.length; i++) {
			System.out.println("Introduzca un número: ");
			posiciones[i] = Leer.datoInt();

		}
		for (int i = 0; i < posiciones.length; i++) {
			
			if (posiciones[i] % divisor == 0) {
				par = posiciones[i];
				System.out.println("Los números pares son: " + par);

			}

		}
		

	}

}
