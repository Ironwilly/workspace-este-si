package trianaSteam;

import java.util.ArrayList;
import java.util.List;



public class Datos {

	
	// Atributos
	

	private List<Videojuego> ListaJuegos=new ArrayList<Videojuego>();
	
	Videojuego vj1 = new Videojuego("Marvel's Avengers", "Acción/Aventura", "+16");
	Videojuego vj2 = new Videojuego("Plants vs. Zombies: Battle for Neighborville", "Shooter en tercera persona", "+7");
	Videojuego vj3 = new Videojuego("Yakuza 6: The Song of Life", "Mundo Abierto", "+18");
	Videojuego vj4 = new Videojuego("Crash Bandicoot 4: It's About Time", "Plataformas", "+7");
	Videojuego vj5 = new Videojuego("Terminator: Resistance Enhanced", "Shooter en primera persona", "+16");
	Videojuego vj6 = new Videojuego("Red Dead Redemption 2", "Mundo Abierto", "+18");
	Videojuego vj7 = new Videojuego("The Legend of Zelda: Breath of the Wild", "Acción/Aventura", "+12");
	Videojuego vj8 = new Videojuego("Forza Horizon 4", "Coches", "+16");
	Videojuego vj9 = new Videojuego("God of War", "Acción/Aventura", "+18");
	Videojuego vj10 = new Videojuego("StarCraft II: Wings of Liberty", "Estrategia", "+16");
	Videojuego vj11 = new Videojuego("The Witcher 3: Wild Hunt", "Mundo Abierto", "+18");
	Videojuego vj12 = new Videojuego("Uncharted 4: El Desenlace del Ladrón", "Shooter en tercera persona", "+16");
	Videojuego vj13 = new Videojuego("Astro Bot Rescue Mission", "Plataformas", "+7");
	Videojuego vj14 = new Videojuego("BioShock Infinite", "Shooter en primera persona", "+18");
	Videojuego vj15 = new Videojuego("Dark Souls III", "Acción/Aventura", "+16");
	Videojuego vj16 = new Videojuego("Batman: Arkham City", "Acción/Aventura", "+16");
	Videojuego vj17 = new Videojuego("Ratchet & Clank", "Shooter en tercera persona", "+7");
	Videojuego vj18 = new Videojuego("Immortals Fenyx Rising", "Mundo Abierto", "+12");
	Videojuego vj19 = new Videojuego("Fortnite Battle Royale", "Battle Royale", "+12");
	Videojuego vj20 = new Videojuego("Resident Evil 7", "Acción/Aventura", "+18");
	
	
	
	//metodos
	public void agregarVideojuego() {

		ListaJuegos.add(vj1);
		ListaJuegos.add(vj2);
		ListaJuegos.add(vj3);
		ListaJuegos.add(vj4);
		ListaJuegos.add(vj5);
		ListaJuegos.add(vj6);
		ListaJuegos.add(vj7);
		ListaJuegos.add(vj8);
		ListaJuegos.add(vj9);
		ListaJuegos.add(vj10);
		ListaJuegos.add(vj11);
		ListaJuegos.add(vj12);
		ListaJuegos.add(vj13);
		ListaJuegos.add(vj14);
		ListaJuegos.add(vj15);
		ListaJuegos.add(vj16);
		ListaJuegos.add(vj17);
		ListaJuegos.add(vj18);
		ListaJuegos.add(vj19);
		ListaJuegos.add(vj20);
		
		
	}
	
	public void agregarManualmenteJuego(Videojuego vj) {
		
		
		ListaJuegos.add(vj);
	}
	

	
	
	//getters and setters


	public List<Videojuego> getListaJuegos() {
		return ListaJuegos;
	}



	public void setListaJuegos(List<Videojuego> listaJuegos) {
		ListaJuegos = listaJuegos;
	}
	

	//ToString


	@Override
	public String toString() {
		return "Datos [ListaJuegos=" + ListaJuegos + "]";
	}	
	
	//métodos
	
	public int buscarJuego(String nombre) {
		int temp = -1;
		
		boolean salir = false;

		for (int i = 0; i < ListaJuegos.size() && !salir; i++) {
			if (ListaJuegos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				temp = i;
				salir = true;
			}
		}
		return temp;
	}

	
}
