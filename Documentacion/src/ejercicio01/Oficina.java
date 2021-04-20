package ejercicio01;


	

import java.text.DecimalFormat;



import java.util.HashMap;
import java.util.Set;


/**
 * Esta clase representa los datos m�s b�sicos de una oficina, y sirve para gestionar sus cuentas
 * @author Guillermo Ferrari
 * @version 1.0 - 13/04/2021
 *
 *
 */

public class Oficina {

	String idOficina;
	String rutaFicheroCuentas;
	HashMap<String, Cuenta> listadoCuentas;

	//CONSTRUCTOR
	public Oficina(String id, String ruta) {
		idOficina = id;
		rutaFicheroCuentas = ruta;

		LectorCSV lector = new LectorCSV(ruta, ';');
		listadoCuentas = lector.leerTodasLasCuentas();
		lector.cerrarFichero();
	}

	// GETTER Y SETTER
	public String getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(String idOficina) {
		this.idOficina = idOficina;
	}

	public String getRutaFicheroCuentas() {
		return rutaFicheroCuentas;
	}

	public void setRutaFicheroCuentas(String rutaFicheroCuentas) {
		this.rutaFicheroCuentas = rutaFicheroCuentas;
	}

	// M�TODOS P�BLICOS
	public String abrirCuenta(String dni, String apellido1, String apellido2,
			String nombre, double saldoInicial) {
		
		/**
		 * este m�todo permite abrir una cuenta nueva
		 * @return devuelve un n�mero de cuenta una vez gestionada correctamente los datos de esta.
		 */
		
		String numCuenta;
		do {
			numCuenta = Integer.toString((int) (Math.random() * 100000));

		} while (listadoCuentas.containsKey(numCuenta));

		DecimalFormat df = new DecimalFormat("0000");
		String pin = df.format((int) (Math.random() * 10000));

		
		Cuenta nuevaCuenta = new Cuenta(numCuenta, dni, apellido1, apellido2,
				nombre, Double.toString(saldoInicial), pin);
		listadoCuentas.put(numCuenta, nuevaCuenta);
		

		return numCuenta;
	}

