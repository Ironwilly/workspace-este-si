package boss;

import java.util.Random;

import datos.BaseDatos;
import utilidades.Leer;
import vista.vistaMapas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables del mapa
		String[][] primero;

		int tam1, tam2;
		int desde = 0, hasta = 9;
		int ale;

		// variables menu
		int menu1, menu2;
		
		
		BaseDatos bd = new BaseDatos ();
		vistaMapas visMa1 = new vistaMapas ();
		visMa1.mostrarMapa(bd.getMapa1());
		
		
/*
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

		System.out.println("***************************\r\n" + "*---------MENÚ----------  *\r\n" + "* *	*	*	* *\r\n"
				+ "* 1 -> Reglas del juego   *\r\n" + "* 2 -> Iniciar partida    *\r\n"
				+ "* 0 -> Salir              *\r\n" + "***************************");

		
		menu1=Leer.datoInt();
		
		switch(menu1){
			case 1:
				
				
				break;
			case 2:
				System.out.println("************************\r\n"
						+ "* ELIJA TAMAÑO TABLERO *\r\n"
						+ "************************\r\n"
						+ "** 1 -> Beginner      **\r\n"
						+ "**		      **\r\n"
						+ "** 2 -> Amateur       **\r\n"
						+ "**                    **\r\n"
						+ "** 3 -> Expert        **\r\n"
						+ "**                    **\r\n"
						+ "************************");
				menu2=Leer.datoInt();
				switch(menu2) {
				case 1:
					tam1 = 10;
					tam2 = 10;
					primero = new String[tam1][tam2];

					for (int i = 0; i < primero.length; i++) {
						for (int j = 0; j < primero[i].length; j++) {

							primero[i][j] = "■";
							System.out.print(primero[i][j] + " ");
						}

						System.out.println("");

					}
					
					System.out.println("\n\n");
					break;
				case 2:
					
					tam1 = 15;
					tam2 = 15;
					primero = new String[tam1][tam2];

					for (int i = 0; i < primero.length; i++) {
						for (int j = 0; j < primero[i].length; j++) {

							primero[i][j] = "■";
							System.out.print(primero[i][j] + " ");
						}

						System.out.println("");

					}
					
					System.out.println("\n\n");
					
					
					
					break;
					
				case 3:
					tam1 = 20;
					tam2 = 20;
					primero = new String[tam1][tam2];

					for (int i = 0; i < primero.length; i++) {
						for (int j = 0; j < primero[i].length; j++) {

							primero[i][j] = "■";
							System.out.print(primero[i][j] + " ");
						}

						System.out.println("");

					}
					
					System.out.println("\n\n");
					break;
				default:
					System.out.println("Número erróneo, prueba de nuevo");
					
					
					
				}
				break;
			case 0:
				System.out.println("Hasta la próxima partida en...¡Hundir La Flota!");
				
				
				break;
			default: 
				System.out.println("Número erróneo, prueba de nuevo");
				
				break;
			
			
		}
		
		}while(menu1 !=0);
		
		/*Random r;
		r = new Random(System.nanoTime());

		System.out.println("Tamaño de las colunnas: \n");
		tam1 = Leer.datoInt();

		System.out.println("Tamaño de las filas: \n");
		tam2 = Leer.datoInt();
		primero = new String[tam1][tam2];

		for (int i = 0; i < primero.length; i++) {
			for (int j = 0; j < primero[i].length; j++) {

				primero[i][j] = "■";
				System.out.print(primero[i][j] + " ");
			}

			System.out.println("");

		}
*/
	}

}
