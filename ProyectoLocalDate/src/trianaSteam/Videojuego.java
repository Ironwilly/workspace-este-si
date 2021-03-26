package trianaSteam;

public class Videojuego {

	//atributos
	
	private String nombre;
	private String genero;
	private String calificacionEdad;
	
	//constructores
	public Videojuego(String nombre, String genero, String calificacionEdad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.calificacionEdad = calificacionEdad;
	}
	
	//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCalificacionEdad() {
		return calificacionEdad;
	}

	public void setCalificacionEdad(String calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}

	//ToString
	@Override
	public String toString() {
		return " nombre= " + nombre + ", Genero= " + genero + ", Calificacion Edad= " + calificacionEdad + "\n";
	}
	
	
	//metodos
	
	
	
	
	
	
	
	
}
