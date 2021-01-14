package chorradas;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables del mapa
		String [][]primero;
		
		int tam1,tam2;
		int desde = 0, hasta = 9;
		int ale;
		
		
		// variables menu
		int menu1;
		
 System.out.println("*****************************************************************************************************************\r\n"
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
 		+ "           .___________________________________________________________________'\r\n"
 		+ "");
 
 	System.out.println("***************************\r\n"
 			+ "*---------MENÚ----------  *\r\n"
 			+ "* *	*	*	* *\r\n"
 			+ "* 1 -> Reglas del juego   *\r\n"
 			+ "* 2 -> Iniciar partida    *\r\n"
 			+ "* 0 -> Salir              *\r\n"
 			+ "***************************");
		
		Random r;
		r=new Random(System.nanoTime());
		
		System.out.println("Tamaño de las colunnas: \n");
		tam1=Leer.datoInt();
		
		System.out.println("Tamaño de las filas: \n");
		tam2=Leer.datoInt();
		primero = new String[tam1][tam2];
		
		for (int i=0;i < primero.length ; i++) {
			for(int j=0; j <primero[i].length ; j++) {
				
			primero[i][j]="■";
			System.out.print(primero[i][j]+ " ");
			}
			
		System.out.println("");
			
		}
		
		
		

	}

}
