package repasando2;

import java.util.Arrays;

public class Ventas {

	//atributo
	private Producto lista[];
	
	//Constructor

	public Ventas(Producto[] lista) {
		super();
		this.lista = lista;
	}
	
	//getters and setter

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
	//ToString

	@Override
	public String toString() {
		return "Ventas [lista=" + Arrays.toString(lista) + "]";
	}
	
	//métodos
	
	
	public void mostrarProductosNoVendidos() {
		 int totalPorVender =0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i].isVendido()) {
				System.out.println("");
			}else {
				totalPorVender = totalPorVender + lista[i].getUnidades();
			}
			
		}
	}
	
	public double calcularDineroTotalVentas(double porcentaje,double suplemento) {
		double totalVentas =0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i].isVendido()) {
				
				totalVentas = totalVentas + lista[i].calcularPvp(porcentaje, suplemento);
			}
			
		}
		return totalVentas;
	}
	
	public double devolverCambio(double dineroEntregado,double dineroGastado) {
		
		return dineroEntregado - dineroGastado;
	}
	
	public void mostrarListadoProductos() {
		
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i].toString());
			if(lista[i] instanceof EspadaLaser) {
				System.out.println("¡Cuidadín al sacarla de la bolsa, que hace pupa!");
			}
		}
	}
	
	
}
