package boletinExamenEjer01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero
		 * estilo hotel para que tenga caché. Debemos gestionar mi “minihotel” y para
		 * ello, debemos crear la clase Habitación estándar, dos hijas llamadas Suite y
		 * Apartamento. Una clase más de gestión del hotel, que se puede llamar
		 * GestionHabitaciones y una clase principal de prueba para probar todos los
		 * métodos. Los atributos de una habitación estándar serán: precio base, si está
		 * ocupada o no, nombre del cliente, número de días de ocupación y número de
		 * ocupantes. En la clase Suite tenemos también la característica de metros
		 * cuadrados y la cantidad de dinero consumido en servicio de habitaciones. En
		 * estas habitaciones (y solo en estas por ser las más caras), el hotel tiene
		 * como detalle, hacer un descuento al precio base de la habitación. En los
		 * apartamentos, no está incluido el servicio de limpieza, pero se puede
		 * contratar por lo que será un atributo extra. Usaremos un método rescrito para
		 * calcular el precio de cualquier habitación. Para una habitación estándar la
		 * cantidad a pagar es el precio base por el número de días. Para los otros
		 * tipos: ✓ Suites: hay que sumarle la cantidad según lo consumido en el
		 * servicio de habitaciones y descontarle el porcentaje que se pase como
		 * parámetro para el descuento. ✓ Apartamentos: Hay que sumarle el extra por el
		 * servicio de limpieza. En la clase gestión, se debe crear un array de
		 * habitaciones donde guardaremos una habitación de cada tipo, incluyendo una
		 * estándar y podremos hacer lo siguiente: Calcular el precio a pagar por una
		 * habitación de la lista elegida por el usuario. Calcular lo recaudado en total
		 * entre todas las habitaciones ocupadas. Mostrar factura con toda la
		 * información. Mostrar listado solo de las habitaciones que no están ocupadas.
		 */
		
		
		double precioB = 350;
		boolean ocu = false, limpieza = false;
		String nomClien;
		int numDiasOcu;
		int numOcu;
		double metrosCua =25.5;
		double GastadoServHab;
		double desc;
		double precioLimpieza;
		
		
		
		System.out.println("¿Cuántos días quieres alquilar la habitación? \n");
		numDiasOcu = Leer.datoInt();
		
		
		
		HabitacionEstandar habE1 = new HabitacionEstandar ( precioB,false,  "Juanito",  numDiasOcu,4);
		HabitacionEstandar habE2 = new HabitacionEstandar ( precioB,true,  "Jaimito",  numDiasOcu,3);
		HabitacionEstandar habE3 = new HabitacionEstandar ( precioB,false,  "Luisito",  numDiasOcu,2);
		
		System.out.println("Cantidad gastada en el servicio de habitaciones: \n");
		GastadoServHab = Leer.datoDouble();
		System.out.println("Porcentaje de descuento que quieres aplicar: \n");
		desc=Leer.datoDouble();
		
		HabitacionEstandar suite1 = new Suite ( precioB,  false,  "Juanito",  numDiasOcu,  4,
			 metrosCua,  GastadoServHab,desc);
		HabitacionEstandar suite2 = new Suite ( precioB,  true,  "Jaimito",  numDiasOcu,  3,
				 metrosCua,  GastadoServHab,desc);
		HabitacionEstandar suite3 = new Suite ( precioB,  false,  "Luisito",  numDiasOcu,  2,
				 metrosCua,  GastadoServHab,desc);
		
		System.out.println("Precio para el servicio de limpieza: \n");
		precioLimpieza = Leer.datoDouble();
		
		HabitacionEstandar apart1 = new Apartamento (precioB,  false,  "Juanito",  numDiasOcu,  4,
			true, precioLimpieza);
		HabitacionEstandar apart2 = new Apartamento (precioB,  true,  "Jaimito",  numDiasOcu,  3,
				false, precioLimpieza);
		HabitacionEstandar apart3 = new Apartamento (precioB,  false,  "Luisito",  numDiasOcu,  2,
				true, precioLimpieza);
		
		
	
		HabitacionEstandar lista[] = {habE1,habE2,habE3};
		
		GestionHabitaciones gesHab = new GestionHabitaciones(lista);
		
		
		
		
		
		System.out.println(habE1 +"\n");
		System.out.println(habE2 +"\n");
		System.out.println(habE3+"\n");
		System.out.println(suite1+"\n");
		System.out.println(suite2+"\n");
		System.out.println(suite3+"\n");
		System.out.println(gesHab+"\n");
		
		System.out.printf("El precio para una suite es de %.2f euros \n",suite1.calcularPrecioHabitacion(precioB, numDiasOcu, 
				GastadoServHab, desc, precioLimpieza));
		System.out.printf("El precio para un apartamento es de %.2f euros \n",apart1.calcularPrecioHabitacion(precioB, numDiasOcu, 
				GastadoServHab, desc, precioLimpieza));
		
		System.out.printf("El total recaudado es de %.2f euros \n",gesHab.calcularRecaudadoTotal(precioB, numDiasOcu, 
				GastadoServHab, desc, precioLimpieza));
		
		
		
		


		

	}

}
