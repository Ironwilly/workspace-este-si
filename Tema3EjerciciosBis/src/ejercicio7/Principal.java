package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crear un programa que gestione un sorteo de loter�a. Tendremos la clase Sorteo y la principal para
          probar todo. El programa debe hacer lo siguiente:
			� Posibilidad de comprar/generar un d�cimo (elegir un n�mero).
			� Hacer sorteo, donde se generar� aleatoriamente el n�mero premiado.
			� Comprobar si nuestro d�cimo est� premiado.
			� Mostrar si eres ganador o no (en el main).*/
		
		int decimoTeclado=0;
		int numBoleto;
		int numPre=0;
		Sorteo s;
		
		s=new Sorteo (decimoTeclado);
		
		
        System.out.println("Elija el n�mero con el que quieres jugar");
	    numBoleto = Leer.datoInt();
	    
	    System.out.println("El n�mero que ha elegido es el \n"+numBoleto);
	    
	    System.out.println("El n�mero premiado es "+ s.generarNum());
	
	    
		
		
		
		
		
		
		
		
	}

}
