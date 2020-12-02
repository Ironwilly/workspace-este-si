package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crear un programa que gestione un sorteo de lotería. Tendremos la clase Sorteo y la principal para
          probar todo. El programa debe hacer lo siguiente:
			• Posibilidad de comprar/generar un décimo (elegir un número).
			• Hacer sorteo, donde se generará aleatoriamente el número premiado.
			• Comprobar si nuestro décimo está premiado.
			• Mostrar si eres ganador o no (en el main).*/
		
		int decimoTeclado=0;
		int numBoleto;
		int numPre=0;
		Sorteo s;
		
		s=new Sorteo (decimoTeclado);
		
		
        System.out.println("Elija el número con el que quieres jugar");
	    numBoleto = Leer.datoInt();
	    
	    System.out.println("El número que ha elegido es el \n"+numBoleto);
	    
	    System.out.println("El número premiado es "+ s.generarNum());
	
	    
		
		
		
		
		
		
		
		
	}

}
