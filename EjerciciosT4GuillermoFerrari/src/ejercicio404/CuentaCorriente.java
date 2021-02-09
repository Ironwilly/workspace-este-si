package ejercicio404;

public class CuentaCorriente extends Cuenta {

	//atributo
	private double saldo;
	private double ingreso;

	
	//constructor
	
	public CuentaCorriente(String tipoCuenta, double saldo, double ingreso) {
		super(tipoCuenta);
		this.saldo = saldo;
		this.ingreso = ingreso;
	}
	
	//getters and setters
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getIngreso() {
		return ingreso;
	}

	public void setIngreso(double ingreso) {
		this.ingreso = ingreso;
	}
	
	
	//to String
	
	@Override
	public String toString() {
		return "CuentaCorriente [saldo=" + saldo + ", ingreso=" + ingreso + "]";
	}
	
	
	//metodos

	

	@Override
	public double calcularSaldoTotal() {
		// TODO Auto-generated method stub
		saldo= saldo + ingreso;
		
		return saldo;
	}




	@Override
	public double calcularIngreso() {
		// TODO Auto-generated method stub
		return ingreso;
	}


	
	public void mostrarFrase() {
		
		System.out.println("Eres el cliente del mes");
		
		
		
	}
	
	
	
	

}
