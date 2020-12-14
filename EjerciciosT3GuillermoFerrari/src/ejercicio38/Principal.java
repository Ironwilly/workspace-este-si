package ejercicio38;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Realiza y sube aquí el siguiente ejercicio. La idea es que pienses en 
		los atributos, devoluciones y parámetros de los métodos más que en hacer 
		algo muy elaborado a nivel de cálculos. 

		Intenta modelar un ascensor. No es necesario crear nada más que la clase 
		Ascensor y una clase principal de prueba. La clase ascensor puede tener 
		métodos como mostrar si sube o baja con una flecha, pedir a qué piso se 
		va y comprobar si se subirá o bajará dependiendo de en qué piso se esté, 
		mostrar mensaje de abriendo puertas, como no tenemos balanza para pesar 
		podemos pedir cuántas personas han entrado y calcular un peso medio 
		suponiendo una media de 70 Kg por persona y avisando cuando se sobrepase 
		un tope, etc.
		*/
		
		int plantasTotal;
		int pisoActual, pisoFinal;
		int personas;
		int pesoPersona = 70;
		Ascensor a1;
		
		
		System.out.println("¿Cuántas plantas tiene el edificio?");
		plantasTotal=Leer.datoInt();
		
		System.out.println("¿En qué planta estás?");
		pisoActual=Leer.datoInt();
		
		System.out.println("¿A qué plantas vas?");
		pisoFinal=Leer.datoInt();
		
		System.out.println("¿Cuántas personas han entrado?");
		personas=Leer.datoInt();
		
		a1=new Ascensor(plantasTotal,pisoActual,personas);
		
		
		
		
		
		
		
		
		

	}

}
