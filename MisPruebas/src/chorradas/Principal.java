package chorradas;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [][]primero;
		
		int tam1,tam2;
		int desde = 0, hasta = 9;
		int ale;
		
		Random r;
		r=new Random(System.nanoTime());
		
		System.out.println("Tamaño de las colunnas: \n");
		tam1=Leer.datoInt();
		
		System.out.println("Tamaño de las filas: \n");
		tam2=Leer.datoInt();
		primero = new String[tam1][tam2];
		
		for (int i=0;i < primero.length ; i++) {
			for(int j=0; j <primero[i].length ; j++) {
				
			primero[i][j]="***"
					+ "***"
					+ "***";
			System.out.print(primero[i][j]+ " ");
			}
			
		System.out.println("\t");
			
		}
		
		
		

	}

}
