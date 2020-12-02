package ejercicio4;

import java.util.Random;

public class Moneda {
	
	
	
	//Crear un programa que simule el lanzamiento de una moneda (cara o cruz). Para ello, se usar�n los
	//siguientes m�todos:
	//	� Generar n�mero entero entre 1 y 2 (equivalente a lanzar la moneda). Devuelve el n�mero
	//	entero generado.
	//	� M�todo para comprobar ganador, se le pasar�n el n�mero elegido por el jugador y dentro se
	//	generar� el aleatorio llamando al m�todo anterior. Devuelve true si son iguales o false si no.
	//	� Un m�todo para mostrar en bonito el ganador. Si se le pasa true mostrar un mensaje de
	//	ganador y si no, debe mostrar "Siga jugando".
	//	� En el main, se debe crear lo necesario para simular un juego de cara o cruz.
	
	
	  //atributos
	
	   int caras;
	  
	   
	   
	   
	   //Constructor
	   
	   public Moneda (int caras) {
		   
		   this.caras=caras;
		   
	   }
	
	   //M�todo
	   
	   //generar n�mero aleatorio entre 1 y 2
	   
	   public int calcularAleatorio() {
		   int desde=1,hasta=2;
		   int ale=0;
		   
		  
		   Random r;		   
		   r=new Random(System.nanoTime());		   			   
		   ale=r.nextInt(hasta-desde+1)+desde;
	   
		   return ale;
		   		   
	   }
	   
	   //ganador
	   
	   public boolean calcularGanador(int elegido) {
	   
	   if(calcularAleatorio()==elegido) {
		   
		  return true;
		   
	   }else {
		   return false;
	   }
	   }
	   
	   
	   //metodo mostrar
	   public void mostrarGanador(boolean acierto) {
		   
		   if(acierto==true) {
			   System.out.println("Campe�n!!");
		   }else {
			   System.out.println("Siga jugando");
		   }
		   
	   }
	   
	   
	   
	   
}
