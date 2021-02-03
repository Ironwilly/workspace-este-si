package ejercicio02;

public class Documento {

	
	//atributo
	
	private String encabezado = ("Triana Server SL.\r\n"
			+ "c/ San jacinto 28,41010 sevilla.");
	
	
	
	//constructores
	
	
	public Documento(String encabezado) {
		super();
		this.encabezado = encabezado;
	}

	//getters and setters
	
	public String getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}
	
	
	//to String
	@Override
	public String toString() {
		return "Documento [encabezado=" + encabezado + "]";
	}
	
	//método
	
	

	public void imprimirDatos() {
		
		System.out.println("\t"+encabezado);
		
	}
	
}
