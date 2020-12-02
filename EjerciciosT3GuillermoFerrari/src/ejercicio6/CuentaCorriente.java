package ejercicio6;

public class CuentaCorriente {

	// Se desea llevar un control del estado de una cuenta corriente. Una cuenta
	// corriente está caracterizada
	// por su saldo y el nombre del titular y sobre ella se pueden realizar tres
	// tipos de operaciones:
	// • Ingresar (cantidad): ingresa en la cuenta una cantidad de dinero dada por
	// el usuario. No
	// imprime de nuevo el saldo, pero sí lo actualiza.
	// • Retirar (cantidad): Debe comprobar si queda suficiente saldo y si es así,
	// disminuye la cuenta
	// una determinada cantidad de dinero especificada por el usuario. No imprime de
	// nuevo el
	// saldo, pero sí lo actualiza.
	// • Calcular saldo en dólares americanos. Se le debe pasar el valor de cambio y
	// debe devolver el
	// valor del saldo en dólares.
	// • Consultar el saldo.
	// Supón que la cuenta inicialmente tiene un saldo de cero. Escribe una clase
	// CuentaCorriente que
	// implemente las funcionalidades descritas y un main con un menú para
	// probarlas.

	// atributos

	String nombre;
	double saldo;

	// constructores

	public CuentaCorriente(String nombre, double saldo) {

		this.nombre = nombre;
		this.saldo = saldo;

	}

	// getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
	//metodo ingresar dinero
	
	  public double ingresarSaldo( double cantidadTeclado) {
		  
		  double saldo=0;
		  
		  saldo= saldo + cantidadTeclado;
		  return saldo;
		  
	  }
	  
	  //metodo retirar saldo
	  
	  public double retirarSaldo(double total) {
	  
	   total = total - saldo;
	   return total;
		  
	 
	  
	 
	
	  }
	
}
