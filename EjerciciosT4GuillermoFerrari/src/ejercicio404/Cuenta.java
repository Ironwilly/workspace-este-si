package ejercicio404;

public abstract class Cuenta {
	
	
	//atributo
	private String tipoCuenta;

	
	//constructor
	
	public Cuenta(String tipoCuenta) {
		super();
		this.tipoCuenta = tipoCuenta;
	}


	
	//getters and setters
	
	public String getTipoCuenta() {
		return tipoCuenta;
	}


	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}



	@Override
	public String toString() {
		return "Cuenta [tipoCuenta=" + tipoCuenta + "]";
	}
	
	//métodos
	
	public abstract double calcularIngreso();

	public abstract double calcularSaldoTotal();

	public void metodoSoloDeCuenta() {
		System.out.println("probando");
	}
	
	
	
	
	
	

}
