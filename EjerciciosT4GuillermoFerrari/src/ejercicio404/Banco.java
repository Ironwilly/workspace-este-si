package ejercicio404;



public class Banco {
	
	public double calcularSaldoTotalDeUnaCuenta(Cuenta cu) {
		return cu.calcularSaldoTotal();
	}
	
	public double sumarSaldosCuentas(Cuenta[] listado) {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + calcularSaldoTotalDeUnaCuenta(listado[i]);
		}
		return resultado;
	}

}
