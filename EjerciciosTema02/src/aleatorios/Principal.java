package aleatorios;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//generar una serie de aleatorios entre un valor y otro valor
		
		
		int tam, hasta, desde, ale;
		Random r;
		
		r=new Random(System.nanoTime());
		
		
		System.out.println("¿Cuántos numeros quiere?");
		tam = Leer.datoInt();
		System.out.println("¿Número mayor?");
		hasta = Leer.datoInt();
		System.out.println("¿Número menor?");
		desde = Leer.datoInt();
		
		//version 1
		
		for (int i=0; i < tam; i++) {
			ale=r.nextInt(hasta-desde+1)+desde;
			System.out.println(ale);
			
		}
		
		
		
		
		
		
		
	}

}
