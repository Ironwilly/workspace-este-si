package prueba1;



public class Imprimir {
	
	//atributo
	private CrudConcesionario crud;

	
	//constructor
	public Imprimir(CrudConcesionario crud) {
		super();
		this.crud = crud;
	}

	//métodos
	
	// imprimir lista coche
	
	public void imprimirListaCoches() {
		
		
		crud.getListaDeCoches()
		.stream()
		.forEach(System.out::println);
	}
	
	//imprimir dado un coche 
	
	public void imprimirUnCocheDado(Coche c) {
		
		System.out.println(c);
	}
	
	
	
	
	
}
