package ejercicioEnClase;

import java.util.Arrays;

public class Carrito {
	
	//atributos
	
          private LineaDeVenta [] listado;
	
	
	//constructores

	public Carrito(LineaDeVenta[] listado) {
		super();
		this.listado = listado;
	}


	//getters and setter
	public LineaDeVenta[] getListado() {
		return listado;
	}


	public void setListado(LineaDeVenta[] listado) {
		this.listado = listado;
	}


	//To string
	
	@Override
	public String toString() {
		return "Carrito [listado=" + Arrays.toString(listado) + "]";
	}
	
	
	//metodos
	
	public double calcularTotal(double descuento, int topeDias) {
		
		double resultado = 0.0;
		
		for(int i=0;i< listado.length; i++) {
			resultado=resultado+listado[i].calcularSubtotal(descuento, topeDias);
			
		}
		return resultado;
	}
	
	

}