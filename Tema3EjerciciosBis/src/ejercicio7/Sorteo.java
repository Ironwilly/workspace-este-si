package ejercicio7;

import java.util.Random;

public class Sorteo {
	
	
	/*Crear un programa que gestione un sorteo de loter�a. Tendremos la clase Sorteo y la principal para
    probar todo. El programa debe hacer lo siguiente:
		� Posibilidad de comprar/generar un d�cimo (elegir un n�mero).
		� Hacer sorteo, donde se generar� aleatoriamente el n�mero premiado.
		� Comprobar si nuestro d�cimo est� premiado.
		� Mostrar si eres ganador o no (en el main).*/
	
	
	
	//Atributos
	
	int decimo;
	
	
	//constructores
	
	public Sorteo (int decimo) {
		
		this.decimo=decimo;
	}
	

	
	
	
	
	//M�todo generar un d�cimo
	
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
