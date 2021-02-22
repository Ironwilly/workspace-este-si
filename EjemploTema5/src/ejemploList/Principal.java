package ejemploList;

import java.util.ArrayList;
import java.util.List;

//siempre importamos el util
public class Principal {

	public static void main(String[] args) {


		
		//nosotros no lo hacemos así
		ArrayList <String>lista = new ArrayList <String>();
		
		
		//lo haremos así
		
		List <String>listadoBueno = new ArrayList <String> ();
		
		
		listadoBueno.add("Willy");
		
		System.out.println(listadoBueno);
		

	}

}
