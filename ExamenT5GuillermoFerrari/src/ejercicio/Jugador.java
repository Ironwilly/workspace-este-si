package ejercicio;

public class Jugador implements Comparable <Jugador>{
	
	//atributos
	
	private String nombre;
	private String posicion;
	private int numCamiseta;
	private int numAnotados;
	private boolean titular;
	
	//constructores 
	
	public Jugador(String nombre, String posicion, int numCamiseta, int numAnotados, boolean titular) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.numCamiseta = numCamiseta;
		this.numAnotados = numAnotados;
		this.titular = titular;
	}
	
	
	//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getNumCamiseta() {
		return numCamiseta;
	}

	public void setNumCamiseta(int numCamiseta) {
		this.numCamiseta = numCamiseta;
	}

	public int getNumAnotados() {
		return numAnotados;
	}

	public void setNumAnotados(int numAnotados) {
		this.numAnotados = numAnotados;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}


	//ToString
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", numCamiseta=" + numCamiseta
				+ ", numAnotados=" + numAnotados + ", titular=" + titular + "]";
	}


	@Override
	public int compareTo(Jugador ju) {
		// TODO Auto-generated method stub
		
		if(this.numCamiseta < ju.numCamiseta) {
			return -1;
		}else {
			if(this.numCamiseta > ju.numCamiseta) {
				return 1;
			}
		}
		
		return 0;
	}
	
	
	
















}
