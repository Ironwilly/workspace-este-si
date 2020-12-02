package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreTeclado;
		double precioBaseTeclado;
		int seccionTeclado;
		boolean rebajadoTeclado;
		double pvpTeclado;
		int reb, uno=1;
		Producto p;
		double cam,precioEnLibras;
		
		double porcentajeTeclado,porcDescuento;
		
		
		System.out.println("Diga nombre");
		nombreTeclado=Leer.dato();
		System.out.println("Diga precio base");
		precioBaseTeclado=Leer.datoDouble();
		System.out.println("Diga sección del producto");
		seccionTeclado=Leer.datoInt();
		System.out.println("Diga 1 si es rebajado o 2 si no lo es");
		reb=Leer.datoInt();
		if (reb==uno) {                  // lo ideal es hacer esto dentro de un metodo, para q al no saber leer boleeanos, podamos leerlo de esta manera
			
			rebajadoTeclado=true;
			
		}
		else {
			rebajadoTeclado=false;
		}
		
		p = new Producto (nombreTeclado,precioBaseTeclado,seccionTeclado,rebajadoTeclado);
		
		System.out.println(p);  //no se pone .tostring dentro del syso
		
		//aki iria el switch del enunciado del examen... pero lo hemos obviado
		System.out.println("Diga el % que quieres ganar ");
		porcentajeTeclado=Leer.datoDouble();
		
		// descuento
		System.out.println("Diga que descuento quieres hacerle al producto");
		porcDescuento=Leer.datoDouble();
		System.out.println(p.aplicarDescuento(porcDescuento));  //se podria guardar en una variable, aki lo imprimimos por comododidad

		System.out.println("A cuanto esta la libra ?");
		cam=Leer.datoDouble();
		precioEnLibras=p.cambiarALibras(cam);
		
		System.out.printf("El precio el libras es: %.2f",precioEnLibras);
		
		p.imprimirGanga();
		
		
		
	}

}
