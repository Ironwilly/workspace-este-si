package ejercicio4;

import utilidades.Leer;

public class Principal {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un programa que simule el lanzamiento de una moneda (cara o cruz). Para ello, se usarán los
		//siguientes métodos:
		//	• Generar número entero entre 1 y 2 (equivalente a lanzar la moneda). Devuelve el número
		//	entero generado.
		//	• Método para comprobar ganador, se le pasarán el número elegido por el jugador y dentro se
		//	generará el aleatorio llamando al método anterior. Devuelve true si son iguales o false si no.
		//	• Un método para mostrar en bonito el ganador. Si se le pasa true mostrar un mensaje de
		//	ganador y si no, debe mostrar "Siga jugando".
		//	• En el main, se debe crear lo necesario para simular un juego de cara o cruz.

		
		int caraAleatoria=0;
		int menu1, elegido;
		Moneda mone1;
		mone1 = new Moneda(caraAleatoria);
		boolean resu;
		do {
		System.out.println("Diga 1 para cara y 2 para cruz");
		elegido=Leer.datoInt();
		
		resu=mone1.calcularGanador(elegido);
		
		mone1.mostrarGanador(resu);
		
		}while(elegido !=0);
		/*
		do {
		
		System.out.println("*********************************\r\n"
				+ "*Reglas del Juego:              *\r\n"
				+ "*Jugador1 ---> gana si sale cara*\r\n"
				+ "*Jugador2 ---> gana si sale cruz*\r\n"
				+ "*********************************\r\n"
				+ "*Pulsar para jugar o para salir:*\r\n"
				+ "*			        *	\r\n"
				+ "*1---> Lanzar Moneda            *\r\n"
				+ "*0---> Salir                    *\r\n"
				+ "*********************************");
		menu1=Leer.datoInt();
		switch (menu1) {
		case 1:
			System.out.println(mone1.calcularAleatorio());
			System.out.println(mone1.calcularGanador());
			break;
		case 0:
			System.out.println("¡Gracias por jugar!");
			break;
		default:
			System.out.println("Número erróneo,vuelve a pulsar 0 para salir o 1 para jugar");
			break;
			
			
		
		
		
		
		} 
		}while(menu1 !=0);
		
		
		
		
		
		
		
		
		
		*/
		

	}

}
