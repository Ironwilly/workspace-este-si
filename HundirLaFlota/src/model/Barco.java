package model;

public class Barco {
	
	
	private int tam;
	private String nombre;
	private String tipo;
	private  int cantidad;
	
	
	
	public Barco(int tam, String nombre, String tipo) {
		super();
		this.tam = tam;
		this.nombre = nombre;
		this.tipo = tipo;
	}



	public int getTam() {
		return tam;
	}



	public void setTam(int tam) {
		this.tam = tam;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
