package relaciones1;

public class Cuenta {
	
	
	//atributos
	
	private int numero;
	private double saldo;
	private Cliente cli;   //esto es el tipo cliente (que esta en la clase cliente,seria un objeto completo)
	
	
	//constructores
	
	public Cuenta(int numero, double saldo, Cliente cli) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cli = cli;
	}

	//getters and setters

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Cliente getCli() {
		return cli;
	}


	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	
	//to string

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + ", cli=" + cli + "]";
	}
	
	
	
	//método
	
	
	
	
	
	
	
	

}
