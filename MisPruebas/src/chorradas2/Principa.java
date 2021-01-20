package chorradas2;

import java.util.Random;

public class Principa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] matriz = new int[5][6];
		 
		// llenar la matriz
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = i+j;
			}
		}
		 
		// imprimirla
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println();
		 
		Random r = new Random();
		 
		// imprimir 10 valores aleatorios de la matriz
		for(int i = 0; i < 5; i++) {
		 
			// nextInt da un número entre 0 y el que le pasas en el
			// argumento, es decir, en el primer caso entre 0 y 7
			// y en la segunda entre 0 y 9. Por lo que obtenemos un
			// índice válido
			int i1 = r.nextInt(matriz.length);
			int i2 = r.nextInt(matriz[0].length);
		 
			System.out.print("Fila:" + i1 + ", ");
			System.out.print("Columna:" + i2 + ": ");
			System.out.println("Valor:" + matriz[i1][i2]);
		}
		
		
		
		
		
		
	}

}
