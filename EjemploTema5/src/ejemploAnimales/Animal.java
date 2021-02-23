package ejemploAnimales;

public class Animal implements IDepredador, ICuidador{
	
	/* SE PONE implements PARA QUE SEA IMPLEMENTADO A LA INTERFACE, DE IGUAL MANERA QUE SE PONIA EXTENDS PARA LAS CLASES HEREDADAS*/

	
	
	//atributos
	private String nombre;
	private int tipoAlimentacion;  //cero hierba, 1 carne
	
	
	//Constructor
	
	
	public Animal(String nombre, int tipoAlimentacion) {
		super();
		this.nombre = nombre;
		this.tipoAlimentacion = tipoAlimentacion;
	}
	
	
	
	
	//getters and setters

	public String getNombre() {
		return nombre;
	}






	public void setNombre(String nombre) {
		this.nombre = nombre;
	}






	public int getTipoAlimentacion() {
		return tipoAlimentacion;
	}






	public void setTipoAlimentacion(int tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}


	//ToString




	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipoAlimentacion=" + tipoAlimentacion + "]";
	}




	//MÉTODOS
	@Override
	public void localizar(Animal presa) {

		System.out.println("Quiero encontrar una presa");
		
	}

	@Override
	public void cazar(Animal presa) {


		System.out.println("He cazado un " +presa.nombre);
		
	}




	@Override
	public void cuidar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
 
}
