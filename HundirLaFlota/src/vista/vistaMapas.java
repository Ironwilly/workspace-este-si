package vista;

import java.util.Random;

import model.Barco;

public class vistaMapas {

	// metodo mostrar mapa
	public void mostrarMapa(String[][] ma1) {

		for (int i = 0; i < ma1.length; i++) {
			for (int j = 0; j < ma1[i].length; j++) {

				System.out.print(ma1[i][j] + " ");
			}

			System.out.println("");

		}

	}

	// método para borrar sitios del mapa
	public void borrarCasilla(int i, int j, String[][] mapa) {

		mapa[i][j] = "";
	}

	// método para pintar los barcos

	public void pintarConBarco(String[][] mapa, Barco b1,Barco b2, int fila, int columna, int sentido) {

		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[i].length; j++) {

				if (i == fila && j == columna) {
					if (b1.getTipo()=="1") {
						for (int tam = 0; tam < b1.getTam(); tam++, j++) {

							System.out.print(b1.getTipo() + " ");
							
						}
						j = j - 1;
					}

					if (b2.getTipo()=="2") {
						for (int tam = 0; tam < b2.getTam(); tam++, j++) {

							System.out.print(b2.getTipo() + " ");
							
						}
						j = j - 1;
					}



					/*for (int tam = 0; tam < b2.getTam(); tam++, j++) {

						System.out.print(b2.getTipo() + " ");
					}*/
					
				}
				
				else {
					System.out.print(mapa[i][j] + " ");
				}

			}

			System.out.println("");

		}
		/*
		for (int x = 0; x < mapa.length; x++) {
			for (int y = 0; y < mapa[x].length; y++) {

				if (x == fila && y == columna) {
					for (int tam2 = 0; tam2 < b2.getTam(); tam2++, y++) {

						System.out.print(b2.getTipo() + " ");
						
					}
					y = y - 1;

				
					/*for (int tam = 0; tam < b2.getTam(); tam++, j++) {

						System.out.print(b2.getTipo() + " ");
					}
					
				}
				else {
					System.out.print(mapa[x][y] + " ");
				}

			}

			System.out.println("");

		}*/

		

	}

}
