package ejercicio;

import java.util.Comparator;

public class OrdenarPorPosicionJuego implements Comparator <Jugador> {

	@Override
	public int compare(Jugador ju1, Jugador ju2) {
		// TODO Auto-generated method stub
		
		String posicionJuegoju1 = ju1.getPosicion();
		String posicionJuegoju2 = ju2.getPosicion();
		
		
		return (posicionJuegoju1.toLowerCase().compareTo(posicionJuegoju2.toLowerCase()));
	}

}


