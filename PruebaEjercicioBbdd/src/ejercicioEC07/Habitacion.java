package ejercicioEC07;

public class Habitacion {

	
	
	//atributos
	private int idHabitacion;
	private int idHotel;
	private int numHabitacion;
	private String nombre;
	private double metrosCuadrados;
	private boolean tieneVistas;
	private String tipo;
	
	//constructores
	public Habitacion(int idHabitacion, int idHotel, int numHabitacion, String nombre, double metrosCuadrados,
			boolean tieneVistas, String tipo) {
		super();
		this.idHabitacion = idHabitacion;
		this.idHotel = idHotel;
		this.numHabitacion = numHabitacion;
		this.nombre = nombre;
		this.metrosCuadrados = metrosCuadrados;
		this.tieneVistas = tieneVistas;
		this.tipo = tipo;
		
		
	}

	//toString
	
	@Override
	public String toString() {
		return "Habitacion [idHabitacion=" + idHabitacion + ", idHotel=" + idHotel + ", numHabitacion=" + numHabitacion
				+ ", nombre=" + nombre + ", metrosCuadrados=" + metrosCuadrados + ", tieneVistas=" + tieneVistas
				+ ", tipo=" + tipo + "]";
	}
	
	
}
