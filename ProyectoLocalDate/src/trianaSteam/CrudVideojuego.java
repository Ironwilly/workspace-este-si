package trianaSteam;


import java.util.ArrayList;
import java.util.List;



public class CrudVideojuego  {

	//atributo
	private List<Videojuego> ListaJuegos;

	// constructores

	public CrudVideojuego(List<Videojuego> listaJuegos) {
		super();
		ListaJuegos = listaJuegos;
	}

	// getters and setters

	public List<Videojuego> getListaJuegos() {
		return ListaJuegos;
	}

	public void setListaJuegos(List<Videojuego> listaJuegos) {
		ListaJuegos = listaJuegos;
	}

	// ToString

	@Override
	public String toString() {
		return "CrudVideojuego [ListaJuegos=" + ListaJuegos + "]";
	}

	
	
	//Métodos 
	
	public int buscarrJuego(String nombre) {
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
