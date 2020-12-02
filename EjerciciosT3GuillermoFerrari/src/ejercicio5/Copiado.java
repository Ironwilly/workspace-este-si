package ejercicio5;

import utilidades.Leer;

public class Copiado {

	
	//Realizar un programa que lea un texto del teclado y un número entero y muestre en pantalla dicho
	//texto una cantidad de veces igual al número introducido. La clase se puede llamar "Copiado".
	
	//atributos
	
	String texto;
	
	
	
	
	//constructores
	
	public Copiado(String texto) {
		
		this.texto=texto;
		
	}




	
	
	//getters and setters
	
	public String getTexto() {
		return texto;
	}




	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	//metodo copiar Xveces el texto
	public int copiarTexto(int numVeces) {
		
		for(int i=0;i<numVeces;i++) {
			System.out.println(texto);
			
		}
		return numVeces;
		
	}
		
		
		
	
	
	
	
	
	
	
	
	
	
}
