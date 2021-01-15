package vista;

public class vistaMapas {
	
	
		
		public void mostrarMapa (String [][] ma1) {
			
			for (int i = 0; i < ma1.length; i++) {
				for (int j = 0; j < ma1[i].length; j++) {

					ma1[i][j] = "■";
					System.out.print(ma1[i][j] + " ");
				}

				System.out.println("");

			}
			
			
			
		}
		
	

}
