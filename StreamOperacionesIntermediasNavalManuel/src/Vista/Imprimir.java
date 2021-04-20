package Vista;

import java.util.List;
import java.util.stream.Stream;

import crud.CrudLimpieza;
import pojo.ProductosLimpieza;

public class Imprimir {
	
	private CrudLimpieza crud;
	
	

	public Imprimir(CrudLimpieza crud) {
		super();
		this.crud = crud;
	}

	//Método para la impresión de la lista
	public void imprimirListaLimpieza() {
		crud.getStockLimpieza()
		.stream()
		.forEach(System.out::println);
	}
	
	//Método para imprimir por ìndice
	public void imprimirProducto (int i) {
		System.out.println(crud.getStockLimpieza().get(i));
	}
	
	//Método para imprimir dado un producto
	public void imprimirProducto (ProductosLimpieza p) {
		System.out.println(p);
	}
	
	//Método para imprimir una lista de productos 
public void imprimirProductosLista (List<ProductosLimpieza> lp) {
		lp.forEach(x -> System.out.println(x));
	}

	//Método para imprimir un stream
	//Podriamos haber convertido el stream en una lista en el crud con Collect,
	//pero ahora tendriamos que volver a pasarlo a stream, para guardarlo puede tener
	//sentido, pero para algo como una busqueda mejor pasamos el stream.
	public void imprimirProductosStream (Stream<ProductosLimpieza> lp) {
		
		lp.forEach(x -> System.out.println(x));
	}
	
	public void imprimirSoloApto () {
		System.out.println("******************************* Productos aptos para el uso alimenticio *******************************");
		
		for (ProductosLimpieza producto  : crud.getStockLimpieza()) {
			if(producto.isAptoUsoAlimenticio()) {
				System.out.println(producto);
			}
		}
		System.out.println("*******************************************************************************************************");
	}
	
	public void impirimirSoloAptoStream () {
		System.out.println("******************************* Productos aptos para el uso alimenticio *******************************");
		
		crud.getStockLimpieza()
		.stream()
		.filter(x->x.isAptoUsoAlimenticio())
		.forEach(x-> System.out.println(x));
		
		System.out.println("*******************************************************************************************************");
	}
	
}
