package ejercicio01;

import java.text.DecimalFormat;

/**
 * Esta clase sirve para representar los datos de la cuenta corriente de un cliente
 * @author Guillermo Ferrari
 * @version 1.0 - 13/04/2021
 *
 *
 */

public class Cuenta {

	private String numCuenta;
	private String dni;
	private String apellido1;
	private String apellido2;
	private String nombre;
	private Double saldo;
	private String pin;

	// CONSTRUCTORES

	public Cuenta(String numCuenta, String dni, String apellido1, String apellido2, String nombre, String saldo,
			String pin) {
		super();
		this.numCuenta = numCuenta;
		this.dni = dni;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre = nombre;
		this.saldo = Double.parseDouble(saldo);
		this.pin = pin;
	}

	// GETTERS Y SETTERS
	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSaldo() {
		return saldo.toString();
	}

	public void setSaldo(String saldo) {
		this.saldo = Double.parseDouble(saldo);
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	// MÉTODOS PÚBLICOS

	
	
	
	
	
	public boolean cambiarTitular(String nombre, String apellido1, String apellido2, String dni, String clave) {
		boolean resultado = false;
		
		/**
		 * 
		 * método que permite cambiar de titular de la cuenta
		 * @return devuelve true si el pin es correcto
		 */ 

		if (clave.equals(pin)) {                                       
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.dni = dni;
			resultado = true;  
			
		}

		return resultado;
	}

	public boolean cambiarPin(String pinAntiguo, String pinNuevo) {
		boolean resultado = false;
		
		/**este método permite cambiar el numero pin
		 * @return devuelve true si el pin antiguo es correcto y el nuevo es un pin valido
		 */

		if (pinAntiguo.equals(pin)) {
			if (pinNuevo.matches("[0-9]{4}")) {
				this.pin = pinNuevo;
				resultado = true;
			} else {
				System.out.println("El nuevo pin no es válido");
			}
		}

		return resultado;

	}

	public boolean ingresarDinero(Double cantidad) {
		boolean resultado = false;
		
		/**
		 * este método permite ingresar dinero en cuenta
		 * @return devuelve true si la cantidad es mayor que 0 y es una cantidad valida
		 */

		if (cantidad > 0) {
			cantidad *= 100;
			double redondeado = Math.round(cantidad) / 100;
			saldo += redondeado;
			resultado = true;
		} else {
			System.out.println("La cantidad indicada no es válida");
		}

		return resultado;
	}

	public boolean retirarDinero(Double cantidad, String clave) {
		boolean resultado = false;
		
		/**
		 * este métood permite sacar dinero de la cuenta
		 * @return devuelve true si la cantidad es mayor que 0 y es cantidad validad, y si el pin introducido es correcto
		 */

		
		if (cantidad > 0 && pin.equals(clave)) {
			cantidad *= 100;
			double redondeado = Math.round(cantidad) / 100;
			saldo -= redondeado;
			resultado = true;
		} else {
			System.out.println("La cantidad indicada no es válida o el pin es incorrecto");
		}

		return resultado;
	}

	public boolean realizarTransferencia(Double cantidad, String clave, Cuenta destino) {
		boolean resultado = false;
		
		/**
		 * este método permite hacer transferencia de dinero a otra cuenta
		 * @return devuelve true si la cantidad es mayor que 0 y es cantidad valida, y si el pin introducido es correcto
		 */

		if (cantidad > 0 && pin.equals(clave)) {
			cantidad *= 100;
			double cantidadRedondeada = Math.round(cantidad) / 100;
			saldo -= cantidadRedondeada;
			destino.ingresarDinero(cantidadRedondeada);
			resultado = true;
		} else {
			System.out.println("La cantidad indicada no es válida o el pin es incorrecto");
		}

		return resultado;
	}

}
