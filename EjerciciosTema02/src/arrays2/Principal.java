package arrays2;

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
		
		//nosotros nunca vamos a usar la variable TAM(tamaño) como condicion de salida de un array
		// siempre se le pone el .length
		
		//para rellenar o cargar un FOR
		for (int i=0;i < edades.length; i++) {
			System.out.println("Mete una edad");
			edades [i]=Leer.datoInt();
			
		}
		
		//para mostrar otro FOR
		for(int i=0;i<edades.length;i++) {
			
			System.out.println("Las edades son: "+edades[i]);
			
		}
		
		
		
	}

}
