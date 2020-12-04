package ejemplosSobrecarga;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base;
		double altura;
		String tipo;
		double cantidad;
		
		System.out.println("Diga la base");
		base=Leer.datoDouble();
		System.out.println("Diga la altura");
		altura=Leer.datoDouble();
		System.out.println("Diga tipo");
		tipo=Leer.dato();
		
		
		
		Triangulo t1;
		
		t1 = new Triangulo (base,altura,tipo) ;
		
		System.out.println(t1.calcularArea());
		
		System.out.println("Diga la cantidad a restar");
		cantidad=Leer.datoDouble();
		System.out.println(t1.calcularArea(cantidad));
		
		
		
		
	}

}
