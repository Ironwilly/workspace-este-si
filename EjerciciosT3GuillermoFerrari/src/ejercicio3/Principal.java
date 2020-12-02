package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realizar un programa que calcule el volumen de un cilindro. 
		//Vosotros debéis decidir qué método usa y qué valores pasarle.

		//volumen cilindro --> A = 2 pi r ( r + h )
		
		double piTeclado=3.1416;
		double radioTeclado;
		double alturaTeclado;
		
		Cilindro c1;
		
		System.out.println("Pi = " +piTeclado);
		System.out.println("Diga el radio en metros");
		radioTeclado=Leer.datoDouble();
		System.out.println("Diga la altura en metros");
		alturaTeclado=Leer.datoDouble();
		
		c1= new Cilindro(piTeclado,radioTeclado,alturaTeclado);
		
		System.out.printf("\nEl área del cilindro es: %.2f metros^2", c1.calcularArea());

	}

}
