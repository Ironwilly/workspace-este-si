package ejercicio02;


import java.util.List;

public class GestionClub {
	
	private List<Socio> listaSocios;

	
	//constructores
	
	public GestionClub(List<Socio> listaSocios) {
		super();
		this.listaSocios = listaSocios;
	}
	
	
	
	
	//getters and setters
	
	
	public List<Socio> getListaSocios() {
		return listaSocios;
	}




	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}


	//métodos

	//agregamos socio
	public void guardarSocio(Socio so) {
		
		
		listaSocios.add(so);
	}
	
	
	//buscamos socio
	public int buscarSocio(String dni) {
		
		int numero = -1;
		boolean salir = false;
		
		for(int i=0;i<listaSocios.size() && !salir;i++) {
			
			if(listaSocios.get(i).getDni().equalsIgnoreCase(dni)) {
				numero = i;
				salir = true;
			}
			}
			
		return numero;
		}
	
		
	
	
	
	//imprimimos lista socios
	
	public void imprimirSocios() {
		
		for(Socio listSoci : listaSocios) {
			System.out.println(listSoci);
		}
	}
	
	//modificar socio
	
	public void modificarSocio(String dni, String nombreNu) {
		
		int index = buscarSocio(dni);
		
		if(index >= 0) {
			listaSocios.get(index).setNombre(nombreNu);
		}
	}
	
	//borrar socio
	
	public void borrarSocio(String dni) {
		
		int index = buscarSocio(dni);
		
		if(index >= 0 ) {
			listaSocios.remove(index);
		}
	}
	
	
	

}
