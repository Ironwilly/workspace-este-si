package ejercicio04arrays;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Rellenar un array unidimensional de 10 posiciones con números aleatorios entre 1 y 99
		//y mostrar el número guardado en un lugar que indique el usuario por teclado.
		
		int desde=1,hasta=99,tam =10,op;
		int [] posiciones;
		Random r;
		
		
		posiciones = new int [tam];
		r= new Random (System.nanoTime());
		
		for(int i=0;i<posiciones.length;i++) {
		posiciones[i]=r.nextInt(hasta-desde+1)+desde;
			System.out.print("\t"+ posiciones[i]);
			
			
		}
		    System.out.println("\n¿Qué número guardado quiere mostrar?");
			op=Leer.datoInt();
			System.out.println("El número es: "+ posiciones[op-1]);
			
			
		
		
		

	}

}
