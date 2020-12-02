package arrays3;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] listado;
		int ale, hasta, desde;
		int tam=15, op;
		
		Random r=new Random(System.nanoTime());
		
		listado=new int[tam]; //la primera vez lo que hay entre [] es el tamaño, luego es el INDICE (dentro del for x ejemplo)
		
		//forma de inicializar directamente con datos (solo y exclusivamente la primera vez
		//se puede declarar un array con valores)
		
		//double [] listaPrecios= {2.3,4.5,8.9};   //esta forma es otra de declarar, aparte de la de arriba puesta, se usa cuando son valores fijos que no queremos perder
		
		
		
		//cargar el array
		
		for (int i=0; i<listado.length;i++) {
			System.out.println("Diga un numero");
			listado[i]=Leer.datoInt();
			
			
		}
		for (int i=0; i<listado.length;i++) {
			System.out.println(listado[i]);
			
			
			
			
		}
		
		//Operaciones, por ejemplo, duplicar un elemento ( por ejemolo un aleatorio)
		hasta=listado.length-1;
		desde=0;
		ale=r.nextInt(hasta-desde+1)+desde;
		
		
		listado[ale]=listado[ale]*2;
		
		for (int i=0; i<listado.length;i++) {
			System.out.println(listado[i]);
			
			
			
			
		}
		

	}

}
