package crud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import datos.DatosLimpieza;
import pojo.ProductosLimpieza;

public class CrudLimpieza {

	private List<ProductosLimpieza> stockLimpieza;

	// Constructor autogenerado
	public CrudLimpieza(List<ProductosLimpieza> stockLimpieza) {
		super();
		this.stockLimpieza = stockLimpieza;
	}

	// Constructor personalizado
	public CrudLimpieza() {

		this.stockLimpieza = new DatosLimpieza().getListaLimpieza();
	}

	// Getters and Setters
	public List<ProductosLimpieza> getStockLimpieza() {
		return stockLimpieza;
	}

	public void setStockLimpieza(List<ProductosLimpieza> stockLimpieza) {
		this.stockLimpieza = stockLimpieza;
	}

	// toString
	@Override
	public String toString() {
		return "CrudLimpieza stockLimpieza=" + stockLimpieza + "";
	}

	public boolean agregarProducto(ProductosLimpieza p) {
		return stockLimpieza.add(p);

	}

	// Busca un producto por nombre de forma clásica (primera coincidencia)
	public int buscarProducto(String nombre) {
		int temp = -1;
		boolean salir = false;

		for (int i = 0; i < stockLimpieza.size() && !salir; i++) {
			if (stockLimpieza.get(i).getNombre().equalsIgnoreCase(nombre)) {
				temp = i;
				salir = true;

			}
		}
		return temp;
	}

	// Buscar el primer producto por nombre (primera coincidencia) con stream
	public ProductosLimpieza buscarProductoStream(String nombre) {

		return stockLimpieza
				.stream()
				.parallel()
				.filter(x -> x.getNombre().equalsIgnoreCase(nombre))
				.findAny()
				.orElse(null);

	}

	// Buscar todos los productos por nombre de forma clásica
	public List<ProductosLimpieza> buscarProductos(String nombre) {
		List<ProductosLimpieza> temp = new ArrayList<ProductosLimpieza>();

		for (int i = 0; i < stockLimpieza.size(); i++) {
			if (stockLimpieza.get(i).getNombre().equalsIgnoreCase(nombre))
				temp.add(stockLimpieza.get(i));
		}
		return temp;
	}

	// Buscar todos los productos por nombre con stream
	public Stream<ProductosLimpieza> buscarProductosStream(String nombre) {
		return stockLimpieza
				.stream()
				.parallel()
				.filter(x -> x.getNombre().equalsIgnoreCase(nombre));
	}

	
	// buscar producto cuyo string contenga parcialmente el nombre dado de forma
	// clásica

	public List<ProductosLimpieza> buscarProductosContienen(String nombre) {

		List<ProductosLimpieza> temp = new ArrayList<ProductosLimpieza>();

		for (int i = 0; i < stockLimpieza.size(); i++) {
			if (stockLimpieza.get(i).getNombre().toUpperCase().contains(nombre.toUpperCase()))
				temp.add(stockLimpieza.get(i));
		}
		return temp;
	}

	// buscar producto cuyo string contenga parcialmente el nombre dado con stream

	public Stream<ProductosLimpieza> buscarProductosContienenStream(String nombre) {
		return stockLimpieza
				.parallelStream() //Otra forma de generar un stream en paralelo.
				.filter(x -> x.getNombre().toUpperCase().contains(nombre.toUpperCase()));
	}
	
	//Modificar producto buscando por nombre de forma clásica
	public void modificarNombreProducto (String nombre, String nuevoNombre) {
		int i;
		i=buscarProducto(nombre);
		stockLimpieza.get(i).setNombre(nuevoNombre);
	}
	//Modificar producto buscando por nombre con Stream
	public void modificarNombreProductoStream (String nombre,String nuevoNombre) {
		buscarProductoStream(nombre)
		.setNombre(nuevoNombre);
	}
	
	//Modificar todos los productos con el mismo nombre de forma clásica
	public void modificarTodosLosProductos (String nombre,String nuevoNombre) {
		List <ProductosLimpieza> temp = buscarProductos(nombre);
		
		for (int i = 0; i < temp.size(); i++) {
			temp.get(i).setNombre(nuevoNombre);
		}
	}
	
	//Modificar todos los productos con el mismo nombre con Stream
	public void modificarTodosLosProductosStream (String nombre,String nuevoNombre ) {
		buscarProductosStream(nombre)
		.forEach(x->x.setNombre(nuevoNombre));
		
	}
	
	//Método para ordenar la lista por orden natural (precio)
	public void ordenarLista () {
		Collections.sort(stockLimpieza);
	}
	
	//Método para ordenar la lista por orden natural (precio) con stream
	public void ordenarListaStream () {
		stockLimpieza=stockLimpieza
				.stream()
				.parallel()
				.sorted()
				.collect(Collectors.toList());
	}

	//Método para ordenar la lista por orden alfabético
	public void ordenarAlf () {
		Collections.sort(stockLimpieza, new OrdenarPorNombre ());
	}
	
	//Método para ordenar la lista por orden alfabético con Stream
	public void ordenarAlfStream () {
		stockLimpieza=stockLimpieza
				.stream()
				.parallel()
				.sorted( (n1, n2)-> n1.getNombre().compareToIgnoreCase(n2.getNombre()))
				.collect(Collectors.toList());
	}
	//Notese que este último método no necesita de una clase que implemente
	//la interfaz comparator para ordenar, le basta con las impresiones lambda,
	//en esto se basa la programación funcional. 

}
