package ejercicio03;

public class Mecanismo extends Exception{

	
	private Termometro ter = new Termometro();
	
	//constructores
	public Mecanismo() {
		
		super();
	}
	
	
	public Mecanismo (String alerta) {
		
		super (alerta);
	}
	
	
	//métodos
	
	
	public void mostrarAlerta(double temperatura)throws Mecanismo {
		
		
			
			throw new Mecanismo ("no puede haber temperaturas menores a -273 ºC");
		
	}
	

}
