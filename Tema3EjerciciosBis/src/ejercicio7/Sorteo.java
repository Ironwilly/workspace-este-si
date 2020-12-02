package ejercicio7;

import java.util.Random;

public class Sorteo {
	
	
	/*Crear un programa que gestione un sorteo de lotería. Tendremos la clase Sorteo y la principal para
    probar todo. El programa debe hacer lo siguiente:
		• Posibilidad de comprar/generar un décimo (elegir un número).
		• Hacer sorteo, donde se generará aleatoriamente el número premiado.
		• Comprobar si nuestro décimo está premiado.
		• Mostrar si eres ganador o no (en el main).*/
	
	
	
	//Atributos
	
	int decimo;
	
	
	//constructores
	
	public Sorteo (int decimo) {
		
		this.decimo=decimo;
	}
	

	
	
	
	
	//Método generar un décimo
	
	public int generarNum () {
		
		Random r;
		int ale;
		int desde = 00000, hasta = 99999;
		
		r=new Random(System.nanoTime());
		 
		ale=r.nextInt(hasta -desde+1)+desde;
		return ale;
		
		
		
	}
	
	
	//Metodo comprobar ganador
	public boolean comprobarGanador(int numBoleto) {
		
		boolean ganador;
		if(generarNum() == numBoleto) {
			
			ganador = true;
			
		}else {
			
			ganador = false;
		}
		
		return ganador;
		
	}

	
	

}
