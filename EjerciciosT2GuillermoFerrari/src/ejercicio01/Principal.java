package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leer 2 n�meros y determinar el mayor de ellos. 
		//Mejorar el programa mostrando tambi�n la posibilidad de que sean iguales.
		
		//Variable
		int numero1, numero2;
		
		//Lectura de datos
		System.out.println("Vamos a deternimar cual de los 2 n�meros es mayor o igual");
		System.out.println("Escribe el primer n�mero:");
		numero1 = Leer.datoInt();
		System.out.println("Escribe el segundo n�mero:");
		numero2 = Leer.datoInt();
		
		//Ejecuci�n de datos
		if (numero1==numero2) {
			System.out.printf("El n�mero %d es igual al n�mero %d",numero1,numero2);
		}else {
			if (numero1>numero2){
				
				System.out.println("El n�mero mayor es:"+ numero1);
					
			}
			
	else {
		System.out.println("El n�mero mayor es:"+ numero2);
		}
		
		
		
		
		}
	}
}
