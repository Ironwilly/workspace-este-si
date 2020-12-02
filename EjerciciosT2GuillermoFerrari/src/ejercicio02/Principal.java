package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leer dos números. Vamos a dividir el primero entre el segundo y se debe mostrar un mensaje
		//de error si el segundo es cero antes de hacer la operación. Mostrar el resultado de la división
		//con dos decimales si no lo es.
		
		//Variables
		double numero1, numero2;
		double division;
		
		
		//Lectura de datos
		System.out.println("Escribe el primer número:");
		numero1=Leer.datoDouble();
		System.out.println("Escribe el segundo número:");
		numero2=Leer.datoDouble();
		
		//Ejecución de datos
		division = numero1/numero2;
		if (numero2==0) {
			System.out.println("ERROR!!!");
		}else {
			System.out.printf("El resultado de dividir %.2f por %.2f es: %.2f",numero1,numero2,division);
		}
		

	}

}
