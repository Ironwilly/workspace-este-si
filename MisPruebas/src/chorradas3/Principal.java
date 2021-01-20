package chorradas3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tablero [][] = null;
		

			    System.out.println("\n***********************");
			    System.out.println("N = mina normal");
			    System.out.println("A = mina amigable");
			    System.out.println("L = mina letal");
			    System.out.println("D = mina dorada");
			    System.out.println("***********************\n");

			    for (int x = 0; x < 15; x++) {
			        for (int y = 0; y < 5; y++) {
			        	
			            tablero[x][y] = "0";
			            System.out.print("|");
			            System.out.print("_" + tablero[x][y] + "_");

			        }
			        System.out.println("|");
			    }

			}

			public void tablero() {


			    for (int x = 0; x < 15; x++) {
			        for (int y = 0; y < 5; y++) {

			            System.out.print("|");
			           
						

			        }
			        System.out.println("|");
			    }

			}
	

	

}
