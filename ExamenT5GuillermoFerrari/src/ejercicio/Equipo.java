package ejercicio;

import java.util.Iterator;
import java.util.List;

public class Equipo {

	// atributos

	private List<Jugador> jugadores;
	private String nombreEquipo;

	// constructores
	public Equipo(List<Jugador> jugadores, String nombreEquipo) {
		super();
		this.jugadores = jugadores;
		this.nombreEquipo = nombreEquipo;
	}

	// getters and setters

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	// ToString
	@Override
	public String toString() {
		return "Equipo [jugadores=" + jugadores + ", nombreEquipo=" + nombreEquipo + "]";
	}

	// métodos

	public void agregarJugador(int index, Jugador ju) {

		jugadores.add(index, ju);
	}

	public void mostrarJugadores() {

		Iterator<Jugador> it = jugadores.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}



	public int buscar(String nombre) {
		int temp = -1;
		boolean salir = false;

		for (int i = 0; i < jugadores.size() && !salir; i++) {
			if (jugadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
				temp = i;
				salir = true;
			}
		}
		return temp;
	}
	
	public void mostrar () {
		for (Jugador ju: jugadores) {
			System.out.println(ju);
		}
	}
	
	
}
