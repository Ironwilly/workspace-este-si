package repasando;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero
		 * estilo hotel para que tenga caché. Debemos gestionar mi “minihotel” y para
		 * ello, debemos crear la clase Habitación estándar, dos hijas llamadas Suite y
		 * Apartamento. 
		 * 
		 * Una clase más de gestión del hotel, que se puede llamar GestionHabitaciones y una 
		 * clase principal de prueba para probar todos los métodos. 
		 * 
		 * Los atributos de una habitación estándar serán: precio base, si está
		 * ocupada o no, nombre del cliente, número de días de ocupación y número de
		 * ocupantes. 
		 * 
		 * En la clase Suite tenemos también la característica de metros
		 * cuadrados y la cantidad de dinero consumido en servicio de habitaciones. 
		 * 
		 * En estas habitaciones (y solo en estas por ser las más caras), el hotel tiene
		 * como detalle, hacer un descuento al precio base de la habitación. 
		 * 
		 * En los apartamentos, no está incluido el servicio de limpieza, pero se puede
		 * contratar por lo que será un atributo extra. 
		 * Usaremos un método rescrito para calcular el precio de cualquier habitación. 
		 * Para una habitación estándar la cantidad a pagar es el precio base por el número de días. 
		 * 
		 * Para los otros tipos: 
		 * ✓ Suites: hay que sumarle la cantidad según lo consumido en el servicio de habitaciones y 
		 * descontarle el porcentaje que se pase como parámetro para el descuento. 
		 * ✓ Apartamentos: Hay que sumarle el extra por el servicio de limpieza. 
		 * En la clase gestión,se debe crear un array de habitaciones donde guardaremos una habitación 
		 * de cada tipo, incluyendo una estándar y podremos hacer lo siguiente: Calcular el precio a pagar por una
		 * habitación de la lista elegida por el usuario. 
		 * Calcular lo recaudado en total entre todas las habitaciones ocupadas.
		 * Mostrar factura con toda la información. Mostrar listado solo de las habitaciones que no están ocupadas.
		 */

		double descuento = 15;
		int numLista;
		
		HabitacionEstandar habiEs = new HabitacionEstandar (350,false,3,4);
		HabitacionEstandar suite = new Suite (450,false,3,5,30.5,40);
		HabitacionEstandar apart = new Apartamento (500,true,4,5,100,true);
				
		HabitacionEstandar lista[] = {habiEs,suite,apart};
		
		GestionDeHabitaciones ges = new GestionDeHabitaciones(lista);
		
		
		ges.mostrarHabLibres();
		System.out.println(apart);
		System.out.println(ges.calcularRecaudacionTotal(descuento)+"\n");
		
		System.out.println("Diga el número de habitación que deseas mostrar el precio (1 HabEstandar,2 Suite,3 Apartamento) \n");
		numLista=Leer.datoInt();
		System.out.println(ges.calcularPrecioHabitacion(numLista, descuento));
		
		
		
		System.out.println("Diga el número de habitación que deseas mostrar la factura (1 HabEstandar,2 Suite,3 Apartamento) \n");
		numLista = Leer.datoInt();
		ges.mostrarFactura(numLista, descuento);
		
		
	}
	

}
