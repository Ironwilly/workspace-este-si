package vista;

import java.util.Random;

import model.Barco;

public class vistaMapas {
	
	
		//metodo mostrar mapa
		public void mostrarMapa (String [][] ma1) {
			
			for (int i = 0; i < ma1.length; i++) {
				for (int j = 0; j < ma1[i].length; j++) {

					ma1[i][j] = "■";
					System.out.print(ma1[i][j] + " ");
				}

				System.out.println("");

			}
			
			
			
		}
		
		//método cargar barcos
		
		public void cargarBarcos(String[] [] b4) {
		Random r;
		r= new Random();
		 
		
		for(int i = 0; i < 5; i++) {
		 
			
			int i1,i2;
			 i1= r.nextInt(b4.length);
			 i2= r.nextInt(b4[0].length);
			 System.out.println("4"+"4"+"4"+"4"+b4[i1][i2]);
		 
			
		
		}
		}

		
			
		
}
