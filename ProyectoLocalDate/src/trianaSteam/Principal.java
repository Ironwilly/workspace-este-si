package trianaSteam;

import java.util.ArrayList;

import java.util.List;

import utilidades.Leer;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Los tiempos avanzan y van cambiando las tecnologías, por eso decidí cerrar mi
		 * antiguo videoclub de vhs, y abrir uno online más acorde a la actualidad.
		 * 
		 * TrianaSteam, es una plataforma de alquiler de videojuegos online, en la cual,
		 * un cliente puede alquilar videojuegos desde cualquier parte del mundo,
		 * teniendo en cuenta que el pago del alquiler, le da derecho a tener 1 día (sin
		 * referencia horaria, es decir, si alquila un martes, tiene que devolver un
		 * miercoles, sea la hora que sea) el videojuego alquilado.
		 * 
		 * En caso de no entregar el juego pasado 1 dia, se le cobrara un recargo
		 * adicional de 3€ por cada dia de demora. El primer día de cada mes hacemos una
		 * oferta del 50%, la cual es posible consultar poniendo el mes en cuestion. El
		 * cliente también puede saber cuantos días quedan para que se haga una nueva
		 * oferta 2x1, simplemente poniendo el mes que quiere saber la oferta, y tomaria
		 * como fecha inicial la actual.
		 * 
		 * La plataforma tambien tiene una promocion especial del 30% en los años que
		 * sean bisiesto, el cual el cliente podrá consultar si es bisiesto o no, y si
		 * tiene descuento simplemente poniendo el año que quiera consultar. A parte de
		 * mostrarle si es bisiesto o no, y si tiene descuento o no, la plataforma
		 * automaticamente mostraria el periodo de tiempo que faltaría para ese año que
		 * se consulta (sea bisiesto o no). Otra promoción que le damos a los clientes
		 * es que si alquila un videojuejo, y a las 3 semanas vuelve a alquilar otro, se
		 * le hace descuento de un 10%.(Unicamente se le aplica este descuento si no
		 * coincide con algunos anteriores)
		 * 
		 */

		int menu1, menu2;
		double saldo, saldoTotal = 0.00;
		int descuentoBi = 30;
		int denominador = 100;
		double precioNormal = 4.95,precio = 0, mitad = 2, precioDes = 0, precioBisi = 0, precioDesPrimMes = 0, precioCombo = 0,
				precioTicket = 0;
		int porcentajeCombo = 80;
		String zona, nombPlatf = "TrianaSteam";
		int year, mes, dia, year2, mes2, dia2;
		int cantidad = 1;
		int cantidadTotal = 0;
		int indice;
		String nombre, genero, calificacionEdad;
		String salir = "yes";

		Datos d = new Datos();
		
		CrudVideojuego crud = new CrudVideojuego(new ArrayList<Videojuego>());

		Plataforma platf = new Plataforma(nombPlatf);

		System.out.println("Escriba la zona de donde vas a alquilar el videojuego  ");
		platf.verZona();
		zona = Leer.dato();

		do {

			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
					+ "%%***********************************************%%\r\n"
					+ "%%******************TRIANASTEAM******************%%\r\n"
					+ "%%***********************************************%%\r\n"
					+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\r\n"
					+ "%%  1--> Agregar Saldo                           %%\r\n"
					+ "%%  2--> Alquilar Videojuego                     %%\r\n"
					+ "%%  3--> Devolver Videojuego                     %%\r\n"
					+ "%%  4--> 50% primer dia mes                      %%\r\n"
					+ "%%  5--> Dias que faltan para el prox 2x1        %%\r\n"
					+ "%%  6--> Promoción años bisiestos 30%            %%\r\n"
					+ "%%  7--> Promo alquiler a las tres semanas 10%   %%\r\n"
					+ "%%  8--> Ticket                                  %%\r\n"
					+ "%%  9--> Retirar Saldo                           %%\r\n"
					+ "%%  10-> Agregar Videojuego                      %%\r\n"
					+ "%%  0--> Salir                                   %%\r\n"
					+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n\n");

			menu1 = Leer.datoInt();

			switch (menu1) {

			case 1:

				System.out.println("Indique el saldo que quieres agregar \n");

				saldo = Leer.datoDouble();
				saldoTotal = saldoTotal + saldo;

				System.out.printf(
						"Usted ha ingresado %.2f euros y tiene un total de saldo ahora mismo de %.2f euros \n\n", saldo,
						saldoTotal);

				break;

			case 2:

				if (saldoTotal >= 4.95) {
					d.agregarVideojuego();
					System.out.println(
							"El precio de alquiler de cualquier videojuego sin ningún descuento es de 4.95 euros \n");
					System.out.println("Escribe la fecha que deseas para alquilar, primero pon el año \n");
					year = Leer.datoInt();
					System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
					mes = Leer.datoInt();
					System.out.println("Y por último pon el día \n");
					dia = Leer.datoInt();
					platf.elegirZona(zona, year, mes, dia);

					System.out.println("Escribe el nombre del juego que quieres alquilar \n");
					nombre = Leer.dato();
					indice = d.buscarJuego(nombre);

					if (indice < 0) {

						System.out.println(
								"Lo sentimos, ese juego no lo tenemos en catálogo, puedes ayudarte de la siguiente lista \n");
						System.out.println(d.getListaJuegos());
					} else {
						d.agregarVideojuego();
						System.out.println("Ese juego lo tenemos en catálogo!!!, acabas de alquilar \n");
						System.out.println(d.getListaJuegos().get(d.buscarJuego(nombre)));

						LocalDate fechaAMirar = LocalDate.of(year, mes, dia);

						if (dia == 1 && !fechaAMirar.isLeapYear()) {
							System.out.println("Estás de suerte, es primero de mes y tienes descuento 50%");
							precioDesPrimMes = (precioNormal / mitad);

							saldoTotal = saldoTotal - precioDesPrimMes;
							System.out.printf(
									"El precio del aquiler del juego es de %.2f euros, le queda un saldo de %.2f euros \n\n",
									precioDesPrimMes, saldoTotal);
							cantidadTotal = cantidadTotal + cantidad;
						}

						if (dia != 1 && fechaAMirar.isLeapYear()) {

							System.out.println(
									"Vaya racha llevas!!, este año es bisiesto, y se te hace un descuento del 30% durante todo el año \n");
							precioDes = precioNormal - (precioNormal * descuentoBi) / denominador;
							saldoTotal = saldoTotal - precioDes;
							System.out.printf(
									"El precio del aquiler del juego es de %.2f euros, le queda un saldo de %.2f euros \n\n",
									precioDes, saldoTotal);
							cantidadTotal = cantidadTotal + cantidad;

						}

						if (dia != 1 && !fechaAMirar.isLeapYear()) {
							precio = precio + precioNormal;
							System.out.printf(
									"El precio del aquiler del juego es de %.2f euros, le queda un saldo de %.2f euros \n\n",
									precioNormal, saldoTotal);
							cantidadTotal = cantidadTotal + cantidad;
							saldoTotal = saldoTotal - precioNormal;
						}

						if (dia == 1 && fechaAMirar.isLeapYear()) {

							precioCombo = precioNormal - (precioNormal * porcentajeCombo) / denominador;
							saldoTotal = saldoTotal - precioCombo;
							System.out.println(
									"Vaya combo promoción te llevas!!!,30% por ser año bisiesto y 50% por ser primero de mes!! \n\n");
							System.out.printf(
									"El precio del aquiler del juego es de %.2f euros, le queda un saldo de %.2f euros \n\n",
									precioCombo, saldoTotal);
							cantidadTotal = cantidadTotal + cantidad;

						}

					}

				} else {
					System.out.println("No tienes saldo suficiente para alquilar un videojuego, recarga saldo antes.");
				}
				break;

			case 3:

				System.out.println(
						"Escribe la fecha en la que alquilaste los últimos videojuegos, primero pon el año \n");
				year = Leer.datoInt();
				System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
				mes = Leer.datoInt();
				System.out.println("Y por último pon el día \n");
				dia = Leer.datoInt();
				System.out.println("Escribe la fecha que vas a devolver el/los videojuegos, primero pon el año \n");
				year2 = Leer.datoInt();
				System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
				mes2 = Leer.datoInt();
				System.out.println("Y por último pon el día \n");
				dia2 = Leer.datoInt();

				platf.diferenciaDeDias(year, mes, dia, year2, mes2, dia2);

				break;

			case 4:

				System.out.println(
						"Escribe la fecha que quieres saber para ver en que día cae el 50%, primero pon el año \n");
				year = Leer.datoInt();
				System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
				mes = Leer.datoInt();
				System.out.println("Y por último pon el día \n");
				dia = Leer.datoInt();
				System.out.println("El día que cae el 50% de la fecha consultada es: \n");
				platf.mostrarDiaPrimeroMes(year, mes, dia);

				break;
			case 5:

				platf.diasQueFaltan();

				break;

			case 6:
				System.out.println(
						"Escribe la fecha que quieres saber si es año bisiesto y tienes un 30% descuento, primero pon el año \n");
				year = Leer.datoInt();
				System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
				mes = Leer.datoInt();
				System.out.println("Y por último pon el día \n");
				dia = Leer.datoInt();
				platf.calcularBisiesto(year, mes, dia);

				break;
			case 7:
				System.out.println("Escribe la fecha de la ultima vez que alquilastes, primero pon el año \n");
				year = Leer.datoInt();
				System.out.println("Ahora el mes (ej: 6 --> mes junio) \n");
				mes = Leer.datoInt();
				System.out.println("Y por último pon el día \n");
				dia = Leer.datoInt();
				System.out.println(
						"Si quieres beneficiarte del 10% descuento por alquilar justo a las tres semanas desde "
								+ "el ultimo alquiler, deberás hacerlo en la siguiente fecha:  \n");
				platf.calcularFechaTresSemanas(year, mes, dia);

				break;
			case 8:

				if (cantidadTotal == 0) {

					System.out.println("Sino alquilas nada, no tienes ticket.");

				} else {
					precioTicket = precio+ precioDes  + precioBisi + precioDesPrimMes + precioCombo ;

					System.out.printf(
							"***************************************************\r\n"
									+ "***************************************************\r\n"
									+ "********************TRIANASTEAM********************\r\n"
									+ "***************************************************\r\n"
									+ "***************************************************\r\n"
									+ "**  Cantidad de juegos alquilados          %d    **\r\n"
									+ "**                                               **\r\n"
									+ "**  Precio total con descuentos incluidos  %.2f  **\r\n"
									+ "**                                               **\r\n"
									+ "**                                               **\r\n"
									+ "***************************************************\n",
							cantidadTotal, precioTicket);
					System.out.print("Fecha : ");
					platf.mostrarFechaYHora();

				}

				break;
				
			case 9:
				
				if(saldoTotal ==0) {
					
					System.out.println("Su cuenta esta a 0€, no tienes nada que retirar.\n");
				}else {
				
				System.out.printf("\nUsted ha retirado un total de %.2f euros.\n\n",
						saldoTotal);
				
				saldoTotal = saldoTotal - saldoTotal;
				}
				
				break;
				
			case 10:
				System.out.println("Diga el nombre del Videojuego que quieres agregar \n");
				nombre = Leer.dato();
				System.out.println("Diga el género del Videojuego que quieres agregar \n");
				genero = Leer.dato();
				System.out.println("Diga la calificación de edad para el Videojuego \n");
				calificacionEdad = Leer.dato();
				Videojuego vj = new Videojuego(nombre,genero,calificacionEdad);
				d.agregarManualmenteJuego(vj);
				break;
				
				
			case 0:
				if(saldoTotal >0) {
					System.out.println("No te vayas sin tu dinero, retira primero el saldo.\n");
				}else {
					
					System.out.println("Hasta la próxima. \n");
				}

			}
			
			

		} while (menu1 != 0 || saldoTotal >0);

	}

}
