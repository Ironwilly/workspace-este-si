package ejercicio05arrays;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Solicitar al usuario que introduzca por teclado el tama�o del array.
		// Declarar y definir el array de enteros.
		// Rellenar el array mediante n�meros aleatorios entre los dos valores que diga
		// el usuario.
		// Mostrar por pantalla la suma de todos los elementos.
		// Mostrar el mayor y el menor guardados en el array.

		int desde, hasta, tam;
		int[] posiciones;
		int suma=0;
		Random r;
		int mayor,menor;

		r = new Random(System.nanoTime());

		System.out.println("Introduce el tama�o deseado para el array: ");
		tam = Leer.datoInt();
		posiciones = new int[tam];
		System.out.println("Introduce el n�mero m�s peque�o que quieres para el array: ");
		desde= Leer.datoInt();
		System.out.println("Introduce el n�mero m�s grande que quieres para el array: ");
		hasta= Leer.datoInt();
		
		for(int i=0;i<posiciones.length;i++) {
			posiciones[i]=r.nextInt(hasta-desde+1)+desde;
			
			
			
		}
		for(int i=0;i<posiciones.length;i++) {
			
			System.out.print("\t"+posiciones[i]);
			
			
		}
		
		
		for(int i=0;i<posiciones.length;i++) {
			suma = suma+posiciones[i];
			
			
			
		}
		mayor= posiciones[0];
				menor = posiciones[0];
		for(int i=0;i<posiciones.length;i++) {
			
			
			
			if (posiciones[i]>mayor) {
				mayor=posiciones[i];
				
							
			}
			if (posiciones[i]<menor) {
				menor=posiciones[i];
			}
			
			
			
		}
		
		
		
			
			
			
		
		System.out.printf("\nLa suma de todos los numeros del array es: %d",suma);
		System.out.printf("\nEl n�mero mayor es: %d",mayor);
		System.out.printf("\nEl n�mero menor es: %d",menor);
		
		
	}

}
