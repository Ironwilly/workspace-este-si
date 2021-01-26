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

	public void pintarConBarco1(String[][] mapa, Barco b1, int fila, int columna, int sentido) {

		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[i].length; j++) {

				if (i == fila && j == columna) {
					
						for (int tam = 0; tam < b1.getTam(); tam++, j++) {

							System.out.print(b1.getTipo() + " ");
							
						}
						j = j - 1;
					

					
					
				}
				
				else {
					System.out.print(mapa[i][j] + " ");
				}

			}

			System.out.println("");

		}
		
		
		

		

	}
	
	
	public void pintarConBarco2(String[][] mapa, Barco b2, int fila, int columna, int sentido) {

		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[i].length; j++) {

				if (i == fila && j == columna) {
					
						for (int tam = 0; tam < b2.getTam(); tam++, j++) {

							System.out.print(b2.getTipo() + " ");
							
						}
						j = j - 1;
					

					
					
				}
				
				else {
					System.out.print(mapa[i][j] + " ");
				}

			}

			System.out.println("");

		}
		
		
		

		

	}
	
	
	public void pintarConBarco3(String[][] mapa, Barco b3, int fila, int columna, int sentido) {

		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[i].length; j++) {

				if (i == fila && j == columna) {
					
						for (int tam = 0; tam < b3.getTam(); tam++, j++) {

							System.out.print(b3.getTipo() + " ");
							
						}
						j = j - 1;
					

					
					
				}
				
				else {
					System.out.print(mapa[i][j] + " ");
				}

			}

			System.out.println("");

		}
		
		
		

		

	}
	
	
	public void pintarConBarco4(String[][] mapa, Barco b4, int fila, int columna, int sentido) {

		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[i].length; j++) {

				if (i == fila && j == columna) {
					
						for (int tam = 0; tam < b4.getTam(); tam++, j++) {

							System.out.print(b4.getTipo() + " ");
							
						}
						j = j - 1;
					

					
					
				}
				
				else {
					System.out.print(mapa[i][j] + " ");
				}

			}

			System.out.println("");

		}
		
		
		

		

	}
	
	
	
	
	
	
	
	

}
