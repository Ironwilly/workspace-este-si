package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leer un n�mero y mostrar por la salida est�ndar si dicho n�mero es o no par
		
		//Variables
		int par, numero;
		
		//Lectura de dato
		System.out.println("Introduce un n�mero:");
		numero=Leer.datoInt();
		
		
		//Ejecuci�n de datos
		
		par = 2;
		
		if (numero % par == 0) {
			
			System.out.printf("El n�mero %d es par",numero);
			
		}else {
			
			System.out.printf("El n�mero %d es impar",numero);
		}
			
			
		}
		
		
		
	}


