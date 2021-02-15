package boletinExamenEjer01;

import java.util.Arrays;

public class GestionHabitaciones {

	//atributos
	
	private HabitacionEstandar lista[];
	
	
	//constructor

	public GestionHabitaciones(HabitacionEstandar[] lista) {
		super();
		this.lista = lista;
	}

	//getters and setters
	
	public HabitacionEstandar[] getLista() {
		return lista;
	}

	public void setLista(HabitacionEstandar[] lista) {
		this.lista = lista;
	}
	
	//ToString

	@Override
	public String toString() {
		return "GestionHabitaciones [lista=" + Arrays.toString(lista) + "]";
	}
	
	//metodos
	
	
	
	
	public double calcularPrecioHab(double precioB, int numDiasOcu, double dineroGastadoServH,double des,double extraLimpieza) {
		
		double resultado = 0.0;
		for(int i=0;i<lista.length;i++) {
			resultado=lista[i].calcularPrecioHabitacion(precioB, numDiasOcu, dineroGastadoServH, des, extraLimpieza);
			
			
		}
		return resultado;
		
	}
	
	
	
			public double calcularRecaudadoTotal(double precioB, int numDiasOcu, double dineroGastadoServH,double des,double extraLimpieza) {
				
				double resultado =0.0;
				for(int i=0;i<lista.length;i++) {
					
					resultado =resultado +lista[i].calcularPrecioHabitacion(precioB, numDiasOcu, dineroGastadoServH, des, extraLimpieza);
				}
		
		return resultado;
	}
	
	
	
	
	
	
}
