package arrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] edades;
		int tam;
		
		System.out.println("Hola");
		System.out.println("¿Cuántas edades va a insertar?");
		
		tam= Leer.datoInt();
		edades = new int [tam]; // es el tamaño SOLO LA PRIMERA VEZ, el resto es el INDICE [ ]
		
		edades [3]= 44; // el 3 hace referencia al indice donde se quiere guardar
		
		System.out.println("La edad guardada es: "+edades[3]);
		
		
		
		

	}

}
