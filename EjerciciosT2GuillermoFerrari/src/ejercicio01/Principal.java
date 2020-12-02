package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leer 2 números y determinar el mayor de ellos. 
		//Mejorar el programa mostrando también la posibilidad de que sean iguales.
		
		//Variable
		int numero1, numero2;
		
		//Lectura de datos
		System.out.println("Vamos a deternimar cual de los 2 números es mayor o igual");
		System.out.println("Escribe el primer número:");
		numero1 = Leer.datoInt();
		System.out.println("Escribe el segundo número:");
		numero2 = Leer.datoInt();
		
		//Ejecución de datos
		if (numero1==numero2) {
			System.out.printf("El número %d es igual al número %d",numero1,numero2);
		}else {
			if (numero1>numero2){
				
				System.out.println("El número mayor es:"+ numero1);
					
			}
			
	else {
		System.out.println("El número mayor es:"+ numero2);
		}
		
		
		
		
		}
	}
}
