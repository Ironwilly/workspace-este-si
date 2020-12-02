package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreTeclado;
		double precioBaseTeclado;
		String seccionTeclado;
		double rebajasTeclado=0;
		double contador=0;
		double pvpTeclado=0;
		int menu1;
		
		
		Producto pro1;
		
		
		
			
	 
	 
		System.out.println("Escriba el nombre del producto");
		nombreTeclado=Leer.dato();
		
		System.out.println("Escriba el precio base del producto");
		precioBaseTeclado=Leer.datoDouble();
		
		System.out.println("Escriba a qué sección pertenece el producto");
		seccionTeclado=Leer.dato();
		
		System.out.println("Pulse 1 si tiene rebaja o pulse 2 sino lleva rebaja");
		menu1=Leer.datoInt();
		pro1=new Producto(nombreTeclado,precioBaseTeclado,seccionTeclado,rebajasTeclado,pvpTeclado);
		pro1.getNombre();
		pro1.setNombre(nombreTeclado);
		pro1.getPrecioBase();
		pro1.setPrecioBase(precioBaseTeclado);
		pro1.getSeccion();
		pro1.setSeccion(seccionTeclado);
		
		switch (menu1) {
		case 1:
			System.out.println("El producto lleva rebaja");
			System.out.println("Diga el % de rebaja que quieres aplicar");
			rebajasTeclado=Leer.datoDouble();
			System.out.println("El pvp con el % de rebaja incluido es de "+pro1.calcularRebaja(rebajasTeclado));
			contador=pro1.calcularRebaja(rebajasTeclado);
			
			break;
		case 2:
			System.out.println("El producto no lleva rebaja");
			break;
			default:
				System.out.println("Error, vuelve a presionar 1 si lleva rebaja o 2 en caso que no tenga rebaja");
				
		
		}
		pro1.getRebajas();
		pro1.setRebajas(rebajasTeclado);
		
		
		System.out.println("El pvp es "+pro1.calcularPvp(contador)+" euros");
		pro1.getPvp();
		pro1.setPvp(pvpTeclado);
		System.out.println(pro1);
		
	 
		
	 
		
		
		
		
		
		
		
	}

}
