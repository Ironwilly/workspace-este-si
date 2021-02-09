package ejercicio404;

public class CuentaAhorro extends Cuenta{
	
	//atributos
	
	private double gastos;
	private double ahorro;
	
	//constructores
	
	public CuentaAhorro(String tipoCuenta, double gastos, double ahorro) {
		super(tipoCuenta);
		this.gastos = gastos;
		this.ahorro = ahorro;
	}
	
	//getters and setters

	public double getGastos() {
		return gastos;
	}

	public void setGastos(double gastos) {
		this.gastos = gastos;
	}

	public double getAhorro() {
		return ahorro;
	}

	public void setAhorro(double ahorro) {
		this.ahorro = ahorro;
	}
	
	//To string 

	@Override
	public String toString() {
		return "CuentaAhorro [gastos=" + gastos + ", ahorro=" + ahorro + "]";
	}
	
	
	//metodos

	@Override
	public double calcularIngreso() {
		// TODO Auto-generated method stub


		ahorro= ahorro - gastos;
		
		return ahorro;
	}

	@Override
	public double calcularSaldoTotal() {
		// TODO Auto-generated method stub
		
		
		
		return ahorro + gastos;
	}
	
	
	public void mostrarFrase2() {
		
		System.out.println("No gastes mucho y ahorrarás más!");
	}
	
	
	
	
	
	
	
	
	

}
