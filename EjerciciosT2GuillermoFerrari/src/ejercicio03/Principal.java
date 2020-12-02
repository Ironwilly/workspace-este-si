package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leer un número que será la cantidad de dinero que una persona quiere retirar de su cuenta
		//bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad que se quiere retirar
		//es mayor que el saldo de la cuenta y el nuevo saldo si se ha podido retirar.
		
		
		//Variables
		double retirada, total;
		
		//Lectura de datos
		System.out.println("Por favor, introduzca la cantidad de dinero que quiere retirar:");
		retirada = Leer.datoDouble();
		
		//Ejecución de datos
		total = 2456.67;
		
		if (retirada > total) {
			System.out.println("No es posible.");
			
		}else {
			System.out.printf("Usted ha retirado %.2f€",retirada);
			System.out.printf("En su cuenta le queda un total de %.2f€",(total-retirada));
		}
		
		
		
	}

}
