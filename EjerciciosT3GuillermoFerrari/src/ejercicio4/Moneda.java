package ejercicio4;

import java.util.Random;

public class Moneda {
	
	
	
	//Crear un programa que simule el lanzamiento de una moneda (cara o cruz). Para ello, se usarán los
	//siguientes métodos:
	//	• Generar número entero entre 1 y 2 (equivalente a lanzar la moneda). Devuelve el número
	//	entero generado.
	//	• Método para comprobar ganador, se le pasarán el número elegido por el jugador y dentro se
	//	generará el aleatorio llamando al método anterior. Devuelve true si son iguales o false si no.
	//	• Un método para mostrar en bonito el ganador. Si se le pasa true mostrar un mensaje de
	//	ganador y si no, debe mostrar "Siga jugando".
	//	• En el main, se debe crear lo necesario para simular un juego de cara o cruz.
	
	
	  //atributos
	
	   int caras;
	  
	   
	   
	   
	   //Constructor
	   
	   public Moneda (int caras) {
		   
		   this.caras=caras;
		   
	   }
	
	   //Método
	   
	   //generar número aleatorio entre 1 y 2
	   
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
			   System.out.println("Campeón!!");
		   }else {
			   System.out.println("Siga jugando");
		   }
		   
	   }
	   
	   
	   
	   
}