	public boolean cerrarCuenta(String numCuenta, String pin) {
		boolean resultado = false;
		
		/**
		 * este m�todo permite cerrar una cuenta
		 * @return devuelve true si el numero de cuenta a cerrar y el pin introducido es correcto
		 */

		if (listadoCuentas.containsKey(numCuenta)) {
			Cuenta cuentaACerrar = listadoCuentas.get(numCuenta);
			if (pin.equals(cuentaACerrar.getPin())) {
				listadoCuentas.remove(numCuenta);
				resultado = true;
			} else {
				System.out.println("Pin no v�lido");
			}
		} else {
			System.out.println("N�mero de cuenta no v�lido");
		}

		return resultado;
	}

	
	public boolean ingresarEnCuenta(String numCuenta, String cantidad) {
		boolean resultado = false;
		
		/**
		 * este m�todo busca en un listado de cuenta, la cuenta donde se quiere ingresar el dinero y comprueba que esta existe
		 * @return devuelve true si el numero de cuenta es correcto y la cantidad a ingresar es correcta
		 */

		HashMap<String, Cuenta> copiaListadoCuentas = new HashMap<String, Cuenta>(
				listadoCuentas);

		if (listadoCuentas.containsKey(numCuenta)) {
			Cuenta c = listadoCuentas.remove(numCuenta);
			resultado = c.ingresarDinero(Double.parseDouble(cantidad));
			if (resultado) {
				listadoCuentas.put(c.getNumCuenta(), c);
			} else {
				System.out.println("No se realiz� la operaci�n");
				listadoCuentas = copiaListadoCuentas;
			}
		} else {
			System.out.println("Cuenta inexistente");
		}

		return resultado;
	}

	
	public boolean reintegroDeCuenta(String numCuenta, String pin,
			String cantidad) {
		
		/**
		 * este m�todo busca en un listado de cuenta,la cuenta donde se quiere sacar el dinero y comprueba que esta existe
		 * @return devuelve true si el n�mero de cuenta,la cantidad, y el pin son correcto
		 */
		
		boolean resultado = false;
		HashMap<String, Cuenta> copiaListadoCuentas = new HashMap<String, Cuenta>(
				listadoCuentas);

		if (listadoCuentas.containsKey(numCuenta)) {
			Cuenta c = listadoCuentas.remove(numCuenta);
			resultado = c.retirarDinero(Double.parseDouble(cantidad), pin);
			if (resultado) {
				listadoCuentas.put(c.getNumCuenta(), c);
			} else {
				System.out.println("No se realiz� la operaci�n");
				listadoCuentas = copiaListadoCuentas;
			}
		} else {
			System.out.println("Cuenta inexistente");
		}

		return resultado;
	}

	
	public boolean transferencia(String cuentaOrigen, String cuentaDestino,
			String pin, String cantidad) {
		
		/**
		 * este m�todo busca un listado de cuentas origen y destino, y comprueban que existan para poder realizar la transferencia
		 * @return devuelve true si la cuenta origen y destino son correcta y si el pin y la cantidad a transferir es correcto
		 */
		boolean resultado = false;
		HashMap<String, Cuenta> copiaListadoCuentas = new HashMap<String, Cuenta>(
				listadoCuentas);

		if (listadoCuentas.containsKey(cuentaOrigen)
				&& listadoCuentas.containsKey(cuentaDestino)) {
			Cuenta origen = listadoCuentas.remove(cuentaOrigen);
			Cuenta destino = listadoCuentas.remove(cuentaDestino);
			resultado = origen.realizarTransferencia(
					Double.parseDouble(cantidad), pin, destino);
			if (resultado) {
				listadoCuentas.put(origen.getNumCuenta(), origen);
				listadoCuentas.put(destino.getNumCuenta(), destino);
			} else {
				System.out.println("No se realiz� la operaci�n");
				listadoCuentas = copiaListadoCuentas;
			}

		} else {
			System.out.println("Cuenta inexistente");
		}

		return resultado;
	}

	
	public boolean cambiarPin(String numCuenta, String pin, String nuevoPin) {
		boolean resultado = false;
		
		/**
		 * este m�todo busca en un listado de cuentas, si la cuenta donde se quiere cambiar el pin existe
		 * @return devuelve true si el numero de cuenta existe y si el pin antiguo y nuevo son validos
		 */
		HashMap<String, Cuenta> copiaListadoCuentas = new HashMap<String, Cuenta>(
				listadoCuentas);

		if (listadoCuentas.containsKey(numCuenta)) {
			Cuenta c = listadoCuentas.remove(numCuenta);
			resultado = c.cambiarPin(pin, nuevoPin);
			if (resultado) {
				listadoCuentas.put(c.getNumCuenta(), c);
			} else {
				System.out.println("No se realiz� la operaci�n");
				listadoCuentas = copiaListadoCuentas;
			}
		} else {
			System.out.println("Cuenta inexistente");
		}

		return resultado;
	}

	
	public boolean guardarOperaciones() {
		
		
		/**
		 * este m�todo busca en un listado de cuenta, el n�mero de cuenta desde donde se ha hecho la operacion, si esta existe, guarda en ella la operaci�n realizada
		 * @return devuelve true si la operaci�n ha sido llevada a cabo correctamente
		 */
		boolean resultado = false;

		EscritorCSV fichero = new EscritorCSV(rutaFicheroCuentas);

		Set<String> keySet = listadoCuentas.keySet();
		for (String num : keySet) {
			Cuenta c = listadoCuentas.get(num);
			fichero.escribirRegistro(c);
		}

		fichero.cerrarFichero();
		resultado = true;
		return resultado;
	}
	
	
	public boolean existeCuenta(String numCuenta){
		
		/**
		 * este m�todo consiste en buscar en un listado de cuentas, un n�mero de cuenta
		 * @return devuelve true si encuentra el n�mero de cuenta a buscar
		 * 		
		 */
		return listadoCuentas.containsKey(numCuenta);
	}

	
	

}


