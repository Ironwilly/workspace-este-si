package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leer un número y mostrar por la salida estándar si dicho número es o no par
		
		//Variables
		int par, numero;
		
		//Lectura de dato
		System.out.println("Introduce un número:");
		numero=Leer.datoInt();
		
		
		//Ejecución de datos
		
		par = 2;
		
		if (numero % par == 0) {
			
			System.out.printf("El número %d es par",numero);
			
		}else {
			
			System.out.printf("El número %d es impar",numero);
		}
			
			
		}
		
		
		
	}


