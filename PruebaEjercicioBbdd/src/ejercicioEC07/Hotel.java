package ejercicioEC07;

public class Hotel {
	
	//atributos
	private int idHotel;
	private String nombre;
	private String ciudad;
	private String provincia;
	
	//constructores
	
	public Hotel(int idHotel, String nombre, String ciudad, String provincia) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}
	
	//getters and setters

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	
	//toString 
	
	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nombre=" + nombre + ", ciudad=" + ciudad + ", provincia=" + provincia
				+ "]";
	}
	
	
	
	
	
	

}
