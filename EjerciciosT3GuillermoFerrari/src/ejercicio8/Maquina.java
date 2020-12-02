package ejercicio8;

import utilidades.Leer;

public class Maquina {

	/*
	 * Crear un programa que emule una máquina vendedora de tickets de metro.
	 * Tendremos que crear la clase Ticket (Clase POJO), la clase Maquina (donde
	 * estarán todos los métodos con funcionalidad) y la clase principal o de
	 * prueba. Podremos: • Comprar uno o varios billetes. • Calcular el cambio a
	 * devolver. • Imprimir por pantalla el billete. Solo uno. Si se han comprado
	 * “x” debemos mostrar en el ticket el mensaje “válido para x personas”. Además,
	 * al final de la jornada, el operario que lleva el mantenimiento de la máquina,
	 * debe tener disponible un método que le ofrezca el saldo total de la
	 * recaudación de la máquina en ese día (no es necesario usar fechas) y ponga a
	 * cero el contador. Por último, también debe contar con la posibilidad de
	 * cambiar el precio de los billetes ya que estos suelen subir todos los años.
	 * Las operaciones para el operario se harán solo si se introduce la contraseña
	 * adecuada. Estas últimas funcionalidades también se harán con métodos dentro
	 * de la clase Maquina.
	 */

	// atributos
	double ingresar;
	double comprar;
	double cambio;

	// constructores

	public Maquina(double ingresar, double comprar, double cambio) {

		this.ingresar = ingresar;
		this.comprar = comprar;
		this.cambio = cambio;
	}

	// getters and setters

	public double getIngresar() {
		return ingresar;
	}

	public void setIngresar(double ingresar) {
		this.ingresar = ingresar;
	}

	public double getComprar() {
		return comprar;
	}

	public void setComprar(double comprar) {
		this.comprar = comprar;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	// metodo ingresar saldo
	public double ingresarSaldo(double ingresarTeclado) {
		double saldo = 0;

		saldo = saldo + ingresar;

		return saldo;

	}

	// metodo comprar 1 o varios ticket

	public double comprarTicket(double precioMaquina) {

		double cantidad = 0;

		cantidad = comprar * precioMaquina;

		return cantidad;
	}

	// metodo ver saldo
	public double mostrarSaldo(double saldoMaquina) {
		double saldoTotal = 0.00;

		saldoTotal = ingresar - comprar;

		return saldoTotal;

	}

	// metodo calcular cambio a devolver

	public double calcularCambio(double devolverTeclado) {

		double devolucion;

		devolucion = ingresar - comprar;

		
		return devolucion;

	}

	// metodo para imprimir el billete
	public int imprimirTicket(double imprimirTicketTeclado) {

		int imprimir = 0;

		System.out.println("¿Cuántos ticket has comprado?");
		imprimir = Leer.datoInt();
		if (imprimir > 1) {
			System.out.printf("*******************************************\r\n"
					+ "************METRO TRIANERO*****************\r\n"
					+ "**ESTE TICKET ES VALIDO PARA %d PERSONA**\r\n"
					+ "*******QUE TENGAS UN BUEN VIAJE************\r\n"
					+ "*******************************************\n", imprimir);

		} else {
			System.out.println("****************************************\r\n"
					+ "************METRO TRIANERO**************\r\n" + "**ESTE TICKET ES VALIDO PARA 1 PERSONA**\r\n"
					+ "*******QUE TENGAS UN BUEN VIAJE*********\r\n" + "****************************************\n");
		}

		return imprimir;

	}
	// metodo operario

	public double permitirOperario(double operarioTeclado) {

		double clave = 12345;
		double comparador;

		
		comparador = Leer.datoDouble();
		if (comparador == clave) {
			System.out.println("La recaudación total es de " + (ingresar - cambio) + " euros\n");

		} else {
			System.out.println("Clave errónea, no tienes acceso a esta opción");
		}

		return comparador;

	}

	// metodo cambio precio billete
	public double leerNuevoPrecio(double precioTeclado) {

		double precioNuevo = 0;
		double clave = 12345;
		double comparador;

		
		comparador = Leer.datoDouble();
		if (comparador == clave) {
			System.out.println(
					"Introduzca el precio que quieres para los ticket, sino hay subida de precio, ponga el mismo precio anterior\n");
			precioTeclado = Leer.datoDouble();
			precioNuevo = precioNuevo + precioTeclado;

		} else {
			System.out.println("Clave errónea, no tienes acceso a esta opción\n");
		}

		return precioNuevo;
	}

}
