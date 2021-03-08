package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu1;
		int index;
		String nombreJu;
		String posicionJu;
		int numCami; 
		int puntosAno;
		boolean titularJu;
		String nombreEquipo = "Triana bulls";
		List<Jugador> jugadores = new ArrayList<Jugador>();
		
		
		do {
		jugadores.add(new Jugador("Juanito","base",55,32,true));
		jugadores.add(new Jugador("Pepito","escolta",67,18,true));
		jugadores.add(new Jugador("Manolito","alero",20,26,true));
		jugadores.add(new Jugador("Luisito","ala",70,19,false));
		jugadores.add(new Jugador("Alfonsito","pivot",41,39,true));
		
		for(Jugador ju : jugadores) {
		
			System.out.println(ju);
			System.out.println("\n");
		}
		
		
		Equipo e = new Equipo(jugadores,nombreEquipo);
		
		
		
		System.out.println("*******************************************************\r\n"
				+ "*** 1 ---> Añadir nuevo jugador                     ***\r\n"
				+ "*** 2 ---> Mostrar todos los jugadores              ***\r\n"
				+ "*** 3 ---> Buscar jugador por nombre                ***\r\n"
				+ "*** 4 ---> Buscar jugador por número camiseta       ***\r\n"
				+ "*** 5 ---> Buscar el jugador con más puntos anotados***\r\n"
				+ "*** 6 ---> Borrar Jugador                           ***\r\n"
				+ "*** 7 ---> Modificar la posicion de un jugador      ***\r\n"
				+ "*** 8 ---> Ordenar jugadores por num camiseta       ***\r\n"
				+ "*** 9 ---> Ordenar jugadores por posicion de juego  ***\r\n"
				+ "*** 10 --> Mostrar jugadores titulares              ***\r\n"
				+ "*** 0 ---> Salir                                    ***\r\n"
				+ "*******************************************************");
		
		menu1 = Leer.datoInt();
		
		switch(menu1) {
		
		case 1:
			
			System.out.println("Diga en qé posición quieres agregar el nuevo jugador: \n");
			index=Leer.datoInt();
			System.out.println("Diga el nombre del nuevo jugador: \n");
			nombreJu = Leer.dato();
			System.out.println("Diga la posición de juego del nuevo jugador: \n");
			posicionJu = Leer.dato();
			System.out.println("Diga el número de camiseta del nuevo jugador: \n");
			numCami = Leer.datoInt();
			System.out.println("Diga los puntos que tiene anotado el nuevo jugador: \n");
			puntosAno = Leer.datoInt();
			
			
			
			//e.agregarJugador(index,Jugador);
			
			
		case 2:
			
			e.mostrarJugadores();
			break;
			
		case 3:
			System.out.println("Diga el nombre que quieres buscar: \n");
			nombreJu = Leer.dato();
			System.out.println(e.buscar(nombreJu));
			
			
			break;
		case 8:
			
			
			Collections.sort(jugadores );
			System.out.println("Jugadores ordenados por número de camiseta \n"+ jugadores + "\n");
			
			break;
			
		case 9:
			
			
			Collections.sort(jugadores, new OrdenarPorPosicionJuego());
			System.out.println("Jugadores ordenados por posicion de juego \n" + jugadores);
			
			break;
			
		case 10:
			if(titularJu = true) {
				e.mostrar();
			}
			
			break;
			
		case 0:
			System.out.println("Hasta pronto!!");
			
			break;
			
			default :
				System.out.println("Número erróneo!");
				break;
		
		
		
		}
		}while(menu1 !=0);

	}

	

}
