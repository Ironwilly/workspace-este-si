package prueba1;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nombres= {"Juan","Pedro","Fernando","Manuel"};
		int[] posiciones;
		int tam, desde=10,hasta=13;
		Random  r;
		
		r=new Random(System.nanoTime());
		
		
		
		System.out.println("¿Cuántos nombres quieres mostrar?");
		tam = Leer.datoInt();
		
		posiciones = new int [tam];
		
		for(int i=0;i<posiciones.length;i++) {
		posiciones[i]=r.nextInt((hasta-desde+1)+desde);
		
		}
		for(int i=0;i<posiciones.length;i++) {
			
			System.out.println(posiciones[i]);
				
				
			}
		
		
		for(int i=0;i<posiciones.length;i++) {
		
			if (posiciones[i]==10) {
				
				System.out.print(" Juan");
				
				
			}
			if (posiciones[i]==11) {
				
				System.out.print(" Pedro");
				
				
			}
			if (posiciones[i]==12) {
	
				System.out.print("Fernando");
	
	
			}
			if (posiciones[i]==13) {
	
				System.out.print(" Manuel");
	
	
			}
				
			}
		
		
		
		
		
		

	}

}
