package ejemploList;

import java.util.ArrayList;
import java.util.List;

//siempre importamos el util
public class Principal {

	public static void main(String[] args) {


		
		//nosotros no lo hacemos as�
		ArrayList <String>lista = new ArrayList <String>();
		
		
		//lo haremos as�
		
		List <String>listadoBueno = new ArrayList <String> ();
		
		
		listadoBueno.add("Willy"); //listadobueno.add ---> el add es el api,q en este caso esta puesto en el main...
		listadoBueno.add("�ngel");
		
		System.out.println(listadoBueno);
		

	}

}
