package ejercicio05;



public class Oficina {
	
	
	
	
	public double calcularElSueldoDeUnEmpleado(Empleado e) {
		return e.calcularSueldo( );
	}

	
	
	public double calcularLoGastadoOficina(Empleado[] listado) {
		double gastado = 0;
		for (int i = 0; i < listado.length; i++) {
			gastado = gastado + calcularElSueldoDeUnEmpleado(listado[i]);
		}
		return gastado;
	}



	

}
