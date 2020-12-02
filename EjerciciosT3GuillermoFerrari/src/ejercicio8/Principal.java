package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		double ingresarTeclado = 0;
		double precioTeclado = 0.00;
		double comprarTeclado = 0.00;
		double devolverTeclado = 0.00;
		double precioMaquina;
		int menu1, menu2, menu3;
		double contador2 = 0.00, contador3 = 0.00;
		int imprimirTicketTeclado = 0;
		double operarioTeclado = 0;
		int cantidad = 1;
		int cero = 0;

		Ticket t1;
		Maquina ma1;

		t1 = new Ticket(precioTeclado);
		precioMaquina = t1.calcularPrecio(precioTeclado);

		ma1 = new Maquina(ingresarTeclado, comprarTeclado, devolverTeclado);

		do {

			System.out.println("*****************************\r\n" + "** 1 --> Precio del ticket **\r\n"
					+ "** 2 --> Ingresar saldo    **\r\n" + "** 3 --> Ver saldo         **\r\n"
					+ "** 4 --> Comprar ticket    **\r\n" + "** 5 --> Cambio a devolver **\r\n"
					+ "** 6 --> Imprimir billete  **\r\n" + "** 7 --> Operario          **\r\n"
					+ "** 0 --> Salir             **\r\n" + "*****************************\n");
			menu1 = Leer.datoInt();
			switch (menu1) {
			case 1:
				System.out.println("El precio de un ticket es de " + t1.calcularPrecio(precioTeclado) + " euros");

				break;

			case 2:
				System.out.println("Diga el saldo a cargar\n");
				ingresarTeclado = Leer.datoDouble();
				System.out.println(ma1.ingresarSaldo(ingresarTeclado));
				System.out.printf("Se ha cargado un total de %.2f euros\n", ingresarTeclado);
				contador2 = contador2 + ingresarTeclado;
				// ma1.getIngresar();
				// ma1.setIngresar(ingresarTeclado);

				break;
			case 3:

				System.out.println(ma1.mostrarSaldo(contador2 - comprarTeclado));
				System.out.printf("Su saldo actual es de %.2f euros\n", contador2 - comprarTeclado);
				contador2 = contador2 - comprarTeclado;

				break;

			case 4:

				System.out.println("¿Cuántos ticket quieres comprar?\n");
				cantidad = Leer.datoInt();
				if (contador2 > precioMaquina * cantidad) {

					System.out.println(ma1.comprarTicket(precioMaquina));
					System.out.printf("El coste total es de %.2f euros\n", (cantidad * precioMaquina));
					System.out.printf("Le queda un saldo de %.2f euros\n", contador2 - (cantidad * precioMaquina));

				} else {
					System.out.println("No tiene suficiente dinero para comprar ticket, recargue saldo antes\n");
				}

				contador2 = contador2 - (cantidad * precioMaquina);

				// ma1.getComprar();
				// ma1.setComprar(precioMaquina);

				break;
			case 5:
				System.out.println(ma1.calcularCambio(devolverTeclado));
				System.out.printf("Se te ha devuelto un total de %.2f euros\n", contador2 - devolverTeclado);
				contador2 = cero;
				break;

			case 6:
				System.out.println(ma1.imprimirTicket(imprimirTicketTeclado));
				break;
			case 7:
				System.out.println("Menú solo para operarios\r\n" + "**************************\r\n"
						+ "** 1 --> Introducir clave\r\n" + "** 0 --> Salir   \r\n" + "**************************\n");

				menu2 = Leer.datoInt();
				switch (menu2) {
				case 1:
					System.out.println("Opción solo disponible para operarios");
					System.out.println("Introduzca su clave de operario");
					System.out.println(ma1.permitirOperario(operarioTeclado));
					System.out.println("   Menú solo para operarios\r\n" + "********************************\r\n"
							+ "** 1 --> Cambiar precio ticket**\r\n" + "** 0 --> Salir                **\r\n"
							+ "********************************\n");
					menu3 = Leer.datoInt();
					switch (menu3) {
					case 1:
						System.out.println("Opción solo disponible para operarios\n");
						System.out.println("Introduzca su clave de operario\n");
						System.out.println(ma1.leerNuevoPrecio(precioTeclado));
						

						break;
					case 0:
						System.out.println("");
						break;
					default:
						System.out.println("Opción errónea, prueba otra vez");
						break;

					}

				case 0:
					System.out.println("");
					break;
				default:
					System.out.println("Opción errónea, prueba otra vez");
					break;

				}
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opción errónea, prueba otra vez");
				break;

			}

		} while (menu1 != 0);

	}

}
