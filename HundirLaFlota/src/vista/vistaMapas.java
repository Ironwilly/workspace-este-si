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
	public void borrarCasilla(int i,int j,String[][] mapa) {

		mapa[i][j] = "";
	}
	
	
	// método para pintar los barcos

	public void pintarConBarco(String[][] mapa, Barco b, int fila, int columna, int sentido) {

		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[i].length; j++) {
				
				if (i == fila && j == columna) {
					for (int tam = 0; tam < b.getTam(); tam++,j++) {
						
						System.out.print(b.getTipo()+" ");
					}j=j-1;
				} else {
					System.out.print(mapa[i][j]+ " ");
				}
				
			}
			
			System.out.println("");

			}
			

	}
	
	
	
	
	
	
	
	
	

}
