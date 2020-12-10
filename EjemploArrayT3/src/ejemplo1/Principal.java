package ejemplo1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//variables para el caso del trabajador
		Trabajador t;
		
		String nombreTeclado;
		double [] horasTrabajadasTeclado = {6,4,8,12}; //Damos valores inicialmente
		double precioHoraTeclado;
		double porcTeclado;
		
		
		
		System.out.println("Diga el nombre del trabajador");
		nombreTeclado=Leer.dato();
		System.out.println("Diga el precio de la hora trabajada");
		precioHoraTeclado=Leer.datoDouble();
		
		t=new Trabajador(nombreTeclado,horasTrabajadasTeclado,precioHoraTeclado);
		//muestro datos
		System.out.println(t);
		
		//llamamos al metodo que calcula el sueldo
		
		System.out.println(t.calcularSueldo());
		
		
		//llammaos al metodo para el neto
		
		System.out.println("Diga el impuesto que quiere quitar");
		porcTeclado=Leer.datoDouble();
		System.out.println(t.calcularSueldoNeto(porcTeclado));
		
		
		
		/*
		
		
		//variables para el caso del producto
		Producto p;
		String nombreTeclado;
		double precioTeclado;
		int cantidadTeclado;
		
		//cargo el array directamente paa no perder tiempo
		int []lista = {2,4,1,3};
		
		
		
		System.out.println("Diga el nombre del producto");
		nombreTeclado=Leer.dato();
		System.out.println("Diga el precio base");
		precioTeclado=Leer.datoDouble();
		System.out.println("Diga cantidad");
		cantidadTeclado=Leer.datoInt();
		
		p=new Producto(nombreTeclado,precioTeclado,cantidadTeclado);
		
		System.out.println(p);
		
		System.out.printf("El precio final despues de "
				+ "los descuentos es %.2f euros",p.calcularPrecioFinal(lista));
		
		*/
		
		
		
	}

}
