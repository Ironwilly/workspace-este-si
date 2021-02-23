package ejercicio2;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * Construir una clase ArrayReales que declare un atributo de tipo double[] num,
		 * lo rellene aleatoriamente y que implemente una interfaz llamada Estadisticas.
		 * 
		 * El contenido de esta interfaz es el siguiente: 
		 * public interface Estadisticas { 
		 * 
		 * double calcularMinimo( );//Devuelve el menor número del array double
		 * calcularMaximo( );//Devuelve el mayor número en el array double
		 * calcularSumatorio( );//Devuelve la suma de los elementos del array 
		 * 
		 * }
		 */
		
		
		double lista[];
		int tam;
		
		System.out.println("Indique el tamaño del array ");
		tam=Leer.datoInt();
		
		lista = new double [tam];
		
	ArrayReales a1 = new ArrayReales(lista);
	
	a1.rellenarArray(tam);
	
	System.out.println(a1);
	
	System.out.println(a1.calcularMinimo(tam));
	System.out.println(a1.calcularMaximo(tam));
	System.out.println(a1.calcularSumatorio(tam));
		
		
	}

}
