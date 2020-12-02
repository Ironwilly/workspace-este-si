package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realizar un programa que lea un texto del teclado y un número entero y muestre en pantalla dicho
		//texto una cantidad de veces igual al número introducido. La clase se puede llamar "Copiado".
		
		
		
		String textoTeclado;
		int numVeces,resu;
		
		
		Copiado cp1;
		
		System.out.println("Introduce el texto");
		textoTeclado = Leer.dato();
		cp1=new Copiado(textoTeclado);
		cp1.setTexto(textoTeclado);
		System.out.println(cp1.getTexto());
		
		System.out.println("Introduce el número de veces que quieres que se repita el texto");
		numVeces=Leer.datoInt();
		resu = cp1.copiarTexto(numVeces);
		System.out.println(resu);
		

	}

}
