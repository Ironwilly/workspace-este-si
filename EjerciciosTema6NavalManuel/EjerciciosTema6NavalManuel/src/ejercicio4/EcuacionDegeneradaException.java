package ejercicio4;

public class EcuacionDegeneradaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EcuacionDegeneradaException () {
		super ("La ecuación es degenerada");
	}
	
	public EcuacionDegeneradaException (String alert) {
		super (alert);
	}
}
