package ejemplo1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado;
		String  nombreTeclado;
		int edadTeclado;
		double alturaTeclado;
		int e;
	
		
		System.out.println("nombre");
		nombreTeclado=Leer.dato();
		System.out.println("edad");
		edadTeclado=Leer.datoInt();
		System.out.println("altura");
		alturaTeclado=Leer.datoDouble();
		
		
		//crear un objeto 
		
		String n="Guillermo";
		Persona p1=new Persona(nombreTeclado, edadTeclado, alturaTeclado);
		
		System.out.println("La persona se llama " 
		+ p1.nombre +" tiene "+ p1.edad +" años y mide "+p1.altura+" metros");
		
		
		
		resultado=p1.calcularEdadDias();
		System.out.println("Tiene usted "+resultado+" días");
		
		System.out.println("Diga de qué edad quiere saber los días");
		e=Leer.datoInt();
		resultado=p1.calcularEdadDiasV2(e);
		System.out.println("Tiene usted "+resultado+" días");
		
		//La p2 que hablamos en la clase java, como ejemplo de una persona con 2 datos en vez de 3
		
		
		Persona p2=new Persona("Rafa",36);
		
		
		// ejemplo con 0 datos
		
		Persona p0=new Persona ();
		
		//ejemplo de los getters and setter
		
		System.out.println(p1.getNombre());
		
		
		
		//a esto hace referencia el toString de la clase persona que he puesto
		System.out.println(p1);
		
		
		
		
		
		
		
	}

}
