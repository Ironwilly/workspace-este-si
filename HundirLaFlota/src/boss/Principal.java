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

		// variables del mapa
		String[][] canoa;
		String[][] fragatas;
		
		
		

		int tam1, tam2;
		int desde = 0, hasta = 9;
		int ale;
		
		int fila, columna, sentido=1;
		int filaMem=0, columnaMem=0;

		// variables menu
		int menu1, menu2,menu3;
		
		
		//jugadores
		String nombrePlayer1,nombrePlayer2;
		
		
		//barcos
		
		BdBarcos bdB = new BdBarcos();
		
		vistaMapas cargBarcos = new vistaMapas ();
		
	    //mapa
		BaseDatos bd = new BaseDatos ();
			
		vistaMapas visMa1 = new vistaMapas ();
		

		
	
		//jugadores
		Jugadores player1;
		Jugadores player2 ;
		
		//reglas
		Reglas regl=new Reglas();
		
		//es falso mientras no termine la partida
		
		boolean  partidaTerminada = false;
		
		//disparos
		
		boolean disparoAcertado = false;
		
		//visMa1.mostrarMapa(bd.getMapa3());
		
		
		// ponemos la canóa
		
		System.out.println("¿ En qué fila quieres poner la cánoa? ");
		fila=Leer.datoInt();
		filaMem = filaMem +fila;
		System.out.println("¿ En qué columna quieres poner la cánoa ? ");
		columna=Leer.datoInt();
		columnaMem= columnaMem + columna;
		
		canoa=new String[filaMem][columnaMem];
		
	   
		
	
		
     
	
		
		
		// ponemos las fragatas
		

		System.out.println("¿ En qué fila quieres poner la primera fragata ?");
		fila=Leer.datoInt();
		filaMem = filaMem +fila;
		
		System.out.println("¿ En qué columna quieres poner la primera fragata ?");
		columna=Leer.datoInt();
		columnaMem= columnaMem + columna;
		
		fragatas=new String[filaMem][columnaMem];
		
		
		
		
		visMa1.pintarConBarco(bd.getMapa3(),bdB.getB1(),bdB.getB2(),filaMem, columnaMem, sentido);
		
			
			
		
		
		
		
		
		
		
		
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
				regl.imprimirReglas();
				
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
					
					System.out.println("Introduzca nombre jugador1:");
					
					nombrePlayer1=Leer.dato();
					
					player1= new Jugadores(nombrePlayer1);
					
					System.out.println(player1);
					
					
					System.out.println("Introduzca nombre jugador2:");
					
					nombrePlayer2=Leer.dato();
					
					player2= new Jugadores(nombrePlayer2);
					
					System.out.println(player2);
					
					
					cargBarcos.cargarBarcos(primero);
					
					visMa1.mostrarMapa(bd.getMapa1());
					
					
					
					break;
				case 2:
				
			
					
					
					 visMa2.mostrarMapa(bd.getMapa2());
					
					
					
					break;
					
				case 3:
					
					
					visMa3.mostrarMapa(bd.getMapa3());
					
					
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
		*/
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
