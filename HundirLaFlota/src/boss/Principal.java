package boss;

import java.util.Random;

import datos.BaseDatos;
import datos.BdBarcos;
import datos.Reglas;
import model.Jugadores;
import utilidades.Leer;
import vista.vistaMapas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *************************************************************************************************
		 * DANIEL OLIVA GARCIA ----> Ideas y Reglas del juego * * * GUILLERMO FERRARI
		 * FERRARI ----> Clases:principal,BaseDatos,BdBarcos,Barco,Jugadores,vistaMapas*
		 *************************************************************************************************
		 */

		// variables del mapa
		String[][] barquitos;

		int tam1, tam2;
		int desde = 0, hasta = 9;
		int ale;

		int fila, columna, sentido = 1;
		int filaMem1 = 0, columnaMem1 = 0, filaMem2 = 0, columnaMem2 = 0, filaMem3 = 0, columnaMem3 = 0;
		int filaMem4 = 0, columnaMem4 = 0;

		// variables menu
		int menu1, menu2, menu3;

		// jugadores
		String nombrePlayer1, nombrePlayer2;

		// barcos

		BdBarcos bdB = new BdBarcos();

		vistaMapas cargBarcos = new vistaMapas();

		// mapa
		BaseDatos bd = new BaseDatos();

		vistaMapas visMa1 = new vistaMapas();

		// jugadores
		Jugadores player1;
		Jugadores player2;

		// reglas
		Reglas regl = new Reglas();

		// es falso mientras no termine la partida

		boolean partidaTerminada = false;

		// disparos

		boolean disparoAcertado = false;

		do {
			System.out.println(
					"*****************************************************************************************************************\r\n"
							+ "*██   ██ ██    ██ ███    ██ ██████  ██ ██████      ██       █████      ███████ ██       ██████  ████████  █████ * \r\n"
							+ "*██   ██ ██    ██ ████   ██ ██   ██ ██ ██   ██     ██      ██   ██     ██      ██      ██    ██    ██    ██   ██* \r\n"
							+ "*███████ ██    ██ ██ ██  ██ ██   ██ ██ ██████      ██      ███████     █████   ██      ██    ██    ██    ███████* \r\n"
							+ "*██   ██ ██    ██ ██  ██ ██ ██   ██ ██ ██   ██     ██      ██   ██     ██      ██      ██    ██    ██    ██   ██* \r\n"
							+ "*██   ██  ██████  ██   ████ ██████  ██ ██   ██     ███████ ██   ██     ██      ███████  ██████     ██    ██   ██* \r\n"
							+ "***************************************************************************************************************** ");

			System.out.println("                                                        .\r\n"
					+ "                                      .                 |\r\n"
					+ "                                      +                 |\r\n"
					+ "                             .        |                *+W+-*\r\n"
					+ "               .           +y        +W+              . H                 .\r\n"
					+ "            .  +y            |I.   y  |               ! H= .           .  ^\r\n"
					+ "            !   \\     .     |H '. /   |  ___.        .! H  !   +--.--y !  V\r\n"
					+ "            !    \\     \\  +=|H|=='.=+ | |====\\   _  '_H_H__H_. H_/=  J !  !\r\n"
					+ "          . !     \\'    VVV_HHH_/__'._H |  E  \\_|=|_|========|_|==|____H. ! _______.\r\n"
					+ "          I-H_I=I=HH_==_|I_IIIII_I_I_=HH|======.I-I-I-=======-I=I=I=I_=H|=H'===I=I/\r\n"
					+ "          \\                                                                      ,\r\n"
					+ "           |                                                                    /\r\n"
					+ "           .___________________________________________________________________'\r\n" + "");

			System.out.println("***************************\r\n" + "*---------MENÚ----------  *\r\n"
					+ "* *	*	*	* *\r\n" + "* 1 -> Reglas del juego   *\r\n" + "* 2 -> Iniciar partida    *\r\n"
					+ "* 0 -> Salir              *\r\n" + "***************************");

			menu1 = Leer.datoInt();

			switch (menu1) {
			case 1:
				regl.imprimirReglas();

				break;
			case 2:
				System.out.println("************************\r\n" + "* ELIJA TAMAÑO TABLERO *\r\n"
						+ "************************\r\n" + "** 1 -> Beginner      **\r\n" + "**		      **\r\n"
						+ "** 2 -> Amateur       **\r\n" + "**                    **\r\n"
						+ "** 3 -> Expert        **\r\n" + "**                    **\r\n" + "************************");
				menu2 = Leer.datoInt();
				switch (menu2) {
				case 1:

					System.out.println("Introduzca nombre jugador1:");

					nombrePlayer1 = Leer.dato();

					player1 = new Jugadores(nombrePlayer1);

					System.out.println(player1);

					System.out.println("Introduzca nombre jugador2:");

					nombrePlayer2 = Leer.dato();

					player2 = new Jugadores(nombrePlayer2);

					System.out.println(player2);

					// ponemos la canóa

					System.out.println("¿ En qué fila quieres poner la cánoa? ");
					fila = Leer.datoInt();
					filaMem1 = filaMem1 + fila;
					System.out.println("¿ En qué columna quieres poner la cánoa ? ");
					columna = Leer.datoInt();
					columnaMem1 = columnaMem1 + columna;

					barquitos = new String[filaMem1][columnaMem1];

					// ponemos las fragatas

					System.out.println("¿ En qué fila quieres poner la primera fragata ?");
					fila = Leer.datoInt();
					filaMem2 = filaMem2 + fila;

					System.out.println("¿ En qué columna quieres poner la primera fragata ?");
					columna = Leer.datoInt();
					columnaMem2 = columnaMem2 + columna;

					barquitos = new String[filaMem2][columnaMem2];

					// ponemos los destructores

					System.out.println("¿ En qué fila quieres poner el primer destructor ?");
					fila = Leer.datoInt();
					filaMem3 = filaMem3 + fila;

					System.out.println("¿ En qué columna quieres poner el primer destructor ?");
					columna = Leer.datoInt();
					columnaMem3 = columnaMem3 + columna;

					barquitos = new String[filaMem3][columnaMem3];

					// ponemos el portaaviones

					System.out.println("¿ En qué fila quieres poner el portaaviones ?");
					fila = Leer.datoInt();
					filaMem4 = filaMem4 + fila;

					System.out.println("¿ En qué columna quieres poner el portaaviones ?");
					columna = Leer.datoInt();
					columnaMem4 = columnaMem4 + columna;

					barquitos = new String[filaMem4][columnaMem4];
					visMa1.pintarConBarco1(bd.getMapa1(), bdB.getB1(), filaMem1, columnaMem1, sentido);
					visMa1.pintarConBarco2(bd.getMapa1(), bdB.getB2(), filaMem2, columnaMem2, sentido);
					visMa1.pintarConBarco3(bd.getMapa1(), bdB.getB3(), filaMem3, columnaMem3, sentido);
					visMa1.pintarConBarco4(bd.getMapa1(), bdB.getB4(), filaMem4, columnaMem4, sentido);

					break;
				case 2:

					System.out.println("Introduzca nombre jugador1:");

					nombrePlayer1 = Leer.dato();

					player1 = new Jugadores(nombrePlayer1);

					System.out.println(player1);

					System.out.println("Introduzca nombre jugador2:");

					nombrePlayer2 = Leer.dato();

					player2 = new Jugadores(nombrePlayer2);

					System.out.println(player2);

					// ponemos la canóa

					System.out.println("¿ En qué fila quieres poner la cánoa? ");
					fila = Leer.datoInt();
					filaMem1 = filaMem1 + fila;
					System.out.println("¿ En qué columna quieres poner la cánoa ? ");
					columna = Leer.datoInt();
					columnaMem1 = columnaMem1 + columna;

					barquitos = new String[filaMem1][columnaMem1];

					// ponemos las fragatas

					System.out.println("¿ En qué fila quieres poner la primera fragata ?");
					fila = Leer.datoInt();
					filaMem2 = filaMem2 + fila;

					System.out.println("¿ En qué columna quieres poner la primera fragata ?");
					columna = Leer.datoInt();
					columnaMem2 = columnaMem2 + columna;

					barquitos = new String[filaMem2][columnaMem2];

					// ponemos los destructores

					System.out.println("¿ En qué fila quieres poner el primer destructor ?");
					fila = Leer.datoInt();
					filaMem3 = filaMem3 + fila;

					System.out.println("¿ En qué columna quieres poner el primer destructor ?");
					columna = Leer.datoInt();
					columnaMem3 = columnaMem3 + columna;

					barquitos = new String[filaMem3][columnaMem3];

					// ponemos el portaaviones

					System.out.println("¿ En qué fila quieres poner el portaaviones ?");
					fila = Leer.datoInt();
					filaMem4 = filaMem4 + fila;

					System.out.println("¿ En qué columna quieres poner el portaaviones ?");
					columna = Leer.datoInt();
					columnaMem4 = columnaMem4 + columna;

					barquitos = new String[filaMem4][columnaMem4];
					visMa1.pintarConBarco1(bd.getMapa2(), bdB.getB1(), filaMem1, columnaMem1, sentido);
					visMa1.pintarConBarco2(bd.getMapa2(), bdB.getB2(), filaMem2, columnaMem2, sentido);
					visMa1.pintarConBarco3(bd.getMapa2(), bdB.getB3(), filaMem3, columnaMem3, sentido);
					visMa1.pintarConBarco4(bd.getMapa2(), bdB.getB4(), filaMem4, columnaMem4, sentido);

					break;

				case 3:

					System.out.println("Introduzca nombre jugador1:");

					nombrePlayer1 = Leer.dato();

					player1 = new Jugadores(nombrePlayer1);

					System.out.println(player1);

					System.out.println("Introduzca nombre jugador2:");

					nombrePlayer2 = Leer.dato();

					player2 = new Jugadores(nombrePlayer2);

					System.out.println(player2);

					// ponemos la canóa

					System.out.println("¿ En qué fila quieres poner la cánoa? ");
					fila = Leer.datoInt();
					filaMem1 = filaMem1 + fila;
					System.out.println("¿ En qué columna quieres poner la cánoa ? ");
					columna = Leer.datoInt();
					columnaMem1 = columnaMem1 + columna;

					barquitos = new String[filaMem1][columnaMem1];

					// ponemos las fragatas

					System.out.println("¿ En qué fila quieres poner la primera fragata ?");
					fila = Leer.datoInt();
					filaMem2 = filaMem2 + fila;

					System.out.println("¿ En qué columna quieres poner la primera fragata ?");
					columna = Leer.datoInt();
					columnaMem2 = columnaMem2 + columna;
					barquitos = new String[filaMem2][columnaMem2];

					// ponemos los destructores

					System.out.println("¿ En qué fila quieres poner el primer destructor ?");
					fila = Leer.datoInt();
					filaMem3 = filaMem3 + fila;

					System.out.println("¿ En qué columna quieres poner el primer destructor ?");
					columna = Leer.datoInt();
					columnaMem3 = columnaMem3 + columna;
					barquitos = new String[filaMem3][columnaMem3];

					// ponemos el portaaviones

					System.out.println("¿ En qué fila quieres poner el portaaviones ?");
					fila = Leer.datoInt();
					filaMem4 = filaMem4 + fila;

					System.out.println("¿ En qué columna quieres poner el portaaviones ?");
					columna = Leer.datoInt();
					columnaMem4 = columnaMem4 + columna;

					barquitos = new String[filaMem4][columnaMem4];
					visMa1.pintarConBarco1(bd.getMapa3(), bdB.getB1(), filaMem1, columnaMem1, sentido);
					visMa1.pintarConBarco2(bd.getMapa3(), bdB.getB2(), filaMem2, columnaMem2, sentido);
					visMa1.pintarConBarco3(bd.getMapa3(), bdB.getB3(), filaMem3, columnaMem3, sentido);
					visMa1.pintarConBarco4(bd.getMapa3(), bdB.getB4(), filaMem4, columnaMem4, sentido);

					System.out.println("\n\n");

					break;

				}

			}
		}while (menu1 != 0);

	}
}