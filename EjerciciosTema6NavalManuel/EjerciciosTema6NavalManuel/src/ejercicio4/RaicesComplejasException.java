package ejercicio4;

public class RaicesComplejasException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RaicesComplejasException() {
		super("La ecuación es compleja");
	}

	public RaicesComplejasException(String alert) {
		super(alert);
	}
}
