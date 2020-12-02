package ejemplo1;

public class Persona {

	// lo primero que se ponen son los atributos

	// atributos ,( en este caso de personas) no le damos valores INICIALES

	String nombre;
	int edad;
	double altura;

	// constructores


	public Persona(String nombre, int edad, double altura) {

		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;

	}
	
	// este se crea para otra persona que solo tenga 2 datos, por ejemplo p2 en el ejemplo
	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
		

	}
    // este se crea para otra persona que no tiene ningun dato (este en caso de que no haya ningun 
	// constructor, no hace falta ponerlo ya que por defecto, si no se escribe nada, lo da por vacio)
	public Persona() {

		
		

	}
	
	//DEBAJO DE CONSTRUCTORES VAN LOS GETTERS AN SETTER ( LO VEREMOS MAS ADELANTE)
	//son metodos q ayudan a obtener el valor de un atributo
	// en cada programa habra un get y un set para cada atributo
	
	public String getNombre () {
		return nombre;
		
	}
	
	public int getEdad () {     //este caso devuelve (return)
		return edad;
		
	}
	
	public void setNombre (String nombre) {    //sino devuelve nada, se pone void
											   // todos los set, llevan void
		this.nombre=nombre;
	}
	
	
	
	
	
	
	// MÉTODOS
	//estuctura -----> public tipo_devolución nombreMetodo(parametros)
	
	
	//pasar edad a dias (en este ejemplo)
	
	//version 1: Sin darle nada
	public int calcularEdadDias () {
		int diaAnyo = 365;					//SOLO PARA ESTO SE DECLARA LA VARIABLE AHI, NO ARRIBA
		int resul = 0;                   
		
		
		resul=edad*diaAnyo;
		return resul;						//La linea return es la ULTIMA LINEA del metodo
	}
	
	
	//version 2: dando la edad desde fuera
	
	public int calcularEdadDiasV2 (int edad) {
		
		int diaAnyo = 365;					//SOLO PARA ESTO SE DECLARA LA VARIABLE AHI, NO ARRIBA
		int resul = 0;                      //en esta version, como se ve, la edad aparece color marron, por que no es el atributo, sino la variable que hay dentro del parentesis
		resul=edad*diaAnyo;
		return resul;						//La linea return es la ULTIMA LINEA del metodo
		
		
	}

	
	//esto se crea dandole a source , luego generate to string
	// poniendo esto, ahora solamente en la clase principal para imprimir no hay que poner x eje: p1.altura, sino unicamente poner p1
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
	}
	
	
	
	
	
	
}
