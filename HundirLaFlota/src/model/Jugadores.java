package model;

public class Jugadores {

	
	private String nombre;
	private int puntuacion;
	private int lanzamientos;
	
	
	
	
	
	public Jugadores(String nombre, int puntuacion, int lanzamientos) {
		super();
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.lanzamientos = lanzamientos;
	}
	
	public Jugadores(String nombre) {
		super();
		this.nombre = nombre;
		this.puntuacion = 0;
		this.lanzamientos = 100;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public int getLanzamientos() {
		return lanzamientos;
	}
	public void setLanzamientos(int lanzamientos) {
		this.lanzamientos = lanzamientos;
	}
	@Override
	public String toString() {
		return "Jugadores [nombre=" + nombre + ", puntuacion=" + puntuacion + ", lanzamientos=" + lanzamientos + "]";
	}
	
	
	
	
	
	
}
