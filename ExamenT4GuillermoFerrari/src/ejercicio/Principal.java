package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		double cantidad =2;
		double extra = 1.2;
		String vehi;
		
		
		Vehiculo v1 = new Vehiculo ("DMM3006",120);
		Vehiculo v2 = new Vehiculo ("GHY9300",90);
		Vehiculo v3 = new Vehiculo ("DRH2400",70);
		
		Vehiculo f1 = new Furgoneta ("FJK1200",100,5);
		Vehiculo f2 = new Furgoneta ("HTD6700",80,3);
		Vehiculo f3 = new Furgoneta ("DRR4500",100,9);
		
		Vehiculo m1 = new Moto ("DDR3200",50,250);
		Vehiculo m2 = new Moto ("DHR1250",70,40);
		Vehiculo m3 = new Moto ("DFG7654",90,120);
		
		
		Vehiculo lista[] = {v1,v2,v3,f1,f2,f3,m1,m2,m3};
		
		Parking par = new Parking ("c/del pez 23,41011 sevilla",lista);
		
		
		System.out.println(v1 +"\n");
		System.out.println(v2 +"\n");
		System.out.println(v3 +"\n");
		System.out.println(f1 +"\n");
		System.out.println(f2 +"\n");
		System.out.println(f3 +"\n");
		System.out.println(m1 +"\n");
		System.out.println(m2 +"\n");
		System.out.println(m3 +"\n");
		
		
		
		System.out.printf("El precio de v1 es de %.2f euros \n",v1.calcularPrecio(cantidad, extra));
		System.out.printf("El precio de v2 es de %.2f euros \n",v2.calcularPrecio(cantidad, extra));
		System.out.printf("El precio de v3 es de %.2f euros \n",v3.calcularPrecio(cantidad, extra));
		System.out.printf("El precio de f1 es de %.2f euros \n",f1.calcularPrecio(cantidad, extra));
		System.out.printf("El precio de f2 es de %.2f euros \n",f2.calcularPrecio(cantidad, extra));
		System.out.printf("El precio de f3 es de %.2f euros \n",f3.calcularPrecio(cantidad, extra));
		System.out.printf("El precio de m1 es de %.2f euros \n",m1.calcularPrecio(cantidad, extra));
		System.out.printf("El precio de m2 es de %.2f euros \n",m2.calcularPrecio(cantidad, extra));
		System.out.printf("El precio de m3 es de %.2f euros \n",m3.calcularPrecio(cantidad, extra));
		
		System.out.printf("El precio total de la lista de vehículos es de %.2f euros \n",par.calcularPrecioLista(lista, cantidad, extra));
		
		
		
		
		System.out.printf("El precio de un vehículo de la lista es de %.2f euros \n",par.calcularPrecioUnVehiculo(v1, cantidad));
		System.out.printf("El precio de un vehículo de la lista es de %.2f euros \n",par.calcularPrecioUnVehiculo(v2, cantidad));
		System.out.printf("El precio de un vehículo de la lista es de %.2f euros \n",par.calcularPrecioUnVehiculo(v3, cantidad));
	
		
		System.out.printf("El precio recaudado por las motos es de %.2f euros \n",par.calcularRecaudadoMotos(lista, cantidad, extra));
		
		
		

	}

}
