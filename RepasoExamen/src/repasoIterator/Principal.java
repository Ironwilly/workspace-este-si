package repasoIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

		List <String> listaDeNombres = new ArrayList <String> ();
		
		listaDeNombres.add("Juan P�rez S�nchez");
		
		listaDeNombres.add("Jos� Alberto Garc�a Montes");
		
		String cadenaBuscar = "Alberto";
		
		System.out.println ("La cadena que buscamos es " + cadenaBuscar);
		
		Iterator<String> it = listaDeNombres.iterator();//Creamos el objeto it de tipo Iterator con String
		
		String tmpAnalizando;
		
		while (it.hasNext()) {//Utilizamos el m�todo hasNext de los objetos tipo Iterator
			
		tmpAnalizando = it.next();//Utilizamos el m�todo next de los objetos tipo Iterator
		
		System.out.println ("Analizando elemento... " + tmpAnalizando);
		
		if (tmpAnalizando.contains(cadenaBuscar)) {
			
		System.out.println ("Cadena encontrada!!!");
		
		} else { 
			System.out.println("No existe esa cadena \n");
		}//else vac�o. No hay acciones a ejecutar.
		
		}
		
		


	}

}
