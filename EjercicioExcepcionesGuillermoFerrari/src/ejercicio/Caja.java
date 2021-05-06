package ejercicio;



public class Caja {

	// atributos

	private int dinero;
	private int operaciones;
	private char letra;
	private String pin;

	
	public Caja (char letra, String pin) {
		super();
		this.letra = letra;
		this.pin = pin;
	}
	
	
	public Caja(int dinero, int operaciones, char letra, String pin) {
		super();
		this.dinero = dinero;
		this.operaciones = operaciones;
		this.letra = letra;
		this.pin = pin;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(int operaciones) {
		this.operaciones = operaciones;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	
	
	@Override
	public String toString() {
		return "Caja [dinero=" + dinero + ", operaciones=" + operaciones + ", letra=" + letra + ", pin=" + pin + "]";
	}

	//metodos
	static void mostrarAlerta1(char letr)throws Alerta {
			
			throw new Alerta("Debes poner una letra de la A a la Z \n");
			
		
		
	}
	
	static void mostrarAlerta2(String pin)throws Alerta {
		
		throw new Alerta("Debes poner un número del 0 al 9 \n");
		
	
	
}
	
	static void mostrarAlerta3(int money, int oper)throws Alerta {
		
		throw new Alerta("El dinero de las operaciones no coincide con la recaudacion de la caja \n");
		
	
	
}
	
	






	
	
}
