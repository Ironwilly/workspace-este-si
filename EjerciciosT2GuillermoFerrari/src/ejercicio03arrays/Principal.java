package ejercicio03arrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un array de enteros unidimensional de 8 posiciones. Rellenarlo con
		// n�meros le�dos por teclado y mostrar la media de todos los elementos y la
		// cantidad de
		// n�meros �cero� introducidos.

		int tam = 8;
		int[] num;
		double suma = 0.00;
		double media = 0.00;
		int cant = 0;

		num = new int[tam];

		for (int i = 0; i < num.length; i++) {

			System.out.println("Mete un n�mero");
			num[i] = Leer.datoInt();

		}

		for (int i = 0; i < num.length; i++) {

			System.out.println("Los n�mero introducidos son " + num[i]);
			suma = suma + num[i];
			media = suma / tam;
			if (num[i] == 0) {
				cant++;
				

			} else;
				

		}

		System.out.printf("La media de todo los elementos es %.2f\n", media);
		System.out.println("N�mero de 0 es " + cant);
	}

}
