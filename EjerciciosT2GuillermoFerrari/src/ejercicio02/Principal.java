package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leer dos n�meros. Vamos a dividir el primero entre el segundo y se debe mostrar un mensaje
		//de error si el segundo es cero antes de hacer la operaci�n. Mostrar el resultado de la divisi�n
		//con dos decimales si no lo es.
		
		//Variables
		double numero1, numero2;
		double division;
		
		
		//Lectura de datos
		System.out.println("Escribe el primer n�mero:");
		numero1=Leer.datoDouble();
		System.out.println("Escribe el segundo n�mero:");
		numero2=Leer.datoDouble();
		
		//Ejecuci�n de datos
		division = numero1/numero2;
		if (numero2==0) {
			System.out.println("ERROR!!!");
		}else {
			System.out.printf("El resultado de dividir %.2f por %.2f es: %.2f",numero1,numero2,division);
		}
		

	}

}
